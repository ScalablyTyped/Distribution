package typings.angularFileUpload.anon

import typings.angularFileUpload.mod.FileItem
import typings.angularFileUpload.mod.Filter
import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<angular-file-upload.angular-file-upload.FileUploaderOptions> */
@js.native
trait PartialFileUploaderOption extends js.Object {
  
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
  implicit class PartialFileUploaderOptionOps[Self <: PartialFileUploaderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    
    @scala.inline
    def setDisableMultipart(value: Boolean): Self = this.set("disableMultipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMultipart: Self = this.set("disableMultipart", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[Filter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFormDataVarargs(value: FormData*): Self = this.set("formData", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Array[FormData]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQueueVarargs(value: FileItem*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: js.Array[FileItem]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    
    @scala.inline
    def setQueueLimit(value: Double): Self = this.set("queueLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueueLimit: Self = this.set("queueLimit", js.undefined)
    
    @scala.inline
    def setRemoveAfterUpload(value: Boolean): Self = this.set("removeAfterUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAfterUpload: Self = this.set("removeAfterUpload", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
