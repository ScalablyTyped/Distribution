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

object XRegion {
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Rectangles: activexDashInteropLib.SafeArray[Rectangle],
    acquire: js.Function0[scala.Unit],
    clear: js.Function0[scala.Unit],
    excludeRectangle: js.Function1[Rectangle, scala.Unit],
    excludeRegion: js.Function1[XRegion, scala.Unit],
    getBounds: js.Function0[Rectangle],
    getRectangles: js.Function0[activexDashInteropLib.SafeArray[Rectangle]],
    intersectRectangle: js.Function1[Rectangle, scala.Unit],
    intersectRegion: js.Function1[XRegion, scala.Unit],
    move: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unionRectangle: js.Function1[Rectangle, scala.Unit],
    unionRegion: js.Function1[XRegion, scala.Unit],
    xOrRectangle: js.Function1[Rectangle, scala.Unit],
    xOrRegion: js.Function1[XRegion, scala.Unit]
  ): XRegion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bounds")(Bounds)
    __obj.updateDynamic("Rectangles")(Rectangles)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("excludeRectangle")(excludeRectangle)
    __obj.updateDynamic("excludeRegion")(excludeRegion)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getRectangles")(getRectangles)
    __obj.updateDynamic("intersectRectangle")(intersectRectangle)
    __obj.updateDynamic("intersectRegion")(intersectRegion)
    __obj.updateDynamic("move")(move)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("unionRectangle")(unionRectangle)
    __obj.updateDynamic("unionRegion")(unionRegion)
    __obj.updateDynamic("xOrRectangle")(xOrRectangle)
    __obj.updateDynamic("xOrRegion")(xOrRegion)
    __obj.asInstanceOf[XRegion]
  }
}

