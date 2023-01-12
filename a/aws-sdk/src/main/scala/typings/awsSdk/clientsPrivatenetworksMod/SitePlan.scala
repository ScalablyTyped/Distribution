package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitePlan extends StObject {
  
  /**
    * The options of the plan.
    */
  var options: js.UndefOr[Options] = js.undefined
  
  /**
    * The resource definitions of the plan.
    */
  var resourceDefinitions: js.UndefOr[NetworkResourceDefinitions] = js.undefined
}
object SitePlan {
  
  inline def apply(): SitePlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitePlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SitePlan] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: NameValuePair*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setResourceDefinitions(value: NetworkResourceDefinitions): Self = StObject.set(x, "resourceDefinitions", value.asInstanceOf[js.Any])
    
    inline def setResourceDefinitionsUndefined: Self = StObject.set(x, "resourceDefinitions", js.undefined)
    
    inline def setResourceDefinitionsVarargs(value: NetworkResourceDefinition*): Self = StObject.set(x, "resourceDefinitions", js.Array(value*))
  }
}
