package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationOptionsRequest extends StObject {
  
  /**
    * The format for the flow log. The default is plain-text.
    */
  var FileFormat: js.UndefOr[DestinationFileFormat] = js.undefined
  
  /**
    * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3. The default is false.
    */
  var HiveCompatiblePartitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to partition the flow log per hour. This reduces the cost and response time for queries. The default is false.
    */
  var PerHourPartition: js.UndefOr[Boolean] = js.undefined
}
object DestinationOptionsRequest {
  
  inline def apply(): DestinationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationOptionsRequest]
  }
  
  extension [Self <: DestinationOptionsRequest](x: Self) {
    
    inline def setFileFormat(value: DestinationFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    inline def setHiveCompatiblePartitions(value: Boolean): Self = StObject.set(x, "HiveCompatiblePartitions", value.asInstanceOf[js.Any])
    
    inline def setHiveCompatiblePartitionsUndefined: Self = StObject.set(x, "HiveCompatiblePartitions", js.undefined)
    
    inline def setPerHourPartition(value: Boolean): Self = StObject.set(x, "PerHourPartition", value.asInstanceOf[js.Any])
    
    inline def setPerHourPartitionUndefined: Self = StObject.set(x, "PerHourPartition", js.undefined)
  }
}
