package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tiledrenderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** tiled rendering using a system-specific handle to a window */
trait XTiledRenderable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    nOutputWidth: scala.Double,
    nOutputHeight: scala.Double,
    nTilePosX: scala.Double,
    nTilePosY: scala.Double,
    nTileWidth: scala.Double,
    nTileHeight: scala.Double
  ): scala.Unit
}

object XTiledRenderable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    paintTile: js.Function7[
      js.Any, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTiledRenderable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("paintTile")(paintTile)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTiledRenderable]
  }
}

