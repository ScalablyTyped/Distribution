package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/machinelearning", "MachineLearning")
@js.native
object MachineLearningNs extends js.Object {
  trait AddTagsInput extends js.Object {
    /**
      * The ID of the ML object to tag. For example, exampleModelId.
      */
    var ResourceId: EntityId
    /**
      * The type of the ML object to tag. 
      */
    var ResourceType: TaggableResourceType
    /**
      * The key-value pairs to use to create tags. If you specify a key without specifying a value, Amazon ML creates a tag with the specified key and a value of null.
      */
    var Tags: TagList
  }
  
  trait AddTagsOutput extends js.Object {
    /**
      * The ID of the ML object that was tagged.
      */
    var ResourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The type of the ML object that was tagged.
      */
    var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
  }
  
  trait BatchPrediction extends js.Object {
    /**
      * The ID of the DataSource that points to the group of observations to predict.
      */
    var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request. 
      */
    var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the BatchPrediction was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    var InvalidRecordCount: js.UndefOr[LongType] = js.undefined
    /**
      * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The ID of the MLModel that generated predictions for the BatchPrediction request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * A description of the most recent details about processing the batch prediction request.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the BatchPrediction.
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'.
      */
    var OutputUri: js.UndefOr[S3Url] = js.undefined
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The status of the BatchPrediction. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a batch of observations.  INPROGRESS - The process is underway.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
    var TotalRecordCount: js.UndefOr[LongType] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateBatchPredictionInput extends js.Object {
    /**
      * The ID of the DataSource that points to the group of observations to predict.
      */
    var BatchPredictionDataSourceId: EntityId
    /**
      * A user-supplied ID that uniquely identifies the BatchPrediction.
      */
    var BatchPredictionId: EntityId
    /**
      * A user-supplied name or description of the BatchPrediction. BatchPredictionName can only use the UTF-8 character set.
      */
    var BatchPredictionName: js.UndefOr[EntityName] = js.undefined
    /**
      * The ID of the MLModel that will generate predictions for the group of observations. 
      */
    var MLModelId: EntityId
    /**
      * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'. Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set permissions, see the Amazon Machine Learning Developer Guide.
      */
    var OutputUri: S3Url
  }
  
  trait CreateBatchPredictionOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the BatchPrediction. This value is identical to the value of the BatchPredictionId in the request.
      */
    var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateDataSourceFromRDSInput extends js.Object {
    /**
      * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training. 
      */
    var ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    /**
      * A user-supplied ID that uniquely identifies the DataSource. Typically, an Amazon Resource Number (ARN) becomes the ID for a DataSource.
      */
    var DataSourceId: EntityId
    /**
      * A user-supplied name or description of the DataSource.
      */
    var DataSourceName: js.UndefOr[EntityName] = js.undefined
    /**
      * The data specification of an Amazon RDS DataSource:  DatabaseInformation -   DatabaseName - The name of the Amazon RDS database.  InstanceIdentifier  - A unique identifier for the Amazon RDS database instance.   DatabaseCredentials - AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon RDS database. ResourceRole - A role (DataPipelineDefaultResourceRole) assumed by an EC2 instance to carry out the copy task from Amazon RDS to Amazon Simple Storage Service (Amazon S3). For more information, see Role templates for data pipelines. ServiceRole - A role (DataPipelineDefaultRole) assumed by the AWS Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines. SecurityInfo - The security information to use to access an RDS DB instance. You need to set up appropriate ingress rules for the security entity IDs provided to allow access to the Amazon RDS instance. Specify a [SubnetId, SecurityGroupIds] pair for a VPC-based RDS DB instance. SelectSqlQuery - A query that is used to retrieve the observation data for the Datasource. S3StagingLocation - The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using SelectSqlQuery is stored in this location. DataSchemaUri - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the Datasource.    Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
      */
    var RDSData: RDSDataSpec
    /**
      * The role that Amazon ML assumes on behalf of the user to create and activate a data pipeline in the user's account and copy data using the SelectSqlQuery query from Amazon RDS to Amazon S3.  
      */
    var RoleARN: RoleARN
  }
  
  trait CreateDataSourceFromRDSOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateDataSourceFromRedshiftInput extends js.Object {
    /**
      * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
      */
    var ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    /**
      * A user-supplied ID that uniquely identifies the DataSource.
      */
    var DataSourceId: EntityId
    /**
      * A user-supplied name or description of the DataSource. 
      */
    var DataSourceName: js.UndefOr[EntityName] = js.undefined
    /**
      * The data specification of an Amazon Redshift DataSource:  DatabaseInformation -   DatabaseName - The name of the Amazon Redshift database.    ClusterIdentifier - The unique ID for the Amazon Redshift cluster.  DatabaseCredentials - The AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon Redshift database. SelectSqlQuery - The query that is used to retrieve the observation data for the Datasource. S3StagingLocation - The Amazon Simple Storage Service (Amazon S3) location for staging Amazon Redshift data. The data retrieved from Amazon Redshift using the SelectSqlQuery query is stored in this location. DataSchemaUri - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the DataSource.  Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
      */
    var DataSpec: RedshiftDataSpec
    /**
      * A fully specified role Amazon Resource Name (ARN). Amazon ML assumes the role on behalf of the user to create the following:    A security group to allow Amazon ML to execute the SelectSqlQuery query on an Amazon Redshift cluster An Amazon S3 bucket policy to grant Amazon ML read/write permissions on the S3StagingLocation  
      */
    var RoleARN: RoleARN
  }
  
  trait CreateDataSourceFromRedshiftOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateDataSourceFromS3Input extends js.Object {
    /**
      * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
      */
    var ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    /**
      * A user-supplied identifier that uniquely identifies the DataSource. 
      */
    var DataSourceId: EntityId
    /**
      * A user-supplied name or description of the DataSource. 
      */
    var DataSourceName: js.UndefOr[EntityName] = js.undefined
    /**
      * The data specification of a DataSource:  DataLocationS3 - The Amazon S3 location of the observation data. DataSchemaLocationS3 - The Amazon S3 location of the DataSchema. DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.   DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the Datasource.   Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
      */
    var DataSpec: S3DataSpec
  }
  
  trait CreateDataSourceFromS3Output extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the DataSource. This value should be identical to the value of the DataSourceID in the request. 
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateEvaluationInput extends js.Object {
    /**
      * The ID of the DataSource for the evaluation. The schema of the DataSource must match the schema used to create the MLModel.
      */
    var EvaluationDataSourceId: EntityId
    /**
      * A user-supplied ID that uniquely identifies the Evaluation.
      */
    var EvaluationId: EntityId
    /**
      * A user-supplied name or description of the Evaluation.
      */
    var EvaluationName: js.UndefOr[EntityName] = js.undefined
    /**
      * The ID of the MLModel to evaluate. The schema used in creating the MLModel must match the schema of the DataSource used in the Evaluation.
      */
    var MLModelId: EntityId
  }
  
