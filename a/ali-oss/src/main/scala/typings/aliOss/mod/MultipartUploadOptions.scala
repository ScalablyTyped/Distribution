package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartUploadOptions extends StObject {
  
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  
  // the progress callback called after each successful upload of one part
  var checkpoint: js.UndefOr[Checkpoint] = js.undefined
  
  var copyheaders: js.UndefOr[js.Object] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  // the checkpoint to resume upload, if this is provided, it will continue the upload from where interrupted, otherwise a new multipart upload will be created.
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  var mime: js.UndefOr[String] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  // the number of parts to be uploaded in parallel
  var partSize: js.UndefOr[Double] = js.undefined
  
  // the suggested size for each part
  var progress: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object MultipartUploadOptions {
  
  @scala.inline
  def apply(): MultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartUploadOptions]
  }
  
  @scala.inline
  implicit class MultipartUploadOptionsMutableBuilder[Self <: MultipartUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCheckpoint(value: Checkpoint): Self = StObject.set(x, "checkpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointUndefined: Self = StObject.set(x, "checkpoint", js.undefined)
    
    @scala.inline
    def setCopyheaders(value: js.Object): Self = StObject.set(x, "copyheaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyheadersUndefined: Self = StObject.set(x, "copyheaders", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    @scala.inline
    def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    @scala.inline
    def setProgress(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
