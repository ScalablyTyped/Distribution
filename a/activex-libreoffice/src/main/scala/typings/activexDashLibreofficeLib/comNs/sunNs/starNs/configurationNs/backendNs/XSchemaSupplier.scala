package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to configuration component schemas.
  * @since OOo 1.1.2
  */
trait XSchemaSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the schema information (component + templates) for a particular component.
    * @param aComponent component whose schema will be accessed
    * @returns an object allowing access to the various parts of the schema, `NULL` if the component doesn't exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getComponentSchema(aComponent: java.lang.String): XSchema
}

object XSchemaSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getComponentSchema: js.Function1[java.lang.String, XSchema],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire, getComponentSchema = getComponentSchema, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSchemaSupplier]
  }
}

