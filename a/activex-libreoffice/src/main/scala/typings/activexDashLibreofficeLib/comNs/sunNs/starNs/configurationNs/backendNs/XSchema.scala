package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handles access to the elements of a component schema, i.e its templates and its component definition.
  * @since OOo 1.1.2
  */
trait XSchema
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Describes only the component definition to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readComponent(aHandler: XSchemaHandler): scala.Unit
  /**
    * Describes the full schema (templates + component) to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates and the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readSchema(aHandler: XSchemaHandler): scala.Unit
  /**
    * Describes the component templates to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readTemplates(aHandler: XSchemaHandler): scala.Unit
}

object XSchema {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    readComponent: js.Function1[XSchemaHandler, scala.Unit],
    readSchema: js.Function1[XSchemaHandler, scala.Unit],
    readTemplates: js.Function1[XSchemaHandler, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XSchema = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, readComponent = readComponent, readSchema = readSchema, readTemplates = readTemplates, release = release)
  
    __obj.asInstanceOf[XSchema]
  }
}

