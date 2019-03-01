package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link LinguProperties} service.
  * @since LibreOffice 4.1
  */
trait XLinguProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** the default western language for new documents. */
  var DefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** the default language for CJK languages. */
  var DefaultLocale_CJK: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** the default language for CTL languages. */
  var DefaultLocale_CTL: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** the minimum number of characters of a word to remain before the hyphen when doing hyphenation. */
  var HyphMinLeading: scala.Double
  /** the minimum number of characters of a word to remain after the hyphen when doing hyphenation. */
  var HyphMinTrailing: scala.Double
  /** the minimum length of a word in order to be hyphenated. */
  var HyphMinWordLength: scala.Double
  /**
    * defines whether interactive hyphenation should be performed without requiring the user to select every hyphenation position after the user has
    * triggered the hyphenation.
    */
  var IsHyphAuto: scala.Boolean
  /** defines whether hyphenation should be done in special regions of documents or not. */
  var IsHyphSpecial: scala.Boolean
  /** defines if control characters should be ignored or not, by the linguistic (i.e., spell checker, hyphenator and thesaurus). */
  var IsIgnoreControlCharacters: scala.Boolean
  /** indicates whether spell checking should be done automatically or not. */
  var IsSpellAuto: scala.Boolean
  /**
    * defines if the capitalization of words should be checked or not.
    * @deprecated Deprecated
    */
  var IsSpellCapitalization: scala.Boolean
  /** defines whether spell checking should be done in special regions of documents or not. */
  var IsSpellSpecial: scala.Boolean
  /** defines if words with only uppercase letters should be subject to spell checking or not. */
  var IsSpellUpperCase: scala.Boolean
  /** defines if words containing digits (or numbers) should be subject to spell checking or not. */
  var IsSpellWithDigits: scala.Boolean
  /** defines if the dictionary-list should be used for spell checking and hyphenation or not. */
  var IsUseDictionaryList: scala.Boolean
  /** defines whether spell checking should be done in reverse direction or not. */
  var IsWrapReverse: scala.Boolean
}

object XLinguProperties {
  @scala.inline
  def apply(
    DefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultLocale_CJK: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultLocale_CTL: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    HyphMinLeading: scala.Double,
    HyphMinTrailing: scala.Double,
    HyphMinWordLength: scala.Double,
    IsHyphAuto: scala.Boolean,
    IsHyphSpecial: scala.Boolean,
    IsIgnoreControlCharacters: scala.Boolean,
    IsSpellAuto: scala.Boolean,
    IsSpellCapitalization: scala.Boolean,
    IsSpellSpecial: scala.Boolean,
    IsSpellUpperCase: scala.Boolean,
    IsSpellWithDigits: scala.Boolean,
    IsUseDictionaryList: scala.Boolean,
    IsWrapReverse: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XLinguProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultLocale")(DefaultLocale)
    __obj.updateDynamic("DefaultLocale_CJK")(DefaultLocale_CJK)
    __obj.updateDynamic("DefaultLocale_CTL")(DefaultLocale_CTL)
    __obj.updateDynamic("HyphMinLeading")(HyphMinLeading)
    __obj.updateDynamic("HyphMinTrailing")(HyphMinTrailing)
    __obj.updateDynamic("HyphMinWordLength")(HyphMinWordLength)
    __obj.updateDynamic("IsHyphAuto")(IsHyphAuto)
    __obj.updateDynamic("IsHyphSpecial")(IsHyphSpecial)
    __obj.updateDynamic("IsIgnoreControlCharacters")(IsIgnoreControlCharacters)
    __obj.updateDynamic("IsSpellAuto")(IsSpellAuto)
    __obj.updateDynamic("IsSpellCapitalization")(IsSpellCapitalization)
    __obj.updateDynamic("IsSpellSpecial")(IsSpellSpecial)
    __obj.updateDynamic("IsSpellUpperCase")(IsSpellUpperCase)
    __obj.updateDynamic("IsSpellWithDigits")(IsSpellWithDigits)
    __obj.updateDynamic("IsUseDictionaryList")(IsUseDictionaryList)
    __obj.updateDynamic("IsWrapReverse")(IsWrapReverse)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XLinguProperties]
  }
}

