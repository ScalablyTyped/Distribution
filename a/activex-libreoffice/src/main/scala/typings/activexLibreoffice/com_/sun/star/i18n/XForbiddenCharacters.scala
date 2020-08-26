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
@js.native
trait XForbiddenCharacters extends XInterface {
  /** returns the forbidden characters for a given locale. */
  def getForbiddenCharacters(aLocale: Locale): ForbiddenCharacters = js.native
  /** determines if forbidden characters are set for a given locale. */
  def hasForbiddenCharacters(aLocale: Locale): Boolean = js.native
  /** removes the setting of forbidden characters for a given locale. */
  def removeForbiddenCharacters(aLocale: Locale): Unit = js.native
  /** sets the forbidden characters for a given Locale. */
  def setForbiddenCharacters(aLocale: Locale, aForbiddenCharacters: ForbiddenCharacters): Unit = js.native
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
  @scala.inline
  implicit class XForbiddenCharactersOps[Self <: XForbiddenCharacters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetForbiddenCharacters(value: Locale => ForbiddenCharacters): Self = this.set("getForbiddenCharacters", js.Any.fromFunction1(value))
    @scala.inline
    def setHasForbiddenCharacters(value: Locale => Boolean): Self = this.set("hasForbiddenCharacters", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveForbiddenCharacters(value: Locale => Unit): Self = this.set("removeForbiddenCharacters", js.Any.fromFunction1(value))
    @scala.inline
    def setSetForbiddenCharacters(value: (Locale, ForbiddenCharacters) => Unit): Self = this.set("setForbiddenCharacters", js.Any.fromFunction2(value))
  }
  
}

