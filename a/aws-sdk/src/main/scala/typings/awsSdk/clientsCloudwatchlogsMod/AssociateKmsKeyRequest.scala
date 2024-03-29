package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateKmsKeyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to use when encrypting log data. This must be a symmetric KMS key. For more information, see Amazon Resource Names and Using Symmetric and Asymmetric Keys.
    */
  var kmsKeyId: KmsKeyId
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}
object AssociateKmsKeyRequest {
  
  inline def apply(kmsKeyId: KmsKeyId, logGroupName: LogGroupName): AssociateKmsKeyRequest = {
    val __obj = js.Dynamic.literal(kmsKeyId = kmsKeyId.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateKmsKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateKmsKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
