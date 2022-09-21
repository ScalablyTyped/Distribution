package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface enables applying a set of changes in one batch transaction.
  *
  * An object implementing this interface allows other interfaces to change its state locally. It will keep a list of pending changes until such changes
  * are committed or canceled.
  *
  * Only when they are explicitly committed will these changes take effect persistently or globally.
  * @see XChangesNotifier
  * @see XChangesSet
  * @see XCancellable
  */
trait XChangesBatch
  extends StObject
     with XInterface {
  
  /** queries for any pending changes that can be committed. */
  val PendingChanges: ChangesSet
  
  /**
    * commits any pending changes.
    *
    * The exact action depends on the concrete service.
    */
  def commitChanges(): Unit
  
  /** queries for any pending changes that can be committed. */
  def getPendingChanges(): ChangesSet
  
  /** checks whether this object has any pending changes that can be committed. */
  def hasPendingChanges(): Boolean
}
object XChangesBatch {
  
  inline def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    getPendingChanges: () => ChangesSet,
    hasPendingChanges: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XChangesBatch = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChangesBatch]
  }
  
  extension [Self <: XChangesBatch](x: Self) {
    
    inline def setCommitChanges(value: () => Unit): Self = StObject.set(x, "commitChanges", js.Any.fromFunction0(value))
    
    inline def setGetPendingChanges(value: () => ChangesSet): Self = StObject.set(x, "getPendingChanges", js.Any.fromFunction0(value))
    
    inline def setHasPendingChanges(value: () => Boolean): Self = StObject.set(x, "hasPendingChanges", js.Any.fromFunction0(value))
    
    inline def setPendingChanges(value: ChangesSet): Self = StObject.set(x, "PendingChanges", value.asInstanceOf[js.Any])
    
    inline def setPendingChangesVarargs(value: ElementChange*): Self = StObject.set(x, "PendingChanges", js.Array(value*))
  }
}
