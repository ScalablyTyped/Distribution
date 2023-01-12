package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInterconnectsRequest extends StObject {
  
  /**
    * The ID of the interconnect.
    */
  var interconnectId: js.UndefOr[InterconnectId] = js.undefined
}
object DescribeInterconnectsRequest {
  
  inline def apply(): DescribeInterconnectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInterconnectsRequest] (val x: Self) extends AnyVal {
    
    inline def setInterconnectId(value: InterconnectId): Self = StObject.set(x, "interconnectId", value.asInstanceOf[js.Any])
    
    inline def setInterconnectIdUndefined: Self = StObject.set(x, "interconnectId", js.undefined)
  }
}
