package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSummary extends StObject {
  
  /**
    * When the dataset was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[Name] = js.undefined
  
  /**
    * The dataset type.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DatasetType] = js.undefined
  
  /**
    * The domain associated with the dataset.
    */
  var Domain: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Domain] = js.undefined
  
  /**
    * When you create a dataset, LastModificationTime is the same as CreationTime. While data is being imported to the dataset, LastModificationTime is the current time of the ListDatasets call. After a CreateDatasetImportJob operation has finished, LastModificationTime is when the import job completed or failed.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
}
object DatasetSummary {
  
  inline def apply(): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSummary]
  }
  
  extension [Self <: DatasetSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: Name): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
  }
}
