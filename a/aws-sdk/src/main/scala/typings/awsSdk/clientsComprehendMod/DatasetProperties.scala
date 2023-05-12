package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetProperties extends StObject {
  
  /**
    * Creation time of the dataset.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the dataset.
    */
  var DatasetArn: js.UndefOr[ComprehendDatasetArn] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[ComprehendArnName] = js.undefined
  
  /**
    * The S3 URI where the dataset is stored.
    */
  var DatasetS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The dataset type (training data or test data).
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsComprehendMod.DatasetType] = js.undefined
  
  /**
    * Description of the dataset.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsComprehendMod.Description] = js.undefined
  
  /**
    * Time when the data from the dataset becomes available in the data lake.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the status of the dataset.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The number of documents in the dataset.
    */
  var NumberOfDocuments: js.UndefOr[typings.awsSdk.clientsComprehendMod.NumberOfDocuments] = js.undefined
  
  /**
    * The dataset status. While the system creates the dataset, the status is CREATING. When the dataset is ready to use, the status changes to COMPLETED. 
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
}
object DatasetProperties {
  
  inline def apply(): DatasetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetProperties] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatasetArn(value: ComprehendDatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: ComprehendArnName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setDatasetS3Uri(value: S3Uri): Self = StObject.set(x, "DatasetS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDatasetS3UriUndefined: Self = StObject.set(x, "DatasetS3Uri", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setNumberOfDocuments(value: NumberOfDocuments): Self = StObject.set(x, "NumberOfDocuments", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDocumentsUndefined: Self = StObject.set(x, "NumberOfDocuments", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
