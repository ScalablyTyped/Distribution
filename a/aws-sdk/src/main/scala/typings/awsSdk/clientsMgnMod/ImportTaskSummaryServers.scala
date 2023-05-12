package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTaskSummaryServers extends StObject {
  
  /**
    * Import task summary servers created count.
    */
  var createdCount: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Import task summary servers modified count.
    */
  var modifiedCount: js.UndefOr[PositiveInteger] = js.undefined
}
object ImportTaskSummaryServers {
  
  inline def apply(): ImportTaskSummaryServers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskSummaryServers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportTaskSummaryServers] (val x: Self) extends AnyVal {
    
    inline def setCreatedCount(value: PositiveInteger): Self = StObject.set(x, "createdCount", value.asInstanceOf[js.Any])
    
    inline def setCreatedCountUndefined: Self = StObject.set(x, "createdCount", js.undefined)
    
    inline def setModifiedCount(value: PositiveInteger): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCountUndefined: Self = StObject.set(x, "modifiedCount", js.undefined)
  }
}
