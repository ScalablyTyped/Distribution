package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecovery extends StObject {
  
  /**
    * The options are: • ENABLED  • DISABLED 
    */
  var status: PointInTimeRecoveryStatus
}
object PointInTimeRecovery {
  
  inline def apply(status: PointInTimeRecoveryStatus): PointInTimeRecovery = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecovery]
  }
  
  extension [Self <: PointInTimeRecovery](x: Self) {
    
    inline def setStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
