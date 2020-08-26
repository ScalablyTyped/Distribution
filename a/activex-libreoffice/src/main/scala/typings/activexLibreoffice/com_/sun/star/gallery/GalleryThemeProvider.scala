package typings.activexLibreoffice.com_.sun.star.gallery

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a container of GalleryThemes and makes it possible for you to manipulate them.
  * @see XGalleryThemeProvider
  */
@js.native
trait GalleryThemeProvider
  extends XGalleryThemeProvider
     with XInitialization

object GalleryThemeProvider {
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
    initialize: SeqEquiv[_] => Unit,
    insertNewByName: String => XGalleryTheme,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): GalleryThemeProvider = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), initialize = js.Any.fromFunction1(initialize), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[GalleryThemeProvider]
  }
}

