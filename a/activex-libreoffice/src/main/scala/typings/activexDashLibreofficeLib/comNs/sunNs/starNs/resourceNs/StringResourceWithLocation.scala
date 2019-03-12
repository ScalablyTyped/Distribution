package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithLocation} interface. */
trait StringResourceWithLocation extends XStringResourceWithLocation {
  /**
    * is used to initialize the object on its creation.
    * @param URL Specifies the location used to load and store - if the ReadOnly state allows it - the string table data.
    * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
    * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
    * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
    * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
    * @param Handler a {@link com.sun.star.task.XInteractionHandler} to be passed to ucb. This may be a null interface.
    * @throws com::sun::star::lang::IllegalArgumentException if no string or an empty string is passed as URL
    */
  def create(
    URL: java.lang.String,
    ReadOnly: scala.Boolean,
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    BaseName: java.lang.String,
    Comment: java.lang.String,
    Handler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  ): scala.Unit
}

object StringResourceWithLocation {
  @scala.inline
  def apply(
    CurrentLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Locales: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    ResourceIDs: stdLib.SafeArray[java.lang.String],
    UniqueNumericId: scala.Double,
    acquire: () => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    create: (java.lang.String, scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit,
    exportBinary: () => stdLib.SafeArray[scala.Double],
    getCurrentLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getDefaultLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocales: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getResourceIDs: () => stdLib.SafeArray[java.lang.String],
    getResourceIDsForLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    getUniqueNumericId: () => scala.Double,
    hasEntryForId: java.lang.String => scala.Boolean,
    hasEntryForIdAndLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Boolean,
    importBinary: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    isModified: () => scala.Boolean,
    isReadOnly: () => scala.Boolean,
    newLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeId: java.lang.String => scala.Unit,
    removeIdForLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    removeLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    resolveString: java.lang.String => java.lang.String,
    resolveStringForLocale: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    setComment: java.lang.String => scala.Unit,
    setCurrentLocale: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Boolean) => scala.Unit,
    setDefaultLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    setString: (java.lang.String, java.lang.String) => scala.Unit,
    setStringForLocale: (java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => scala.Unit,
    setURL: java.lang.String => scala.Unit,
    store: () => scala.Unit,
    storeAsURL: java.lang.String => scala.Unit,
    storeToStorage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, java.lang.String, java.lang.String) => scala.Unit,
    storeToURL: (java.lang.String, java.lang.String, java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler) => scala.Unit
  ): StringResourceWithLocation = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), create = js.Any.fromFunction6(create), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), setURL = js.Any.fromFunction1(setURL), store = js.Any.fromFunction0(store), storeAsURL = js.Any.fromFunction1(storeAsURL), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
  
    __obj.asInstanceOf[StringResourceWithLocation]
  }
}

