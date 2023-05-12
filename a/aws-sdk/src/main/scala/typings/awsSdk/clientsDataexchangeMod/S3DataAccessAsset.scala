package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataAccessAsset extends StObject {
  
  /**
    * The Amazon S3 bucket hosting data to be shared in the S3 data access.
    */
  var Bucket: _String
  
  /**
    * The Amazon S3 bucket used for hosting shared data in the Amazon S3 data access.
    */
  var KeyPrefixes: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * S3 keys made available using this asset.
    */
  var Keys: js.UndefOr[ListOfString] = js.undefined
  
  /**
    *  List of AWS KMS CMKs (Key Management System Customer Managed Keys) and ARNs used to encrypt S3 objects being shared in this S3 Data Access asset. Providers must include all AWS KMS keys used to encrypt these shared S3 objects.
    */
  var KmsKeysToGrant: js.UndefOr[ListOfKmsKeysToGrant] = js.undefined
  
  /**
    * The automatically-generated bucket-style alias for your Amazon S3 Access Point. Customers can access their entitled data using the S3 Access Point alias.
    */
  var S3AccessPointAlias: js.UndefOr[_String] = js.undefined
  
  /**
    * The ARN for your Amazon S3 Access Point. Customers can also access their entitled data using the S3 Access Point ARN.
    */
  var S3AccessPointArn: js.UndefOr[_String] = js.undefined
}
object S3DataAccessAsset {
  
  inline def apply(Bucket: _String): S3DataAccessAsset = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataAccessAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DataAccessAsset] (val x: Self) extends AnyVal {
    
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
    
    inline def setS3AccessPointAlias(value: _String): Self = StObject.set(x, "S3AccessPointAlias", value.asInstanceOf[js.Any])
    
    inline def setS3AccessPointAliasUndefined: Self = StObject.set(x, "S3AccessPointAlias", js.undefined)
    
    inline def setS3AccessPointArn(value: _String): Self = StObject.set(x, "S3AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setS3AccessPointArnUndefined: Self = StObject.set(x, "S3AccessPointArn", js.undefined)
  }
}
