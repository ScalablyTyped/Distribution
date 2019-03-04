package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XLanguageGuessing extends js.Object {
  /**
    * returns a list of all supported languages.
    *
    * This should be the same as the mathematical union of all enabled and disabled languages.
    */
  val AvailableLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns the list of all disabled languages */
  val DisabledLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns the list of all enabled languages */
  val EnabledLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /**
    * allows to explicitly discard some languages from the set of languages possibly returned.
    *
    * By default all languages are enabled.
    */
  def disableLanguages(
    aLanguages: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  ): scala.Unit
  /**
    * allows to explicitly re-enable some languages that got previously disabled.
    *
    * By default all languages are enabled.
    */
  def enableLanguages(
    aLanguages: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  ): scala.Unit
  /**
    * returns a list of all supported languages.
    *
    * This should be the same as the mathematical union of all enabled and disabled languages.
    */
  def getAvailableLanguages(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns the list of all disabled languages */
  def getDisabledLanguages(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
  /** returns the list of all enabled languages */
  def getEnabledLanguages(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
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
  def guessPrimaryLanguage(aText: java.lang.String, nStartPos: scala.Double, nLen: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
}

object XLanguageGuessing {
  @scala.inline
  def apply(
    AvailableLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    DisabledLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    EnabledLanguages: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    disableLanguages: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale], 
      scala.Unit
    ],
    enableLanguages: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale], 
      scala.Unit
    ],
    getAvailableLanguages: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getDisabledLanguages: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getEnabledLanguages: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    guessPrimaryLanguage: js.Function3[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
    ]
  ): XLanguageGuessing = {
    val __obj = js.Dynamic.literal(AvailableLanguages = AvailableLanguages, DisabledLanguages = DisabledLanguages, EnabledLanguages = EnabledLanguages, disableLanguages = disableLanguages, enableLanguages = enableLanguages, getAvailableLanguages = getAvailableLanguages, getDisabledLanguages = getDisabledLanguages, getEnabledLanguages = getEnabledLanguages, guessPrimaryLanguage = guessPrimaryLanguage)
  
    __obj.asInstanceOf[XLanguageGuessing]
  }
}

