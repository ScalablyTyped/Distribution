package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style for rendering a shadow. */
@js.native
trait ShadowProperties extends js.Object {
  
  /**
    * enables/disables the shadow of a {@link Shape} .
    *
    * The other shadow properties are only applied if this is set to `TRUE` .
    */
  var Shadow: Boolean = js.native
  
  /** This is the color of the shadow of this {@link Shape} . */
  var ShadowColor: Color = js.native
  
  /** This defines the degree of transparence of the shadow in percent. */
  var ShadowTransparence: Double = js.native
  
  /** This is the horizontal distance of the left edge of the {@link Shape} to the shadow. */
  var ShadowXDistance: Double = js.native
  
  /** This is the vertical distance of the top edge of the {@link Shape} to the shadow. */
  var ShadowYDistance: Double = js.native
}
object ShadowProperties {
  
  @scala.inline
  def apply(
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double
  ): ShadowProperties = {
    val __obj = js.Dynamic.literal(Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProperties]
  }
  
  @scala.inline
  implicit class ShadowPropertiesOps[Self <: ShadowProperties] (val x: Self) extends AnyVal {
    
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
    def setShadow(value: Boolean): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: Color): Self = this.set("ShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowTransparence(value: Double): Self = this.set("ShadowTransparence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowXDistance(value: Double): Self = this.set("ShadowXDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowYDistance(value: Double): Self = this.set("ShadowYDistance", value.asInstanceOf[js.Any])
  }
}
