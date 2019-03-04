package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  var Shadow: scala.Boolean
  /** This is the color of the shadow of this {@link Shape} . */
  var ShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** This defines the degree of transparence of the shadow in percent. */
  var ShadowTransparence: scala.Double
  /** This is the horizontal distance of the left edge of the {@link Shape} to the shadow. */
  var ShadowXDistance: scala.Double
  /** This is the vertical distance of the top edge of the {@link Shape} to the shadow. */
  var ShadowYDistance: scala.Double
}

object ShadowProperties {
  @scala.inline
  def apply(
    Shadow: scala.Boolean,
    ShadowColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ShadowTransparence: scala.Double,
    ShadowXDistance: scala.Double,
    ShadowYDistance: scala.Double
  ): ShadowProperties = {
    val __obj = js.Dynamic.literal(Shadow = Shadow, ShadowColor = ShadowColor, ShadowTransparence = ShadowTransparence, ShadowXDistance = ShadowXDistance, ShadowYDistance = ShadowYDistance)
  
    __obj.asInstanceOf[ShadowProperties]
  }
}

