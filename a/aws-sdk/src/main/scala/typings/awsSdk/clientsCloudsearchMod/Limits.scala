package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limits extends StObject {
  
  var MaximumPartitionCount: typings.awsSdk.clientsCloudsearchMod.MaximumPartitionCount
  
  var MaximumReplicationCount: typings.awsSdk.clientsCloudsearchMod.MaximumReplicationCount
}
object Limits {
  
  inline def apply(MaximumPartitionCount: MaximumPartitionCount, MaximumReplicationCount: MaximumReplicationCount): Limits = {
    val __obj = js.Dynamic.literal(MaximumPartitionCount = MaximumPartitionCount.asInstanceOf[js.Any], MaximumReplicationCount = MaximumReplicationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
  
  extension [Self <: Limits](x: Self) {
    
    inline def setMaximumPartitionCount(value: MaximumPartitionCount): Self = StObject.set(x, "MaximumPartitionCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumReplicationCount(value: MaximumReplicationCount): Self = StObject.set(x, "MaximumReplicationCount", value.asInstanceOf[js.Any])
  }
}
