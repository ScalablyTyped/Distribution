package typings.appBuilderLib.nsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NsisWebOptions extends NsisOptions {
  
  /**
    * The application package download URL. Optional — by default computed using publish configuration.
    *
    * URL like `https://example.com/download/latest` allows web installer to be version independent (installer will download latest application package).
    * Please note — it is [full URL](https://github.com/electron-userland/electron-builder/issues/1810#issuecomment-317650878).
    *
    * Custom `X-Arch` http header is set to `32` or `64`.
    */
  val appPackageUrl: js.UndefOr[String | Null] = js.native
}
object NsisWebOptions {
  
  @scala.inline
  def apply(): NsisWebOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NsisWebOptions]
  }
  
  @scala.inline
  implicit class NsisWebOptionsOps[Self <: NsisWebOptions] (val x: Self) extends AnyVal {
    
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
    def setAppPackageUrl(value: String): Self = this.set("appPackageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPackageUrl: Self = this.set("appPackageUrl", js.undefined)
    
    @scala.inline
    def setAppPackageUrlNull: Self = this.set("appPackageUrl", null)
  }
}
