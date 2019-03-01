package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a {@link CustomShape} */
trait CustomShapeEngine
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with XCustomShapeEngine

object CustomShapeEngine {
  @scala.inline
  def apply(
    Interaction: activexDashInteropLib.SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: js.Function0[scala.Unit],
    getInteraction: js.Function0[activexDashInteropLib.SafeArray[XCustomShapeHandle]],
    getLineGeometry: js.Function0[PolyPolygonBezierCoords],
    getTextBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    render: js.Function0[XShape]
  ): CustomShapeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Interaction")(Interaction)
    __obj.updateDynamic("LineGeometry")(LineGeometry)
    __obj.updateDynamic("TextBounds")(TextBounds)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getInteraction")(getInteraction)
    __obj.updateDynamic("getLineGeometry")(getLineGeometry)
    __obj.updateDynamic("getTextBounds")(getTextBounds)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[CustomShapeEngine]
  }
}

