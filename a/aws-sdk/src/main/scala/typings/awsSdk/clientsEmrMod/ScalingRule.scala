package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingRule extends StObject {
  
  /**
    * The conditions that trigger an automatic scaling activity.
    */
  var Action: ScalingAction
  
  /**
    * A friendly, more verbose description of the automatic scaling rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name used to identify an automatic scaling rule. Rule names must be unique within a scaling policy.
    */
  var Name: String
  
  /**
    * The CloudWatch alarm definition that determines when automatic scaling activity is triggered.
    */
  var Trigger: ScalingTrigger
}
object ScalingRule {
  
  inline def apply(Action: ScalingAction, Name: String, Trigger: ScalingTrigger): ScalingRule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingRule] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ScalingAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: ScalingTrigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
  }
}
