package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericQuestionPropertyValueAutomation extends StObject {
  
  /**
    * The property label of the automation.
    */
  var Label: NumericQuestionPropertyAutomationLabel
}
object NumericQuestionPropertyValueAutomation {
  
  inline def apply(Label: NumericQuestionPropertyAutomationLabel): NumericQuestionPropertyValueAutomation = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericQuestionPropertyValueAutomation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericQuestionPropertyValueAutomation] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: NumericQuestionPropertyAutomationLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
  }
}
