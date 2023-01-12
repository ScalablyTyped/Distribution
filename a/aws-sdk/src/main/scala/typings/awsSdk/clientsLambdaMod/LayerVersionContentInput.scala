package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerVersionContentInput extends StObject {
  
  /**
    * The Amazon S3 bucket of the layer archive.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.clientsLambdaMod.S3Bucket] = js.undefined
  
  /**
    * The Amazon S3 key of the layer archive.
    */
  var S3Key: js.UndefOr[typings.awsSdk.clientsLambdaMod.S3Key] = js.undefined
  
  /**
    * For versioned objects, the version of the layer archive object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsSdk.clientsLambdaMod.S3ObjectVersion] = js.undefined
  
  /**
    * The base64-encoded contents of the layer archive. Amazon Web Services SDK and Amazon Web Services CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.undefined
}
object LayerVersionContentInput {
  
  inline def apply(): LayerVersionContentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerVersionContentInput] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    inline def setS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
    
    inline def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    inline def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}
