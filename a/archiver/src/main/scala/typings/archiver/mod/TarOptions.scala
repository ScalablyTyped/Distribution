package typings.archiver.mod

import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TarOptions extends js.Object {
  
  var gzip: js.UndefOr[Boolean] = js.native
  
  var gzipOptions: js.UndefOr[ZlibOptions] = js.native
}
object TarOptions {
  
  @scala.inline
  def apply(): TarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TarOptions]
  }
  
  @scala.inline
  implicit class TarOptionsOps[Self <: TarOptions] (val x: Self) extends AnyVal {
    
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
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    
    @scala.inline
    def setGzipOptions(value: ZlibOptions): Self = this.set("gzipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzipOptions: Self = this.set("gzipOptions", js.undefined)
  }
}
