package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAtRest extends StObject {
  
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data.
    */
  var CatalogEncryptionMode: typings.awsSdk.clientsGlueMod.CatalogEncryptionMode
  
  /**
    * The ID of the KMS key to use for encryption at rest.
    */
  var SseAwsKmsKeyId: js.UndefOr[NameString] = js.undefined
}
object EncryptionAtRest {
  
  inline def apply(CatalogEncryptionMode: CatalogEncryptionMode): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(CatalogEncryptionMode = CatalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionAtRest] (val x: Self) extends AnyVal {
    
    inline def setCatalogEncryptionMode(value: CatalogEncryptionMode): Self = StObject.set(x, "CatalogEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setSseAwsKmsKeyId(value: NameString): Self = StObject.set(x, "SseAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseAwsKmsKeyIdUndefined: Self = StObject.set(x, "SseAwsKmsKeyId", js.undefined)
  }
}
