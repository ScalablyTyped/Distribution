package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct defines the appearance of a hatch.
  *
  * A hatch is a texture made of straight lines.
  */
trait Hatch extends js.Object {
  /** You can rotate the lines of the hatch with this angle. */
  var Angle: Double
  /** This is the color of the hatch lines. */
  var Color: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  /** This is the distance between the lines in the hatch. */
  var Distance: Double
  /** The HatchStyle defines the kind of lines used to draw this hatch. */
  var Style: HatchStyle
}

object Hatch {
  @scala.inline
  def apply(Angle: Double, Color: Color, Distance: Double, Style: HatchStyle): Hatch = {
    val __obj = js.Dynamic.literal(Angle = Angle, Color = Color, Distance = Distance, Style = Style)
  
    __obj.asInstanceOf[Hatch]
  }
}

