package typings.activexLibreoffice.com_.sun.star.ucb

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
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockEntry]
  }
}

