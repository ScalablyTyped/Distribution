package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMultiplexRequest extends StObject {
  
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string
}
object DescribeMultiplexRequest {
  
  inline def apply(MultiplexId: string): DescribeMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMultiplexRequest] (val x: Self) extends AnyVal {
    
    inline def setMultiplexId(value: string): Self = StObject.set(x, "MultiplexId", value.asInstanceOf[js.Any])
  }
}
