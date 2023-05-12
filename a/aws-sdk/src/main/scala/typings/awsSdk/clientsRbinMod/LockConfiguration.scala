package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockConfiguration extends StObject {
  
  /**
    * Information about the retention rule unlock delay.
    */
  var UnlockDelay: typings.awsSdk.clientsRbinMod.UnlockDelay
}
object LockConfiguration {
  
  inline def apply(UnlockDelay: UnlockDelay): LockConfiguration = {
    val __obj = js.Dynamic.literal(UnlockDelay = UnlockDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockConfiguration] (val x: Self) extends AnyVal {
    
    inline def setUnlockDelay(value: UnlockDelay): Self = StObject.set(x, "UnlockDelay", value.asInstanceOf[js.Any])
  }
}
