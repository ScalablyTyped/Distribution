package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUploadsQuery extends js.Object {
  
  var `key-marker`: js.UndefOr[String] = js.native
  
  var `max-uploads`: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var `upload-id-marker`: js.UndefOr[String] = js.native
}
object ListUploadsQuery {
  
  @scala.inline
  def apply(): ListUploadsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUploadsQuery]
  }
  
  @scala.inline
  implicit class ListUploadsQueryOps[Self <: ListUploadsQuery] (val x: Self) extends AnyVal {
    
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
    def `setKey-marker`(value: String): Self = this.set("key-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteKey-marker`: Self = this.set("key-marker", js.undefined)
    
    @scala.inline
    def `setMax-uploads`(value: Double): Self = this.set("max-uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-uploads`: Self = this.set("max-uploads", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def `setUpload-id-marker`(value: String): Self = this.set("upload-id-marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUpload-id-marker`: Self = this.set("upload-id-marker", js.undefined)
  }
}
