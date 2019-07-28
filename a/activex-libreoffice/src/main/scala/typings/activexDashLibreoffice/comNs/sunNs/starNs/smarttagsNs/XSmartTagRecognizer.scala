package typings.activexDashLibreoffice.comNs.sunNs.starNs.smarttagsNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XBreakIterator
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextMarkup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a smart tag recognizer.
  * @since OOo 2.3
  */
trait XSmartTagRecognizer extends XInitialization {
  /** The number of smart tag types supported by this recognizer component. */
  var SmartTagCount: Double
  /**
    * launches the property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def displayPropertyPage(nSmartTagIndex: Double, aLocale: Locale): Unit
  /**
    * obtains a detailed description of this recognizer component.
    * @param aLocale Is used for localization of the description.
    * @returns the description of the recognizer component.
    */
  def getDescription(aLocale: Locale): String
  /**
    * obtains a name that describes this recognizer component.
    * @param aLocale Is used for localization of the name.
    * @returns the name of the recognizer component.
    */
  def getName(aLocale: Locale): String
  /**
    * obtains the URL that can be used to download new or updated recognizers.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the download URL.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagDownloadURL(nSmartTagIndex: Double): String
  /**
    * obtains the name of one specific smart tag type supported by this recognizer component.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the unique name of the smart tag type. Smart tag type names are always in the format of namespaceURI::tagname.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagName(nSmartTagIndex: Double): String
  /**
    * indicates whether there is a property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @returns true if there is a property page matching the requested smart tag type and locale.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def hasPropertyPage(nSmartTagIndex: Double, aLocale: Locale): Boolean
  /**
    * recognizes smart tags.
    * @param aText The text that should be scanned by the recognizer. aText is UTF-16 encoded.
    * @param nStart Denotes the start position of the region to scan.
    * @param nLength Denotes the length of the text to scan.
    * @param eDataType This value indicates the type of the passed text.
    * @param aLocale Is used to indicate the language of the passed text.
    * @param xTextMarkup This object is used to submit any recognized smart tags to the calling application.
    * @param aApplicationName A string containing the name of the calling application.
    * @param xController The current controller of the document.
    * @param xTokenizer This can be used to tokenize the string to recognize.
    */
  def recognize(
    aText: String,
    nStart: Double,
    nLength: Double,
    eDataType: SmartTagRecognizerMode,
    aLocale: Locale,
    xTextMarkup: XTextMarkup,
    aApplicationName: String,
    xController: XController,
    xTokenizer: XBreakIterator
  ): Unit
}

object XSmartTagRecognizer {
  @scala.inline
  def apply(
    SmartTagCount: Double,
    acquire: () => Unit,
    displayPropertyPage: (Double, Locale) => Unit,
    getDescription: Locale => String,
    getName: Locale => String,
    getSmartTagDownloadURL: Double => String,
    getSmartTagName: Double => String,
    hasPropertyPage: (Double, Locale) => Boolean,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    recognize: (String, Double, Double, SmartTagRecognizerMode, Locale, XTextMarkup, String, XController, XBreakIterator) => Unit,
    release: () => Unit
  ): XSmartTagRecognizer = {
    val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount, acquire = js.Any.fromFunction0(acquire), displayPropertyPage = js.Any.fromFunction2(displayPropertyPage), getDescription = js.Any.fromFunction1(getDescription), getName = js.Any.fromFunction1(getName), getSmartTagDownloadURL = js.Any.fromFunction1(getSmartTagDownloadURL), getSmartTagName = js.Any.fromFunction1(getSmartTagName), hasPropertyPage = js.Any.fromFunction2(hasPropertyPage), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), recognize = js.Any.fromFunction9(recognize), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSmartTagRecognizer]
  }
}

