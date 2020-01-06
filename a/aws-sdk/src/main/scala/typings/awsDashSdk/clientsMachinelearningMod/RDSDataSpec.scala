package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDataSpec extends js.Object {
  /**
    * A JSON string that represents the splitting and rearrangement processing to be applied to a DataSource. If the DataRearrangement parameter is not provided, all of the input data is used to create the Datasource. There are multiple parameters that control what data is used to create a datasource:  percentBegin Use percentBegin to indicate the beginning of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. percentEnd Use percentEnd to indicate the end of the range of the data used to create the Datasource. If you do not include percentBegin and percentEnd, Amazon ML includes all of the data when creating the datasource. complement The complement parameter instructs Amazon ML to use the data that is not included in the range of percentBegin to percentEnd to create a datasource. The complement parameter is useful if you need to create complementary datasources for training and evaluation. To create a complementary datasource, use the same values for percentBegin and percentEnd, along with the complement parameter. For example, the following two datasources do not share any data, and can be used to train and evaluate a model. The first datasource has 25 percent of the data, and the second one has 75 percent of the data. Datasource for evaluation: {"splitting":{"percentBegin":0, "percentEnd":25}} Datasource for training: {"splitting":{"percentBegin":0, "percentEnd":25, "complement":"true"}}  strategy To change how Amazon ML splits the data for a datasource, use the strategy parameter. The default value for the strategy parameter is sequential, meaning that Amazon ML takes all of the data records between the percentBegin and percentEnd parameters for the datasource, in the order that the records appear in the input data. The following two DataRearrangement lines are examples of sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"sequential", "complement":"true"}} To randomly split the input data into the proportions indicated by the percentBegin and percentEnd parameters, set the strategy parameter to random and provide a string that is used as the seed value for the random data splitting (for example, you can use the S3 path to your data as the random seed string). If you choose the random split strategy, Amazon ML assigns each row of data a pseudo-random number between 0 and 100, and then selects the rows that have an assigned number between percentBegin and percentEnd. Pseudo-random numbers are assigned using both the input seed string value and the byte offset as a seed, so changing the data results in a different split. Any existing ordering is preserved. The random splitting strategy ensures that variables in the training and evaluation data are distributed similarly. It is useful in the cases where the input data may have an implicit sort order, which would otherwise result in training and evaluation datasources containing non-similar data records. The following two DataRearrangement lines are examples of non-sequentially ordered training and evaluation datasources: Datasource for evaluation: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv"}} Datasource for training: {"splitting":{"percentBegin":70, "percentEnd":100, "strategy":"random", "randomSeed"="s3://my_s3_path/bucket/file.csv", "complement":"true"}}  
    */
  var DataRearrangement: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.DataRearrangement] = js.native
  /**
    * A JSON string that represents the schema for an Amazon RDS DataSource. The DataSchema defines the structure of the observation data in the data file(s) referenced in the DataSource. A DataSchema is not required if you specify a DataSchemaUri Define your DataSchema as a series of key-value pairs. attributes and excludedVariableNames have an array of key-value pairs for their value. Use the following format to define your DataSchema. { "version": "1.0",  "recordAnnotationFieldName": "F1",  "recordWeightFieldName": "F2",  "targetFieldName": "F3",  "dataFormat": "CSV",  "dataFileContainsHeader": true,  "attributes": [  { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2", "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],  "excludedVariableNames": [ "F6" ] }  
    */
  var DataSchema: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.DataSchema] = js.native
  /**
    * The Amazon S3 location of the DataSchema. 
    */
  var DataSchemaUri: js.UndefOr[S3Url] = js.native
  /**
    * The AWS Identity and Access Management (IAM) credentials that are used connect to the Amazon RDS database.
    */
  var DatabaseCredentials: RDSDatabaseCredentials = js.native
  /**
    * Describes the DatabaseName and InstanceIdentifier of an Amazon RDS database.
    */
  var DatabaseInformation: RDSDatabase = js.native
  /**
    * The role (DataPipelineDefaultResourceRole) assumed by an Amazon Elastic Compute Cloud (Amazon EC2) instance to carry out the copy operation from Amazon RDS to an Amazon S3 task. For more information, see Role templates for data pipelines.
    */
  var ResourceRole: EDPResourceRole = js.native
  /**
    * The Amazon S3 location for staging Amazon RDS data. The data retrieved from Amazon RDS using SelectSqlQuery is stored in this location.
    */
  var S3StagingLocation: S3Url = js.native
  /**
    * The security group IDs to be used to access a VPC-based RDS DB instance. Ensure that there are appropriate ingress rules set up to allow access to the RDS DB instance. This attribute is used by Data Pipeline to carry out the copy operation from Amazon RDS to an Amazon S3 task.
    */
  var SecurityGroupIds: EDPSecurityGroupIds = js.native
  /**
    * The query that is used to retrieve the observation data for the DataSource.
    */
  var SelectSqlQuery: RDSSelectSqlQuery = js.native
  /**
    * The role (DataPipelineDefaultRole) assumed by AWS Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ServiceRole: EDPServiceRole = js.native
  /**
    * The subnet ID to be used to access a VPC-based RDS DB instance. This attribute is used by Data Pipeline to carry out the copy task from Amazon RDS to Amazon S3.
    */
  var SubnetId: EDPSubnetId = js.native
}

object RDSDataSpec {
  @scala.inline
  def apply(
    DatabaseCredentials: RDSDatabaseCredentials,
    DatabaseInformation: RDSDatabase,
    ResourceRole: EDPResourceRole,
    S3StagingLocation: S3Url,
    SecurityGroupIds: EDPSecurityGroupIds,
    SelectSqlQuery: RDSSelectSqlQuery,
    ServiceRole: EDPServiceRole,
    SubnetId: EDPSubnetId,
    DataRearrangement: DataRearrangement = null,
    DataSchema: DataSchema = null,
    DataSchemaUri: S3Url = null
  ): RDSDataSpec = {
    val __obj = js.Dynamic.literal(DatabaseCredentials = DatabaseCredentials.asInstanceOf[js.Any], DatabaseInformation = DatabaseInformation.asInstanceOf[js.Any], ResourceRole = ResourceRole.asInstanceOf[js.Any], S3StagingLocation = S3StagingLocation.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SelectSqlQuery = SelectSqlQuery.asInstanceOf[js.Any], ServiceRole = ServiceRole.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    if (DataRearrangement != null) __obj.updateDynamic("DataRearrangement")(DataRearrangement.asInstanceOf[js.Any])
    if (DataSchema != null) __obj.updateDynamic("DataSchema")(DataSchema.asInstanceOf[js.Any])
    if (DataSchemaUri != null) __obj.updateDynamic("DataSchemaUri")(DataSchemaUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDataSpec]
  }
}

