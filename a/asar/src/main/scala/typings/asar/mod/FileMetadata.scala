package typings.asar.mod

import typings.asar.asarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asar.asar.EntryMetadata & {  executable :true | undefined,   offset :number | undefined,   size :number | undefined} */
@js.native
trait FileMetadata extends Metadata {
  
  var executable: js.UndefOr[`true`] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var unpacked: Boolean = js.native
}
object FileMetadata {
  
  @scala.inline
  def apply(unpacked: Boolean): FileMetadata = {
    val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMetadata]
  }
  
  @scala.inline
  implicit class FileMetadataOps[Self <: FileMetadata] (val x: Self) extends AnyVal {
    
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
    def setUnpacked(value: Boolean): Self = this.set("unpacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutable(value: `true`): Self = this.set("executable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutable: Self = this.set("executable", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
