package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MLModel extends StObject {
  
  /**
    * The algorithm used to train the MLModel. The following algorithm is supported:    SGD -- Stochastic gradient descent. The goal of SGD is to minimize the gradient of the loss function.   
    */
  var Algorithm: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.Algorithm] = js.undefined
  
  var ComputeTime: js.UndefOr[LongType] = js.undefined
  
  /**
    * The time that the MLModel was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
  
  /**
    * The current endpoint of the MLModel.
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
  
  var FinishedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
  
  /**
    * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * Identifies the MLModel category. The following are the available types:    REGRESSION - Produces a numeric result. For example, "What price should a house be listed at?"    BINARY - Produces one of two possible results. For example, "Is this a child-friendly web site?".    MULTICLASS - Produces one of several possible results. For example, "Is this a HIGH-, LOW-, or MEDIUM-risk trade?".  
    */
  var MLModelType: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.MLModelType] = js.undefined
  
  /**
    * A description of the most recent details about accessing the MLModel.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.Message] = js.undefined
  
  /**
    * A user-supplied name or description of the MLModel.
    */
  var Name: js.UndefOr[MLModelName] = js.undefined
  
  var ScoreThreshold: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.ScoreThreshold] = js.undefined
  
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  var SizeInBytes: js.UndefOr[LongType] = js.undefined
  
  var StartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of an MLModel. This element can have one of the following values:     PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create an MLModel.    INPROGRESS - The creation process is underway.    FAILED - The request to create an MLModel didn't run to completion. The model isn't usable.    COMPLETED - The creation process completed successfully.    DELETED - The MLModel is marked as deleted. It isn't usable.  
    */
  var Status: js.UndefOr[EntityStatus] = js.undefined
  
  /**
    * The ID of the training DataSource. The CreateMLModel operation uses the TrainingDataSourceId.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.    sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10.    sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none.    sgd.l1RegularizationAmount - The coefficient regularization L1 norm, which controls overfitting the data by penalizing large coefficients. This parameter tends to drive coefficients to zero, resulting in sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.    sgd.l2RegularizationAmount - The coefficient regularization L2 norm, which controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.TrainingParameters] = js.undefined
}
object MLModel {
  
  inline def apply(): MLModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MLModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MLModel] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setComputeTime(value: LongType): Self = StObject.set(x, "ComputeTime", value.asInstanceOf[js.Any])
    
    inline def setComputeTimeUndefined: Self = StObject.set(x, "ComputeTime", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCreatedByIamUser(value: AwsUserArn): Self = StObject.set(x, "CreatedByIamUser", value.asInstanceOf[js.Any])
    
    inline def setCreatedByIamUserUndefined: Self = StObject.set(x, "CreatedByIamUser", js.undefined)
    
    inline def setEndpointInfo(value: RealtimeEndpointInfo): Self = StObject.set(x, "EndpointInfo", value.asInstanceOf[js.Any])
    
    inline def setEndpointInfoUndefined: Self = StObject.set(x, "EndpointInfo", js.undefined)
    
    inline def setFinishedAt(value: js.Date): Self = StObject.set(x, "FinishedAt", value.asInstanceOf[js.Any])
    
    inline def setFinishedAtUndefined: Self = StObject.set(x, "FinishedAt", js.undefined)
    
    inline def setInputDataLocationS3(value: S3Url): Self = StObject.set(x, "InputDataLocationS3", value.asInstanceOf[js.Any])
    
    inline def setInputDataLocationS3Undefined: Self = StObject.set(x, "InputDataLocationS3", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
    
    inline def setMLModelType(value: MLModelType): Self = StObject.set(x, "MLModelType", value.asInstanceOf[js.Any])
    
    inline def setMLModelTypeUndefined: Self = StObject.set(x, "MLModelType", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setName(value: MLModelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScoreThreshold(value: ScoreThreshold): Self = StObject.set(x, "ScoreThreshold", value.asInstanceOf[js.Any])
    
    inline def setScoreThresholdLastUpdatedAt(value: js.Date): Self = StObject.set(x, "ScoreThresholdLastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setScoreThresholdLastUpdatedAtUndefined: Self = StObject.set(x, "ScoreThresholdLastUpdatedAt", js.undefined)
    
    inline def setScoreThresholdUndefined: Self = StObject.set(x, "ScoreThreshold", js.undefined)
    
    inline def setSizeInBytes(value: LongType): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "StartedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "StartedAt", js.undefined)
    
    inline def setStatus(value: EntityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrainingDataSourceId(value: EntityId): Self = StObject.set(x, "TrainingDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataSourceIdUndefined: Self = StObject.set(x, "TrainingDataSourceId", js.undefined)
    
    inline def setTrainingParameters(value: TrainingParameters): Self = StObject.set(x, "TrainingParameters", value.asInstanceOf[js.Any])
    
    inline def setTrainingParametersUndefined: Self = StObject.set(x, "TrainingParameters", js.undefined)
  }
}
