package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** supplies information on index entries to generate a "table of; alphabetical index" for a given locale. */
@js.native
trait XIndexEntrySupplier extends XInterface {
  /**
    * returns the capital index key for sorting a table of indexes, to a given index entry, to a given {@link com.sun.star.lang.Locale} and to a given sort
    * algorithm.
    *
    * For example, in English locale it returns **"K"** for "keyboard"
    */
  def getIndexCharacter(aIndexEntry: String, aLocale: Locale, aSortAlgorithm: String): String = js.native
  /**
    * returns the page number word of an index entry, where one page or more pages are combined to one page number entry, for a given {@link
    * com.sun.star.lang.Locale} .
    *
    * For example, in English locale it returns ; **"p."** for **bMorePages** == `FALSE`; **"pp."** for **bMorePages** == `TRUE`
    */
  def getIndexFollowPageWord(bMorePages: Boolean, aLocale: Locale): String = js.native
}

object XIndexEntrySupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getIndexCharacter: (String, Locale, String) => String,
    getIndexFollowPageWord: (Boolean, Locale) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XIndexEntrySupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getIndexCharacter = js.Any.fromFunction3(getIndexCharacter), getIndexFollowPageWord = js.Any.fromFunction2(getIndexFollowPageWord), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XIndexEntrySupplier]
  }
  @scala.inline
  implicit class XIndexEntrySupplierOps[Self <: XIndexEntrySupplier] (val x: Self) extends AnyVal {
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
    def setGetIndexCharacter(value: (String, Locale, String) => String): Self = this.set("getIndexCharacter", js.Any.fromFunction3(value))
    @scala.inline
    def setGetIndexFollowPageWord(value: (Boolean, Locale) => String): Self = this.set("getIndexFollowPageWord", js.Any.fromFunction2(value))
  }
  
}

