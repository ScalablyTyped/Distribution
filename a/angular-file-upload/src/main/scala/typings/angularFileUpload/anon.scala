package typings.angularFileUpload

import typings.angularFileUpload.mod.FileItem
import typings.angularFileUpload.mod.Filter
import typings.std.FormData
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<angular-file-upload.angular-file-upload.FileUploaderOptions> */
  @js.native
  trait PartialFileUploaderOption extends StObject {
    
    var alias: js.UndefOr[String] = js.native
    
    var autoUpload: js.UndefOr[Boolean] = js.native
    
    var disableMultipart: js.UndefOr[Boolean] = js.native
    
    var filters: js.UndefOr[js.Array[Filter]] = js.native
    
    var formData: js.UndefOr[js.Array[FormData]] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var queue: js.UndefOr[js.Array[FileItem]] = js.native
    
    var queueLimit: js.UndefOr[Double] = js.native
    
    var removeAfterUpload: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object PartialFileUploaderOption {
    
    @scala.inline
    def apply(): PartialFileUploaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileUploaderOption]
    }
    
    @scala.inline
    implicit class PartialFileUploaderOptionMutableBuilder[Self <: PartialFileUploaderOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
      
      @scala.inline
      def setDisableMultipart(value: Boolean): Self = StObject.set(x, "disableMultipart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMultipartUndefined: Self = StObject.set(x, "disableMultipart", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setFormData(value: js.Array[FormData]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      @scala.inline
      def setFormDataVarargs(value: FormData*): Self = StObject.set(x, "formData", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setQueue(value: js.Array[FileItem]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueLimit(value: Double): Self = StObject.set(x, "queueLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueLimitUndefined: Self = StObject.set(x, "queueLimit", js.undefined)
      
      @scala.inline
      def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
      
      @scala.inline
      def setQueueVarargs(value: FileItem*): Self = StObject.set(x, "queue", js.Array(value :_*))
      
      @scala.inline
      def setRemoveAfterUpload(value: Boolean): Self = StObject.set(x, "removeAfterUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAfterUploadUndefined: Self = StObject.set(x, "removeAfterUpload", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
