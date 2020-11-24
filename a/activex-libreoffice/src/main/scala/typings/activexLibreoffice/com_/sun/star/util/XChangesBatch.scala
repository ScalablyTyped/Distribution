package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait XChangesBatch extends XInterface {
  
  /** queries for any pending changes that can be committed. */
  val PendingChanges: ChangesSet = js.native
  
  /**
    * commits any pending changes.
    *
    * The exact action depends on the concrete service.
    */
  def commitChanges(): Unit = js.native
  
  /** queries for any pending changes that can be committed. */
  def getPendingChanges(): ChangesSet = js.native
  
  /** checks whether this object has any pending changes that can be committed. */
  def hasPendingChanges(): Boolean = js.native
}
object XChangesBatch {
  
  @scala.inline
  def apply(
    PendingChanges: ChangesSet,
    acquire: () => Unit,
    commitChanges: () => Unit,
    getPendingChanges: () => ChangesSet,
    hasPendingChanges: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChangesBatch = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChangesBatch]
  }
  
  @scala.inline
  implicit class XChangesBatchOps[Self <: XChangesBatch] (val x: Self) extends AnyVal {
    
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
    def setPendingChangesVarargs(value: ElementChange*): Self = this.set("PendingChanges", js.Array(value :_*))
    
    @scala.inline
    def setPendingChanges(value: ChangesSet): Self = this.set("PendingChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitChanges(value: () => Unit): Self = this.set("commitChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPendingChanges(value: () => ChangesSet): Self = this.set("getPendingChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPendingChanges(value: () => Boolean): Self = this.set("hasPendingChanges", js.Any.fromFunction0(value))
  }
}
