package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataInput extends StObject {
  
  /**
    * The Key Management Service key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * Metadata provider from whom the Amazon S3 data has been acquired.
    */
  var MetadataProvider: typings.awsSdk.clientsSagemakergeospatialMod.MetadataProvider
  
  /**
    * The URL to the Amazon S3 input.
    */
  var S3Uri: typings.awsSdk.clientsSagemakergeospatialMod.S3Uri
}
object S3DataInput {
  
  inline def apply(MetadataProvider: MetadataProvider, S3Uri: S3Uri): S3DataInput = {
    val __obj = js.Dynamic.literal(MetadataProvider = MetadataProvider.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DataInput] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMetadataProvider(value: MetadataProvider): Self = StObject.set(x, "MetadataProvider", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
