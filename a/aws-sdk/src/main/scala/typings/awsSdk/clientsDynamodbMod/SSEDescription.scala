package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEDescription extends StObject {
  
  /**
    * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's KMS key is accessible again. DynamoDB will initiate the table archival process when table's KMS key remains inaccessible for more than seven days from this date.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The KMS key ARN used for the KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.KMSMasterKeyArn] = js.undefined
  
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses Key Management Service. The key is stored in your account and is managed by KMS (KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsSdk.clientsDynamodbMod.SSEType] = js.undefined
  
  /**
    * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.undefined
}
object SSEDescription {
  
  inline def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SSEDescription] (val x: Self) extends AnyVal {
    
    inline def setInaccessibleEncryptionDateTime(value: js.Date): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    
    inline def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
    
    inline def setKMSMasterKeyArn(value: KMSMasterKeyArn): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
    
    inline def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
    
    inline def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
    
    inline def setStatus(value: SSEStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
