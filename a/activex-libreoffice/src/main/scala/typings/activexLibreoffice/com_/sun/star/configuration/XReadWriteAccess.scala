package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.beans.XHierarchicalPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameReplace
import typings.activexLibreoffice.com_.sun.star.util.ChangesSet
import typings.activexLibreoffice.com_.sun.star.util.XChangesBatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XReadWriteAccess
  extends StObject
     with XHierarchicalNameReplace
     with XChangesBatch
     with XHierarchicalPropertySetInfo
object XReadWriteAccess {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    getByHierarchicalName: String => Any,
    getPendingChanges: () => ChangesSet,
    getPropertyByHierarchicalName: String => Property,
    hasByHierarchicalName: String => Boolean,
    hasPendingChanges: () => Boolean,
    hasPropertyByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    replaceByHierarchicalName: (String, Any) => Unit
  ): XReadWriteAccess = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getPendingChanges = js.Any.fromFunction0(getPendingChanges), getPropertyByHierarchicalName = js.Any.fromFunction1(getPropertyByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), hasPropertyByHierarchicalName = js.Any.fromFunction1(hasPropertyByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByHierarchicalName = js.Any.fromFunction2(replaceByHierarchicalName))
    __obj.asInstanceOf[XReadWriteAccess]
  }
}
