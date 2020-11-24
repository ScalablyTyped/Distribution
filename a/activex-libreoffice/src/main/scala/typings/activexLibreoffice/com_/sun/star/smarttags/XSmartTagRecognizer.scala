package typings.activexLibreoffice.com_.sun.star.smarttags

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.i18n.XBreakIterator
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.text.XTextMarkup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a smart tag recognizer.
  * @since OOo 2.3
  */
@js.native
trait XSmartTagRecognizer extends XInitialization {
  
  /** The number of smart tag types supported by this recognizer component. */
  var SmartTagCount: Double = js.native
  
  /**
    * launches the property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def displayPropertyPage(nSmartTagIndex: Double, aLocale: Locale): Unit = js.native
  
  /**
    * obtains a detailed description of this recognizer component.
    * @param aLocale Is used for localization of the description.
    * @returns the description of the recognizer component.
    */
  def getDescription(aLocale: Locale): String = js.native
  
  /**
    * obtains a name that describes this recognizer component.
    * @param aLocale Is used for localization of the name.
    * @returns the name of the recognizer component.
    */
  def getName(aLocale: Locale): String = js.native
  
  /**
    * obtains the URL that can be used to download new or updated recognizers.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the download URL.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagDownloadURL(nSmartTagIndex: Double): String = js.native
  
  /**
    * obtains the name of one specific smart tag type supported by this recognizer component.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @returns the unique name of the smart tag type. Smart tag type names are always in the format of namespaceURI::tagname.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def getSmartTagName(nSmartTagIndex: Double): String = js.native
  
  /**
    * indicates whether there is a property page for a smart tag type.
    * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
    * @param aLocale Is used for localization of the property page.
    * @returns true if there is a property page matching the requested smart tag type and locale.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
    */
  def hasPropertyPage(nSmartTagIndex: Double, aLocale: Locale): Boolean = js.native
  
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
  ): Unit = js.native
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
    val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), displayPropertyPage = js.Any.fromFunction2(displayPropertyPage), getDescription = js.Any.fromFunction1(getDescription), getName = js.Any.fromFunction1(getName), getSmartTagDownloadURL = js.Any.fromFunction1(getSmartTagDownloadURL), getSmartTagName = js.Any.fromFunction1(getSmartTagName), hasPropertyPage = js.Any.fromFunction2(hasPropertyPage), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), recognize = js.Any.fromFunction9(recognize), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSmartTagRecognizer]
  }
  
  @scala.inline
  implicit class XSmartTagRecognizerOps[Self <: XSmartTagRecognizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSmartTagCount(value: Double): Self = this.set("SmartTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPropertyPage(value: (Double, Locale) => Unit): Self = this.set("displayPropertyPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDescription(value: Locale => String): Self = this.set("getDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetName(value: Locale => String): Self = this.set("getName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSmartTagDownloadURL(value: Double => String): Self = this.set("getSmartTagDownloadURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSmartTagName(value: Double => String): Self = this.set("getSmartTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPropertyPage(value: (Double, Locale) => Boolean): Self = this.set("hasPropertyPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRecognize(
      value: (String, Double, Double, SmartTagRecognizerMode, Locale, XTextMarkup, String, XController, XBreakIterator) => Unit
    ): Self = this.set("recognize", js.Any.fromFunction9(value))
  }
}
