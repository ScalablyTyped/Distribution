package typings.awsSdk.clientsKeyspacesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyspaces extends Service {
  
  @JSName("config")
  var config_Keyspaces: ConfigBase & ClientConfiguration = js.native
  
  /**
    * The CreateKeyspace operation adds a new keyspace to your account. In an Amazon Web Services account, keyspace names must be unique within each Region.  CreateKeyspace is an asynchronous operation. You can monitor the creation status of the new keyspace by using the GetKeyspace operation. For more information, see Creating keyspaces in the Amazon Keyspaces Developer Guide.
    */
  def createKeyspace(): Request[CreateKeyspaceResponse, AWSError] = js.native
  def createKeyspace(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyspaceResponse, Unit]): Request[CreateKeyspaceResponse, AWSError] = js.native
  /**
    * The CreateKeyspace operation adds a new keyspace to your account. In an Amazon Web Services account, keyspace names must be unique within each Region.  CreateKeyspace is an asynchronous operation. You can monitor the creation status of the new keyspace by using the GetKeyspace operation. For more information, see Creating keyspaces in the Amazon Keyspaces Developer Guide.
    */
  def createKeyspace(params: CreateKeyspaceRequest): Request[CreateKeyspaceResponse, AWSError] = js.native
  def createKeyspace(
    params: CreateKeyspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyspaceResponse, Unit]
  ): Request[CreateKeyspaceResponse, AWSError] = js.native
  
  /**
    * The CreateTable operation adds a new table to the specified keyspace. Within a keyspace, table names must be unique.  CreateTable is an asynchronous operation. When the request is received, the status of the table is set to CREATING. You can monitor the creation status of the new table by using the GetTable operation, which returns the current status of the table. You can start using a table when the status is ACTIVE. For more information, see Creating tables in the Amazon Keyspaces Developer Guide.
    */
  def createTable(): Request[CreateTableResponse, AWSError] = js.native
  def createTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]): Request[CreateTableResponse, AWSError] = js.native
  /**
    * The CreateTable operation adds a new table to the specified keyspace. Within a keyspace, table names must be unique.  CreateTable is an asynchronous operation. When the request is received, the status of the table is set to CREATING. You can monitor the creation status of the new table by using the GetTable operation, which returns the current status of the table. You can start using a table when the status is ACTIVE. For more information, see Creating tables in the Amazon Keyspaces Developer Guide.
    */
  def createTable(params: CreateTableRequest): Request[CreateTableResponse, AWSError] = js.native
  def createTable(
    params: CreateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]
  ): Request[CreateTableResponse, AWSError] = js.native
  
  /**
    * The DeleteKeyspace operation deletes a keyspace and all of its tables. 
    */
  def deleteKeyspace(): Request[DeleteKeyspaceResponse, AWSError] = js.native
  def deleteKeyspace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeyspaceResponse, Unit]): Request[DeleteKeyspaceResponse, AWSError] = js.native
  /**
    * The DeleteKeyspace operation deletes a keyspace and all of its tables. 
    */
  def deleteKeyspace(params: DeleteKeyspaceRequest): Request[DeleteKeyspaceResponse, AWSError] = js.native
  def deleteKeyspace(
    params: DeleteKeyspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeyspaceResponse, Unit]
  ): Request[DeleteKeyspaceResponse, AWSError] = js.native
  
  /**
    * The DeleteTable operation deletes a table and all of its data. After a DeleteTable request is received, the specified table is in the DELETING state until Amazon Keyspaces completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is either in the CREATING or UPDATING states, then Amazon Keyspaces returns a ResourceInUseException. If the specified table does not exist, Amazon Keyspaces returns a ResourceNotFoundException. If the table is already in the DELETING state, no error is returned.
    */
  def deleteTable(): Request[DeleteTableResponse, AWSError] = js.native
  def deleteTable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableResponse, Unit]): Request[DeleteTableResponse, AWSError] = js.native
  /**
    * The DeleteTable operation deletes a table and all of its data. After a DeleteTable request is received, the specified table is in the DELETING state until Amazon Keyspaces completes the deletion. If the table is in the ACTIVE state, you can delete it. If a table is either in the CREATING or UPDATING states, then Amazon Keyspaces returns a ResourceInUseException. If the specified table does not exist, Amazon Keyspaces returns a ResourceNotFoundException. If the table is already in the DELETING state, no error is returned.
    */
  def deleteTable(params: DeleteTableRequest): Request[DeleteTableResponse, AWSError] = js.native
  def deleteTable(
    params: DeleteTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTableResponse, Unit]
  ): Request[DeleteTableResponse, AWSError] = js.native
  
  /**
    * Returns the name and the Amazon Resource Name (ARN) of the specified table.
    */
  def getKeyspace(): Request[GetKeyspaceResponse, AWSError] = js.native
  def getKeyspace(callback: js.Function2[/* err */ AWSError, /* data */ GetKeyspaceResponse, Unit]): Request[GetKeyspaceResponse, AWSError] = js.native
  /**
    * Returns the name and the Amazon Resource Name (ARN) of the specified table.
    */
  def getKeyspace(params: GetKeyspaceRequest): Request[GetKeyspaceResponse, AWSError] = js.native
  def getKeyspace(
    params: GetKeyspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKeyspaceResponse, Unit]
  ): Request[GetKeyspaceResponse, AWSError] = js.native
  
  /**
    * Returns information about the table, including the table's name and current status, the keyspace name, configuration settings, and metadata. To read table metadata using GetTable, Select action permissions for the table and system tables are required to complete the operation.
    */
  def getTable(): Request[GetTableResponse, AWSError] = js.native
  def getTable(callback: js.Function2[/* err */ AWSError, /* data */ GetTableResponse, Unit]): Request[GetTableResponse, AWSError] = js.native
  /**
    * Returns information about the table, including the table's name and current status, the keyspace name, configuration settings, and metadata. To read table metadata using GetTable, Select action permissions for the table and system tables are required to complete the operation.
    */
  def getTable(params: GetTableRequest): Request[GetTableResponse, AWSError] = js.native
  def getTable(
    params: GetTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTableResponse, Unit]
  ): Request[GetTableResponse, AWSError] = js.native
  
  /**
    * Returns a list of keyspaces.
    */
  def listKeyspaces(): Request[ListKeyspacesResponse, AWSError] = js.native
  def listKeyspaces(callback: js.Function2[/* err */ AWSError, /* data */ ListKeyspacesResponse, Unit]): Request[ListKeyspacesResponse, AWSError] = js.native
  /**
    * Returns a list of keyspaces.
    */
  def listKeyspaces(params: ListKeyspacesRequest): Request[ListKeyspacesResponse, AWSError] = js.native
  def listKeyspaces(
    params: ListKeyspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKeyspacesResponse, Unit]
  ): Request[ListKeyspacesResponse, AWSError] = js.native
  
  /**
    * Returns a list of tables for a specified keyspace.
    */
  def listTables(): Request[ListTablesResponse, AWSError] = js.native
  def listTables(callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]): Request[ListTablesResponse, AWSError] = js.native
  /**
    * Returns a list of tables for a specified keyspace.
    */
  def listTables(params: ListTablesRequest): Request[ListTablesResponse, AWSError] = js.native
  def listTables(
    params: ListTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]
  ): Request[ListTablesResponse, AWSError] = js.native
  
  /**
    * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Restores the specified table to the specified point in time within the earliest_restorable_timestamp and the current time. For more information about restore points, see  Time window for PITR continuous backups in the Amazon Keyspaces Developer Guide. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account. When you restore using point in time recovery, Amazon Keyspaces restores your source table's schema and data to the state based on the selected timestamp (day:hour:minute:second) to a new table. The Time to Live (TTL) settings are also restored to the state based on the selected timestamp. In addition to the table's schema, data, and TTL settings, RestoreTable restores the capacity mode, encryption, and point-in-time recovery settings from the source table. Unlike the table's schema data and TTL settings, which are restored based on the selected timestamp, these settings are always restored based on the table's settings as of the current time or when the table was deleted. You can also overwrite these settings during restore:   Read/write capacity mode   Provisioned throughput capacity settings   Point-in-time (PITR) settings   Tags   For more information, see PITR restore settings in the Amazon Keyspaces Developer Guide. Note that the following settings are not restored, and you must configure them manually for the new table:   Automatic scaling policies (for tables that use provisioned capacity mode)   Identity and Access Management (IAM) policies   Amazon CloudWatch metrics and alarms  
    */
  def restoreTable(): Request[RestoreTableResponse, AWSError] = js.native
  def restoreTable(callback: js.Function2[/* err */ AWSError, /* data */ RestoreTableResponse, Unit]): Request[RestoreTableResponse, AWSError] = js.native
  /**
    * Restores the specified table to the specified point in time within the earliest_restorable_timestamp and the current time. For more information about restore points, see  Time window for PITR continuous backups in the Amazon Keyspaces Developer Guide. Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account. When you restore using point in time recovery, Amazon Keyspaces restores your source table's schema and data to the state based on the selected timestamp (day:hour:minute:second) to a new table. The Time to Live (TTL) settings are also restored to the state based on the selected timestamp. In addition to the table's schema, data, and TTL settings, RestoreTable restores the capacity mode, encryption, and point-in-time recovery settings from the source table. Unlike the table's schema data and TTL settings, which are restored based on the selected timestamp, these settings are always restored based on the table's settings as of the current time or when the table was deleted. You can also overwrite these settings during restore:   Read/write capacity mode   Provisioned throughput capacity settings   Point-in-time (PITR) settings   Tags   For more information, see PITR restore settings in the Amazon Keyspaces Developer Guide. Note that the following settings are not restored, and you must configure them manually for the new table:   Automatic scaling policies (for tables that use provisioned capacity mode)   Identity and Access Management (IAM) policies   Amazon CloudWatch metrics and alarms  
    */
  def restoreTable(params: RestoreTableRequest): Request[RestoreTableResponse, AWSError] = js.native
  def restoreTable(
    params: RestoreTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreTableResponse, Unit]
  ): Request[RestoreTableResponse, AWSError] = js.native
  
  /**
    * Associates a set of tags with a Amazon Keyspaces resource. You can then activate these user-defined tags so that they appear on the Cost Management Console for cost allocation tracking. For more information, see Adding tags and labels to Amazon Keyspaces resources in the Amazon Keyspaces Developer Guide. For IAM policy examples that show how to control access to Amazon Keyspaces resources based on tags, see Amazon Keyspaces resource access based on tags in the Amazon Keyspaces Developer Guide.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates a set of tags with a Amazon Keyspaces resource. You can then activate these user-defined tags so that they appear on the Cost Management Console for cost allocation tracking. For more information, see Adding tags and labels to Amazon Keyspaces resources in the Amazon Keyspaces Developer Guide. For IAM policy examples that show how to control access to Amazon Keyspaces resources based on tags, see Amazon Keyspaces resource access based on tags in the Amazon Keyspaces Developer Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the association of tags from a Amazon Keyspaces resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the association of tags from a Amazon Keyspaces resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption, point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update operation.
    */
  def updateTable(): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]): Request[UpdateTableResponse, AWSError] = js.native
  /**
    * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption, point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update operation.
    */
  def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(
    params: UpdateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]
  ): Request[UpdateTableResponse, AWSError] = js.native
}
