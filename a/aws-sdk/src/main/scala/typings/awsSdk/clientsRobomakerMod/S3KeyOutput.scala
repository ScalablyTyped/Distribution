package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3KeyOutput extends StObject {
  
  /**
    * The etag for the object.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The S3 key.
    */
  var s3Key: js.UndefOr[S3KeyOrPrefix] = js.undefined
}
object S3KeyOutput {
  
  inline def apply(): S3KeyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3KeyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3KeyOutput] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setS3Key(value: S3KeyOrPrefix): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
  }
}
