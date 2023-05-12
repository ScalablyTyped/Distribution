package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartActivityStreamRequest extends StObject {
  
  /**
    * Specifies whether or not the database activity stream is to start as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies whether the database activity stream includes engine-native audit fields. This option applies to an Oracle or Microsoft SQL Server DB instance. By default, no engine-native audit fields are included.
    */
  var EngineNativeAuditFieldsIncluded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for encrypting messages in the database activity stream. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
    */
  var KmsKeyId: String
  
  /**
    * Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously.
    */
  var Mode: ActivityStreamMode
  
  /**
    * The Amazon Resource Name (ARN) of the DB cluster, for example, arn:aws:rds:us-east-1:12345667890:cluster:das-cluster.
    */
  var ResourceArn: String
}
object StartActivityStreamRequest {
  
  inline def apply(KmsKeyId: String, Mode: ActivityStreamMode, ResourceArn: String): StartActivityStreamRequest = {
    val __obj = js.Dynamic.literal(KmsKeyId = KmsKeyId.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartActivityStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartActivityStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setApplyImmediately(value: BooleanOptional): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setEngineNativeAuditFieldsIncluded(value: BooleanOptional): Self = StObject.set(x, "EngineNativeAuditFieldsIncluded", value.asInstanceOf[js.Any])
    
    inline def setEngineNativeAuditFieldsIncludedUndefined: Self = StObject.set(x, "EngineNativeAuditFieldsIncluded", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: ActivityStreamMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
