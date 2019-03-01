package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This abstract service specifies the general characteristics of an optional text inside a {@link Shape} . */
trait Text
  extends TextProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText

object Text {
  @scala.inline
  def apply(
    TextProperties: TextProperties = null,
    XText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText = null
  ): Text = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XText)
    __obj.asInstanceOf[Text]
  }
}

