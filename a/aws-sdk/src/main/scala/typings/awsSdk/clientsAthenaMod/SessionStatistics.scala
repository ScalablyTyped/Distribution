package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStatistics extends StObject {
  
  /**
    * The data processing unit execution time for a session in milliseconds.
    */
  var DpuExecutionInMillis: js.UndefOr[Long] = js.undefined
}
object SessionStatistics {
  
  inline def apply(): SessionStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionStatistics] (val x: Self) extends AnyVal {
    
    inline def setDpuExecutionInMillis(value: Long): Self = StObject.set(x, "DpuExecutionInMillis", value.asInstanceOf[js.Any])
    
    inline def setDpuExecutionInMillisUndefined: Self = StObject.set(x, "DpuExecutionInMillis", js.undefined)
  }
}
