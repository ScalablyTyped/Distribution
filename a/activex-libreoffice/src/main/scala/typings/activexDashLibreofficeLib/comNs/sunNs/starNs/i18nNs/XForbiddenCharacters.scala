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
    acquire: js.Function0[scala.Unit],
    getForbiddenCharacters: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, ForbiddenCharacters],
    hasForbiddenCharacters: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeForbiddenCharacters: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setForbiddenCharacters: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      ForbiddenCharacters, 
      scala.Unit
    ]
  ): XForbiddenCharacters = {
    val __obj = js.Dynamic.literal(acquire = acquire, getForbiddenCharacters = getForbiddenCharacters, hasForbiddenCharacters = hasForbiddenCharacters, queryInterface = queryInterface, release = release, removeForbiddenCharacters = removeForbiddenCharacters, setForbiddenCharacters = setForbiddenCharacters)
  
    __obj.asInstanceOf[XForbiddenCharacters]
  }
}

