package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaIntegration extends StObject {
  
  /**
    * The location in Amazon S3 to store the generated CloudFormation template.
    */
  var IntegrationResultS3DestinationArn: String
  
  /**
    * The end date for the partition.
    */
  var PartitionEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The schedule for adding new partitions to the table.
    */
  var PartitionLoadFrequency: typings.awsSdk.clientsEc2Mod.PartitionLoadFrequency
  
  /**
    * The start date for the partition.
    */
  var PartitionStartDate: js.UndefOr[js.Date] = js.undefined
}
object AthenaIntegration {
  
  inline def apply(IntegrationResultS3DestinationArn: String, PartitionLoadFrequency: PartitionLoadFrequency): AthenaIntegration = {
    val __obj = js.Dynamic.literal(IntegrationResultS3DestinationArn = IntegrationResultS3DestinationArn.asInstanceOf[js.Any], PartitionLoadFrequency = PartitionLoadFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[AthenaIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AthenaIntegration] (val x: Self) extends AnyVal {
    
    inline def setIntegrationResultS3DestinationArn(value: String): Self = StObject.set(x, "IntegrationResultS3DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setPartitionEndDate(value: js.Date): Self = StObject.set(x, "PartitionEndDate", value.asInstanceOf[js.Any])
    
    inline def setPartitionEndDateUndefined: Self = StObject.set(x, "PartitionEndDate", js.undefined)
    
    inline def setPartitionLoadFrequency(value: PartitionLoadFrequency): Self = StObject.set(x, "PartitionLoadFrequency", value.asInstanceOf[js.Any])
    
    inline def setPartitionStartDate(value: js.Date): Self = StObject.set(x, "PartitionStartDate", value.asInstanceOf[js.Any])
    
    inline def setPartitionStartDateUndefined: Self = StObject.set(x, "PartitionStartDate", js.undefined)
  }
}
