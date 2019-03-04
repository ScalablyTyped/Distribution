package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.smarttagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a smart tag recognizer.
  * @since OOo 2.3
  */
trait XSmartTagRecognizer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /** The number of smart tag types supported by this recognizer component. */
  var SmartTagCount: scala.Double
  /**
    * launches the property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def displayPropertyPage(nSmartTagIndex: scala.Double, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
  /**
    * obtains a detailed description of this recognizer component.
    * @param aLocale Is used for localization of the description.
    * @returns the description of the recognizer component.
    */
  def getDescription(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * obtains a name that describes this recognizer component.
    * @param aLocale Is used for localization of the name.
    * @returns the name of the recognizer component.
    */
  def getName(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): java.lang.String
  /**
    * obtains the URL that can be used to download new or updated recognizers.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the download URL.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagDownloadURL(nSmartTagIndex: scala.Double): java.lang.String
  /**
    * obtains the name of one specific smart tag type supported by this recognizer component.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the unique name of the smart tag type. Smart tag type names are always in the format of namespaceURI::tagname.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagName(nSmartTagIndex: scala.Double): java.lang.String
  /**
    * indicates whether there is a property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @returns true if there is a property page matching the requested smart tag type and locale.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def hasPropertyPage(nSmartTagIndex: scala.Double, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Boolean
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
    aText: java.lang.String,
    nStart: scala.Double,
    nLength: scala.Double,
    eDataType: SmartTagRecognizerMode,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    xTextMarkup: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextMarkup,
    aApplicationName: java.lang.String,
    xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    xTokenizer: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XBreakIterator
  ): scala.Unit
}

object XSmartTagRecognizer {
  @scala.inline
  def apply(
    SmartTagCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    displayPropertyPage: js.Function2[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    getDescription: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getName: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String],
    getSmartTagDownloadURL: js.Function1[scala.Double, java.lang.String],
    getSmartTagName: js.Function1[scala.Double, java.lang.String],
    hasPropertyPage: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    recognize: js.Function9[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      SmartTagRecognizerMode, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextMarkup, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XBreakIterator, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit]
  ): XSmartTagRecognizer = {
    val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount, acquire = acquire, displayPropertyPage = displayPropertyPage, getDescription = getDescription, getName = getName, getSmartTagDownloadURL = getSmartTagDownloadURL, getSmartTagName = getSmartTagName, hasPropertyPage = hasPropertyPage, initialize = initialize, queryInterface = queryInterface, recognize = recognize, release = release)
  
    __obj.asInstanceOf[XSmartTagRecognizer]
  }
}

