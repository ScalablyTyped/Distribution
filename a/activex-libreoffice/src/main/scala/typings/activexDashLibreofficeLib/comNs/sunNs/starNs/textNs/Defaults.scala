package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides default settings of a text component for paragraph and character properties. */
trait Defaults
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex {
  /** default tab-distance to be used. */
  var TabStopDistance: scala.Double
}

object Defaults {
  @scala.inline
  def apply(
    CharacterProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = null,
    CharacterPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = null,
    ParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = null,
    ParagraphPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = null,
    ParagraphPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = null,
    TabStopDistance: scala.Double,
    XPropertySet: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = null
  ): Defaults = {
    val __obj = js.Dynamic.literal(TabStopDistance = TabStopDistance)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XPropertySet)
    __obj.asInstanceOf[Defaults]
  }
}

