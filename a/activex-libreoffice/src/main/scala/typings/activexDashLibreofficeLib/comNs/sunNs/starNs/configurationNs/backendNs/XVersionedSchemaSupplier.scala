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

object XVersionedSchemaSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getComponentSchema: js.Function1[java.lang.String, XSchema],
    getSchemaVersion: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XVersionedSchemaSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getComponentSchema")(getComponentSchema)
    __obj.updateDynamic("getSchemaVersion")(getSchemaVersion)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XVersionedSchemaSupplier]
  }
}

