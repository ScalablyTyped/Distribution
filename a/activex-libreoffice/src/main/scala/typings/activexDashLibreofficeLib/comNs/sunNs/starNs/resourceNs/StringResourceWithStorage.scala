package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a service providing access to a resource string table implementing the {@link com.sun.star.resource.XStringResourceWithStorage} interface. */
trait StringResourceWithStorage extends XStringResourceWithStorage {
  /**
    * is used to initialize the object on its creation.
    * @param Storage Specifies the storage used to load and store - if the ReadOnly state allows it - the string table data.
    * @param ReadOnly Specifies if the resource should be read only, see `XStringResourceManager::isReadOnly`
    * @param locale Specifies if the locale first to be used as current locale. Internally the `XStringResourceManager::setCurrentLocale` method is called wit
    * @param BaseName Base string for the file names used to store the locale data. The locale data is stored in Java properties files also following the corr
    * @param Comment Comment stored first in each properties file followed by a line feed character. The line feed character is added automatically and hasn't
    * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
    */
  def create(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    ReadOnly: scala.Boolean,
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    BaseName: java.lang.String,
    Comment: java.lang.String
  ): scala.Unit
}

