package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.i18n.XBreakIterator
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.text.XTextMarkup
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smarttags {
  
  /**
    * provides one or more actions for smart tags.
    *
    * An implementation of this service defines one or more actions that can be performed for a smart tag which has been recognized by a {@link
    * SmartTagRecognizer} service.
    * @since OOo 2.3
    */
  type SmartTagAction = XSmartTagAction
  
  /**
    * recognizes smart tags.
    *
    * Implementations of this service are used to scan the document text for smart tags. Smart tags are pieces of text that can be associated with specific
    * actions which are defined by implementations of the {@link SmartTagAction} service.
    * @since OOo 2.3
    */
  type SmartTagRecognizer = XSmartTagRecognizer
  
  /**
    * specifies the which type of text is passed to {@link XSmartTagRecognizer.recognize()}
    * @since OOo 2.3
    */
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  */
  trait SmartTagRecognizerMode extends StObject
  object SmartTagRecognizerMode {
    
    @scala.inline
    def CELL: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def CHAR: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def PARAGRAPH: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def SINGLE_WORD: `1` = 1.asInstanceOf[`1`]
  }
  
  /** provides access to a range based smart tag recognizer. */
  trait XRangeBasedSmartTagRecognizer
    extends StObject
       with XInitialization {
    
    /**
      * recognizes smart tags.
      * @param xRange The text that should be scanned by the recognizer.
      * @param eDataType This value indicates the type of the passed text.
      * @param xTextMarkup This object is used to submit any recognized smart tags to the calling application.
      * @param aApplicationName A string containing the name of the calling application.
      * @param xController The current controller of the document.
      */
    def recognizeTextRange(
      xRange: XTextRange,
      eDataType: SmartTagRecognizerMode,
      xTextMarkup: XTextMarkup,
      aApplicationName: String,
      xController: XController
    ): Unit
  }
  object XRangeBasedSmartTagRecognizer {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      initialize: SeqEquiv[js.Any] => Unit,
      queryInterface: `type` => js.Any,
      recognizeTextRange: (XTextRange, SmartTagRecognizerMode, XTextMarkup, String, XController) => Unit,
      release: () => Unit
    ): XRangeBasedSmartTagRecognizer = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), recognizeTextRange = js.Any.fromFunction5(recognizeTextRange), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XRangeBasedSmartTagRecognizer]
    }
    
    @scala.inline
    implicit class XRangeBasedSmartTagRecognizerMutableBuilder[Self <: XRangeBasedSmartTagRecognizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecognizeTextRange(value: (XTextRange, SmartTagRecognizerMode, XTextMarkup, String, XController) => Unit): Self = StObject.set(x, "recognizeTextRange", js.Any.fromFunction5(value))
    }
  }
  
  /**
    * provides access to smart tag actions.
    * @since OOo 2.3
    */
  trait XSmartTagAction
    extends StObject
       with XInitialization {
    
    /** the number of smart tag types supported by this action component. */
    var SmartTagCount: Double
    
    /**
      * obtains a caption for a specified action for use in user interfaces.
      * @param nActionID The identifier of the requested action.
      * @param aApplicationName A string containing the name of the calling application.
      * @param aLocale Is used for localization of the caption.
      * @param xProperties Contains additional smart tag properties collected by the smart tag recognizer.
      * @param aText The calling application can pass the text of the smart tag to the action component.
      * @param aXML A string that is a XML representation of the smart tag.
      * @param xController The current controller of the document.
      * @param xTarget A text range representing the smart tag in the document.
      * @returns the caption of the requested action.
      * @throws com::sun::star::lang::IllegalArgumentException if the ActionID is not recognized.
      */
    def getActionCaptionFromID(
      nActionID: Double,
      aApplicationName: String,
      aLocale: Locale,
      xProperties: XStringKeyMap,
      aText: String,
      aXML: String,
      xController: XController,
      xTarget: XTextRange
    ): String
    
    /**
      * obtains the number of actions provided for a specified smart tag type.
      * @param aSmartTagName Name of the wanted smart tag type. This is one of the names obtained by {@link getSmartTagName()}
      * @param xController The current controller of the document.
      * @param xProperties Contains the smart tag properties collected by the smart tag recognizer.
      * @returns the number of actions available for the given smart tag type.
      */
    def getActionCount(aSmartTagName: String, xController: XController, xProperties: XStringKeyMap): Double
    
    /**
      * obtains a unique integer identifier for an action.
      * @param aSmartTagName Name of the wanted smart tag type. This is one of the names obtained by {@link getSmartTagName()}
      * @param nActionIndex The index of the action for the given smart tag type.
      * @param xController The current controller of the document.
      * @returns the unique integer identifier for the requested action.
      * @throws com::sun::star::lang::IllegalArgumentException if the specified nActionIndex is greater than the number of available actions for the specified sm
      */
    def getActionID(aSmartTagName: String, nActionIndex: Double, xController: XController): Double
    
    /**
      * obtains a language independent name of an action.
      * @param nActionID The identifier of the requested action.
      * @param xController The current controller of the document.
      * @returns the language independent name of the specified action.
      * @throws com::sun::star::lang::IllegalArgumentException if the ActionID is not recognized.
      */
    def getActionNameFromID(nActionID: Double, xController: XController): String
    
    /**
      * obtains a detailed description of this action component.
      * @param aLocale Is used for localization of the description.
      * @returns the description of the action component.
      */
    def getDescription(aLocale: Locale): String
    
    /**
      * obtains a name that describes this action component.
      * @param aLocale Is used for localization of the name.
      * @returns the name describing the action component.
      */
    def getName(aLocale: Locale): String
    
    /**
      * obtains the caption of the smart tag type for using in user interfaces.
      * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
      * @param aLocale Is used for localization of the caption.
      * @returns the caption associated with the smart tag type.
      * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount
      */
    def getSmartTagCaption(nSmartTagIndex: Double, aLocale: Locale): String
    
    /**
      * obtains the name of one specific smart tag type supported by this action component.
      * @param nSmartTagIndex Index of the wanted smart tag type. Value needs to be between 0 and the number of smarttags available (exclusively).
      * @returns an unique name of the smart tag type. Smart tag type names are always in the format of namespaceURI::tagname.
      * @throws com::sun::star::lang::IndexOutOfBoundsException if nSmartTagIndex is greater than SmartTagCount.
      */
    def getSmartTagName(nSmartTagIndex: Double): String
    
    /**
      * invokes an action.
      * @param nActionID The identifier of the requested action.
      * @param aApplicationName A string containing the name of the calling application.
      * @param xController The current controller of the document.
      * @param xTarget A text range representing the smart tag in the document.
      * @param xProperties Contains the smart tag properties collected by the smart tag recognizer.
      * @param aText The calling application can pass the text of the smart tag to the action component.
      * @param aXML A string that is a XML representation of the smart tag.
      * @param aLocale Is used for localization of the action.
      * @throws com::sun::star::lang::IllegalArgumentException if the ActionID is not recognized.
      */
    def invokeAction(
      nActionID: Double,
      aApplicationName: String,
      xController: XController,
      xTarget: XTextRange,
      xProperties: XStringKeyMap,
      aText: String,
      aXML: String,
      aLocale: Locale
    ): Unit
    
    /**
      * determines whether a caption is dynamic.
      * @param nActionID The identifier of the requested action.
      * @param aApplicationName A string containing the name of the calling application.
      * @param xController The current controller of the document.
      * @param aLocale Is used for localization.
      * @returns a boolean indicating whether the caption is dynamic.
      * @throws com::sun::star::lang::IllegalArgumentException if the ActionID is not recognized.
      */
    def isCaptionDynamic(nActionID: Double, aApplicationName: String, xController: XController, aLocale: Locale): Boolean
    
    /**
      * determines whether the smart tag indicator should be visible.
      * @param nActionID The identifier of the requested action.
      * @param aApplicationName A string containing the name of the calling application.
      * @param xController The current controller of the document.
      * @param aLocale Is used for localization.
      * @returns a boolean indicating whether the smart tag indicator should be visible.
      * @throws com::sun::star::lang::IllegalArgumentException if the ActionID is not recognized.
      */
    def isShowSmartTagIndicator(nActionID: Double, aApplicationName: String, xController: XController, aLocale: Locale): Boolean
  }
  object XSmartTagAction {
    
    @scala.inline
    def apply(
      SmartTagCount: Double,
      acquire: () => Unit,
      getActionCaptionFromID: (Double, String, Locale, XStringKeyMap, String, String, XController, XTextRange) => String,
      getActionCount: (String, XController, XStringKeyMap) => Double,
      getActionID: (String, Double, XController) => Double,
      getActionNameFromID: (Double, XController) => String,
      getDescription: Locale => String,
      getName: Locale => String,
      getSmartTagCaption: (Double, Locale) => String,
      getSmartTagName: Double => String,
      initialize: SeqEquiv[js.Any] => Unit,
      invokeAction: (Double, String, XController, XTextRange, XStringKeyMap, String, String, Locale) => Unit,
      isCaptionDynamic: (Double, String, XController, Locale) => Boolean,
      isShowSmartTagIndicator: (Double, String, XController, Locale) => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XSmartTagAction = {
      val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActionCaptionFromID = js.Any.fromFunction8(getActionCaptionFromID), getActionCount = js.Any.fromFunction3(getActionCount), getActionID = js.Any.fromFunction3(getActionID), getActionNameFromID = js.Any.fromFunction2(getActionNameFromID), getDescription = js.Any.fromFunction1(getDescription), getName = js.Any.fromFunction1(getName), getSmartTagCaption = js.Any.fromFunction2(getSmartTagCaption), getSmartTagName = js.Any.fromFunction1(getSmartTagName), initialize = js.Any.fromFunction1(initialize), invokeAction = js.Any.fromFunction8(invokeAction), isCaptionDynamic = js.Any.fromFunction4(isCaptionDynamic), isShowSmartTagIndicator = js.Any.fromFunction4(isShowSmartTagIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XSmartTagAction]
    }
    
    @scala.inline
    implicit class XSmartTagActionMutableBuilder[Self <: XSmartTagAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetActionCaptionFromID(value: (Double, String, Locale, XStringKeyMap, String, String, XController, XTextRange) => String): Self = StObject.set(x, "getActionCaptionFromID", js.Any.fromFunction8(value))
      
      @scala.inline
      def setGetActionCount(value: (String, XController, XStringKeyMap) => Double): Self = StObject.set(x, "getActionCount", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetActionID(value: (String, Double, XController) => Double): Self = StObject.set(x, "getActionID", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetActionNameFromID(value: (Double, XController) => String): Self = StObject.set(x, "getActionNameFromID", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDescription(value: Locale => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetName(value: Locale => String): Self = StObject.set(x, "getName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSmartTagCaption(value: (Double, Locale) => String): Self = StObject.set(x, "getSmartTagCaption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetSmartTagName(value: Double => String): Self = StObject.set(x, "getSmartTagName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInvokeAction(value: (Double, String, XController, XTextRange, XStringKeyMap, String, String, Locale) => Unit): Self = StObject.set(x, "invokeAction", js.Any.fromFunction8(value))
      
      @scala.inline
      def setIsCaptionDynamic(value: (Double, String, XController, Locale) => Boolean): Self = StObject.set(x, "isCaptionDynamic", js.Any.fromFunction4(value))
      
      @scala.inline
      def setIsShowSmartTagIndicator(value: (Double, String, XController, Locale) => Boolean): Self = StObject.set(x, "isShowSmartTagIndicator", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSmartTagCount(value: Double): Self = StObject.set(x, "SmartTagCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provides access to a smart tag recognizer.
    * @since OOo 2.3
    */
  trait XSmartTagRecognizer
    extends StObject
       with XInitialization {
    
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
      initialize: SeqEquiv[js.Any] => Unit,
      queryInterface: `type` => js.Any,
      recognize: (String, Double, Double, SmartTagRecognizerMode, Locale, XTextMarkup, String, XController, XBreakIterator) => Unit,
      release: () => Unit
    ): XSmartTagRecognizer = {
      val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), displayPropertyPage = js.Any.fromFunction2(displayPropertyPage), getDescription = js.Any.fromFunction1(getDescription), getName = js.Any.fromFunction1(getName), getSmartTagDownloadURL = js.Any.fromFunction1(getSmartTagDownloadURL), getSmartTagName = js.Any.fromFunction1(getSmartTagName), hasPropertyPage = js.Any.fromFunction2(hasPropertyPage), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), recognize = js.Any.fromFunction9(recognize), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XSmartTagRecognizer]
    }
    
    @scala.inline
    implicit class XSmartTagRecognizerMutableBuilder[Self <: XSmartTagRecognizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayPropertyPage(value: (Double, Locale) => Unit): Self = StObject.set(x, "displayPropertyPage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDescription(value: Locale => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetName(value: Locale => String): Self = StObject.set(x, "getName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSmartTagDownloadURL(value: Double => String): Self = StObject.set(x, "getSmartTagDownloadURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSmartTagName(value: Double => String): Self = StObject.set(x, "getSmartTagName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasPropertyPage(value: (Double, Locale) => Boolean): Self = StObject.set(x, "hasPropertyPage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRecognize(
        value: (String, Double, Double, SmartTagRecognizerMode, Locale, XTextMarkup, String, XController, XBreakIterator) => Unit
      ): Self = StObject.set(x, "recognize", js.Any.fromFunction9(value))
      
      @scala.inline
      def setSmartTagCount(value: Double): Self = StObject.set(x, "SmartTagCount", value.asInstanceOf[js.Any])
    }
  }
}
