package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerMachineDetectionConfig extends StObject {
  
  /**
    * Enable or disable answering machine detection
    */
  var enableAnswerMachineDetection: Boolean
}
object AnswerMachineDetectionConfig {
  
  inline def apply(enableAnswerMachineDetection: Boolean): AnswerMachineDetectionConfig = {
    val __obj = js.Dynamic.literal(enableAnswerMachineDetection = enableAnswerMachineDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerMachineDetectionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnswerMachineDetectionConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableAnswerMachineDetection(value: Boolean): Self = StObject.set(x, "enableAnswerMachineDetection", value.asInstanceOf[js.Any])
  }
}
