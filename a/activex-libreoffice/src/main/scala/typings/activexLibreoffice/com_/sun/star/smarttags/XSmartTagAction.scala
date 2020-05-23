package typings.activexLibreoffice.com_.sun.star.smarttags

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to smart tag actions.
  * @since OOo 2.3
  */
trait XSmartTagAction extends XInitialization {
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
    initialize: SeqEquiv[_] => Unit,
    invokeAction: (Double, String, XController, XTextRange, XStringKeyMap, String, String, Locale) => Unit,
    isCaptionDynamic: (Double, String, XController, Locale) => Boolean,
    isShowSmartTagIndicator: (Double, String, XController, Locale) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSmartTagAction = {
    val __obj = js.Dynamic.literal(SmartTagCount = SmartTagCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActionCaptionFromID = js.Any.fromFunction8(getActionCaptionFromID), getActionCount = js.Any.fromFunction3(getActionCount), getActionID = js.Any.fromFunction3(getActionID), getActionNameFromID = js.Any.fromFunction2(getActionNameFromID), getDescription = js.Any.fromFunction1(getDescription), getName = js.Any.fromFunction1(getName), getSmartTagCaption = js.Any.fromFunction2(getSmartTagCaption), getSmartTagName = js.Any.fromFunction1(getSmartTagName), initialize = js.Any.fromFunction1(initialize), invokeAction = js.Any.fromFunction8(invokeAction), isCaptionDynamic = js.Any.fromFunction4(isCaptionDynamic), isShowSmartTagIndicator = js.Any.fromFunction4(isShowSmartTagIndicator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSmartTagAction]
  }
}

