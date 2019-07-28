package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link LinguProperties} service.
  * @since LibreOffice 4.1
  */
trait XLinguProperties extends XPropertySet {
  /** the default western language for new documents. */
  var DefaultLocale: Locale
  /** the default language for CJK languages. */
  var DefaultLocale_CJK: Locale
  /** the default language for CTL languages. */
  var DefaultLocale_CTL: Locale
  /** the minimum number of characters of a word to remain before the hyphen when doing hyphenation. */
  var HyphMinLeading: Double
  /** the minimum number of characters of a word to remain after the hyphen when doing hyphenation. */
  var HyphMinTrailing: Double
  /** the minimum length of a word in order to be hyphenated. */
  var HyphMinWordLength: Double
  /**
    * defines whether interactive hyphenation should be performed without requiring the user to select every hyphenation position after the user has
    * triggered the hyphenation.
    */
  var IsHyphAuto: Boolean
  /** defines whether hyphenation should be done in special regions of documents or not. */
  var IsHyphSpecial: Boolean
  /** defines if control characters should be ignored or not, by the linguistic (i.e., spell checker, hyphenator and thesaurus). */
  var IsIgnoreControlCharacters: Boolean
  /** indicates whether spell checking should be done automatically or not. */
  var IsSpellAuto: Boolean
  /**
    * defines if the capitalization of words should be checked or not.
    * @deprecated Deprecated
    */
  var IsSpellCapitalization: Boolean
  /** defines whether spell checking should be done in special regions of documents or not. */
  var IsSpellSpecial: Boolean
  /** defines if words with only uppercase letters should be subject to spell checking or not. */
  var IsSpellUpperCase: Boolean
  /** defines if words containing digits (or numbers) should be subject to spell checking or not. */
  var IsSpellWithDigits: Boolean
  /** defines if the dictionary-list should be used for spell checking and hyphenation or not. */
  var IsUseDictionaryList: Boolean
  /** defines whether spell checking should be done in reverse direction or not. */
  var IsWrapReverse: Boolean
}

object XLinguProperties {
  @scala.inline
  def apply(
    DefaultLocale: Locale,
    DefaultLocale_CJK: Locale,
    DefaultLocale_CTL: Locale,
    HyphMinLeading: Double,
    HyphMinTrailing: Double,
    HyphMinWordLength: Double,
    IsHyphAuto: Boolean,
    IsHyphSpecial: Boolean,
    IsIgnoreControlCharacters: Boolean,
    IsSpellAuto: Boolean,
    IsSpellCapitalization: Boolean,
    IsSpellSpecial: Boolean,
    IsSpellUpperCase: Boolean,
    IsSpellWithDigits: Boolean,
    IsUseDictionaryList: Boolean,
    IsWrapReverse: Boolean,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XLinguProperties = {
    val __obj = js.Dynamic.literal(DefaultLocale = DefaultLocale, DefaultLocale_CJK = DefaultLocale_CJK, DefaultLocale_CTL = DefaultLocale_CTL, HyphMinLeading = HyphMinLeading, HyphMinTrailing = HyphMinTrailing, HyphMinWordLength = HyphMinWordLength, IsHyphAuto = IsHyphAuto, IsHyphSpecial = IsHyphSpecial, IsIgnoreControlCharacters = IsIgnoreControlCharacters, IsSpellAuto = IsSpellAuto, IsSpellCapitalization = IsSpellCapitalization, IsSpellSpecial = IsSpellSpecial, IsSpellUpperCase = IsSpellUpperCase, IsSpellWithDigits = IsSpellWithDigits, IsUseDictionaryList = IsUseDictionaryList, IsWrapReverse = IsWrapReverse, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XLinguProperties]
  }
}

