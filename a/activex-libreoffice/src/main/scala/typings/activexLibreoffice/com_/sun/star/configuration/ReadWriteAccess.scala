package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.util.ChangesSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides easy read/write access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadWriteAccess
  extends StObject
     with XReadWriteAccess {
  
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: String): Unit
}
object ReadWriteAccess {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    create: String => Unit,
    getByHierarchicalName: String => Any,
    getPendingChanges: () => ChangesSet,
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: () => Boolean,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, Any) => Unit
  ): ReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), create = js.Any.fromFunction1(create), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[ReadWriteAccess]
  }
  
  extension [Self <: ReadWriteAccess](x: Self) {
    
    inline def setCreate(value: String => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
