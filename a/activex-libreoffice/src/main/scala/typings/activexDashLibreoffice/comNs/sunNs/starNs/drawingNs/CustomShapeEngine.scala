package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a {@link CustomShape} */
trait CustomShapeEngine
  extends XInitialization
     with XCustomShapeEngine

object CustomShapeEngine {
  @scala.inline
  def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: () => Unit,
    getInteraction: () => SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => Rectangle,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: () => XShape
  ): CustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction, LineGeometry = LineGeometry, TextBounds = TextBounds, acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[CustomShapeEngine]
  }
}

