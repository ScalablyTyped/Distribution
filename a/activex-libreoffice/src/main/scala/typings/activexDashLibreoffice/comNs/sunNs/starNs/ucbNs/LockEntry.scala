package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines the types of locks that can be used with a resource. */
trait LockEntry extends js.Object {
  /** defines the lock's scope. */
  var Scope: LockScope
  /** defines the type of the lock. */
  var Type: LockType
}

object LockEntry {
  @scala.inline
  def apply(Scope: LockScope, Type: LockType): LockEntry = {
    val __obj = js.Dynamic.literal(Scope = Scope, Type = Type)
  
    __obj.asInstanceOf[LockEntry]
  }
}

