package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages multiple rectangles which make up a region. */
trait XRegion
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the bounding box of the shape. */
  val Bounds: Rectangle
  /** returns all rectangles which are making up this region. */
  val Rectangles: stdLib.SafeArray[Rectangle]
  /** makes this region an empty region. */
  def clear(): scala.Unit
  /** removes the area of the specified rectangle from this region. */
  def excludeRectangle(Rect: Rectangle): scala.Unit
  /** removes the area of the specified region from this region. */
  def excludeRegion(Region: XRegion): scala.Unit
  /** returns the bounding box of the shape. */
  def getBounds(): Rectangle
  /** returns all rectangles which are making up this region. */
  def getRectangles(): stdLib.SafeArray[Rectangle]
  /** intersects the specified rectangle with the current region. */
  def intersectRectangle(Region: Rectangle): scala.Unit
  /** intersects the specified region with the current region. */
  def intersectRegion(Region: XRegion): scala.Unit
  /** moves this region by the specified horizontal and vertical delta. */
  def move(nHorzMove: scala.Double, nVertMove: scala.Double): scala.Unit
  /** adds the specified rectangle to this region. */
  def unionRectangle(Rect: Rectangle): scala.Unit
  /** adds the specified region to this region. */
  def unionRegion(Region: XRegion): scala.Unit
  /** applies an exclusive-or operation with the specified rectangle to this region. */
  def xOrRectangle(Rect: Rectangle): scala.Unit
  /** applies an exclusive-or operation with the specified region to this region. */
  def xOrRegion(Region: XRegion): scala.Unit
}

object XRegion {
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Rectangles: stdLib.SafeArray[Rectangle],
    acquire: () => scala.Unit,
    clear: () => scala.Unit,
    excludeRectangle: Rectangle => scala.Unit,
    excludeRegion: XRegion => scala.Unit,
    getBounds: () => Rectangle,
    getRectangles: () => stdLib.SafeArray[Rectangle],
    intersectRectangle: Rectangle => scala.Unit,
    intersectRegion: XRegion => scala.Unit,
    move: (scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    unionRectangle: Rectangle => scala.Unit,
    unionRegion: XRegion => scala.Unit,
    xOrRectangle: Rectangle => scala.Unit,
    xOrRegion: XRegion => scala.Unit
  ): XRegion = {
    val __obj = js.Dynamic.literal(Bounds = Bounds, Rectangles = Rectangles, acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), excludeRectangle = js.Any.fromFunction1(excludeRectangle), excludeRegion = js.Any.fromFunction1(excludeRegion), getBounds = js.Any.fromFunction0(getBounds), getRectangles = js.Any.fromFunction0(getRectangles), intersectRectangle = js.Any.fromFunction1(intersectRectangle), intersectRegion = js.Any.fromFunction1(intersectRegion), move = js.Any.fromFunction2(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unionRectangle = js.Any.fromFunction1(unionRectangle), unionRegion = js.Any.fromFunction1(unionRegion), xOrRectangle = js.Any.fromFunction1(xOrRectangle), xOrRegion = js.Any.fromFunction1(xOrRegion))
  
    __obj.asInstanceOf[XRegion]
  }
}

