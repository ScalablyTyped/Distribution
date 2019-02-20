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

