package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineLearning
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MachineLearning: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.ClientConfiguration = js.native
  /**
    * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
    */
  def addTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
    */
  def addTags(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addTags(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.AddTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
    */
  def createBatchPrediction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBatchPrediction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
    */
  def createBatchPrediction(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBatchPrediction(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
    */
  def createDataSourceFromRDS(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromRDS(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
    */
  def createDataSourceFromRDS(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromRDS(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRDSOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
    */
  def createDataSourceFromRedshift(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromRedshift(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
    */
  def createDataSourceFromRedshift(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromRedshift(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromRedshiftOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
    */
  def createDataSourceFromS3(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromS3(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
    */
  def createDataSourceFromS3(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Input): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDataSourceFromS3(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Input,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateDataSourceFromS3Output, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
    */
  def createEvaluation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEvaluation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
    */
  def createEvaluation(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createEvaluation(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
    */
  def createMLModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMLModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
    */
  def createMLModel(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMLModel(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
    */
  def createRealtimeEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRealtimeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
    */
  def createRealtimeEndpoint(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createRealtimeEndpoint(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.CreateRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
    */
  def deleteBatchPrediction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBatchPrediction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
    */
  def deleteBatchPrediction(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteBatchPrediction(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
    */
  def deleteDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
    */
  def deleteDataSource(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDataSource(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
    */
  def deleteEvaluation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEvaluation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
    */
  def deleteEvaluation(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteEvaluation(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
    */
  def deleteMLModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMLModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
    */
  def deleteMLModel(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMLModel(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a real time endpoint of an MLModel.
    */
  def deleteRealtimeEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRealtimeEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a real time endpoint of an MLModel.
    */
  def deleteRealtimeEndpoint(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteRealtimeEndpoint(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteRealtimeEndpointOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
    */
  def deleteTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
    */
  def deleteTags(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTags(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DeleteTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of BatchPrediction operations that match the search criteria in the request.
    */
  def describeBatchPredictions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBatchPredictions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of BatchPrediction operations that match the search criteria in the request.
    */
  def describeBatchPredictions(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBatchPredictions(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DataSource that match the search criteria in the request.
    */
  def describeDataSources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDataSources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DataSource that match the search criteria in the request.
    */
  def describeDataSources(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDataSources(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DescribeEvaluations that match the search criteria in the request.
    */
  def describeEvaluations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvaluations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of DescribeEvaluations that match the search criteria in the request.
    */
  def describeEvaluations(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEvaluations(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of MLModel that match the search criteria in the request.
    */
  def describeMLModels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMLModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of MLModel that match the search criteria in the request.
    */
  def describeMLModels(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMLModels(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the tags for your Amazon ML object.
    */
  def describeTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of the tags for your Amazon ML object.
    */
  def describeTags(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTags(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeTagsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
    */
  def getBatchPrediction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBatchPrediction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
    */
  def getBatchPrediction(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBatchPrediction(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
    */
  def getDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
    */
  def getDataSource(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataSource(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
    */
  def getEvaluation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEvaluation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
    */
  def getEvaluation(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEvaluation(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
    */
  def getMLModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMLModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
    */
  def getMLModel(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMLModel(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.GetMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
    */
  def predict(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def predict(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
    */
  def predict(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def predict(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.PredictOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
    */
  def updateBatchPrediction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBatchPrediction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
    */
  def updateBatchPrediction(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBatchPrediction(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateBatchPredictionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
    */
  def updateDataSource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDataSource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
    */
  def updateDataSource(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDataSource(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateDataSourceOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
    */
  def updateEvaluation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEvaluation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
    */
  def updateEvaluation(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateEvaluation(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateEvaluationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
    */
  def updateMLModel(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMLModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
    */
  def updateMLModel(params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMLModel(
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.UpdateMLModelOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeBatchPredictionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeDataSourcesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_evaluationAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_evaluationAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_evaluationAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_evaluationAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeEvaluationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_mLModelAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_mLModelAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_mLModelAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsInput with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_mLModelAvailable(
    state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
    params: awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsInput with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMachinelearningMod.MachineLearningNs.DescribeMLModelsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

