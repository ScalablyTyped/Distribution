package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeEngine} */
trait XCustomShapeEngine
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns a collection of interaction handles */
  val Interaction: stdLib.SafeArray[XCustomShapeHandle]
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords
  /** @returns the text bound of the shape */
  val TextBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /** @returns a collection of interaction handles */
  def getInteraction(): stdLib.SafeArray[XCustomShapeHandle]
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
    Interaction: stdLib.SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    acquire: () => scala.Unit,
    getInteraction: () => stdLib.SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    render: () => XShape
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction, LineGeometry = LineGeometry, TextBounds = TextBounds, acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[XCustomShapeEngine]
  }
}

