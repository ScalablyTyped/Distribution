package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRecorder extends StObject {
  
  /**
    * The name of the recorder. By default, Config automatically assigns the name "default" when creating the configuration recorder. You cannot change the assigned name.
    */
  var name: js.UndefOr[RecorderName] = js.undefined
  
  /**
    * Specifies the types of Amazon Web Services resources for which Config records configuration changes.
    */
  var recordingGroup: js.UndefOr[RecordingGroup] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the IAM role used to describe the Amazon Web Services resources associated with the account.  While the API model does not require this field, the server will reject a request without a defined roleARN for the configuration recorder. 
    */
  var roleARN: js.UndefOr[String] = js.undefined
}
object ConfigurationRecorder {
  
  inline def apply(): ConfigurationRecorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorder]
  }
  
  extension [Self <: ConfigurationRecorder](x: Self) {
    
    inline def setName(value: RecorderName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecordingGroup(value: RecordingGroup): Self = StObject.set(x, "recordingGroup", value.asInstanceOf[js.Any])
    
    inline def setRecordingGroupUndefined: Self = StObject.set(x, "recordingGroup", js.undefined)
    
    inline def setRoleARN(value: String): Self = StObject.set(x, "roleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "roleARN", js.undefined)
  }
}
