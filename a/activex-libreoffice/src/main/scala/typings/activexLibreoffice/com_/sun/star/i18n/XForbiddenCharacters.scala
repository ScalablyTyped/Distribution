package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to forbidden character settings in a document.
  *
  * In some languages, particular characters are not allowed to be placed at the beginning or at the end of a text line.
  */
trait XForbiddenCharacters extends XInterface {
  /** returns the forbidden characters for a given locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters
  /** determines if forbidden characters are set for a given locale. */
  def hasForbiddenCharacters(aLocale: Locale): Boolean
  /** removes the setting of forbidden characters for a given locale. */
  def removeForbiddenCharacters(aLocale: Locale): Unit
  /** sets the forbidden characters for a given Locale. */
  def setForbiddenCharacters(aLocale: Locale, aForbiddenCharacters: ForbiddenCharacters): Unit
}

object XForbiddenCharacters {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getForbiddenCharacters: Locale => ForbiddenCharacters,
    hasForbiddenCharacters: Locale => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeForbiddenCharacters: Locale => Unit,
    setForbiddenCharacters: (Locale, ForbiddenCharacters) => Unit
  ): XForbiddenCharacters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), hasForbiddenCharacters = js.Any.fromFunction1(hasForbiddenCharacters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeForbiddenCharacters = js.Any.fromFunction1(removeForbiddenCharacters), setForbiddenCharacters = js.Any.fromFunction2(setForbiddenCharacters))
    __obj.asInstanceOf[XForbiddenCharacters]
  }
}

