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
    Locales: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    ResourceIDs: activexDashInteropLib.SafeArray[java.lang.String],
    UniqueNumericId: scala.Double,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    create: js.Function6[
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ],
    exportBinary: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getCurrentLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getDefaultLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocales: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale]
    ],
    getResourceIDs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getResourceIDsForLocale: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    getUniqueNumericId: js.Function0[scala.Double],
    hasEntryForId: js.Function1[java.lang.String, scala.Boolean],
    hasEntryForIdAndLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean
    ],
    importBinary: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    newLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeId: js.Function1[java.lang.String, scala.Unit],
    removeIdForLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    removeLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    resolveString: js.Function1[java.lang.String, java.lang.String],
    resolveStringForLocale: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String
    ],
    setComment: js.Function1[java.lang.String, scala.Unit],
    setCurrentLocale: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Boolean, 
      scala.Unit
    ],
    setDefaultLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    setString: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setStringForLocale: js.Function3[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      scala.Unit
    ],
    setURL: js.Function1[java.lang.String, scala.Unit],
    store: js.Function0[scala.Unit],
    storeAsURL: js.Function1[java.lang.String, scala.Unit],
    storeToStorage: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    storeToURL: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      scala.Unit
    ]
  ): StringResourceWithLocation = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale, DefaultLocale = DefaultLocale, Locales = Locales, ResourceIDs = ResourceIDs, UniqueNumericId = UniqueNumericId, acquire = acquire, addModifyListener = addModifyListener, create = create, exportBinary = exportBinary, getCurrentLocale = getCurrentLocale, getDefaultLocale = getDefaultLocale, getLocales = getLocales, getResourceIDs = getResourceIDs, getResourceIDsForLocale = getResourceIDsForLocale, getUniqueNumericId = getUniqueNumericId, hasEntryForId = hasEntryForId, hasEntryForIdAndLocale = hasEntryForIdAndLocale, importBinary = importBinary, isModified = isModified, isReadOnly = isReadOnly, newLocale = newLocale, queryInterface = queryInterface, release = release, removeId = removeId, removeIdForLocale = removeIdForLocale, removeLocale = removeLocale, removeModifyListener = removeModifyListener, resolveString = resolveString, resolveStringForLocale = resolveStringForLocale, setComment = setComment, setCurrentLocale = setCurrentLocale, setDefaultLocale = setDefaultLocale, setString = setString, setStringForLocale = setStringForLocale, setURL = setURL, store = store, storeAsURL = storeAsURL, storeToStorage = storeToStorage, storeToURL = storeToURL)
  
    __obj.asInstanceOf[StringResourceWithLocation]
  }
}

