package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharingSettings extends StObject {
  
  /**
    * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
    */
  var NotebookOutputOption: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NotebookOutputOption] = js.undefined
  
  /**
    * When NotebookOutputOption is Allowed, the Amazon Web Services Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
    */
  var S3KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.undefined
}
object SharingSettings {
  
  inline def apply(): SharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharingSettings]
  }
  
  extension [Self <: SharingSettings](x: Self) {
    
    inline def setNotebookOutputOption(value: NotebookOutputOption): Self = StObject.set(x, "NotebookOutputOption", value.asInstanceOf[js.Any])
    
    inline def setNotebookOutputOptionUndefined: Self = StObject.set(x, "NotebookOutputOption", js.undefined)
    
    inline def setS3KmsKeyId(value: KmsKeyId): Self = StObject.set(x, "S3KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setS3KmsKeyIdUndefined: Self = StObject.set(x, "S3KmsKeyId", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
  }
}
