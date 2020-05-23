package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** manages multiple rectangles which make up a region. */
trait XRegion extends XInterface {
  /** returns the bounding box of the shape. */
  val Bounds: Rectangle
  /** returns all rectangles which are making up this region. */
  val Rectangles: SafeArray[Rectangle]
  /** makes this region an empty region. */
  def clear(): Unit
  /** removes the area of the specified rectangle from this region. */
  def excludeRectangle(Rect: Rectangle): Unit
  /** removes the area of the specified region from this region. */
  def excludeRegion(Region: XRegion): Unit
  /** returns the bounding box of the shape. */
  def getBounds(): Rectangle
  /** returns all rectangles which are making up this region. */
  def getRectangles(): SafeArray[Rectangle]
  /** intersects the specified rectangle with the current region. */
  def intersectRectangle(Region: Rectangle): Unit
  /** intersects the specified region with the current region. */
  def intersectRegion(Region: XRegion): Unit
  /** moves this region by the specified horizontal and vertical delta. */
  def move(nHorzMove: Double, nVertMove: Double): Unit
  /** adds the specified rectangle to this region. */
  def unionRectangle(Rect: Rectangle): Unit
  /** adds the specified region to this region. */
  def unionRegion(Region: XRegion): Unit
  /** applies an exclusive-or operation with the specified rectangle to this region. */
  def xOrRectangle(Rect: Rectangle): Unit
  /** applies an exclusive-or operation with the specified region to this region. */
  def xOrRegion(Region: XRegion): Unit
}

object XRegion {
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Rectangles: SafeArray[Rectangle],
    acquire: () => Unit,
    clear: () => Unit,
    excludeRectangle: Rectangle => Unit,
    excludeRegion: XRegion => Unit,
    getBounds: () => Rectangle,
    getRectangles: () => SafeArray[Rectangle],
    intersectRectangle: Rectangle => Unit,
    intersectRegion: XRegion => Unit,
    move: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unionRectangle: Rectangle => Unit,
    unionRegion: XRegion => Unit,
    xOrRectangle: Rectangle => Unit,
    xOrRegion: XRegion => Unit
  ): XRegion = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), excludeRectangle = js.Any.fromFunction1(excludeRectangle), excludeRegion = js.Any.fromFunction1(excludeRegion), getBounds = js.Any.fromFunction0(getBounds), getRectangles = js.Any.fromFunction0(getRectangles), intersectRectangle = js.Any.fromFunction1(intersectRectangle), intersectRegion = js.Any.fromFunction1(intersectRegion), move = js.Any.fromFunction2(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unionRectangle = js.Any.fromFunction1(unionRectangle), unionRegion = js.Any.fromFunction1(unionRegion), xOrRectangle = js.Any.fromFunction1(xOrRectangle), xOrRegion = js.Any.fromFunction1(xOrRegion))
    __obj.asInstanceOf[XRegion]
  }
}

