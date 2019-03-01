package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Panose extends js.Object {
  var ArmStyle: scala.Double
  var Contrast: scala.Double
  var FamilyType: scala.Double
  var Letterform: scala.Double
  var Midline: scala.Double
  var Proportion: scala.Double
  var SerifStyle: scala.Double
  var StrokeVariation: scala.Double
  var Weight: scala.Double
  var XHeight: scala.Double
}

object Panose {
  @scala.inline
  def apply(
    ArmStyle: scala.Double,
    Contrast: scala.Double,
    FamilyType: scala.Double,
    Letterform: scala.Double,
    Midline: scala.Double,
    Proportion: scala.Double,
    SerifStyle: scala.Double,
    StrokeVariation: scala.Double,
    Weight: scala.Double,
    XHeight: scala.Double
  ): Panose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArmStyle")(ArmStyle)
    __obj.updateDynamic("Contrast")(Contrast)
    __obj.updateDynamic("FamilyType")(FamilyType)
    __obj.updateDynamic("Letterform")(Letterform)
    __obj.updateDynamic("Midline")(Midline)
    __obj.updateDynamic("Proportion")(Proportion)
    __obj.updateDynamic("SerifStyle")(SerifStyle)
    __obj.updateDynamic("StrokeVariation")(StrokeVariation)
    __obj.updateDynamic("Weight")(Weight)
    __obj.updateDynamic("XHeight")(XHeight)
    __obj.asInstanceOf[Panose]
  }
}

