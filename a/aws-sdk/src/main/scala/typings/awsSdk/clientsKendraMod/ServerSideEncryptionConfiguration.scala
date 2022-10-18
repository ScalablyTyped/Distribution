package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The identifier of the KMS key. Amazon Kendra doesn't support asymmetric keys.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsKendraMod.KmsKeyId] = js.undefined
}
object ServerSideEncryptionConfiguration {
  
  inline def apply(): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  extension [Self <: ServerSideEncryptionConfiguration](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
