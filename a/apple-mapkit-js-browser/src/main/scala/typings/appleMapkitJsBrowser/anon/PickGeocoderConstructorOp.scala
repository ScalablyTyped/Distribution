package typings.appleMapkitJsBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<apple-mapkit-js-browser.mapkit.GeocoderConstructorOptions, 'language'> */
@js.native
trait PickGeocoderConstructorOp extends js.Object {
  
  var language: js.UndefOr[String] = js.native
}
object PickGeocoderConstructorOp {
  
  @scala.inline
  def apply(): PickGeocoderConstructorOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickGeocoderConstructorOp]
  }
  
  @scala.inline
  implicit class PickGeocoderConstructorOpOps[Self <: PickGeocoderConstructorOp] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
