package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for {@link LinguProperties} service.
  * @since LibreOffice 4.1
  */
trait XLinguProperties
  extends StObject
     with XPropertySet {
  
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
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): XLinguProperties = {
    val __obj = js.Dynamic.literal(DefaultLocale = DefaultLocale.asInstanceOf[js.Any], DefaultLocale_CJK = DefaultLocale_CJK.asInstanceOf[js.Any], DefaultLocale_CTL = DefaultLocale_CTL.asInstanceOf[js.Any], HyphMinLeading = HyphMinLeading.asInstanceOf[js.Any], HyphMinTrailing = HyphMinTrailing.asInstanceOf[js.Any], HyphMinWordLength = HyphMinWordLength.asInstanceOf[js.Any], IsHyphAuto = IsHyphAuto.asInstanceOf[js.Any], IsHyphSpecial = IsHyphSpecial.asInstanceOf[js.Any], IsIgnoreControlCharacters = IsIgnoreControlCharacters.asInstanceOf[js.Any], IsSpellAuto = IsSpellAuto.asInstanceOf[js.Any], IsSpellCapitalization = IsSpellCapitalization.asInstanceOf[js.Any], IsSpellSpecial = IsSpellSpecial.asInstanceOf[js.Any], IsSpellUpperCase = IsSpellUpperCase.asInstanceOf[js.Any], IsSpellWithDigits = IsSpellWithDigits.asInstanceOf[js.Any], IsUseDictionaryList = IsUseDictionaryList.asInstanceOf[js.Any], IsWrapReverse = IsWrapReverse.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XLinguProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLinguProperties] (val x: Self) extends AnyVal {
    
    inline def setDefaultLocale(value: Locale): Self = StObject.set(x, "DefaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale_CJK(value: Locale): Self = StObject.set(x, "DefaultLocale_CJK", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale_CTL(value: Locale): Self = StObject.set(x, "DefaultLocale_CTL", value.asInstanceOf[js.Any])
    
    inline def setHyphMinLeading(value: Double): Self = StObject.set(x, "HyphMinLeading", value.asInstanceOf[js.Any])
    
    inline def setHyphMinTrailing(value: Double): Self = StObject.set(x, "HyphMinTrailing", value.asInstanceOf[js.Any])
    
    inline def setHyphMinWordLength(value: Double): Self = StObject.set(x, "HyphMinWordLength", value.asInstanceOf[js.Any])
    
    inline def setIsHyphAuto(value: Boolean): Self = StObject.set(x, "IsHyphAuto", value.asInstanceOf[js.Any])
    
    inline def setIsHyphSpecial(value: Boolean): Self = StObject.set(x, "IsHyphSpecial", value.asInstanceOf[js.Any])
    
    inline def setIsIgnoreControlCharacters(value: Boolean): Self = StObject.set(x, "IsIgnoreControlCharacters", value.asInstanceOf[js.Any])
    
    inline def setIsSpellAuto(value: Boolean): Self = StObject.set(x, "IsSpellAuto", value.asInstanceOf[js.Any])
    
    inline def setIsSpellCapitalization(value: Boolean): Self = StObject.set(x, "IsSpellCapitalization", value.asInstanceOf[js.Any])
    
    inline def setIsSpellSpecial(value: Boolean): Self = StObject.set(x, "IsSpellSpecial", value.asInstanceOf[js.Any])
    
    inline def setIsSpellUpperCase(value: Boolean): Self = StObject.set(x, "IsSpellUpperCase", value.asInstanceOf[js.Any])
    
    inline def setIsSpellWithDigits(value: Boolean): Self = StObject.set(x, "IsSpellWithDigits", value.asInstanceOf[js.Any])
    
    inline def setIsUseDictionaryList(value: Boolean): Self = StObject.set(x, "IsUseDictionaryList", value.asInstanceOf[js.Any])
    
    inline def setIsWrapReverse(value: Boolean): Self = StObject.set(x, "IsWrapReverse", value.asInstanceOf[js.Any])
  }
}
