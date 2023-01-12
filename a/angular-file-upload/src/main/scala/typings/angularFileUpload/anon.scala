package typings.angularFileUpload

import typings.angularFileUpload.mod.FileItem
import typings.angularFileUpload.mod.Filter
import typings.std.FormData
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<angular-file-upload.angular-file-upload.FileUploaderOptions> */
  trait PartialFileUploaderOption extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var autoUpload: js.UndefOr[Boolean] = js.undefined
    
    var disableMultipart: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[js.Array[Filter]] = js.undefined
    
    var formData: js.UndefOr[js.Array[FormData]] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var queue: js.UndefOr[js.Array[FileItem]] = js.undefined
    
    var queueLimit: js.UndefOr[Double] = js.undefined
    
    var removeAfterUpload: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PartialFileUploaderOption {
    
    inline def apply(): PartialFileUploaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileUploaderOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFileUploaderOption] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
      
      inline def setDisableMultipart(value: Boolean): Self = StObject.set(x, "disableMultipart", value.asInstanceOf[js.Any])
      
      inline def setDisableMultipartUndefined: Self = StObject.set(x, "disableMultipart", js.undefined)
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFormData(value: js.Array[FormData]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setFormDataVarargs(value: FormData*): Self = StObject.set(x, "formData", js.Array(value*))
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setQueue(value: js.Array[FileItem]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      inline def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      inline def setQueueVarargs(value: FileItem*): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setRemoveAfterUpload(value: Boolean): Self = StObject.set(x, "removeAfterUpload", value.asInstanceOf[js.Any])
      
      inline def setRemoveAfterUploadUndefined: Self = StObject.set(x, "removeAfterUpload", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
