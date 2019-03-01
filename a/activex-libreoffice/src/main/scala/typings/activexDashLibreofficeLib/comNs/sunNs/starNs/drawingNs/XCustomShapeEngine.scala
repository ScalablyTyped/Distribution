package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeEngine} */
trait XCustomShapeEngine
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a collection of interaction handles */
  val Interaction: activexDashInteropLib.SafeArray[XCustomShapeHandle]
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords
  /** @returns the text bound of the shape */
  val TextBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns a collection of interaction handles */
  def getInteraction(): activexDashInteropLib.SafeArray[XCustomShapeHandle]
  /** @returns the line geometry of the object */
  def getLineGeometry(): PolyPolygonBezierCoords
  /** @returns the text bound of the shape */
  def getTextBounds(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns a the shape that is representing the {@link CustomShape} */
  def render(): XShape
}

object XCustomShapeEngine {
  @scala.inline
  def apply(
    Interaction: activexDashInteropLib.SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: js.Function0[scala.Unit],
    getInteraction: js.Function0[activexDashInteropLib.SafeArray[XCustomShapeHandle]],
    getLineGeometry: js.Function0[PolyPolygonBezierCoords],
    getTextBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    render: js.Function0[XShape]
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Interaction")(Interaction)
    __obj.updateDynamic("LineGeometry")(LineGeometry)
    __obj.updateDynamic("TextBounds")(TextBounds)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getInteraction")(getInteraction)
    __obj.updateDynamic("getLineGeometry")(getLineGeometry)
    __obj.updateDynamic("getTextBounds")(getTextBounds)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[XCustomShapeEngine]
  }
}

