package typings.apidoc.mod

import typings.apidoc.anon.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedFile extends js.Object {
  
  var blocks: js.Array[Global] = js.native
  
  var extension: String = js.native
  
  var filename: String = js.native
  
  var src: String = js.native
}
object ParsedFile {
  
  @scala.inline
  def apply(blocks: js.Array[Global], extension: String, filename: String, src: String): ParsedFile = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedFile]
  }
  
  @scala.inline
  implicit class ParsedFileOps[Self <: ParsedFile] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: Global*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[Global]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
