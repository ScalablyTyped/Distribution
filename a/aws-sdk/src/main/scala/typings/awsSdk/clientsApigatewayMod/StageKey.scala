package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageKey extends StObject {
  
  /**
    * The string identifier of the associated RestApi.
    */
  var restApiId: js.UndefOr[String] = js.undefined
  
  /**
    * The stage name associated with the stage key.
    */
  var stageName: js.UndefOr[String] = js.undefined
}
object StageKey {
  
  inline def apply(): StageKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StageKey] (val x: Self) extends AnyVal {
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
  }
}