  trait CreateEvaluationOutput extends js.Object {
    /**
      * The user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
      */
    var EvaluationId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateMLModelInput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel.
      */
    var MLModelId: EntityId
    /**
      * A user-supplied name or description of the MLModel.
      */
    var MLModelName: js.UndefOr[EntityName] = js.undefined
    /**
      * The category of supervised learning that this MLModel will address. Choose from the following types:  Choose REGRESSION if the MLModel will be used to predict a numeric value. Choose BINARY if the MLModel result has two possible values. Choose MULTICLASS if the MLModel result has a limited number of values.    For more information, see the Amazon Machine Learning Developer Guide.
      */
    var MLModelType: MLModelType
    /**
      * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10.  sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none. We strongly recommend that you shuffle your data.   sgd.l1RegularizationAmount - The coefficient regularization L1 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
      */
    var Parameters: js.UndefOr[TrainingParameters] = js.undefined
    /**
      * The data recipe for creating the MLModel. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML creates a default.
      */
    var Recipe: js.UndefOr[Recipe] = js.undefined
    /**
      * The Amazon Simple Storage Service (Amazon S3) location and file name that contains the MLModel recipe. You must specify either the recipe or its URI. If you don't specify a recipe or its URI, Amazon ML creates a default.
      */
    var RecipeUri: js.UndefOr[S3Url] = js.undefined
    /**
      * The DataSource that points to the training data.
      */
    var TrainingDataSourceId: EntityId
  }
  
  trait CreateMLModelOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request. 
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait CreateRealtimeEndpointInput extends js.Object {
    /**
      * The ID assigned to the MLModel during creation.
      */
    var MLModelId: EntityId
  }
  
  trait CreateRealtimeEndpointOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * The endpoint information of the MLModel 
      */
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
  }
  
  trait DataSource extends js.Object {
    /**
      *  The parameter is true if statistics need to be generated from the observation data. 
      */
    var ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the DataSource was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The location and name of the data in Amazon Simple Storage Service (Amazon S3) that is used by a DataSource.
      */
    var DataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
      */
    var DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined
    /**
      * The total number of observations contained in the data files that the DataSource references.
      */
    var DataSizeInBytes: js.UndefOr[LongType] = js.undefined
    /**
      * The ID that is assigned to the DataSource during creation.
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * A description of the most recent details about creating the DataSource.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the DataSource.
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * The number of data files referenced by the DataSource.
      */
    var NumberOfFiles: js.UndefOr[LongType] = js.undefined
    var RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create a DataSource. INPROGRESS - The creation process is underway. FAILED - The request to create a DataSource did not run to completion. It is not usable. COMPLETED - The creation process completed successfully. DELETED - The DataSource is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
  }
  
