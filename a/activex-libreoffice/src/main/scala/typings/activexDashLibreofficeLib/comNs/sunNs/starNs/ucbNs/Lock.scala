package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

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
  var LockTokens: stdLib.SafeArray[java.lang.String]
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
  var Timeout: scala.Double
}

object Lock {
  @scala.inline
  def apply(
    Depth: LockDepth,
    LockTokens: stdLib.SafeArray[java.lang.String],
    Owner: js.Any,
    Scope: LockScope,
    Timeout: scala.Double,
    Type: LockType
  ): Lock = {
    val __obj = js.Dynamic.literal(Depth = Depth, LockTokens = LockTokens, Owner = Owner, Scope = Scope, Timeout = Timeout, Type = Type)
  
    __obj.asInstanceOf[Lock]
  }
}

