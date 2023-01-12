package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecordingConfigurationRequest extends StObject {
  
  /**
    * ARN of the recording configuration to be retrieved.
    */
  var arn: RecordingConfigurationArn
}
object GetRecordingConfigurationRequest {
  
  inline def apply(arn: RecordingConfigurationArn): GetRecordingConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecordingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RecordingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
