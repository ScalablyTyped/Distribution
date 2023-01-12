package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRetrievalPolicy extends StObject {
  
  /**
    * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
    */
  var Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined
}
object DataRetrievalPolicy {
  
  inline def apply(): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
    
    inline def setRules(value: DataRetrievalRulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: DataRetrievalRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
