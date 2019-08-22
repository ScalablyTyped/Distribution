package typings.awsDashSdk.clientsForecastserviceMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastService extends Service {
  @JSName("config")
  var config_ForecastService: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected. Amazon Forecast uses this information when training the model and generating a forecast.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields of the dataset, including the field name and data type.   After creating a dataset, you import your training data into the dataset and add the dataset to a dataset group. You then use the dataset group to create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets, use the ListDatasets operation.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected. Amazon Forecast uses this information when training the model and generating a forecast.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields of the dataset, including the field name and data type.   After creating a dataset, you import your training data into the dataset and add the dataset to a dataset group. You then use the dataset group to create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets, use the ListDatasets operation.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or you can add datasets later with the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can create a predictor using the dataset group. Use the DescribeDatasetGroup operation to get the status. 
    */
  def createDatasetGroup(): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]): Request[CreateDatasetGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or you can add datasets later with the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can create a predictor using the dataset group. Use the DescribeDatasetGroup operation to get the status. 
    */
  def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(
    params: CreateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]
  ): Request[CreateDatasetGroupResponse, AWSError] = js.native
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. For more information, see aws-forecast-iam-roles. Two properties of the training data are optionally specified:   The delimiter that separates the data fields. The default delimiter is a comma (,), which is the only supported delimiter in this release.   The format of timestamps. If the format is not specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".   When Amazon Forecast uploads your training data, it verifies that the data was collected at the DataFrequency specified when the target dataset was created. For more information, see CreateDataset and howitworks-datasets-groups. Amazon Forecast also verifies the delimiter and timestamp format. You can use the ListDatasetImportJobs operation to get a list of all your dataset import jobs, filtered by specified criteria. To get a list of all your dataset import jobs, filtered by the specified criteria, use the ListDatasetGroups operation.
    */
  def createDatasetImportJob(): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. For more information, see aws-forecast-iam-roles. Two properties of the training data are optionally specified:   The delimiter that separates the data fields. The default delimiter is a comma (,), which is the only supported delimiter in this release.   The format of timestamps. If the format is not specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".   When Amazon Forecast uploads your training data, it verifies that the data was collected at the DataFrequency specified when the target dataset was created. For more information, see CreateDataset and howitworks-datasets-groups. Amazon Forecast also verifies the delimiter and timestamp format. You can use the ListDatasetImportJobs operation to get a list of all your dataset import jobs, filtered by specified criteria. To get a list of all your dataset import jobs, filtered by the specified criteria, use the ListDatasetGroups operation.
    */
  def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(
    params: CreateDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]
  ): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3), use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon, specified in the CreatePredictor request, multiplied by the DataFrequency, specified in the CreateDataset request. When you query a forecast, you can request a specific date range within the complete forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same timezone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status. 
    */
  def createForecast(): Request[CreateForecastResponse, AWSError] = js.native
  def createForecast(callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastResponse, Unit]): Request[CreateForecastResponse, AWSError] = js.native
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3), use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon, specified in the CreatePredictor request, multiplied by the DataFrequency, specified in the CreateDataset request. When you query a forecast, you can request a specific date range within the complete forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same timezone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status. 
    */
  def createForecast(params: CreateForecastRequest): Request[CreateForecastResponse, AWSError] = js.native
  def createForecast(
    params: CreateForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastResponse, Unit]
  ): Request[CreateForecastResponse, AWSError] = js.native
  /**
    * Exports a forecast created by the CreateForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your forecast export jobs, use the ListForecastExportJobs operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. Use the DescribeForecastExportJob operation to get the status. 
    */
  def createForecastExportJob(): Request[CreateForecastExportJobResponse, AWSError] = js.native
  def createForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastExportJobResponse, Unit]): Request[CreateForecastExportJobResponse, AWSError] = js.native
  /**
    * Exports a forecast created by the CreateForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your forecast export jobs, use the ListForecastExportJobs operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. Use the DescribeForecastExportJob operation to get the status. 
    */
  def createForecastExportJob(params: CreateForecastExportJobRequest): Request[CreateForecastExportJobResponse, AWSError] = js.native
  def createForecastExportJob(
    params: CreateForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastExportJobResponse, Unit]
  ): Request[CreateForecastExportJobResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast predictor. In the request, you provide a dataset group and either specify an algorithm or let Amazon Forecast choose the algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the chosen algorithm to train a model using the latest version of the datasets in the specified dataset group. The result is called a predictor. You then generate a forecast using the CreateForecast operation. After training a model, the CreatePredictor operation also evaluates it. To see the evaluation metrics, use the GetAccuracyMetrics operation. Always review the evaluation metrics before deciding to use the predictor to generate a forecast. Optionally, you can specify a featurization configuration to fill and aggragate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig.  AutoML  If you set PerformAutoML to true, Amazon Forecast evaluates each algorithm and chooses the one that minimizes the objective function. The objective function is defined as the mean of the weighted p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all your predictors, use the ListPredictors operation.  The Status of the predictor must be ACTIVE, signifying that training has completed, before you can use the predictor to create a forecast. Use the DescribePredictor operation to get the status. 
    */
  def createPredictor(): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]): Request[CreatePredictorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast predictor. In the request, you provide a dataset group and either specify an algorithm or let Amazon Forecast choose the algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the chosen algorithm to train a model using the latest version of the datasets in the specified dataset group. The result is called a predictor. You then generate a forecast using the CreateForecast operation. After training a model, the CreatePredictor operation also evaluates it. To see the evaluation metrics, use the GetAccuracyMetrics operation. Always review the evaluation metrics before deciding to use the predictor to generate a forecast. Optionally, you can specify a featurization configuration to fill and aggragate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig.  AutoML  If you set PerformAutoML to true, Amazon Forecast evaluates each algorithm and chooses the one that minimizes the objective function. The objective function is defined as the mean of the weighted p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all your predictors, use the ListPredictors operation.  The Status of the predictor must be ACTIVE, signifying that training has completed, before you can use the predictor to create a forecast. Use the DescribePredictor operation to get the status. 
    */
  def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(
    params: CreatePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]
  ): Request[CreatePredictorResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Forecast dataset created using the CreateDataset operation. To be deleted, the dataset must have a status of ACTIVE or CREATE_FAILED. Use the DescribeDataset operation to get the status.
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Forecast dataset created using the CreateDataset operation. To be deleted, the dataset must have a status of ACTIVE or CREATE_FAILED. Use the DescribeDataset operation to get the status.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset group created using the CreateDatasetGroup operation. To be deleted, the dataset group must have a status of ACTIVE, CREATE_FAILED, or UPDATE_FAILED. Use the DescribeDatasetGroup operation to get the status. The operation deletes only the dataset group, not the datasets in the group.
    */
  def deleteDatasetGroup(): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset group created using the CreateDatasetGroup operation. To be deleted, the dataset group must have a status of ACTIVE, CREATE_FAILED, or UPDATE_FAILED. Use the DescribeDatasetGroup operation to get the status. The operation deletes only the dataset group, not the datasets in the group.
    */
  def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(
    params: DeleteDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset import job created using the CreateDatasetImportJob operation. To be deleted, the import job must have a status of ACTIVE or CREATE_FAILED. Use the DescribeDatasetImportJob operation to get the status.
    */
  def deleteDatasetImportJob(): Request[js.Object, AWSError] = js.native
  def deleteDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset import job created using the CreateDatasetImportJob operation. To be deleted, the import job must have a status of ACTIVE or CREATE_FAILED. Use the DescribeDatasetImportJob operation to get the status.
    */
  def deleteDatasetImportJob(params: DeleteDatasetImportJobRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetImportJob(
    params: DeleteDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast created using the CreateForecast operation. To be deleted, the forecast must have a status of ACTIVE or CREATE_FAILED. Use the DescribeForecast operation to get the status. You can't delete a forecast while it is being exported.
    */
  def deleteForecast(): Request[js.Object, AWSError] = js.native
  def deleteForecast(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast created using the CreateForecast operation. To be deleted, the forecast must have a status of ACTIVE or CREATE_FAILED. Use the DescribeForecast operation to get the status. You can't delete a forecast while it is being exported.
    */
  def deleteForecast(params: DeleteForecastRequest): Request[js.Object, AWSError] = js.native
  def deleteForecast(
    params: DeleteForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast export job created using the CreateForecastExportJob operation. To be deleted, the export job must have a status of ACTIVE or CREATE_FAILED. Use the DescribeForecastExportJob operation to get the status.
    */
  def deleteForecastExportJob(): Request[js.Object, AWSError] = js.native
  def deleteForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast export job created using the CreateForecastExportJob operation. To be deleted, the export job must have a status of ACTIVE or CREATE_FAILED. Use the DescribeForecastExportJob operation to get the status.
    */
  def deleteForecastExportJob(params: DeleteForecastExportJobRequest): Request[js.Object, AWSError] = js.native
  def deleteForecastExportJob(
    params: DeleteForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a predictor created using the CreatePredictor operation. To be deleted, the predictor must have a status of ACTIVE or CREATE_FAILED. Use the DescribePredictor operation to get the status. Any forecasts generated by the predictor will no longer be available.
    */
  def deletePredictor(): Request[js.Object, AWSError] = js.native
  def deletePredictor(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a predictor created using the CreatePredictor operation. To be deleted, the predictor must have a status of ACTIVE or CREATE_FAILED. Use the DescribePredictor operation to get the status. Any forecasts generated by the predictor will no longer be available.
    */
  def deletePredictor(params: DeletePredictorRequest): Request[js.Object, AWSError] = js.native
  def deletePredictor(
    params: DeletePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Describes an Amazon Forecast dataset created using the CreateDataset operation. In addition to listing the properties provided by the user in the CreateDataset request, this operation includes the following properties:    CreationTime     LastModificationTime     Status   
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Describes an Amazon Forecast dataset created using the CreateDataset operation. In addition to listing the properties provided by the user in the CreateDataset request, this operation includes the following properties:    CreationTime     LastModificationTime     Status   
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Describes a dataset group created using the CreateDatasetGroup operation. In addition to listing the properties provided by the user in the CreateDatasetGroup request, this operation includes the following properties:    DatasetArns - The datasets belonging to the group.    CreationTime     LastModificationTime     Status   
    */
  def describeDatasetGroup(): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  /**
    * Describes a dataset group created using the CreateDatasetGroup operation. In addition to listing the properties provided by the user in the CreateDatasetGroup request, this operation includes the following properties:    DatasetArns - The datasets belonging to the group.    CreationTime     LastModificationTime     Status   
    */
  def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(
    params: DescribeDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]
  ): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  /**
    * Describes a dataset import job created using the CreateDatasetImportJob operation. In addition to listing the properties provided by the user in the CreateDatasetImportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     DataSize     FieldStatistics     Status     Message - If an error occurred, information about the error.  
    */
  def describeDatasetImportJob(): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  /**
    * Describes a dataset import job created using the CreateDatasetImportJob operation. In addition to listing the properties provided by the user in the CreateDatasetImportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     DataSize     FieldStatistics     Status     Message - If an error occurred, information about the error.  
    */
  def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(
    params: DescribeDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]
  ): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  /**
    * Describes a forecast created using the CreateForecast operation. In addition to listing the properties provided by the user in the CreateForecast request, this operation includes the following properties:    DatasetGroupArn - The dataset group that provided the training data.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecast(): Request[DescribeForecastResponse, AWSError] = js.native
  def describeForecast(callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastResponse, Unit]): Request[DescribeForecastResponse, AWSError] = js.native
  /**
    * Describes a forecast created using the CreateForecast operation. In addition to listing the properties provided by the user in the CreateForecast request, this operation includes the following properties:    DatasetGroupArn - The dataset group that provided the training data.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecast(params: DescribeForecastRequest): Request[DescribeForecastResponse, AWSError] = js.native
  def describeForecast(
    params: DescribeForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastResponse, Unit]
  ): Request[DescribeForecastResponse, AWSError] = js.native
  /**
    * Describes a forecast export job created using the CreateForecastExportJob operation. In addition to listing the properties provided by the user in the CreateForecastExportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecastExportJob(): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  def describeForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastExportJobResponse, Unit]): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  /**
    * Describes a forecast export job created using the CreateForecastExportJob operation. In addition to listing the properties provided by the user in the CreateForecastExportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecastExportJob(params: DescribeForecastExportJobRequest): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  def describeForecastExportJob(
    params: DescribeForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastExportJobResponse, Unit]
  ): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  /**
    * Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided by the user in the CreatePredictor request, this operation includes the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]): Request[DescribePredictorResponse, AWSError] = js.native
  /**
    * Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided by the user in the CreatePredictor request, this operation includes the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(
    params: DescribePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]
  ): Request[DescribePredictorResponse, AWSError] = js.native
  /**
    * Provides metrics on the accuracy of the models that were trained by the CreatePredictor operation. Use metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast. Metrics are generated for each backtest window evaluated. For more information, see EvaluationParameters. The parameters of the filling method determine which items contribute to the metrics. If zero is specified, all items contribute. If nan is specified, only those items that have complete data in the range being evaluated contribute. For more information, see FeaturizationMethod. For an example of how to train a model and review metrics, see getting-started.
    */
  def getAccuracyMetrics(): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  def getAccuracyMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetAccuracyMetricsResponse, Unit]): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  /**
    * Provides metrics on the accuracy of the models that were trained by the CreatePredictor operation. Use metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast. Metrics are generated for each backtest window evaluated. For more information, see EvaluationParameters. The parameters of the filling method determine which items contribute to the metrics. If zero is specified, all items contribute. If nan is specified, only those items that have complete data in the range being evaluated contribute. For more information, see FeaturizationMethod. For an example of how to train a model and review metrics, see getting-started.
    */
  def getAccuracyMetrics(params: GetAccuracyMetricsRequest): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  def getAccuracyMetrics(
    params: GetAccuracyMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccuracyMetricsResponse, Unit]
  ): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset groups created using the CreateDatasetGroup operation. For each dataset group, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDatasetGroup operation.
    */
  def listDatasetGroups(): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]): Request[ListDatasetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset groups created using the CreateDatasetGroup operation. For each dataset group, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDatasetGroup operation.
    */
  def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(
    params: ListDatasetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]
  ): Request[ListDatasetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset import jobs created using the CreateDatasetImportJob operation. For each import job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDatasetImportJob operation. You can filter the list by providing an array of Filter objects.
    */
  def listDatasetImportJobs(): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset import jobs created using the CreateDatasetImportJob operation. For each import job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDatasetImportJob operation. You can filter the list by providing an array of Filter objects.
    */
  def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(
    params: ListDatasetImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]
  ): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of datasets created using the CreateDataset operation. For each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDataset operation.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Returns a list of datasets created using the CreateDataset operation. For each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeDataset operation.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Returns a list of forecast export jobs created using the CreateForecastExportJob operation. For each forecast export job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeForecastExportJob operation. The list can be filtered using an array of Filter objects.
    */
  def listForecastExportJobs(): Request[ListForecastExportJobsResponse, AWSError] = js.native
  def listForecastExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListForecastExportJobsResponse, Unit]): Request[ListForecastExportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of forecast export jobs created using the CreateForecastExportJob operation. For each forecast export job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeForecastExportJob operation. The list can be filtered using an array of Filter objects.
    */
  def listForecastExportJobs(params: ListForecastExportJobsRequest): Request[ListForecastExportJobsResponse, AWSError] = js.native
  def listForecastExportJobs(
    params: ListForecastExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListForecastExportJobsResponse, Unit]
  ): Request[ListForecastExportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of forecasts created using the CreateForecast operation. For each forecast, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeForecast operation. The list can be filtered using an array of Filter objects.
    */
  def listForecasts(): Request[ListForecastsResponse, AWSError] = js.native
  def listForecasts(callback: js.Function2[/* err */ AWSError, /* data */ ListForecastsResponse, Unit]): Request[ListForecastsResponse, AWSError] = js.native
  /**
    * Returns a list of forecasts created using the CreateForecast operation. For each forecast, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribeForecast operation. The list can be filtered using an array of Filter objects.
    */
  def listForecasts(params: ListForecastsRequest): Request[ListForecastsResponse, AWSError] = js.native
  def listForecasts(
    params: ListForecastsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListForecastsResponse, Unit]
  ): Request[ListForecastsResponse, AWSError] = js.native
  /**
    * Returns a list of predictors created using the CreatePredictor operation. For each predictor, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribePredictor operation. The list can be filtered using an array of Filter objects.
    */
  def listPredictors(): Request[ListPredictorsResponse, AWSError] = js.native
  def listPredictors(callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorsResponse, Unit]): Request[ListPredictorsResponse, AWSError] = js.native
  /**
    * Returns a list of predictors created using the CreatePredictor operation. For each predictor, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of properties by using the ARN with the DescribePredictor operation. The list can be filtered using an array of Filter objects.
    */
  def listPredictors(params: ListPredictorsRequest): Request[ListPredictorsResponse, AWSError] = js.native
  def listPredictors(
    params: ListPredictorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorsResponse, Unit]
  ): Request[ListPredictorsResponse, AWSError] = js.native
  /**
    * Replaces any existing datasets in the dataset group with the specified datasets.  The Status of the dataset group must be ACTIVE before creating a predictor using the dataset group. Use the DescribeDatasetGroup operation to get the status. 
    */
  def updateDatasetGroup(): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  def updateDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetGroupResponse, Unit]): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  /**
    * Replaces any existing datasets in the dataset group with the specified datasets.  The Status of the dataset group must be ACTIVE before creating a predictor using the dataset group. Use the DescribeDatasetGroup operation to get the status. 
    */
  def updateDatasetGroup(params: UpdateDatasetGroupRequest): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  def updateDatasetGroup(
    params: UpdateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetGroupResponse, Unit]
  ): Request[UpdateDatasetGroupResponse, AWSError] = js.native
}

