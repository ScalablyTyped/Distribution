package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the settings of a cell shadow. */
@js.native
trait ShadowFormat extends js.Object {
  
  /** contains the color value of the shadow. */
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /** is `TRUE` , if shadow is transparent. */
  var IsTransparent: Boolean = js.native
  
  /** contains the location of the shadow. */
  var Location: ShadowLocation = js.native
  
  /** contains the size of the shadow. */
  var ShadowWidth: Double = js.native
}
object ShadowFormat {
  
  @scala.inline
  def apply(Color: Color, IsTransparent: Boolean, Location: ShadowLocation, ShadowWidth: Double): ShadowFormat = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], IsTransparent = IsTransparent.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], ShadowWidth = ShadowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowFormat]
  }
  
  @scala.inline
  implicit class ShadowFormatOps[Self <: ShadowFormat] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransparent(value: Boolean): Self = this.set("IsTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ShadowLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowWidth(value: Double): Self = this.set("ShadowWidth", value.asInstanceOf[js.Any])
  }
}
