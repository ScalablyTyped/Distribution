package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to versioned configuration component schemas.
  * @since OOo 2.0
  */
trait XVersionedSchemaSupplier extends XSchemaSupplier {
  /**
    * Returns the schema version for a particular component.
    * @param aComponent component whose schema version will be determined
    * @returns a `string` that identifies the schema version for the given component.  The format of the version string is arbitrary. No meaning should be attac
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the version data.
    */
  def getSchemaVersion(aComponent: java.lang.String): java.lang.String
}

