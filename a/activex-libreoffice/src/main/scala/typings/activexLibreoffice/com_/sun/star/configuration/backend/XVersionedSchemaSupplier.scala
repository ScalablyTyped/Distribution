package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to versioned configuration component schemas.
  * @since OOo 2.0
  */
trait XVersionedSchemaSupplier
  extends StObject
     with XSchemaSupplier {
  
  /**
    * Returns the schema version for a particular component.
    * @param aComponent component whose schema version will be determined
    * @returns a `string` that identifies the schema version for the given component.  The format of the version string is arbitrary. No meaning should be attac
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the version data.
    */
  def getSchemaVersion(aComponent: String): String
}
object XVersionedSchemaSupplier {
  
  inline def apply(
    acquire: () => Unit,
    getComponentSchema: String => XSchema,
    getSchemaVersion: String => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XVersionedSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getComponentSchema = js.Any.fromFunction1(getComponentSchema), getSchemaVersion = js.Any.fromFunction1(getSchemaVersion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XVersionedSchemaSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XVersionedSchemaSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetSchemaVersion(value: String => String): Self = StObject.set(x, "getSchemaVersion", js.Any.fromFunction1(value))
  }
}
