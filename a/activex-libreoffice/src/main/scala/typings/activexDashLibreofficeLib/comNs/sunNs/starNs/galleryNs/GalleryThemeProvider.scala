package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a container of GalleryThemes and makes it possible for you to manipulate them.
  * @see XGalleryThemeProvider
  */
trait GalleryThemeProvider
  extends XGalleryThemeProvider
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object GalleryThemeProvider {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    insertNewByName: js.Function1[java.lang.String, XGalleryTheme],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit]
  ): GalleryThemeProvider = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, initialize = initialize, insertNewByName = insertNewByName, queryInterface = queryInterface, release = release, removeByName = removeByName)
  
    __obj.asInstanceOf[GalleryThemeProvider]
  }
}

