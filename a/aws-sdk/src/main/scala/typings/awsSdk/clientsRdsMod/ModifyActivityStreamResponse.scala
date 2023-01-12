package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyActivityStreamResponse extends StObject {
  
  /**
    * Indicates whether engine-native audit fields are included in the database activity stream.
    */
  var EngineNativeAuditFieldsIncluded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the Amazon Kinesis data stream to be used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encryption of messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the database activity stream.
    */
  var Mode: js.UndefOr[ActivityStreamMode] = js.undefined
  
  /**
    * The status of the modification to the policy state of the database activity stream.
    */
  var PolicyStatus: js.UndefOr[ActivityStreamPolicyStatus] = js.undefined
  
  /**
    * The status of the modification to the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.undefined
}
object ModifyActivityStreamResponse {
  
  inline def apply(): ModifyActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyActivityStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyActivityStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setEngineNativeAuditFieldsIncluded(value: BooleanOptional): Self = StObject.set(x, "EngineNativeAuditFieldsIncluded", value.asInstanceOf[js.Any])
    
    inline def setEngineNativeAuditFieldsIncludedUndefined: Self = StObject.set(x, "EngineNativeAuditFieldsIncluded", js.undefined)
    
    inline def setKinesisStreamName(value: String): Self = StObject.set(x, "KinesisStreamName", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamNameUndefined: Self = StObject.set(x, "KinesisStreamName", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMode(value: ActivityStreamMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setPolicyStatus(value: ActivityStreamPolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
    
    inline def setStatus(value: ActivityStreamStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
