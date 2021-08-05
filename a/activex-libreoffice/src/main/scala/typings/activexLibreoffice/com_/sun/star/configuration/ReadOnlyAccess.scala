package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides easy read-only access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadOnlyAccess
  extends StObject
     with XHierarchicalNameAccess {
  
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: String): Unit
}
object ReadOnlyAccess {
  
  inline def apply(
    acquire: () => Unit,
    create: String => Unit,
    getByHierarchicalName: String => js.Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ReadOnlyAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ReadOnlyAccess]
  }
  
  extension [Self <: ReadOnlyAccess](x: Self) {
    
    inline def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
