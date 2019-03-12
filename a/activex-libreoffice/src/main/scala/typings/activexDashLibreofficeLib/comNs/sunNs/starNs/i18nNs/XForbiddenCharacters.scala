package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to forbidden character settings in a document.
  *
  * In some languages, particular characters are not allowed to be placed at the beginning or at the end of a text line.
  */
trait XForbiddenCharacters
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the forbidden characters for a given locale. */
  def getForbiddenCharacters(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): ForbiddenCharacters
  /** determines if forbidden characters are set for a given locale. */
  def hasForbiddenCharacters(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Boolean
  /** removes the setting of forbidden characters for a given locale. */
  def removeForbiddenCharacters(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /** sets the forbidden characters for a given Locale. */
  def setForbiddenCharacters(
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aForbiddenCharacters: ForbiddenCharacters
  ): scala.Unit
}

object XForbiddenCharacters {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => ForbiddenCharacters,
    hasForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setForbiddenCharacters: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, ForbiddenCharacters) => scala.Unit
  ): XForbiddenCharacters = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getForbiddenCharacters = js.Any.fromFunction1(getForbiddenCharacters), hasForbiddenCharacters = js.Any.fromFunction1(hasForbiddenCharacters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeForbiddenCharacters = js.Any.fromFunction1(removeForbiddenCharacters), setForbiddenCharacters = js.Any.fromFunction2(setForbiddenCharacters))
  
    __obj.asInstanceOf[XForbiddenCharacters]
  }
}

