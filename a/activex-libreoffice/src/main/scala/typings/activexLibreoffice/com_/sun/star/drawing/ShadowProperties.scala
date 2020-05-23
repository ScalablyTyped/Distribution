package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering a shadow. */
trait ShadowProperties extends js.Object {
  /**
    * enables/disables the shadow of a {@link Shape} .
    *
    * The other shadow properties are only applied if this is set to `TRUE` .
    */
  var Shadow: Boolean
  /** This is the color of the shadow of this {@link Shape} . */
  var ShadowColor: Color
  /** This defines the degree of transparence of the shadow in percent. */
  var ShadowTransparence: Double
  /** This is the horizontal distance of the left edge of the {@link Shape} to the shadow. */
  var ShadowXDistance: Double
  /** This is the vertical distance of the top edge of the {@link Shape} to the shadow. */
  var ShadowYDistance: Double
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
}

