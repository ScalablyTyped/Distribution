package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportS3DataInput extends StObject {
  
  /**
    * The Key Management Service key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * The URL to the Amazon S3 data input.
    */
  var S3Uri: typings.awsSdk.clientsSagemakergeospatialMod.S3Uri
}
object ExportS3DataInput {
  
  inline def apply(S3Uri: S3Uri): ExportS3DataInput = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportS3DataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportS3DataInput] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKey): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
