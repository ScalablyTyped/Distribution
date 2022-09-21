package typings.activexLibreoffice.com_.sun.star.ucb

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines a lock. */
trait Lock
  extends StObject
     with LockEntry {
  
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
  var Owner: Any
  
  /**
    * a timeout value for the lock.
    *
    * This element specifies the number of seconds between granting of the lock and the automatic removal of that lock. The value must not be greater than
    * `2^32-1` . A value of `-1` stands for an infinite lock, that will never be removed automatically.
    */
  var Timeout: Double
}
object Lock {
  
  inline def apply(
    Depth: LockDepth,
    LockTokens: SafeArray[String],
    Owner: Any,
    Scope: LockScope,
    Timeout: Double,
    Type: LockType
  ): Lock = {
    val __obj = js.Dynamic.literal(Depth = Depth.asInstanceOf[js.Any], LockTokens = LockTokens.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], Timeout = Timeout.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lock]
  }
  
  extension [Self <: Lock](x: Self) {
    
    inline def setDepth(value: LockDepth): Self = StObject.set(x, "Depth", value.asInstanceOf[js.Any])
    
    inline def setLockTokens(value: SafeArray[String]): Self = StObject.set(x, "LockTokens", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Any): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
  }
}
