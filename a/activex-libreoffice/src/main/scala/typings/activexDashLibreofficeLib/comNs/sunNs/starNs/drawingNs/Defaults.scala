package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a set of properties to access the defaults of a drawing document
  * @see DrawingDocumentFactory
  */
trait Defaults
  extends TextProperties
     with LineProperties
     with FillProperties
     with ShadowProperties
     with ConnectorProperties
     with MeasureProperties

object Defaults {
  @scala.inline
  def apply(
    ConnectorProperties: ConnectorProperties = null,
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    MeasureProperties: MeasureProperties = null,
    ShadowProperties: ShadowProperties = null,
    TextProperties: TextProperties = null
  ): Defaults = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ConnectorProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, MeasureProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextProperties)
    __obj.asInstanceOf[Defaults]
  }
}

