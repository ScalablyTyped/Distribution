package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the Gallery themes. It also allows inserting and removing of Gallery themes by name.
  *
  * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing Gallery themes collection.
  * @see com.sun.star.container.XNameAccess
  */
trait XGalleryThemeProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a new Gallery theme and adds it to the collection.
    * @param ThemeName The name of the Gallery theme to be added to the collection. The name must be unique.
    * @returns {@link XGalleryTheme} The created theme interface
    * @see com.sun.star.container.ElementExistException
    */
  def insertNewByName(ThemeName: java.lang.String): XGalleryTheme
  /**
    * deletes a Gallery theme from the collection.
    * @param ThemeName The name of the Gallery theme to be removed. The theme with the given name must exist.
    * @see com.sun.star.container.NoSuchElementException
    */
  def removeByName(ThemeName: java.lang.String): scala.Unit
}

object XGalleryThemeProvider {
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
    insertNewByName: js.Function1[java.lang.String, XGalleryTheme],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit]
  ): XGalleryThemeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertNewByName")(insertNewByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.asInstanceOf[XGalleryThemeProvider]
  }
}

