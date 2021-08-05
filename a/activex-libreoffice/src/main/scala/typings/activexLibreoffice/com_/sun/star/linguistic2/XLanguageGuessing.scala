package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to guess the language of a text
  *
  * The current set of supported languages is: af : Afrikaansam : Amharicar : Arabicbe : Belarusbr : Bretonbs : Bosnianca : Catalancs : Czechcy : Welshda
  * : Danishde : Germandrt : Drentsel : Greeken : Englisheo : Esperantoes : Spanishet : Estonianeu : Basquefa : Persianfi : Finnishfr : Frenchfy :
  * Frisianga : Irish Gaelicgd : Scots Gaelicgv : Manx Gaeliche : Hebrewhi : Hindihr : Croatianhu : Hungarianhy : Armenianid : Indonesianis : Icelandicit
  * : Italianja : Japaneseka : Georgianko : Koreanla : Latinlb : Luxembourgish (added with OOo 3.3)lt : Lithuanianlv : Latvianmr : Marathims : Malayne :
  * Nepalinl : Dutchnb : Norwegian (Bokmal)pl : Polishpt-PT : Portuguese (Portugal)qu : Quechuarm : Romanshro : Romanianru : Russiansa : Sanskritsco :
  * Scotssh : Serbian (written with latin characters)sk-SK : Slovak (written with Latin characters)sl : Sloveniansq : Albaniansr : Serbian (written with
  * cyrillic characters) (added with OOo 3.4)sv : Swedishsw : Swahilita : Tamilth : Thaitl : Tagalogtr : Turkishuk : Ukrainianvi : Vietnameseyi :
  * Yiddishzh-CN : Chinese (simplified)zh-TW : Chinese (traditional)
  * @since OOo 2.2
  */
trait XLanguageGuessing extends StObject {
  
  /**
    * returns a list of all supported languages.
    *
    * This should be the same as the mathematical union of all enabled and disabled languages.
    */
  val AvailableLanguages: SafeArray[Locale]
  
  /** returns the list of all disabled languages */
  val DisabledLanguages: SafeArray[Locale]
  
  /** returns the list of all enabled languages */
  val EnabledLanguages: SafeArray[Locale]
  
  /**
    * allows to explicitly discard some languages from the set of languages possibly returned.
    *
    * By default all languages are enabled.
    */
  def disableLanguages(aLanguages: SeqEquiv[Locale]): Unit
  
  /**
    * allows to explicitly re-enable some languages that got previously disabled.
    *
    * By default all languages are enabled.
    */
  def enableLanguages(aLanguages: SeqEquiv[Locale]): Unit
  
  /**
    * returns a list of all supported languages.
    *
    * This should be the same as the mathematical union of all enabled and disabled languages.
    */
  def getAvailableLanguages(): SafeArray[Locale]
  
  /** returns the list of all disabled languages */
  def getDisabledLanguages(): SafeArray[Locale]
  
  /** returns the list of all enabled languages */
  def getEnabledLanguages(): SafeArray[Locale]
  
  /**
    * determines the single most probable language of a sub-string.
    *
    * Please note that because statistical analysis is part of the algorithm the likelihood to get the correct result increases with the length of the
    * sub-string. A word is much less likely guessed correctly compared to a sentence or even a whole paragraph.
    *
    * Also note that some languages are that "close" to each other that it will be quite unlikely to find a difference in them, e.g. English (UK), English
    * (IE) and English (AUS) and most likely English (US) as well. And thus the result may be arbitrary.
    * @param aText all the text including the part that should checked.
    * @param nStartPos specifies the starting index of the sub-string to be checked The value must met 0 <= nStartPos < (length of text - 1).
    * @param nLen specifies the length of the sub-string to be checked. The value must met 0 <= nLen <= (length of text).
    * @returns the locale for the language identified. If no language could be identified the locale will be empty.
    * @see com.sun.star.lang.Locale
    */
  def guessPrimaryLanguage(aText: String, nStartPos: Double, nLen: Double): Locale
}
object XLanguageGuessing {
  
  inline def apply(
    AvailableLanguages: SafeArray[Locale],
    DisabledLanguages: SafeArray[Locale],
    EnabledLanguages: SafeArray[Locale],
    disableLanguages: SeqEquiv[Locale] => Unit,
    enableLanguages: SeqEquiv[Locale] => Unit,
    getAvailableLanguages: () => SafeArray[Locale],
    getDisabledLanguages: () => SafeArray[Locale],
    getEnabledLanguages: () => SafeArray[Locale],
    guessPrimaryLanguage: (String, Double, Double) => Locale
  ): XLanguageGuessing = {
    val __obj = js.Dynamic.literal(AvailableLanguages = AvailableLanguages.asInstanceOf[js.Any], DisabledLanguages = DisabledLanguages.asInstanceOf[js.Any], EnabledLanguages = EnabledLanguages.asInstanceOf[js.Any], disableLanguages = js.Any.fromFunction1(disableLanguages), enableLanguages = js.Any.fromFunction1(enableLanguages), getAvailableLanguages = js.Any.fromFunction0(getAvailableLanguages), getDisabledLanguages = js.Any.fromFunction0(getDisabledLanguages), getEnabledLanguages = js.Any.fromFunction0(getEnabledLanguages), guessPrimaryLanguage = js.Any.fromFunction3(guessPrimaryLanguage))
    __obj.asInstanceOf[XLanguageGuessing]
  }
  
  extension [Self <: XLanguageGuessing](x: Self) {
    
    inline def setAvailableLanguages(value: SafeArray[Locale]): Self = StObject.set(x, "AvailableLanguages", value.asInstanceOf[js.Any])
    
    inline def setDisableLanguages(value: SeqEquiv[Locale] => Unit): Self = StObject.set(x, "disableLanguages", js.Any.fromFunction1(value))
    
    inline def setDisabledLanguages(value: SafeArray[Locale]): Self = StObject.set(x, "DisabledLanguages", value.asInstanceOf[js.Any])
    
    inline def setEnableLanguages(value: SeqEquiv[Locale] => Unit): Self = StObject.set(x, "enableLanguages", js.Any.fromFunction1(value))
    
    inline def setEnabledLanguages(value: SafeArray[Locale]): Self = StObject.set(x, "EnabledLanguages", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableLanguages(value: () => SafeArray[Locale]): Self = StObject.set(x, "getAvailableLanguages", js.Any.fromFunction0(value))
    
    inline def setGetDisabledLanguages(value: () => SafeArray[Locale]): Self = StObject.set(x, "getDisabledLanguages", js.Any.fromFunction0(value))
    
    inline def setGetEnabledLanguages(value: () => SafeArray[Locale]): Self = StObject.set(x, "getEnabledLanguages", js.Any.fromFunction0(value))
    
    inline def setGuessPrimaryLanguage(value: (String, Double, Double) => Locale): Self = StObject.set(x, "guessPrimaryLanguage", js.Any.fromFunction3(value))
  }
}
