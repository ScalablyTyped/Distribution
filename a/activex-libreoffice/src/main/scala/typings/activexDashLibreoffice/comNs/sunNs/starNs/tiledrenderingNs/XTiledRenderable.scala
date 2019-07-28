package typings.activexDashLibreoffice.comNs.sunNs.starNs.tiledrenderingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** tiled rendering using a system-specific handle to a window */
trait XTiledRenderable extends XInterface {
  /**
    * paint a tile to a system-specific window
    * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
    * @param nOutputWidth horizontal output parameter measured in pixels.
    * @param nOutputHeight vertical output parameter measured in pixels.
    * @param nTilePosX logical X position of the top left corner of the rendered rectangle, in TWIPs.
    * @param nTilePosY logical Y position of the top left corner of the rendered rectangle, in TWIPs.
    * @param nTileWidth logical width of the rendered rectangle, in TWIPs.
    * @param nTileHeight logical height of the rendered rectangle, in TWIPs.
    * @since LibreOffice 5.0
    */
  def paintTile(
    Parent: js.Any,
    nOutputWidth: Double,
    nOutputHeight: Double,
    nTilePosX: Double,
    nTilePosY: Double,
    nTileWidth: Double,
    nTileHeight: Double
  ): Unit
}

object XTiledRenderable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    paintTile: (js.Any, Double, Double, Double, Double, Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTiledRenderable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), paintTile = js.Any.fromFunction7(paintTile), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTiledRenderable]
  }
}

