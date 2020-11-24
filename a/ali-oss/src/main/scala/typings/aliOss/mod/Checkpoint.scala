package typings.aliOss.mod

import typings.aliOss.anon.Etag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkpoint extends js.Object {
  
  var doneParts: js.Array[Etag] = js.native
  
  var file: js.Any = js.native
  
   //  object key
  var fileSize: Double = js.native
  
   // The file object selected by the user, if the browser is restarted, it needs the user to manually trigger the settings
  var name: String = js.native
  
  var partSize: Double = js.native
  
  var uploadId: String = js.native
}
object Checkpoint {
  
  @scala.inline
  def apply(
    doneParts: js.Array[Etag],
    file: js.Any,
    fileSize: Double,
    name: String,
    partSize: Double,
    uploadId: String
  ): Checkpoint = {
    val __obj = js.Dynamic.literal(doneParts = doneParts.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partSize = partSize.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkpoint]
  }
  
  @scala.inline
  implicit class CheckpointOps[Self <: Checkpoint] (val x: Self) extends AnyVal {
    
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
    def setDonePartsVarargs(value: Etag*): Self = this.set("doneParts", js.Array(value :_*))
    
    @scala.inline
    def setDoneParts(value: js.Array[Etag]): Self = this.set("doneParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: js.Any): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
  }
}
