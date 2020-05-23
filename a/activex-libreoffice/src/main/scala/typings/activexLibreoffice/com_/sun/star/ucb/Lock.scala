package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a lock. */
trait Lock extends LockEntry {
  /** defines the lock's depth. */
  var Depth: LockDepth
  /**
    * the lock tokens.
    *
    * Each lock token is a URI.
    */
  var LockTokens: SafeArray[String]
  /**
    * the owner of the lock.
    *
    * This element provides information sufficient for either directly contacting a principal (such as a telephone number or email URI), or for discovering
    * the principal (such as the URL of a homepage) who owns the lock.
    */
  var Owner: js.Any
  /**
    * a timeout value for the lock.
    *
    * This element specifies the number of seconds between granting of the lock and the automatic removal of that lock. The value must not be greater than
    * `2^32-1` . A value of `-1` stands for an infinite lock, that will never be removed automatically.
    */
  var Timeout: Double
}

object Lock {
  @scala.inline
  def apply(
    Depth: LockDepth,
    LockTokens: SafeArray[String],
    Owner: js.Any,
    Scope: LockScope,
    Timeout: Double,
    Type: LockType
  ): Lock = {
    val __obj = js.Dynamic.literal(Depth = Depth.asInstanceOf[js.Any], LockTokens = LockTokens.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lock]
  }
}

