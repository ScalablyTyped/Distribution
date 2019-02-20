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
  val Rectangles: activexDashInteropLib.SafeArray[Rectangle]
  /** makes this region an empty region. */
  def clear(): scala.Unit
  /** removes the area of the specified rectangle from this region. */
  def excludeRectangle(Rect: Rectangle): scala.Unit
  /** removes the area of the specified region from this region. */
  def excludeRegion(Region: XRegion): scala.Unit
  /** returns the bounding box of the shape. */
  def getBounds(): Rectangle
  /** returns all rectangles which are making up this region. */
  def getRectangles(): activexDashInteropLib.SafeArray[Rectangle]
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

