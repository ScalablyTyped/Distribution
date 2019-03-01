package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a single item of a Gallery theme. */
trait XGalleryItem
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  val Type: scala.Double
  /**
    * retrieves the type of the Gallery item
    * @returns The type of the Gallery item
    * @see GalleryItemType
    */
  def getType(): scala.Double
}

object XGalleryItem {
  @scala.inline
  def apply(
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGalleryItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGalleryItem]
  }
}

