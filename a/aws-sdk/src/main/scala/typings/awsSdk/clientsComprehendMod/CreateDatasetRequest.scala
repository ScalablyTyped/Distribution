package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * Name of the dataset.
    */
  var DatasetName: ComprehendArnName
  
  /**
    * The dataset type. You can specify that the data in a dataset is for training the model or for testing the model.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsComprehendMod.DatasetType] = js.undefined
  
  /**
    * Description of the dataset.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsComprehendMod.Description] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel of the flywheel to receive the data.
    */
  var FlywheelArn: ComprehendFlywheelArn
  
  /**
    * Information about the input data configuration. The type of input data varies based on the format of the input and whether the data is for a classifier model or an entity recognition model.
    */
  var InputDataConfig: DatasetInputDataConfig
  
  /**
    * Tags for the dataset.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(
    DatasetName: ComprehendArnName,
    FlywheelArn: ComprehendFlywheelArn,
    InputDataConfig: DatasetInputDataConfig
  ): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], FlywheelArn = FlywheelArn.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDatasetName(value: ComprehendArnName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfig(value: DatasetInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
