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

