package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the basic interface to be used to access linguistic functionality.
  *
  * This interface is used to access spell checker, hyphenator, and thesaurus functionality. Additionally, it can query what implementations of those
  * services are available (for specific languages or in general). It can select and query which of those implementations should be used for a specific
  * language.
  *
  * For spell checking and thesaurus, the order in the list defines the order of creation/usage of those services. That is, if the first spell checker
  * implementation does not recognize the given word as correct, the second service implementation for that language is created and gets queried. If that
  * one fails, the third one gets created and queried and so on. This chain stops if an implementation reports the word as correct or the end of the list
  * is reached, in which case the word is reported as incorrect.
  *
  * For the thesaurus, the behavior is the same when no meaning was found.
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.linguistic2.Thesaurus
  */
trait XLinguServiceManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  val Hyphenator: XHyphenator
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  val SpellChecker: XSpellChecker
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  val Thesaurus: XThesaurus
  /**
    * adds a listener to the list of event listeners.
    *
    * The listeners may support one or both of {@link com.sun.star.linguistic2.XDictionaryEventListener} and {@link
    * com.sun.star.linguistic2.XLinguServiceEventListener} interfaces.
    * @param xListener the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceManagerListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener): scala.Boolean
  /**
    * @param aServiceName the name of the service requesting the list of available implementations.
    * @param aLocale the language used to query the list of available implementations.
    * @returns the list of implementation names of the available services.
    */
  def getAvailableServices(
    aServiceName: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * queries the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to get queried.
    * @param aLocale the language to get queried.
    * @returns the list of implementation names of the services to be used.
    */
  def getConfiguredServices(
    aServiceName: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  def getHyphenator(): XHyphenator
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  def getSpellChecker(): XSpellChecker
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  def getThesaurus(): XThesaurus
  /**
    * removes a listener from the list of event listeners.
    * @param xListener the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceManagerListener(xListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener): scala.Boolean
  /**
    * sets the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to set the list of implementations to be used.
    * @param aLocale the language to set the list.
    * @param aServiceImplNames the name of the service to set the list.
    */
  def setConfiguredServices(
    aServiceName: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aServiceImplNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
}

