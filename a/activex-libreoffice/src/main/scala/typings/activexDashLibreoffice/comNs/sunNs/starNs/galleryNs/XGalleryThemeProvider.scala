package typings.activexDashLibreoffice.comNs.sunNs.starNs.galleryNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the Gallery themes. It also allows inserting and removing of Gallery themes by name.
  *
  * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing Gallery themes collection.
  * @see com.sun.star.container.XNameAccess
  */
trait XGalleryThemeProvider extends XNameAccess {
  /**
    * creates a new Gallery theme and adds it to the collection.
    * @param ThemeName The name of the Gallery theme to be added to the collection. The name must be unique.
    * @returns {@link XGalleryTheme} The created theme interface
    * @see com.sun.star.container.ElementExistException
    */
  def insertNewByName(ThemeName: String): XGalleryTheme
  /**
    * deletes a Gallery theme from the collection.
    * @param ThemeName The name of the Gallery theme to be removed. The theme with the given name must exist.
    * @see com.sun.star.container.NoSuchElementException
    */
  def removeByName(ThemeName: String): Unit
}

object XGalleryThemeProvider {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertNewByName: String => XGalleryTheme,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XGalleryThemeProvider = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
  
    __obj.asInstanceOf[XGalleryThemeProvider]
  }
}

