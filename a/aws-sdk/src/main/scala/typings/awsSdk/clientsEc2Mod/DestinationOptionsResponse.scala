package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationOptionsResponse extends StObject {
  
  /**
    * The format for the flow log.
    */
  var FileFormat: js.UndefOr[DestinationFileFormat] = js.undefined
  
  /**
    * Indicates whether to use Hive-compatible prefixes for flow logs stored in Amazon S3.
    */
  var HiveCompatiblePartitions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to partition the flow log per hour.
    */
  var PerHourPartition: js.UndefOr[Boolean] = js.undefined
}
object DestinationOptionsResponse {
  
  inline def apply(): DestinationOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationOptionsResponse]
  }
  
  extension [Self <: DestinationOptionsResponse](x: Self) {
    
    inline def setFileFormat(value: DestinationFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    inline def setHiveCompatiblePartitions(value: Boolean): Self = StObject.set(x, "HiveCompatiblePartitions", value.asInstanceOf[js.Any])
    
    inline def setHiveCompatiblePartitionsUndefined: Self = StObject.set(x, "HiveCompatiblePartitions", js.undefined)
    
    inline def setPerHourPartition(value: Boolean): Self = StObject.set(x, "PerHourPartition", value.asInstanceOf[js.Any])
    
    inline def setPerHourPartitionUndefined: Self = StObject.set(x, "PerHourPartition", js.undefined)
  }
}
