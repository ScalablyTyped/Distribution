package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleConfig extends StObject {
  
  /**
    * Logical negation of the rule. If the rule would usually evaluate true, it's evaluated as false, and vice versa.
    */
  var Inverted: boolean
  
  /**
    * The value of N, when you specify an ATLEAST rule type. That is, Threshold is the number of controls that must be set when you specify an ATLEAST type.
    */
  var Threshold: integer
  
  /**
    * A rule can be one of the following: ATLEAST, AND, or OR.
    */
  var Type: RuleType
}
object RuleConfig {
  
  inline def apply(Inverted: boolean, Threshold: integer, Type: RuleType): RuleConfig = {
    val __obj = js.Dynamic.literal(Inverted = Inverted.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleConfig] (val x: Self) extends AnyVal {
    
    inline def setInverted(value: boolean): Self = StObject.set(x, "Inverted", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: integer): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setType(value: RuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
