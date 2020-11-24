package typings.angularFileUpload.mod

import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileUploaderOptions extends js.Object {
  
  /**
    * Name of the field which will contain the file, default is file
    * @default file
    */
  var alias: String = js.native
  
  /**
    * Automatically upload files after adding them to the queue
    * @default false
    */
  var autoUpload: Boolean = js.native
  
  /**
    * Disable multipart.
    * @default false
    */
  var disableMultipart: Boolean = js.native
  
  /**
    * Filters to be applied to the files before adding them to the queue. If the filter returns true the file will be added to the queue
    * @default [folderFilter, queueLimitFilter]
    */
  var filters: js.Array[Filter] = js.native
  
  /**
    * Data to be sent along with the files
    * @default []
    */
  var formData: js.Array[FormData] = js.native
  
  /**
    * Headers to be sent along with the files. HTML5 browsers only.
    * @default {}
    */
  var headers: Headers = js.native
  
  /**
    * It's a request method. HTML5 browsers only.
    * @default POST
    */
  var method: String = js.native
  
  /**
    * Items to be uploaded
    * @default []
    */
  var queue: js.Array[FileItem] = js.native
  
  /**
    * Maximum count of files.
    * @default Number.MAX_VALUE
    */
  var queueLimit: Double = js.native
  
  /**
    * Remove files from the queue after uploading
    * @default false
    */
  var removeAfterUpload: Boolean = js.native
  
  /**
    * Path on the server to upload files
    * @default /
    */
  var url: String = js.native
  
  /**
    * enable CORS. HTML5 browsers only.
    * @default false
    */
  var withCredentials: Boolean = js.native
}
object FileUploaderOptions {
  
  @scala.inline
  def apply(
    alias: String,
    autoUpload: Boolean,
    disableMultipart: Boolean,
    filters: js.Array[Filter],
    formData: js.Array[FormData],
    headers: Headers,
    method: String,
    queue: js.Array[FileItem],
    queueLimit: Double,
    removeAfterUpload: Boolean,
    url: String,
    withCredentials: Boolean
  ): FileUploaderOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], autoUpload = autoUpload.asInstanceOf[js.Any], disableMultipart = disableMultipart.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], queueLimit = queueLimit.asInstanceOf[js.Any], removeAfterUpload = removeAfterUpload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploaderOptions]
  }
  
  @scala.inline
  implicit class FileUploaderOptionsOps[Self <: FileUploaderOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMultipart(value: Boolean): Self = this.set("disableMultipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[Filter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataVarargs(value: FormData*): Self = this.set("formData", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Array[FormData]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueVarargs(value: FileItem*): Self = this.set("queue", js.Array(value :_*))
    
    @scala.inline
    def setQueue(value: js.Array[FileItem]): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueLimit(value: Double): Self = this.set("queueLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAfterUpload(value: Boolean): Self = this.set("removeAfterUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
}
