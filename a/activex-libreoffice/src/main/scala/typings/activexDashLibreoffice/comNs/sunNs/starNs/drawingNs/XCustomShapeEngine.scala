package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeEngine} */
trait XCustomShapeEngine extends XInterface {
  /** @returns a collection of interaction handles */
  val Interaction: SafeArray[XCustomShapeHandle]
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords
  /** @returns the text bound of the shape */
  val TextBounds: Rectangle
  /** @returns a collection of interaction handles */
  def getInteraction(): SafeArray[XCustomShapeHandle]
  /** @returns the line geometry of the object */
  def getLineGeometry(): PolyPolygonBezierCoords
  /** @returns the text bound of the shape */
  def getTextBounds(): Rectangle
  /** @returns a the shape that is representing the {@link CustomShape} */
  def render(): XShape
}

object XCustomShapeEngine {
  @scala.inline
  def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: () => Unit,
    getInteraction: () => SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: () => XShape
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction, LineGeometry = LineGeometry, TextBounds = TextBounds, acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[XCustomShapeEngine]
  }
}

