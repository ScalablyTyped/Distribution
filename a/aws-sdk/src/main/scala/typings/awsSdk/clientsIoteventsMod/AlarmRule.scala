package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmRule extends StObject {
  
  /**
    * A rule that compares an input property value to a threshold value with a comparison operator.
    */
  var simpleRule: js.UndefOr[SimpleRule] = js.undefined
}
object AlarmRule {
  
  inline def apply(): AlarmRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmRule] (val x: Self) extends AnyVal {
    
    inline def setSimpleRule(value: SimpleRule): Self = StObject.set(x, "simpleRule", value.asInstanceOf[js.Any])
    
    inline def setSimpleRuleUndefined: Self = StObject.set(x, "simpleRule", js.undefined)
  }
}
