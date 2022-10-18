package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionResponse extends StObject {
  
  /**
    * The requested information, in the form of a Partition object.
    */
  var Partition: js.UndefOr[typings.awsSdk.clientsGlueMod.Partition] = js.undefined
}
object GetPartitionResponse {
  
  inline def apply(): GetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionResponse]
  }
  
  extension [Self <: GetPartitionResponse](x: Self) {
    
    inline def setPartition(value: Partition): Self = StObject.set(x, "Partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "Partition", js.undefined)
  }
}
