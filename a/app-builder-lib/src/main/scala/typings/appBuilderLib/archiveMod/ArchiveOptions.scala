package typings.appBuilderLib.archiveMod

import typings.appBuilderLib.appBuilderLibStrings.Copy
import typings.appBuilderLib.appBuilderLibStrings.DEFAULT
import typings.appBuilderLib.appBuilderLibStrings.Deflate
import typings.appBuilderLib.appBuilderLibStrings.LZMA
import typings.appBuilderLib.coreMod.CompressionLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveOptions extends js.Object {
  
  var compression: js.UndefOr[CompressionLevel | Null] = js.native
  
  var dictSize: js.UndefOr[Double] = js.native
  
  var excluded: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * @default true
    */
  var isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.native
  
  var isRegularFile: js.UndefOr[Boolean] = js.native
  
  var method: js.UndefOr[Copy | LZMA | Deflate | DEFAULT] = js.native
  
  /**
    * @default true
    */
  var solid: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var withoutDir: js.UndefOr[Boolean] = js.native
}
object ArchiveOptions {
  
  @scala.inline
  def apply(): ArchiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveOptions]
  }
  
  @scala.inline
  implicit class ArchiveOptionsOps[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: CompressionLevel): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setCompressionNull: Self = this.set("compression", null)
    
    @scala.inline
    def setDictSize(value: Double): Self = this.set("dictSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictSize: Self = this.set("dictSize", js.undefined)
    
    @scala.inline
    def setExcludedVarargs(value: String*): Self = this.set("excluded", js.Array(value :_*))
    
    @scala.inline
    def setExcluded(value: js.Array[String]): Self = this.set("excluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcluded: Self = this.set("excluded", js.undefined)
    
    @scala.inline
    def setExcludedNull: Self = this.set("excluded", null)
    
    @scala.inline
    def setIsArchiveHeaderCompressed(value: Boolean): Self = this.set("isArchiveHeaderCompressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsArchiveHeaderCompressed: Self = this.set("isArchiveHeaderCompressed", js.undefined)
    
    @scala.inline
    def setIsRegularFile(value: Boolean): Self = this.set("isRegularFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRegularFile: Self = this.set("isRegularFile", js.undefined)
    
    @scala.inline
    def setMethod(value: Copy | LZMA | Deflate | DEFAULT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = this.set("solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolid: Self = this.set("solid", js.undefined)
    
    @scala.inline
    def setWithoutDir(value: Boolean): Self = this.set("withoutDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutDir: Self = this.set("withoutDir", js.undefined)
  }
}
