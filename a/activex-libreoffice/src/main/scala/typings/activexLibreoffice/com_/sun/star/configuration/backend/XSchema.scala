package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles access to the elements of a component schema, i.e its templates and its component definition.
  * @since OOo 1.1.2
  */
trait XSchema
  extends StObject
     with XInterface {
  
  /**
    * Describes only the component definition to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readComponent(aHandler: XSchemaHandler): Unit
  
  /**
    * Describes the full schema (templates + component) to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates and the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readSchema(aHandler: XSchemaHandler): Unit
  
  /**
    * Describes the component templates to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readTemplates(aHandler: XSchemaHandler): Unit
}
object XSchema {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    readComponent: XSchemaHandler => Unit,
    readSchema: XSchemaHandler => Unit,
    readTemplates: XSchemaHandler => Unit,
    release: () => Unit
  ): XSchema = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1(readComponent), readSchema = js.Any.fromFunction1(readSchema), readTemplates = js.Any.fromFunction1(readTemplates), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSchema]
  }
  
  extension [Self <: XSchema](x: Self) {
    
    inline def setReadComponent(value: XSchemaHandler => Unit): Self = StObject.set(x, "readComponent", js.Any.fromFunction1(value))
    
    inline def setReadSchema(value: XSchemaHandler => Unit): Self = StObject.set(x, "readSchema", js.Any.fromFunction1(value))
    
    inline def setReadTemplates(value: XSchemaHandler => Unit): Self = StObject.set(x, "readTemplates", js.Any.fromFunction1(value))
  }
}
