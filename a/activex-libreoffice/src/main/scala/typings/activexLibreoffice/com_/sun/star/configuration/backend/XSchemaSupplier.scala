package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to configuration component schemas.
  * @since OOo 1.1.2
  */
@js.native
trait XSchemaSupplier extends XInterface {
  /**
    * Returns the schema information (component + templates) for a particular component.
    * @param aComponent component whose schema will be accessed
    * @returns an object allowing access to the various parts of the schema, `NULL` if the component doesn't exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getComponentSchema(aComponent: String): XSchema = js.native
}

object XSchemaSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getComponentSchema: String => XSchema,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getComponentSchema = js.Any.fromFunction1(getComponentSchema), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSchemaSupplier]
  }
  @scala.inline
  implicit class XSchemaSupplierOps[Self <: XSchemaSupplier] (val x: Self) extends AnyVal {
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
    def setGetComponentSchema(value: String => XSchema): Self = this.set("getComponentSchema", js.Any.fromFunction1(value))
  }
  
}

