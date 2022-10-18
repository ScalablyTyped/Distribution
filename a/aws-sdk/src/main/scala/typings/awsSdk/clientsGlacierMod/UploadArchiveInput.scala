package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadArchiveInput extends StObject {
  
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  
  /**
    * The optional description of the archive you are uploading.
    */
  var archiveDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The data to upload.
    */
  var body: js.UndefOr[Stream] = js.undefined
  
  /**
    * The SHA256 tree hash of the data being uploaded.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the vault.
    */
  var vaultName: String
}
object UploadArchiveInput {
  
  inline def apply(accountId: String, vaultName: String): UploadArchiveInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadArchiveInput]
  }
  
  extension [Self <: UploadArchiveInput](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setArchiveDescription(value: String): Self = StObject.set(x, "archiveDescription", value.asInstanceOf[js.Any])
    
    inline def setArchiveDescriptionUndefined: Self = StObject.set(x, "archiveDescription", js.undefined)
    
    inline def setBody(value: Stream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setVaultName(value: String): Self = StObject.set(x, "vaultName", value.asInstanceOf[js.Any])
  }
}
