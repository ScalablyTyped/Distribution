package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * points to a sequence of characters within a {@link Text} .
  *
  * The service provides access to the string content and the properties of this range of text and the {@link TextContent} instances which are bound to
  * this text range.
  *
  * A {@link TextRange} is also used for a **text portion** which is returned by the {@link com.sun.star.container.XEnumeration} for a single paragraph.
  * Because this is the mechanism to use to export data, all formatting attributes and contents bound to this range have to be available from
  * implementations of this service.
  * @see Text
  */
trait TextRange
  extends XTextRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyState
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContentEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex

object TextRange {
  @scala.inline
  def apply(
    CharacterProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = null,
    CharacterPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = null,
    ParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = null,
    ParagraphPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = null,
    ParagraphPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = null,
    XContentEnumerationAccess: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContentEnumerationAccess = null,
    XPropertySet: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet = null,
    XPropertyState: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyState = null,
    XTextRange: XTextRange = null
  ): TextRange = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XContentEnumerationAccess)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XPropertySet)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XPropertyState)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTextRange)
    __obj.asInstanceOf[TextRange]
  }
}

