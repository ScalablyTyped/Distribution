package typings.asar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asar.asar.EntryMetadata & {  files :{[property: string] : asar.asar.EntryMetadata}} */
@js.native
trait DirectoryMetadata extends Metadata {
  
  var files: StringDictionary[EntryMetadata] = js.native
  
  var unpacked: Boolean = js.native
}
object DirectoryMetadata {
  
  @scala.inline
  def apply(files: StringDictionary[EntryMetadata], unpacked: Boolean): DirectoryMetadata = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryMetadata]
  }
  
  @scala.inline
  implicit class DirectoryMetadataOps[Self <: DirectoryMetadata] (val x: Self) extends AnyVal {
    
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
    def setFiles(value: StringDictionary[EntryMetadata]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpacked(value: Boolean): Self = this.set("unpacked", value.asInstanceOf[js.Any])
  }
}