  trait DeleteBatchPredictionInput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the BatchPrediction.
      */
    var BatchPredictionId: EntityId
  }
  
  trait DeleteBatchPredictionOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the BatchPrediction. This value should be identical to the value of the BatchPredictionID in the request.
      */
    var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait DeleteDataSourceInput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the DataSource.
      */
    var DataSourceId: EntityId
  }
  
  trait DeleteDataSourceOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the DataSource. This value should be identical to the value of the DataSourceID in the request.
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait DeleteEvaluationInput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the Evaluation to delete.
      */
    var EvaluationId: EntityId
  }
  
  trait DeleteEvaluationOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
      */
    var EvaluationId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait DeleteMLModelInput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel.
      */
    var MLModelId: EntityId
  }
  
  trait DeleteMLModelOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelID in the request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait DeleteRealtimeEndpointInput extends js.Object {
    /**
      * The ID assigned to the MLModel during creation.
      */
    var MLModelId: EntityId
  }
  
  trait DeleteRealtimeEndpointOutput extends js.Object {
    /**
      * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * The endpoint information of the MLModel 
      */
    var RealtimeEndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
  }
  
  trait DeleteTagsInput extends js.Object {
    /**
      * The ID of the tagged ML object. For example, exampleModelId.
      */
    var ResourceId: EntityId
    /**
      * The type of the tagged ML object.
      */
    var ResourceType: TaggableResourceType
    /**
      * One or more tags to delete.
      */
    var TagKeys: TagKeyList
  }
  
  trait DeleteTagsOutput extends js.Object {
    /**
      * The ID of the ML object from which tags were deleted.
      */
    var ResourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The type of the ML object from which tags were deleted.
      */
    var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
  }
  
  trait DescribeBatchPredictionsInput extends js.Object {
    /**
      * The equal to operator. The BatchPrediction results will have FilterVariable values that exactly match the value specified with EQ.
      */
    var EQ: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * Use one of the following variables to filter a list of BatchPrediction:   CreatedAt - Sets the search criteria to the BatchPrediction creation date.  Status - Sets the search criteria to the BatchPrediction status.  Name - Sets the search criteria to the contents of the BatchPrediction  Name.  IAMUser - Sets the search criteria to the user account that invoked the BatchPrediction creation.  MLModelId - Sets the search criteria to the MLModel used in the BatchPrediction.  DataSourceId - Sets the search criteria to the DataSource used in the BatchPrediction.  DataURI - Sets the search criteria to the data file(s) used in the BatchPrediction. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
      */
    var FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.undefined
    /**
      * The greater than or equal to operator. The BatchPrediction results will have FilterVariable values that are greater than or equal to the value specified with GE. 
      */
    var GE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The greater than operator. The BatchPrediction results will have FilterVariable values that are greater than the value specified with GT.
      */
    var GT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than or equal to operator. The BatchPrediction results will have FilterVariable values that are less than or equal to the value specified with LE.
      */
    var LE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than operator. The BatchPrediction results will have FilterVariable values that are less than the value specified with LT.
      */
    var LT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
      */
    var Limit: js.UndefOr[PageLimit] = js.undefined
    /**
      * The not equal to operator. The BatchPrediction results will have FilterVariable values not equal to the value specified with NE.
      */
    var NE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * An ID of the page in the paginated results.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A string that is found at the beginning of a variable, such as Name or Id. For example, a Batch Prediction operation could have the Name 2014-09-09-HolidayGiftMailer. To search for this BatchPrediction, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
      */
    var Prefix: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * A two-value parameter that determines the sequence of the resulting list of MLModels.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
      */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  trait DescribeBatchPredictionsOutput extends js.Object {
    /**
      * The ID of the next page in the paginated results that indicates at least one more page follows.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A list of BatchPrediction objects that meet the search criteria. 
      */
    var Results: js.UndefOr[BatchPredictions] = js.undefined
  }
  
  trait DescribeDataSourcesInput extends js.Object {
    /**
      * The equal to operator. The DataSource results will have FilterVariable values that exactly match the value specified with EQ.
      */
    var EQ: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * Use one of the following variables to filter a list of DataSource:   CreatedAt - Sets the search criteria to DataSource creation dates.  Status - Sets the search criteria to DataSource statuses.  Name - Sets the search criteria to the contents of DataSource   Name.  DataUri - Sets the search criteria to the URI of data files used to create the DataSource. The URI can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory.  IAMUser - Sets the search criteria to the user account that invoked the DataSource creation. 
      */
    var FilterVariable: js.UndefOr[DataSourceFilterVariable] = js.undefined
    /**
      * The greater than or equal to operator. The DataSource results will have FilterVariable values that are greater than or equal to the value specified with GE. 
      */
    var GE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The greater than operator. The DataSource results will have FilterVariable values that are greater than the value specified with GT.
      */
    var GT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than or equal to operator. The DataSource results will have FilterVariable values that are less than or equal to the value specified with LE.
      */
    var LE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than operator. The DataSource results will have FilterVariable values that are less than the value specified with LT.
      */
    var LT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      *  The maximum number of DataSource to include in the result.
      */
    var Limit: js.UndefOr[PageLimit] = js.undefined
    /**
      * The not equal to operator. The DataSource results will have FilterVariable values not equal to the value specified with NE.
      */
    var NE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The ID of the page in the paginated results.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A string that is found at the beginning of a variable, such as Name or Id. For example, a DataSource could have the Name 2014-09-09-HolidayGiftMailer. To search for this DataSource, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
      */
    var Prefix: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * A two-value parameter that determines the sequence of the resulting list of DataSource.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
      */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  trait DescribeDataSourcesOutput extends js.Object {
    /**
      * An ID of the next page in the paginated results that indicates at least one more page follows.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A list of DataSource that meet the search criteria. 
      */
    var Results: js.UndefOr[DataSources] = js.undefined
  }
  
  trait DescribeEvaluationsInput extends js.Object {
    /**
      * The equal to operator. The Evaluation results will have FilterVariable values that exactly match the value specified with EQ.
      */
    var EQ: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * Use one of the following variable to filter a list of Evaluation objects:   CreatedAt - Sets the search criteria to the Evaluation creation date.  Status - Sets the search criteria to the Evaluation status.  Name - Sets the search criteria to the contents of Evaluation   Name.  IAMUser - Sets the search criteria to the user account that invoked an Evaluation.  MLModelId - Sets the search criteria to the MLModel that was evaluated.  DataSourceId - Sets the search criteria to the DataSource used in Evaluation.  DataUri - Sets the search criteria to the data file(s) used in Evaluation. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
      */
    var FilterVariable: js.UndefOr[EvaluationFilterVariable] = js.undefined
    /**
      * The greater than or equal to operator. The Evaluation results will have FilterVariable values that are greater than or equal to the value specified with GE. 
      */
    var GE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The greater than operator. The Evaluation results will have FilterVariable values that are greater than the value specified with GT.
      */
    var GT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than or equal to operator. The Evaluation results will have FilterVariable values that are less than or equal to the value specified with LE.
      */
    var LE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than operator. The Evaluation results will have FilterVariable values that are less than the value specified with LT.
      */
    var LT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      *  The maximum number of Evaluation to include in the result.
      */
    var Limit: js.UndefOr[PageLimit] = js.undefined
    /**
      * The not equal to operator. The Evaluation results will have FilterVariable values not equal to the value specified with NE.
      */
    var NE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The ID of the page in the paginated results.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A string that is found at the beginning of a variable, such as Name or Id. For example, an Evaluation could have the Name 2014-09-09-HolidayGiftMailer. To search for this Evaluation, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
      */
    var Prefix: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * A two-value parameter that determines the sequence of the resulting list of Evaluation.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
      */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  trait DescribeEvaluationsOutput extends js.Object {
    /**
      * The ID of the next page in the paginated results that indicates at least one more page follows.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A list of Evaluation that meet the search criteria. 
      */
    var Results: js.UndefOr[Evaluations] = js.undefined
  }
  
  trait DescribeMLModelsInput extends js.Object {
    /**
      * The equal to operator. The MLModel results will have FilterVariable values that exactly match the value specified with EQ.
      */
    var EQ: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * Use one of the following variables to filter a list of MLModel:   CreatedAt - Sets the search criteria to MLModel creation date.  Status - Sets the search criteria to MLModel status.  Name - Sets the search criteria to the contents of MLModel  Name.  IAMUser - Sets the search criteria to the user account that invoked the MLModel creation.  TrainingDataSourceId - Sets the search criteria to the DataSource used to train one or more MLModel.  RealtimeEndpointStatus - Sets the search criteria to the MLModel real-time endpoint status.  MLModelType - Sets the search criteria to MLModel type: binary, regression, or multi-class.  Algorithm - Sets the search criteria to the algorithm that the MLModel uses.  TrainingDataURI - Sets the search criteria to the data file(s) used in training a MLModel. The URL can identify either a file or an Amazon Simple Storage Service (Amazon S3) bucket or directory. 
      */
    var FilterVariable: js.UndefOr[MLModelFilterVariable] = js.undefined
    /**
      * The greater than or equal to operator. The MLModel results will have FilterVariable values that are greater than or equal to the value specified with GE. 
      */
    var GE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The greater than operator. The MLModel results will have FilterVariable values that are greater than the value specified with GT.
      */
    var GT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than or equal to operator. The MLModel results will have FilterVariable values that are less than or equal to the value specified with LE.
      */
    var LE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The less than operator. The MLModel results will have FilterVariable values that are less than the value specified with LT.
      */
    var LT: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
      */
    var Limit: js.UndefOr[PageLimit] = js.undefined
    /**
      * The not equal to operator. The MLModel results will have FilterVariable values not equal to the value specified with NE.
      */
    var NE: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * The ID of the page in the paginated results.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A string that is found at the beginning of a variable, such as Name or Id. For example, an MLModel could have the Name 2014-09-09-HolidayGiftMailer. To search for this MLModel, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
      */
    var Prefix: js.UndefOr[ComparatorValue] = js.undefined
    /**
      * A two-value parameter that determines the sequence of the resulting list of MLModel.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
      */
    var SortOrder: js.UndefOr[SortOrder] = js.undefined
  }
  
  trait DescribeMLModelsOutput extends js.Object {
    /**
      * The ID of the next page in the paginated results that indicates at least one more page follows.
      */
    var NextToken: js.UndefOr[StringType] = js.undefined
    /**
      * A list of MLModel that meet the search criteria.
      */
    var Results: js.UndefOr[MLModels] = js.undefined
  }
  
  trait DescribeTagsInput extends js.Object {
    /**
      * The ID of the ML object. For example, exampleModelId. 
      */
    var ResourceId: EntityId
    /**
      * The type of the ML object.
      */
    var ResourceType: TaggableResourceType
  }
  
  trait DescribeTagsOutput extends js.Object {
    /**
      * The ID of the tagged ML object.
      */
    var ResourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The type of the tagged ML object.
      */
    var ResourceType: js.UndefOr[TaggableResourceType] = js.undefined
    /**
      * A list of tags associated with the ML object.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait DetailsMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DetailsValue]
  
  trait Evaluation extends js.Object {
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the Evaluation was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The ID of the DataSource that is used to evaluate the MLModel.
      */
    var EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The ID that is assigned to the Evaluation at creation.
      */
    var EvaluationId: js.UndefOr[EntityId] = js.undefined
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location and name of the data in Amazon Simple Storage Server (Amazon S3) that is used in the evaluation.
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The ID of the MLModel that is the focus of the evaluation.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * A description of the most recent details about evaluating the MLModel.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the Evaluation. 
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * Measurements of how well the MLModel performed, using observations referenced by the DataSource. One of the following metrics is returned, based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
      */
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The status of the evaluation. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to evaluate an MLModel.  INPROGRESS - The evaluation is underway.  FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.  COMPLETED - The evaluation process completed successfully.  DELETED - The Evaluation is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
  }
  
  trait GetBatchPredictionInput extends js.Object {
    /**
      * An ID assigned to the BatchPrediction at creation.
      */
    var BatchPredictionId: EntityId
  }
  
  trait GetBatchPredictionOutput extends js.Object {
    /**
      * The ID of the DataSource that was used to create the BatchPrediction. 
      */
    var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * An ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request.
      */
    var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
    /**
      * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the BatchPrediction, normalized and scaled on computation resources. ComputeTime is only available if the BatchPrediction is in the COMPLETED state.
      */
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time when the BatchPrediction was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the BatchPrediction as COMPLETED or FAILED. FinishedAt is only available when the BatchPrediction is in the COMPLETED or FAILED state.
      */
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * The number of invalid records that Amazon Machine Learning saw while processing the BatchPrediction.
      */
    var InvalidRecordCount: js.UndefOr[LongType] = js.undefined
    /**
      * The time of the most recent edit to BatchPrediction. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * A link to the file that contains logs of the CreateBatchPrediction operation.
      */
    var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
    /**
      * The ID of the MLModel that generated predictions for the BatchPrediction request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * A description of the most recent details about processing the batch prediction request.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the BatchPrediction.
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * The location of an Amazon S3 bucket or directory to receive the operation results.
      */
    var OutputUri: js.UndefOr[S3Url] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the BatchPrediction as INPROGRESS. StartedAt isn't available if the BatchPrediction is in the PENDING state.
      */
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The status of the BatchPrediction, which can be one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate batch predictions.  INPROGRESS - The batch predictions are in progress.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
    /**
      * The number of total records that Amazon Machine Learning saw while processing the BatchPrediction.
      */
    var TotalRecordCount: js.UndefOr[LongType] = js.undefined
  }
  
  trait GetDataSourceInput extends js.Object {
    /**
      * The ID assigned to the DataSource at creation.
      */
    var DataSourceId: EntityId
    /**
      * Specifies whether the GetDataSource operation should return DataSourceSchema. If true, DataSourceSchema is returned. If false, DataSourceSchema is not returned.
      */
    var Verbose: js.UndefOr[Verbose] = js.undefined
  }
  
  trait GetDataSourceOutput extends js.Object {
    /**
      *  The parameter is true if statistics need to be generated from the observation data. 
      */
    var ComputeStatistics: js.UndefOr[ComputeStatistics] = js.undefined
    /**
      * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the DataSource, normalized and scaled on computation resources. ComputeTime is only available if the DataSource is in the COMPLETED state and the ComputeStatistics is set to true.
      */
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the DataSource was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account from which the DataSource was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var DataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * A JSON string that represents the splitting and rearrangement requirement used when this DataSource was created.
      */
    var DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined
    /**
      * The total size of observations in the data files.
      */
    var DataSizeInBytes: js.UndefOr[LongType] = js.undefined
    /**
      * The ID assigned to the DataSource at creation. This value should be identical to the value of the DataSourceId in the request.
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The schema used by all of the data files of this DataSource. Note This parameter is provided as part of the verbose format.
      */
    var DataSourceSchema: js.UndefOr[DataSchema] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the DataSource as COMPLETED or FAILED. FinishedAt is only available when the DataSource is in the COMPLETED or FAILED state.
      */
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The time of the most recent edit to the DataSource. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * A link to the file containing logs of CreateDataSourceFrom* operations.
      */
    var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
    /**
      * The user-supplied description of the most recent details about creating the DataSource.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the DataSource.
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * The number of data files referenced by the DataSource.
      */
    var NumberOfFiles: js.UndefOr[LongType] = js.undefined
    var RDSMetadata: js.UndefOr[RDSMetadata] = js.undefined
    var RedshiftMetadata: js.UndefOr[RedshiftMetadata] = js.undefined
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the DataSource as INPROGRESS. StartedAt isn't available if the DataSource is in the PENDING state.
      */
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The current status of the DataSource. This element can have one of the following values:   PENDING - Amazon ML submitted a request to create a DataSource.  INPROGRESS - The creation process is underway.  FAILED - The request to create a DataSource did not run to completion. It is not usable.  COMPLETED - The creation process completed successfully.  DELETED - The DataSource is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
  }
  
  trait GetEvaluationInput extends js.Object {
    /**
      * The ID of the Evaluation to retrieve. The evaluation of each MLModel is recorded and cataloged. The ID provides the means to access the information. 
      */
    var EvaluationId: EntityId
  }
  
  trait GetEvaluationOutput extends js.Object {
    /**
      * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the Evaluation, normalized and scaled on computation resources. ComputeTime is only available if the Evaluation is in the COMPLETED state.
      */
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the Evaluation was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account that invoked the evaluation. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The DataSource used for this evaluation.
      */
    var EvaluationDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * The evaluation ID which is same as the EvaluationId in the request.
      */
    var EvaluationId: js.UndefOr[EntityId] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the Evaluation as COMPLETED or FAILED. FinishedAt is only available when the Evaluation is in the COMPLETED or FAILED state.
      */
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * The time of the most recent edit to the Evaluation. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * A link to the file that contains logs of the CreateEvaluation operation.
      */
    var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
    /**
      * The ID of the MLModel that was the focus of the evaluation.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * A description of the most recent details about evaluating the MLModel.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the Evaluation. 
      */
    var Name: js.UndefOr[EntityName] = js.undefined
    /**
      * Measurements of how well the MLModel performed using observations referenced by the DataSource. One of the following metric is returned based on the type of the MLModel:    BinaryAUC: A binary MLModel uses the Area Under the Curve (AUC) technique to measure performance.    RegressionRMSE: A regression MLModel uses the Root Mean Square Error (RMSE) technique to measure performance. RMSE measures the difference between predicted and actual values for a single variable.   MulticlassAvgFScore: A multiclass MLModel uses the F1 score technique to measure performance.     For more information about performance metrics, please see the Amazon Machine Learning Developer Guide. 
      */
    var PerformanceMetrics: js.UndefOr[PerformanceMetrics] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the Evaluation as INPROGRESS. StartedAt isn't available if the Evaluation is in the PENDING state.
      */
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The status of the evaluation. This element can have one of the following values:   PENDING - Amazon Machine Language (Amazon ML) submitted a request to evaluate an MLModel.  INPROGRESS - The evaluation is underway.  FAILED - The request to evaluate an MLModel did not run to completion. It is not usable.  COMPLETED - The evaluation process completed successfully.  DELETED - The Evaluation is marked as deleted. It is not usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
  }
  
  trait GetMLModelInput extends js.Object {
    /**
      * The ID assigned to the MLModel at creation.
      */
    var MLModelId: EntityId
    /**
      * Specifies whether the GetMLModel operation should return Recipe. If true, Recipe is returned. If false, Recipe is not returned.
      */
    var Verbose: js.UndefOr[Verbose] = js.undefined
  }
  
  trait GetMLModelOutput extends js.Object {
    /**
      * The approximate CPU time in milliseconds that Amazon Machine Learning spent processing the MLModel, normalized and scaled on computation resources. ComputeTime is only available if the MLModel is in the COMPLETED state.
      */
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the MLModel was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The current endpoint of the MLModel
      */
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the MLModel as COMPLETED or FAILED. FinishedAt is only available when the MLModel is in the COMPLETED or FAILED state.
      */
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * A link to the file that contains logs of the CreateMLModel operation.
      */
    var LogUri: js.UndefOr[PresignedS3Url] = js.undefined
    /**
      * The MLModel ID, which is same as the MLModelId in the request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * Identifies the MLModel category. The following are the available types:   REGRESSION -- Produces a numeric result. For example, "What price should a house be listed at?" BINARY -- Produces one of two possible results. For example, "Is this an e-commerce website?" MULTICLASS -- Produces one of several possible results. For example, "Is this a HIGH, LOW or MEDIUM risk trade?" 
      */
    var MLModelType: js.UndefOr[MLModelType] = js.undefined
    /**
      * A description of the most recent details about accessing the MLModel.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the MLModel.
      */
    var Name: js.UndefOr[MLModelName] = js.undefined
    /**
      * The recipe to use when training the MLModel. The Recipe provides detailed information about the observation data to use during training, and manipulations to perform on the observation data during training. Note This parameter is provided as part of the verbose format.
      */
    var Recipe: js.UndefOr[Recipe] = js.undefined
    /**
      * The schema used by all of the data files referenced by the DataSource. Note This parameter is provided as part of the verbose format.
      */
    var Schema: js.UndefOr[DataSchema] = js.undefined
    /**
      * The scoring threshold is used in binary classification MLModel models. It marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the threshold receive a positive result from the MLModel, such as true. Output values less than the threshold receive a negative response from the MLModel, such as false.
      */
    var ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined
    /**
      * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
      */
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    var SizeInBytes: js.UndefOr[LongType] = js.undefined
    /**
      * The epoch time when Amazon Machine Learning marked the MLModel as INPROGRESS. StartedAt isn't available if the MLModel is in the PENDING state.
      */
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The current status of the MLModel. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to describe a MLModel.  INPROGRESS - The request is processing.  FAILED - The request did not run to completion. The ML model isn't usable.  COMPLETED - The request completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
    /**
      * The ID of the training DataSource.
      */
    var TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none. We strongly recommend that you shuffle your data.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to zero, resulting in a sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm. It controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
      */
    var TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
  }
  
  trait MLModel extends js.Object {
    /**
      * The algorithm used to train the MLModel. The following algorithm is supported:   SGD -- Stochastic gradient descent. The goal of SGD is to minimize the gradient of the loss function.  
      */
    var Algorithm: js.UndefOr[Algorithm] = js.undefined
    var ComputeTime: js.UndefOr[LongType] = js.undefined
    /**
      * The time that the MLModel was created. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
      */
    var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.undefined
    /**
      * The current endpoint of the MLModel.
      */
    var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.undefined
    var FinishedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
      */
    var InputDataLocationS3: js.UndefOr[S3Url] = js.undefined
    /**
      * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
      */
    var LastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The ID assigned to the MLModel at creation.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
    /**
      * Identifies the MLModel category. The following are the available types:   REGRESSION - Produces a numeric result. For example, "What price should a house be listed at?"  BINARY - Produces one of two possible results. For example, "Is this a child-friendly web site?".  MULTICLASS - Produces one of several possible results. For example, "Is this a HIGH-, LOW-, or MEDIUM-risk trade?". 
      */
    var MLModelType: js.UndefOr[MLModelType] = js.undefined
    /**
      * A description of the most recent details about accessing the MLModel.
      */
    var Message: js.UndefOr[Message] = js.undefined
    /**
      * A user-supplied name or description of the MLModel.
      */
    var Name: js.UndefOr[MLModelName] = js.undefined
    var ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined
    /**
      * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
      */
    var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.undefined
    var SizeInBytes: js.UndefOr[LongType] = js.undefined
    var StartedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      * The current status of an MLModel. This element can have one of the following values:    PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create an MLModel.  INPROGRESS - The creation process is underway.  FAILED - The request to create an MLModel didn't run to completion. The model isn't usable.  COMPLETED - The creation process completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
      */
    var Status: js.UndefOr[EntityStatus] = js.undefined
    /**
      * The ID of the training DataSource. The CreateMLModel operation uses the TrainingDataSourceId.
      */
    var TrainingDataSourceId: js.UndefOr[EntityId] = js.undefined
    /**
      * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm, which controls overfitting the data by penalizing large coefficients. This parameter tends to drive coefficients to zero, resulting in sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm, which controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
      */
    var TrainingParameters: js.UndefOr[TrainingParameters] = js.undefined
  }
  
  trait PerformanceMetrics extends js.Object {
    var Properties: js.UndefOr[PerformanceMetricsProperties] = js.undefined
  }
  
  trait PerformanceMetricsProperties
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PerformanceMetricsPropertyValue]
  
  trait PredictInput extends js.Object {
    /**
      * A unique identifier of the MLModel.
      */
    var MLModelId: EntityId
    var PredictEndpoint: VipURL
    var Record: Record
  }
  
  trait PredictOutput extends js.Object {
    var Prediction: js.UndefOr[Prediction] = js.undefined
  }
  
  trait Prediction extends js.Object {
    var details: js.UndefOr[DetailsMap] = js.undefined
    /**
      * The prediction label for either a BINARY or MULTICLASS MLModel.
      */
    var predictedLabel: js.UndefOr[Label] = js.undefined
    var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.undefined
    /**
      * The prediction value for REGRESSION MLModel.
      */
    var predictedValue: js.UndefOr[floatLabel] = js.undefined
  }
  
  trait RDSDataSpec extends js.Object {
    /**
      * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:  percentBegin Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. percentEnd Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. complement The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}} Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}  strategy To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}} To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}  
      */
    var DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined
    /**
      * A JSON string that represents the schema for an Amazon RDS DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. A DataSchema is not required if you specify a DataSchemaUri Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0",  "recordAnnotationFieldName": "F1",  "recordWeightFieldName": "F2",  "targetFieldName": "F3",  "dataFormat": "CSV",  "dataFileContainsHeader": true,  "attributes": [  { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],  "excludedVariableNames": [ "F6" ] }  
      */
    var DataSchema: js.UndefOr[DataSchema] = js.undefined
    /**
      * The Amazon S3 location of the DataSchema. 
      */
    var DataSchemaUri: js.UndefOr[S3Url] = js.undefined
    /**
      * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
      */
    var DatabaseCredentials: RDSDatabaseCredentials
    /**
      * Describes the DatabaseName and InstanceIdentifier of an Amazon RDS database.
      */
    var DatabaseInformation: RDSDatabase
    /**
      * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see Role templates for data pipelines.
      */
    var ResourceRole: EDPResourceRole
    /**
      * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using SelectSqlQuery is stored in this location.
      */
    var S3StagingLocation: S3Url
    /**
      * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out the copy operation from Amazon RDS to an Amazon S3 task.
      */
    var SecurityGroupIds: EDPSecurityGroupIds
    /**
      * The query that is used to retrieve the observation data for the DataSource.
      */
    var SelectSqlQuery: RDSSelectSqlQuery
    /**
      * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
      */
    var ServiceRole: EDPServiceRole
    /**
      * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry out the copy task from Amazon RDS to Amazon S3.
      */
    var SubnetId: EDPSubnetId
  }
  
  trait RDSDatabase extends js.Object {
    var DatabaseName: RDSDatabaseName
    /**
      * The ID of an RDS DB instance.
      */
    var InstanceIdentifier: RDSInstanceIdentifier
  }
  
  trait RDSDatabaseCredentials extends js.Object {
    var Password: RDSDatabasePassword
    var Username: RDSDatabaseUsername
  }
  
  trait RDSMetadata extends js.Object {
    /**
      * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use the ID to find details about the instance in the Data Pipeline console.
      */
    var DataPipelineId: js.UndefOr[EDPPipelineId] = js.undefined
    /**
      * The database details required to connect to an Amazon RDS.
      */
    var Database: js.UndefOr[RDSDatabase] = js.undefined
    var DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.undefined
    /**
      * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
      */
    var ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined
    /**
      * The SQL query that is supplied during CreateDataSourceFromRDS. Returns only if Verbose is true in GetDataSourceInput. 
      */
    var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined
    /**
      * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
      */
    var ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined
  }
  
  trait RealtimeEndpointInfo extends js.Object {
    /**
      * The time that the request to create the real-time endpoint for the MLModel was received. The time is expressed in epoch time.
      */
    var CreatedAt: js.UndefOr[EpochTime] = js.undefined
    /**
      *  The current status of the real-time endpoint for the MLModel. This element can have one of the following values:    NONE - Endpoint does not exist or was previously deleted.  READY - Endpoint is ready to be used for real-time predictions.  UPDATING - Updating/creating the endpoint.  
      */
    var EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined
    /**
      * The URI that specifies where to send real-time prediction requests for the MLModel. Note The application must wait until the real-time endpoint is ready before using this URI. 
      */
    var EndpointUrl: js.UndefOr[VipURL] = js.undefined
    /**
      *  The maximum processing rate for the real-time endpoint for MLModel, measured in incoming requests per second.
      */
    var PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined
  }
  
  trait Record
    extends /* key */ org.scalablytyped.runtime.StringDictionary[VariableValue]
  
  trait RedshiftDataSpec extends js.Object {
    /**
      * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:  percentBegin Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. percentEnd Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. complement The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}} Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}  strategy To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}} To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}  
      */
    var DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined
    /**
      * A JSON string that represents the schema for an Amazon Redshift DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. A DataSchema is not required if you specify a DataSchemaUri. Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0",  "recordAnnotationFieldName": "F1",  "recordWeightFieldName": "F2",  "targetFieldName": "F3",  "dataFormat": "CSV",  "dataFileContainsHeader": true,  "attributes": [  { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],  "excludedVariableNames": [ "F6" ] } 
      */
    var DataSchema: js.UndefOr[DataSchema] = js.undefined
    /**
      * Describes the schema location for an Amazon Redshift DataSource.
      */
    var DataSchemaUri: js.UndefOr[S3Url] = js.undefined
    /**
      * Describes AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon Redshift database.
      */
    var DatabaseCredentials: RedshiftDatabaseCredentials
    /**
      * Describes the DatabaseName and ClusterIdentifier for an Amazon Redshift DataSource.
      */
    var DatabaseInformation: RedshiftDatabase
    /**
      * Describes an Amazon S3 location to store the result set of the SelectSqlQuery query.
      */
    var S3StagingLocation: S3Url
    /**
      * Describes the SQL Query to execute on an Amazon Redshift database for an Amazon Redshift DataSource.
      */
    var SelectSqlQuery: RedshiftSelectSqlQuery
  }
  
  trait RedshiftDatabase extends js.Object {
    var ClusterIdentifier: RedshiftClusterIdentifier
    var DatabaseName: RedshiftDatabaseName
  }
  
  trait RedshiftDatabaseCredentials extends js.Object {
    var Password: RedshiftDatabasePassword
    var Username: RedshiftDatabaseUsername
  }
  
  trait RedshiftMetadata extends js.Object {
    var DatabaseUserName: js.UndefOr[RedshiftDatabaseUsername] = js.undefined
    var RedshiftDatabase: js.UndefOr[RedshiftDatabase] = js.undefined
    /**
      *  The SQL query that is specified during CreateDataSourceFromRedshift. Returns only if Verbose is true in GetDataSourceInput. 
      */
    var SelectSqlQuery: js.UndefOr[RedshiftSelectSqlQuery] = js.undefined
  }
  
  trait S3DataSpec extends js.Object {
    /**
      * The location of the data file(s) used by a DataSource. The URI specifies a data file or an Amazon Simple Storage Service (Amazon S3) directory or bucket containing data files.
      */
    var DataLocationS3: S3Url
    /**
      * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:  percentBegin Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. percentEnd Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. complement The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}} Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}  strategy To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}} To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}  
      */
    var DataRearrangement: js.UndefOr[DataRearrangement] = js.undefined
    /**
      *  A JSON string that represents the schema for an Amazon S3 DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. You must provide either the DataSchema or the DataSchemaLocationS3. Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0",  "recordAnnotationFieldName": "F1",  "recordWeightFieldName": "F2",  "targetFieldName": "F3",  "dataFormat": "CSV",  "dataFileContainsHeader": true,  "attributes": [  { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],  "excludedVariableNames": [ "F6" ] }  
      */
    var DataSchema: js.UndefOr[DataSchema] = js.undefined
    /**
      * Describes the schema location in Amazon S3. You must provide either the DataSchema or the DataSchemaLocationS3.
      */
    var DataSchemaLocationS3: js.UndefOr[S3Url] = js.undefined
  }
  
  trait ScoreValuePerLabelMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ScoreValue]
  
  trait Tag extends js.Object {
    /**
      * A unique identifier for the tag. Valid characters include Unicode letters, digits, white space, _, ., /, =, +, -, %, and @.
      */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
      * An optional string, typically used to describe or define the tag. Valid characters include Unicode letters, digits, white space, _, ., /, =, +, -, %, and @.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TrainingParameters
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
      */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
      */
    def addTags(params: AddTagsInput): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      params: AddTagsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
      */
    def createBatchPrediction(): awsDashSdkLib.libRequestMod.Request[CreateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBatchPrediction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
      */
    def createBatchPrediction(params: CreateBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[CreateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBatchPrediction(
      params: CreateBatchPredictionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
      */
    def createDataSourceFromRDS(): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRDSOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromRDS(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromRDSOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRDSOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
      */
    def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRDSOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromRDS(
      params: CreateDataSourceFromRDSInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromRDSOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRDSOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
      */
    def createDataSourceFromRedshift(): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRedshiftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromRedshift(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromRedshiftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRedshiftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
      */
    def createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRedshiftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromRedshift(
      params: CreateDataSourceFromRedshiftInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromRedshiftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromRedshiftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
      */
    def createDataSourceFromS3(): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromS3Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromS3(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromS3Output, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromS3Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
      */
    def createDataSourceFromS3(params: CreateDataSourceFromS3Input): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromS3Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDataSourceFromS3(
      params: CreateDataSourceFromS3Input,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDataSourceFromS3Output, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDataSourceFromS3Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
      */
    def createEvaluation(): awsDashSdkLib.libRequestMod.Request[CreateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEvaluation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
      */
    def createEvaluation(params: CreateEvaluationInput): awsDashSdkLib.libRequestMod.Request[CreateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEvaluation(
      params: CreateEvaluationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
      */
    def createMLModel(): awsDashSdkLib.libRequestMod.Request[CreateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMLModel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
      */
    def createMLModel(params: CreateMLModelInput): awsDashSdkLib.libRequestMod.Request[CreateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMLModel(
      params: CreateMLModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
      */
    def createRealtimeEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRealtimeEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRealtimeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
      */
    def createRealtimeEndpoint(params: CreateRealtimeEndpointInput): awsDashSdkLib.libRequestMod.Request[CreateRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRealtimeEndpoint(
      params: CreateRealtimeEndpointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRealtimeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
      */
    def deleteBatchPrediction(): awsDashSdkLib.libRequestMod.Request[DeleteBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBatchPrediction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
      */
    def deleteBatchPrediction(params: DeleteBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[DeleteBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBatchPrediction(
      params: DeleteBatchPredictionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
      */
    def deleteDataSource(): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDataSource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
      */
    def deleteDataSource(params: DeleteDataSourceInput): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDataSource(
      params: DeleteDataSourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
      */
    def deleteEvaluation(): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEvaluation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
      */
    def deleteEvaluation(params: DeleteEvaluationInput): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEvaluation(
      params: DeleteEvaluationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
      */
    def deleteMLModel(): awsDashSdkLib.libRequestMod.Request[DeleteMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMLModel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
      */
    def deleteMLModel(params: DeleteMLModelInput): awsDashSdkLib.libRequestMod.Request[DeleteMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMLModel(
      params: DeleteMLModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a real time endpoint of an MLModel.
      */
    def deleteRealtimeEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRealtimeEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRealtimeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a real time endpoint of an MLModel.
      */
    def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput): awsDashSdkLib.libRequestMod.Request[DeleteRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRealtimeEndpoint(
      params: DeleteRealtimeEndpointInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRealtimeEndpointOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRealtimeEndpointOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
      */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
      */
    def deleteTags(params: DeleteTagsInput): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      params: DeleteTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of BatchPrediction operations that match the search criteria in the request.
      */
    def describeBatchPredictions(): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBatchPredictions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBatchPredictionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of BatchPrediction operations that match the search criteria in the request.
      */
    def describeBatchPredictions(params: DescribeBatchPredictionsInput): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBatchPredictions(
      params: DescribeBatchPredictionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBatchPredictionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DataSource that match the search criteria in the request.
      */
    def describeDataSources(): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDataSources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDataSourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DataSource that match the search criteria in the request.
      */
    def describeDataSources(params: DescribeDataSourcesInput): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDataSources(
      params: DescribeDataSourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDataSourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DescribeEvaluations that match the search criteria in the request.
      */
    def describeEvaluations(): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvaluations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEvaluationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of DescribeEvaluations that match the search criteria in the request.
      */
    def describeEvaluations(params: DescribeEvaluationsInput): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvaluations(
      params: DescribeEvaluationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEvaluationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of MLModel that match the search criteria in the request.
      */
    def describeMLModels(): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMLModels(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMLModelsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of MLModel that match the search criteria in the request.
      */
    def describeMLModels(params: DescribeMLModelsInput): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMLModels(
      params: DescribeMLModelsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMLModelsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of the tags for your Amazon ML object.
      */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of the tags for your Amazon ML object.
      */
    def describeTags(params: DescribeTagsInput): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      params: DescribeTagsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
      */
    def getBatchPrediction(): awsDashSdkLib.libRequestMod.Request[GetBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBatchPrediction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
      */
    def getBatchPrediction(params: GetBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[GetBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBatchPrediction(
      params: GetBatchPredictionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
      */
    def getDataSource(): awsDashSdkLib.libRequestMod.Request[GetDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDataSource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
      */
    def getDataSource(params: GetDataSourceInput): awsDashSdkLib.libRequestMod.Request[GetDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDataSource(
      params: GetDataSourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
      */
    def getEvaluation(): awsDashSdkLib.libRequestMod.Request[GetEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEvaluation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
      */
    def getEvaluation(params: GetEvaluationInput): awsDashSdkLib.libRequestMod.Request[GetEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEvaluation(
      params: GetEvaluationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
      */
    def getMLModel(): awsDashSdkLib.libRequestMod.Request[GetMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMLModel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
      */
    def getMLModel(params: GetMLModelInput): awsDashSdkLib.libRequestMod.Request[GetMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getMLModel(
      params: GetMLModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
      */
    def predict(): awsDashSdkLib.libRequestMod.Request[PredictOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def predict(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PredictOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PredictOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
      */
    def predict(params: PredictInput): awsDashSdkLib.libRequestMod.Request[PredictOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def predict(
      params: PredictInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PredictOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PredictOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
      */
    def updateBatchPrediction(): awsDashSdkLib.libRequestMod.Request[UpdateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBatchPrediction(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
      */
    def updateBatchPrediction(params: UpdateBatchPredictionInput): awsDashSdkLib.libRequestMod.Request[UpdateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBatchPrediction(
      params: UpdateBatchPredictionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBatchPredictionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBatchPredictionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
      */
    def updateDataSource(): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDataSource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
      */
    def updateDataSource(params: UpdateDataSourceInput): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDataSource(
      params: UpdateDataSourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDataSourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDataSourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
      */
    def updateEvaluation(): awsDashSdkLib.libRequestMod.Request[UpdateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEvaluation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
      */
    def updateEvaluation(params: UpdateEvaluationInput): awsDashSdkLib.libRequestMod.Request[UpdateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateEvaluation(
      params: UpdateEvaluationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateEvaluationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateEvaluationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
      */
    def updateMLModel(): awsDashSdkLib.libRequestMod.Request[UpdateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMLModel(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
      */
    def updateMLModel(params: UpdateMLModelInput): awsDashSdkLib.libRequestMod.Request[UpdateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMLModel(
      params: UpdateMLModelInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMLModelOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMLModelOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_batchPredictionAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_batchPredictionAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBatchPredictionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_batchPredictionAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
      params: DescribeBatchPredictionsInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_batchPredictionAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.batchPredictionAvailable,
      params: DescribeBatchPredictionsInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBatchPredictionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBatchPredictionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dataSourceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dataSourceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDataSourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_dataSourceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
      params: DescribeDataSourcesInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_dataSourceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.dataSourceAvailable,
      params: DescribeDataSourcesInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDataSourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDataSourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_evaluationAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_evaluationAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEvaluationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_evaluationAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
      params: DescribeEvaluationsInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_evaluationAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.evaluationAvailable,
      params: DescribeEvaluationsInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEvaluationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEvaluationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_mLModelAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_mLModelAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMLModelsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
      */
    @JSName("waitFor")
    def waitFor_mLModelAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
      params: DescribeMLModelsInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_mLModelAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.mLModelAvailable,
      params: DescribeMLModelsInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMLModelsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMLModelsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateBatchPredictionInput extends js.Object {
    /**
      * The ID assigned to the BatchPrediction during creation.
      */
    var BatchPredictionId: EntityId
    /**
      * A new user-supplied name or description of the BatchPrediction.
      */
    var BatchPredictionName: EntityName
  }
  
  trait UpdateBatchPredictionOutput extends js.Object {
    /**
      * The ID assigned to the BatchPrediction during creation. This value should be identical to the value of the BatchPredictionId in the request.
      */
    var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait UpdateDataSourceInput extends js.Object {
    /**
      * The ID assigned to the DataSource during creation.
      */
    var DataSourceId: EntityId
    /**
      * A new user-supplied name or description of the DataSource that will replace the current description. 
      */
    var DataSourceName: EntityName
  }
  
  trait UpdateDataSourceOutput extends js.Object {
    /**
      * The ID assigned to the DataSource during creation. This value should be identical to the value of the DataSourceID in the request.
      */
    var DataSourceId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait UpdateEvaluationInput extends js.Object {
    /**
      * The ID assigned to the Evaluation during creation.
      */
    var EvaluationId: EntityId
    /**
      * A new user-supplied name or description of the Evaluation that will replace the current content. 
      */
    var EvaluationName: EntityName
  }
  
  trait UpdateEvaluationOutput extends js.Object {
    /**
      * The ID assigned to the Evaluation during creation. This value should be identical to the value of the Evaluation in the request.
      */
    var EvaluationId: js.UndefOr[EntityId] = js.undefined
  }
  
  trait UpdateMLModelInput extends js.Object {
    /**
      * The ID assigned to the MLModel during creation.
      */
    var MLModelId: EntityId
    /**
      * A user-supplied name or description of the MLModel.
      */
    var MLModelName: js.UndefOr[EntityName] = js.undefined
    /**
      * The ScoreThreshold used in binary classification MLModel that marks the boundary between a positive prediction and a negative prediction. Output values greater than or equal to the ScoreThreshold receive a positive result from the MLModel, such as true. Output values less than the ScoreThreshold receive a negative response from the MLModel, such as false.
      */
    var ScoreThreshold: js.UndefOr[ScoreThreshold] = js.undefined
  }
  
  trait UpdateMLModelOutput extends js.Object {
    /**
      * The ID assigned to the MLModel during creation. This value should be identical to the value of the MLModelID in the request.
      */
    var MLModelId: js.UndefOr[EntityId] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Algorithm = awsDashSdkLib.awsDashSdkLibStrings.sgd | java.lang.String
  type AwsUserArn = java.lang.String
  type BatchPredictionFilterVariable = awsDashSdkLib.awsDashSdkLibStrings.CreatedAt | awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.IAMUser | awsDashSdkLib.awsDashSdkLibStrings.MLModelId | awsDashSdkLib.awsDashSdkLibStrings.DataSourceId | awsDashSdkLib.awsDashSdkLibStrings.DataURI | java.lang.String
  type BatchPredictions = js.Array[BatchPrediction]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparatorValue = java.lang.String
  type ComputeStatistics = scala.Boolean
  type DataRearrangement = java.lang.String
  type DataSchema = java.lang.String
  type DataSourceFilterVariable = awsDashSdkLib.awsDashSdkLibStrings.CreatedAt | awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.DataLocationS3 | awsDashSdkLib.awsDashSdkLibStrings.IAMUser | java.lang.String
  type DataSources = js.Array[DataSource]
  type DetailsAttributes = awsDashSdkLib.awsDashSdkLibStrings.PredictiveModelType | awsDashSdkLib.awsDashSdkLibStrings.Algorithm | java.lang.String
  type DetailsValue = java.lang.String
  type EDPPipelineId = java.lang.String
  type EDPResourceRole = java.lang.String
  type EDPSecurityGroupId = java.lang.String
  type EDPSecurityGroupIds = js.Array[EDPSecurityGroupId]
  type EDPServiceRole = java.lang.String
  type EDPSubnetId = java.lang.String
  type EntityId = java.lang.String
  type EntityName = java.lang.String
  type EntityStatus = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.INPROGRESS | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type EpochTime = stdLib.Date
  type EvaluationFilterVariable = awsDashSdkLib.awsDashSdkLibStrings.CreatedAt | awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.IAMUser | awsDashSdkLib.awsDashSdkLibStrings.MLModelId | awsDashSdkLib.awsDashSdkLibStrings.DataSourceId | awsDashSdkLib.awsDashSdkLibStrings.DataURI | java.lang.String
  type Evaluations = js.Array[Evaluation]
  type IntegerType = scala.Double
  type Label = java.lang.String
  type LongType = scala.Double
  type MLModelFilterVariable = awsDashSdkLib.awsDashSdkLibStrings.CreatedAt | awsDashSdkLib.awsDashSdkLibStrings.LastUpdatedAt | awsDashSdkLib.awsDashSdkLibStrings.Status | awsDashSdkLib.awsDashSdkLibStrings.Name | awsDashSdkLib.awsDashSdkLibStrings.IAMUser | awsDashSdkLib.awsDashSdkLibStrings.TrainingDataSourceId | awsDashSdkLib.awsDashSdkLibStrings.RealtimeEndpointStatus | awsDashSdkLib.awsDashSdkLibStrings.MLModelType | awsDashSdkLib.awsDashSdkLibStrings.Algorithm | awsDashSdkLib.awsDashSdkLibStrings.TrainingDataURI | java.lang.String
  type MLModelName = java.lang.String
  type MLModelType = awsDashSdkLib.awsDashSdkLibStrings.REGRESSION | awsDashSdkLib.awsDashSdkLibStrings.BINARY | awsDashSdkLib.awsDashSdkLibStrings.MULTICLASS | java.lang.String
  type MLModels = js.Array[MLModel]
  type Message = java.lang.String
  type PageLimit = scala.Double
  type PerformanceMetricsPropertyKey = java.lang.String
  type PerformanceMetricsPropertyValue = java.lang.String
  type PresignedS3Url = java.lang.String
  type RDSDatabaseName = java.lang.String
  type RDSDatabasePassword = java.lang.String
  type RDSDatabaseUsername = java.lang.String
  type RDSInstanceIdentifier = java.lang.String
  type RDSSelectSqlQuery = java.lang.String
  type RealtimeEndpointStatus = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type Recipe = java.lang.String
  type RedshiftClusterIdentifier = java.lang.String
  type RedshiftDatabaseName = java.lang.String
  type RedshiftDatabasePassword = java.lang.String
  type RedshiftDatabaseUsername = java.lang.String
  type RedshiftSelectSqlQuery = java.lang.String
  type RoleARN = java.lang.String
  type S3Url = java.lang.String
  type ScoreThreshold = scala.Double
  type ScoreValue = scala.Double
  type SortOrder = awsDashSdkLib.awsDashSdkLibStrings.asc | awsDashSdkLib.awsDashSdkLibStrings.dsc | java.lang.String
  type StringType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TaggableResourceType = awsDashSdkLib.awsDashSdkLibStrings.BatchPrediction | awsDashSdkLib.awsDashSdkLibStrings.DataSource | awsDashSdkLib.awsDashSdkLibStrings.Evaluation | awsDashSdkLib.awsDashSdkLibStrings.MLModel | java.lang.String
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Verbose = scala.Boolean
  type VipURL = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-12-12` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type floatLabel = scala.Double
}

