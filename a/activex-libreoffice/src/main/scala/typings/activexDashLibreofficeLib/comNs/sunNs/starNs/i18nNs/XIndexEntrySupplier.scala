package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** supplies information on index entries to generate a "table of; alphabetical index" for a given locale. */
trait XIndexEntrySupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the capital index key for sorting a table of indexes, to a given index entry, to a given {@link com.sun.star.lang.Locale} and to a given sort
    * algorithm.
    *
    * For example, in English locale it returns **"K"** for "keyboard"
    */
  def getIndexCharacter(
    aIndexEntry: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aSortAlgorithm: java.lang.String
  ): java.lang.String
  /**
    * returns the page number word of an index entry, where one page or more pages are combined to one page number entry, for a given {@link
    * com.sun.star.lang.Locale} .
    *
    * For example, in English locale it returns ; **"p."** for **bMorePages** == `FALSE`; **"pp."** for **bMorePages** == `TRUE`
    */
  def getIndexFollowPageWord(bMorePages: scala.Boolean, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
}

object XIndexEntrySupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getIndexCharacter: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String
    ],
    getIndexFollowPageWord: js.Function2[
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIndexEntrySupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getIndexCharacter")(getIndexCharacter)
    __obj.updateDynamic("getIndexFollowPageWord")(getIndexFollowPageWord)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XIndexEntrySupplier]
  }
}

