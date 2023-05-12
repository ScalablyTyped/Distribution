package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryStatistics extends StObject {
  
  /**
    * The duration of the Protected Query, from creation until query completion.
    */
  var totalDurationInMillis: js.UndefOr[Long] = js.undefined
}
object ProtectedQueryStatistics {
  
  inline def apply(): ProtectedQueryStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedQueryStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryStatistics] (val x: Self) extends AnyVal {
    
    inline def setTotalDurationInMillis(value: Long): Self = StObject.set(x, "totalDurationInMillis", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationInMillisUndefined: Self = StObject.set(x, "totalDurationInMillis", js.undefined)
  }
}
