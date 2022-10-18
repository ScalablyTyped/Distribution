package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetGroupSummary extends StObject {
  
  /**
    * When the dataset group was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset group.
    */
  var DatasetGroupName: js.UndefOr[Name] = js.undefined
  
  /**
    * When the dataset group was created or last updated from a call to the UpdateDatasetGroup operation. While the dataset group is being updated, LastModificationTime is the current time of the ListDatasetGroups call.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
}
object DatasetGroupSummary {
  
  inline def apply(): DatasetGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetGroupSummary]
  }
  
  extension [Self <: DatasetGroupSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
    
    inline def setDatasetGroupName(value: Name): Self = StObject.set(x, "DatasetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupNameUndefined: Self = StObject.set(x, "DatasetGroupName", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
  }
}
