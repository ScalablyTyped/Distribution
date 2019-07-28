package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScale extends XConditionEntry {
  var ColorScaleEntries: SafeArray[XColorScaleEntry]
}

object ColorScale {
  @scala.inline
  def apply(
    ColorScaleEntries: SafeArray[XColorScaleEntry],
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[ColorScale]
  }
}

