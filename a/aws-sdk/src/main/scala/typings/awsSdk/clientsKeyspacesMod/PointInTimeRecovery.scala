package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecovery extends StObject {
  
  /**
    * The options are:    status=ENABLED     status=DISABLED   
    */
  var status: PointInTimeRecoveryStatus
}
object PointInTimeRecovery {
  
  inline def apply(status: PointInTimeRecoveryStatus): PointInTimeRecovery = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecovery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointInTimeRecovery] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
