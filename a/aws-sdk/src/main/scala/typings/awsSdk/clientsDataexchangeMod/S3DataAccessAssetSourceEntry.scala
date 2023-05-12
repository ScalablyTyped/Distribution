package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataAccessAssetSourceEntry extends StObject {
  
  /**
    * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
    */
  var Bucket: _String
  
  /**
    * Organizes Amazon S3 asset key prefixes stored in an Amazon S3 bucket.
    */
  var KeyPrefixes: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The keys used to create the Amazon S3 data access.
    */
  var Keys: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * List of AWS KMS CMKs (Key Management System Customer Managed Keys) and ARNs used to encrypt S3 objects being shared in this S3 Data Access asset.
    */
  var KmsKeysToGrant: js.UndefOr[ListOfKmsKeysToGrant] = js.undefined
}
object S3DataAccessAssetSourceEntry {
  
  inline def apply(Bucket: _String): S3DataAccessAssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataAccessAssetSourceEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DataAccessAssetSourceEntry] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: _String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixes(value: ListOfString): Self = StObject.set(x, "KeyPrefixes", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixesUndefined: Self = StObject.set(x, "KeyPrefixes", js.undefined)
    
    inline def setKeyPrefixesVarargs(value: _String*): Self = StObject.set(x, "KeyPrefixes", js.Array(value*))
    
    inline def setKeys(value: ListOfString): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setKeysVarargs(value: _String*): Self = StObject.set(x, "Keys", js.Array(value*))
    
    inline def setKmsKeysToGrant(value: ListOfKmsKeysToGrant): Self = StObject.set(x, "KmsKeysToGrant", value.asInstanceOf[js.Any])
    
    inline def setKmsKeysToGrantUndefined: Self = StObject.set(x, "KmsKeysToGrant", js.undefined)
    
    inline def setKmsKeysToGrantVarargs(value: KmsKeyToGrant*): Self = StObject.set(x, "KmsKeysToGrant", js.Array(value*))
  }
}
