package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfig extends StObject {
  
  /**
    * The state of event replication.
    */
  var State: js.UndefOr[ReplicationState] = js.undefined
}
object ReplicationConfig {
  
  inline def apply(): ReplicationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationConfig] (val x: Self) extends AnyVal {
    
    inline def setState(value: ReplicationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
