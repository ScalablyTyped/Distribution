package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceFromRedshiftInput extends StObject {
  
  /**
    * The compute statistics for a DataSource. The statistics are generated from the observation data referenced by a DataSource. Amazon ML uses the statistics internally during MLModel training. This parameter must be set to true if the DataSource needs to be used for MLModel training.
    */
  var ComputeStatistics: js.UndefOr[typings.awsSdk.clientsMachinelearningMod.ComputeStatistics] = js.undefined
  
  /**
    * A user-supplied ID that uniquely identifies the DataSource.
    */
  var DataSourceId: EntityId
  
  /**
    * A user-supplied name or description of the DataSource. 
    */
  var DataSourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The data specification of an Amazon Redshift DataSource:   DatabaseInformation -    DatabaseName - The name of the Amazon Redshift database.     ClusterIdentifier - The unique ID for the Amazon Redshift cluster.     DatabaseCredentials - The AWS Identity and Access Management (IAM) credentials that are used to connect to the Amazon Redshift database.   SelectSqlQuery - The query that is used to retrieve the observation data for the Datasource.   S3StagingLocation - The Amazon Simple Storage Service (Amazon S3) location for staging Amazon Redshift data. The data retrieved from Amazon Redshift using the SelectSqlQuery query is stored in this location.   DataSchemaUri - The Amazon S3 location of the DataSchema.   DataSchema - A JSON string representing the schema. This is not required if DataSchemaUri is specified.    DataRearrangement - A JSON string that represents the splitting and rearrangement requirements for the DataSource.  Sample -  "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"   
    */
  var DataSpec: RedshiftDataSpec
  
  /**
    * A fully specified role Amazon Resource Name (ARN). Amazon ML assumes the role on behalf of the user to create the following:   A security group to allow Amazon ML to execute the SelectSqlQuery query on an Amazon Redshift cluster   An Amazon S3 bucket policy to grant Amazon ML read/write permissions on the S3StagingLocation   
    */
  var RoleARN: typings.awsSdk.clientsMachinelearningMod.RoleARN
}
object CreateDataSourceFromRedshiftInput {
  
  inline def apply(DataSourceId: EntityId, DataSpec: RedshiftDataSpec, RoleARN: RoleARN): CreateDataSourceFromRedshiftInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any], DataSpec = DataSpec.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceFromRedshiftInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataSourceFromRedshiftInput] (val x: Self) extends AnyVal {
    
    inline def setComputeStatistics(value: ComputeStatistics): Self = StObject.set(x, "ComputeStatistics", value.asInstanceOf[js.Any])
    
    inline def setComputeStatisticsUndefined: Self = StObject.set(x, "ComputeStatistics", js.undefined)
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: EntityName): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNameUndefined: Self = StObject.set(x, "DataSourceName", js.undefined)
    
    inline def setDataSpec(value: RedshiftDataSpec): Self = StObject.set(x, "DataSpec", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
