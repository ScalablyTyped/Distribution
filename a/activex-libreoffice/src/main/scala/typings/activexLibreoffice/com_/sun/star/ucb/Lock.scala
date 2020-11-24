package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines a lock. */
@js.native
trait Lock extends LockEntry {
  
  /** defines the lock's depth. */
  var Depth: LockDepth = js.native
  
  /**
    * the lock tokens.
    *
    * Each lock token is a URI.
    */
  var LockTokens: SafeArray[String] = js.native
  
  /**
    * the owner of the lock.
    *
    * This element provides information sufficient for either directly contacting a principal (such as a telephone number or email URI), or for discovering
    * the principal (such as the URL of a homepage) who owns the lock.
    */
  var Owner: js.Any = js.native
  
  /**
    * a timeout value for the lock.
    *
    * This element specifies the number of seconds between granting of the lock and the automatic removal of that lock. The value must not be greater than
    * `2^32-1` . A value of `-1` stands for an infinite lock, that will never be removed automatically.
    */
  var Timeout: Double = js.native
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
  
  @scala.inline
  implicit class LockOps[Self <: Lock] (val x: Self) extends AnyVal {
    
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
    def setDepth(value: LockDepth): Self = this.set("Depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTokens(value: SafeArray[String]): Self = this.set("LockTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("Timeout", value.asInstanceOf[js.Any])
  }
}
