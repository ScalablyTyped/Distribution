package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dms", "DMS")
@js.native
object DMSNs extends js.Object {
  trait AccountQuota extends js.Object {
    /**
      * The name of the AWS DMS quota for this AWS account.
      */
    var AccountQuotaName: js.UndefOr[String] = js.undefined
    /**
      * The maximum allowed value for the quota.
      */
    var Max: js.UndefOr[Long] = js.undefined
    /**
      * The amount currently used toward the quota maximum.
      */
    var Used: js.UndefOr[Long] = js.undefined
  }
  
  trait AddTagsToResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be added to. AWS DMS resources include a replication instance, endpoint, and a replication task.
      */
    var ResourceArn: String
    /**
      * The tag to be assigned to the DMS resource.
      */
    var Tags: TagList
  }
  
  trait AddTagsToResourceResponse extends js.Object
  
  trait AvailabilityZone extends js.Object {
    /**
      * The name of the availability zone.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait Certificate extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the certificate.
      */
    var CertificateArn: js.UndefOr[String] = js.undefined
    /**
      * The date that the certificate was created.
      */
    var CertificateCreationDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
      */
    var CertificateIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The owner of the certificate.
      */
    var CertificateOwner: js.UndefOr[String] = js.undefined
    /**
      * The contents of the .pem X.509 certificate file for the certificate.
      */
    var CertificatePem: js.UndefOr[String] = js.undefined
    /**
      * The location of the imported Oracle Wallet certificate for use with SSL.
      */
    var CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined
    /**
      * The key length of the cryptographic algorithm being used.
      */
    var KeyLength: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The signing algorithm for the certificate.
      */
    var SigningAlgorithm: js.UndefOr[String] = js.undefined
    /**
      * The beginning date that the certificate is valid.
      */
    var ValidFromDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The final date that the certificate is valid.
      */
    var ValidToDate: js.UndefOr[TStamp] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Connection extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the endpoint. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
      */
    var EndpointIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The error message when the connection last failed.
      */
    var LastFailureMessage: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string.
      */
    var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The connection status.
      */
    var Status: js.UndefOr[String] = js.undefined
  }
  
  trait CreateEndpointMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) for the certificate.
      */
    var CertificateArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the endpoint database.
      */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The settings in JSON format for the DMS transfer type of source endpoint.  Possible attributes include the following:    serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    bucketName - The name of the S3 bucket to use.    compressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.    Shorthand syntax for these attributes is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these attributes is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
      */
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined
    /**
      * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
      */
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined
    /**
      * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
      */
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined
    /**
      * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
      */
    var EndpointIdentifier: String
    /**
      * The type of endpoint.
      */
    var EndpointType: ReplicationEndpointTypeValue
    /**
      * The type of engine for the endpoint. Valid values, depending on the EndPointType value, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, dynamodb, mongodb, and sqlserver.
      */
    var EngineName: String
    /**
      * The external table definition. 
      */
    var ExternalTableDefinition: js.UndefOr[String] = js.undefined
    /**
      * Additional attributes associated with the connection.
      */
    var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
    /**
      * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
      */
    var KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined
    /**
      * The AWS KMS key identifier to use to encrypt the connection parameters. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
      */
    var MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined
    /**
      * The password to be used to log in to the endpoint database.
      */
    var Password: js.UndefOr[SecretString] = js.undefined
    /**
      * The port used by the endpoint database.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
      */
    var S3Settings: js.UndefOr[S3Settings] = js.undefined
    /**
      * The name of the server where the endpoint database resides.
      */
    var ServerName: js.UndefOr[String] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) for the service access role that you want to use to create the endpoint. 
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The SSL mode can be one of four values: none, require, verify-ca, verify-full. The default value is none.
      */
    var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
    /**
      * Tags to be added to the endpoint.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The user name to be used to log in to the endpoint database.
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait CreateEndpointResponse extends js.Object {
    /**
      * The endpoint that was created.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
  }
  
  trait CreateEventSubscriptionMessage extends js.Object {
    /**
      *  A Boolean value; set to true to activate the subscription, or set to false to create the subscription but not activate it. 
      */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      *  A list of event categories for a source type that you want to subscribe to. You can see a list of the categories for a given source type by calling the DescribeEventCategories action or in the topic Working with Events and Notifications in the AWS Database Migration Service User Guide. 
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it. 
      */
    var SnsTopicArn: String
    /**
      *  The list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens. 
      */
    var SourceIds: js.UndefOr[SourceIdsList] = js.undefined
    /**
      *  The type of AWS DMS resource that generates the events. For example, if you want to be notified of events generated by a replication instance, you set this parameter to replication-instance. If this value is not specified, all events are returned.  Valid values: replication-instance | migration-task
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The name of the AWS DMS event notification subscription.  Constraints: The name must be less than 255 characters. 
      */
    var SubscriptionName: String
    /**
      * A tag to be attached to the event subscription.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateEventSubscriptionResponse extends js.Object {
    /**
      * The event subscription that was created.
      */
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  trait CreateReplicationInstanceMessage extends js.Object {
    /**
      * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
      */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window. Default: true 
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The EC2 Availability Zone that the replication instance will be created in. Default: A random, system-chosen Availability Zone in the endpoint's region.  Example: us-east-1d 
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * A list of DNS name servers supported for the replication instance.
      */
    var DnsNameServers: js.UndefOr[String] = js.undefined
    /**
      * The engine version number of the replication instance.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
      */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      *  Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true. 
      */
    var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The compute and memory capacity of the replication instance as specified by the replication instance class.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
      */
    var ReplicationInstanceClass: String
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
      */
    var ReplicationInstanceIdentifier: String
    /**
      * A subnet group to associate with the replication instance.
      */
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined
    /**
      * Tags to be associated with the replication instance.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait CreateReplicationInstanceResponse extends js.Object {
    /**
      * The replication instance that was created.
      */
    var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
  }
  
  trait CreateReplicationSubnetGroupMessage extends js.Object {
    /**
      * The description for the subnet group.
      */
    var ReplicationSubnetGroupDescription: String
    /**
      * The name for the replication subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens. Must not be "default". Example: mySubnetgroup 
      */
    var ReplicationSubnetGroupIdentifier: String
    /**
      * The EC2 subnet IDs for the subnet group.
      */
    var SubnetIds: SubnetIdentifierList
    /**
      * The tag to be assigned to the subnet group.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateReplicationSubnetGroupResponse extends js.Object {
    /**
      * The replication subnet group that was created.
      */
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
  }
  
  trait CreateReplicationTaskMessage extends js.Object {
    /**
      * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
      */
    var CdcStartPosition: js.UndefOr[String] = js.undefined
    /**
      * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
      */
    var CdcStartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
      */
    var CdcStopPosition: js.UndefOr[String] = js.undefined
    /**
      * The migration type.
      */
    var MigrationType: MigrationTypeValue
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
    /**
      * The replication task identifier. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ReplicationTaskIdentifier: String
    /**
      * Settings for the task, such as target metadata settings. For a complete list of task settings, see Task Settings for AWS Database Migration Service Tasks in the AWS Database Migration User Guide. 
      */
    var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var SourceEndpointArn: String
    /**
      * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with "file://". When working with the DMS API, provide the JSON as the parameter value. For example, --table-mappings file://mappingfile.json
      */
    var TableMappings: String
    /**
      * Tags to be added to the replication instance.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var TargetEndpointArn: String
  }
  
  trait CreateReplicationTaskResponse extends js.Object {
    /**
      * The replication task that was created.
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait DeleteCertificateMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deleted certificate.
      */
    var CertificateArn: String
  }
  
  trait DeleteCertificateResponse extends js.Object {
    /**
      * The Secure Sockets Layer (SSL) certificate.
      */
    var Certificate: js.UndefOr[Certificate] = js.undefined
  }
  
  trait DeleteEndpointMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
  }
  
  trait DeleteEndpointResponse extends js.Object {
    /**
      * The endpoint that was deleted.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
  }
  
  trait DeleteEventSubscriptionMessage extends js.Object {
    /**
      * The name of the DMS event notification subscription to be deleted.
      */
    var SubscriptionName: String
  }
  
  trait DeleteEventSubscriptionResponse extends js.Object {
    /**
      * The event subscription that was deleted.
      */
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  trait DeleteReplicationInstanceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the replication instance to be deleted.
      */
    var ReplicationInstanceArn: String
  }
  
  trait DeleteReplicationInstanceResponse extends js.Object {
    /**
      * The replication instance that was deleted.
      */
    var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
  }
  
  trait DeleteReplicationSubnetGroupMessage extends js.Object {
    /**
      * The subnet group name of the replication instance.
      */
    var ReplicationSubnetGroupIdentifier: String
  }
  
  trait DeleteReplicationSubnetGroupResponse extends js.Object
  
  trait DeleteReplicationTaskMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the replication task to be deleted.
      */
    var ReplicationTaskArn: String
  }
  
  trait DeleteReplicationTaskResponse extends js.Object {
    /**
      * The deleted replication task.
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait DescribeAccountAttributesMessage extends js.Object
  
  trait DescribeAccountAttributesResponse extends js.Object {
    /**
      * Account quota information.
      */
    var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
  }
  
  trait DescribeCertificatesMessage extends js.Object {
    /**
      * Filters applied to the certificate described in the form of key-value pairs.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 10
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeCertificatesResponse extends js.Object {
    /**
      * The Secure Sockets Layer (SSL) certificates associated with the replication instance.
      */
    var Certificates: js.UndefOr[CertificateList] = js.undefined
    /**
      * The pagination token.
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeConnectionsMessage extends js.Object {
    /**
      * The filters applied to the connection. Valid filter names: endpoint-arn | replication-instance-arn
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeConnectionsResponse extends js.Object {
    /**
      * A description of the connections.
      */
    var Connections: js.UndefOr[ConnectionList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEndpointTypesMessage extends js.Object {
    /**
      * Filters applied to the describe action. Valid filter names: engine-name | endpoint-type
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEndpointTypesResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The type of endpoints that are supported.
      */
    var SupportedEndpointTypes: js.UndefOr[SupportedEndpointTypeList] = js.undefined
  }
  
  trait DescribeEndpointsMessage extends js.Object {
    /**
      * Filters applied to the describe action. Valid filter names: endpoint-arn | endpoint-type | endpoint-id | engine-name
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeEndpointsResponse extends js.Object {
    /**
      * Endpoint description.
      */
    var Endpoints: js.UndefOr[EndpointList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventCategoriesMessage extends js.Object {
    /**
      * Filters applied to the action.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | migration-task
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventCategoriesResponse extends js.Object {
    /**
      * A list of event categories.
      */
    var EventCategoryGroupList: js.UndefOr[EventCategoryGroupList] = js.undefined
  }
  
  trait DescribeEventSubscriptionsMessage extends js.Object {
    /**
      * Filters applied to the action.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The name of the AWS DMS event subscription to be described.
      */
    var SubscriptionName: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventSubscriptionsResponse extends js.Object {
    /**
      * A list of event subscriptions.
      */
    var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeEventsMessage extends js.Object {
    /**
      * The duration of the events to be listed.
      */
    var Duration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The end time for the events to be listed.
      */
    var EndTime: js.UndefOr[TStamp] = js.undefined
    /**
      * A list of event categories for a source type that you want to subscribe to.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * Filters applied to the action.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      *  The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens. It cannot end with a hyphen or contain two consecutive hyphens. 
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The type of AWS DMS resource that generates events. Valid values: replication-instance | migration-task
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
    /**
      * The start time for the events to be listed.
      */
    var StartTime: js.UndefOr[TStamp] = js.undefined
  }
  
  trait DescribeEventsResponse extends js.Object {
    /**
      * The events described.
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeOrderableReplicationInstancesMessage extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeOrderableReplicationInstancesResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The order-able replication instances available.
      */
    var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined
  }
  
  trait DescribeRefreshSchemasStatusMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
  }
  
  trait DescribeRefreshSchemasStatusResponse extends js.Object {
    /**
      * The status of the schema.
      */
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
  }
  
  trait DescribeReplicationInstanceTaskLogsMessage extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
  }
  
  trait DescribeReplicationInstanceTaskLogsResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * An array of replication task log metadata. Each member of the array contains the replication task name, ARN, and task log size (in bytes). 
      */
    var ReplicationInstanceTaskLogs: js.UndefOr[ReplicationInstanceTaskLogsList] = js.undefined
  }
  
  trait DescribeReplicationInstancesMessage extends js.Object {
    /**
      * Filters applied to the describe action. Valid filter names: replication-instance-arn | replication-instance-id | replication-instance-class | engine-version
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeReplicationInstancesResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The replication instances described.
      */
    var ReplicationInstances: js.UndefOr[ReplicationInstanceList] = js.undefined
  }
  
  trait DescribeReplicationSubnetGroupsMessage extends js.Object {
    /**
      * Filters applied to the describe action.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeReplicationSubnetGroupsResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A description of the replication subnet groups.
      */
    var ReplicationSubnetGroups: js.UndefOr[ReplicationSubnetGroups] = js.undefined
  }
  
  trait DescribeReplicationTaskAssessmentResultsMessage extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * - The Amazon Resource Name (ARN) string that uniquely identifies the task. When this input parameter is specified the API will return only one result and ignore the values of the max-records and marker parameters. 
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeReplicationTaskAssessmentResultsResponse extends js.Object {
    /**
      * - The Amazon S3 bucket where the task assessment report is located. 
      */
    var BucketName: js.UndefOr[String] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The task assessment report. 
      */
    var ReplicationTaskAssessmentResults: js.UndefOr[ReplicationTaskAssessmentResultList] = js.undefined
  }
  
  trait DescribeReplicationTasksMessage extends js.Object {
    /**
      * Filters applied to the describe action. Valid filter names: replication-task-arn | replication-task-id | migration-type | endpoint-arn | replication-instance-arn
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeReplicationTasksResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * A description of the replication tasks.
      */
    var ReplicationTasks: js.UndefOr[ReplicationTaskList] = js.undefined
  }
  
  trait DescribeSchemasMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  }
  
  trait DescribeSchemasResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The described schema.
      */
    var Schemas: js.UndefOr[SchemaList] = js.undefined
  }
  
  trait DescribeTableStatisticsMessage extends js.Object {
    /**
      * Filters applied to the describe table statistics action. Valid filter names: schema-name | table-name | table-state A combination of filters creates an AND condition where each record matches all specified filters.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 500.
      */
    var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task.
      */
    var ReplicationTaskArn: String
  }
  
  trait DescribeTableStatisticsResponse extends js.Object {
    /**
      *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
      */
    var Marker: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task.
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
    /**
      * The table statistics.
      */
    var TableStatistics: js.UndefOr[TableStatisticsList] = js.undefined
  }
  
  trait DmsTransferSettings extends js.Object {
    /**
      *  The name of the S3 bucket to use. 
      */
    var BucketName: js.UndefOr[String] = js.undefined
    /**
      *  The IAM role that has permission to access the Amazon S3 bucket. 
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  }
  
  trait DynamoDbSettings extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) used by the service access IAM role. 
      */
    var ServiceAccessRoleArn: String
  }
  
  trait ElasticsearchSettings extends js.Object {
    /**
      * The endpoint for the ElasticSearch cluster.
      */
    var EndpointUri: String
    /**
      * The maximum number of seconds that DMS retries failed API requests to the Elasticsearch cluster.
      */
    var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The maximum percentage of records that can fail to be written before a full load operation stops. 
      */
    var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) used by service to access the IAM role.
      */
    var ServiceAccessRoleArn: String
  }
  
  trait Endpoint extends js.Object {
    /**
      * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
      */
    var CertificateArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the database at the endpoint.
      */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The settings in JSON format for the DMS transfer type of source endpoint.  Possible attributes include the following:    serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    bucketName - The name of the S3 bucket to use.    compressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.    Shorthand syntax for these attributes is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these attributes is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
      */
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined
    /**
      * The settings for the target DynamoDB database. For more information, see the DynamoDBSettings structure.
      */
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined
    /**
      * The settings for the Elasticsearch source endpoint. For more information, see the ElasticsearchSettings structure.
      */
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: js.UndefOr[String] = js.undefined
    /**
      * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
      */
    var EndpointIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The type of endpoint.
      */
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
    /**
      * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
      */
    var EngineDisplayName: js.UndefOr[String] = js.undefined
    /**
      * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
      */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
      *  Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent call to CreateEndpoint to create the endpoint with a cross-account. 
      */
    var ExternalId: js.UndefOr[String] = js.undefined
    /**
      * The external table definition.
      */
    var ExternalTableDefinition: js.UndefOr[String] = js.undefined
    /**
      * Additional connection attributes used to connect to the endpoint.
      */
    var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
    /**
      * The settings for the Amazon Kinesis source endpoint. For more information, see the KinesisSettings structure.
      */
    var KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined
    /**
      * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * The settings for the MongoDB source endpoint. For more information, see the MongoDbSettings structure.
      */
    var MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined
    /**
      * The port value used to access the endpoint.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The settings for the S3 target endpoint. For more information, see the S3Settings structure.
      */
    var S3Settings: js.UndefOr[S3Settings] = js.undefined
    /**
      * The name of the server at the endpoint.
      */
    var ServerName: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) used by the service access IAM role.
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The SSL mode used to connect to the endpoint. SSL mode can be one of four values: none, require, verify-ca, verify-full.  The default value is none.
      */
    var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
    /**
      * The status of the endpoint.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The user name used to connect to the endpoint.
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The date of the event.
      */
    var Date: js.UndefOr[TStamp] = js.undefined
    /**
      * The event categories available for the specified source type.
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The event message.
      */
    var Message: js.UndefOr[String] = js.undefined
    /**
      *  The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.  Constraints:replication instance, endpoint, migration task
      */
    var SourceIdentifier: js.UndefOr[String] = js.undefined
    /**
      *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | endpoint | migration-task
      */
    var SourceType: js.UndefOr[SourceType] = js.undefined
  }
  
  trait EventCategoryGroup extends js.Object {
    /**
      *  A list of event categories for a SourceType that you want to subscribe to. 
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | migration-task
      */
    var SourceType: js.UndefOr[String] = js.undefined
  }
  
  trait EventSubscription extends js.Object {
    /**
      * The AWS DMS event notification subscription Id.
      */
    var CustSubscriptionId: js.UndefOr[String] = js.undefined
    /**
      * The AWS customer account associated with the AWS DMS event notification subscription.
      */
    var CustomerAwsId: js.UndefOr[String] = js.undefined
    /**
      * Boolean value that indicates if the event subscription is enabled.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * A lists of event categories.
      */
    var EventCategoriesList: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      * The topic ARN of the AWS DMS event notification subscription.
      */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
      * A list of source Ids for the event subscription.
      */
    var SourceIdsList: js.UndefOr[SourceIdsList] = js.undefined
    /**
      *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | migration-task
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The status of the AWS DMS event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The time the RDS event notification subscription was created.
      */
    var SubscriptionCreationTime: js.UndefOr[String] = js.undefined
  }
  
  trait Filter extends js.Object {
    /**
      * The name of the filter.
      */
    var Name: String
    /**
      * The filter value.
      */
    var Values: FilterValueList
  }
  
  trait ImportCertificateMessage extends js.Object {
    /**
      * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
      */
    var CertificateIdentifier: String
    /**
      * The contents of the .pem X.509 certificate file for the certificate.
      */
    var CertificatePem: js.UndefOr[String] = js.undefined
    /**
      * The location of the imported Oracle Wallet certificate for use with SSL.
      */
    var CertificateWallet: js.UndefOr[CertificateWallet] = js.undefined
    /**
      * The tags associated with the certificate.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait ImportCertificateResponse extends js.Object {
    /**
      * The certificate to be uploaded.
      */
    var Certificate: js.UndefOr[Certificate] = js.undefined
  }
  
  trait KinesisSettings extends js.Object {
    /**
      * The output format for the records created on the endpoint. The message format is JSON.
      */
    var MessageFormat: js.UndefOr[MessageFormatValue] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the IAM role that DMS uses to write to the Amazon Kinesis data stream.
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
      */
    var StreamArn: js.UndefOr[String] = js.undefined
  }
  
  trait ListTagsForResourceMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the AWS DMS resource.
      */
    var ResourceArn: String
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * A list of tags for the resource.
      */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  trait ModifyEndpointMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
      */
    var CertificateArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the endpoint database.
      */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
      * The settings in JSON format for the DMS transfer type of source endpoint.  Attributes include the following:   serviceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.   BucketName - The name of the S3 bucket to use.   compressionType - An optional parameter to use GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed.   Shorthand syntax: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string JSON syntax:  { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } 
      */
    var DmsTransferSettings: js.UndefOr[DmsTransferSettings] = js.undefined
    /**
      * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
      */
    var DynamoDbSettings: js.UndefOr[DynamoDbSettings] = js.undefined
    /**
      * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
      */
    var ElasticsearchSettings: js.UndefOr[ElasticsearchSettings] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
    /**
      * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
      */
    var EndpointIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The type of endpoint.
      */
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
    /**
      * The type of engine for the endpoint. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
      */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
      * The external table definition.
      */
    var ExternalTableDefinition: js.UndefOr[String] = js.undefined
    /**
      * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an argument.
      */
    var ExtraConnectionAttributes: js.UndefOr[String] = js.undefined
    /**
      * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
      */
    var KinesisSettings: js.UndefOr[KinesisSettings] = js.undefined
    /**
      * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
      */
    var MongoDbSettings: js.UndefOr[MongoDbSettings] = js.undefined
    /**
      * The password to be used to login to the endpoint database.
      */
    var Password: js.UndefOr[SecretString] = js.undefined
    /**
      * The port used by the endpoint database.
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
      */
    var S3Settings: js.UndefOr[S3Settings] = js.undefined
    /**
      * The name of the server where the endpoint database resides.
      */
    var ServerName: js.UndefOr[String] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint. 
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
    /**
      * The SSL mode to be used. SSL mode can be one of four values: none, require, verify-ca, verify-full.  The default value is none.
      */
    var SslMode: js.UndefOr[DmsSslModeValue] = js.undefined
    /**
      * The user name to be used to login to the endpoint database.
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait ModifyEndpointResponse extends js.Object {
    /**
      * The modified endpoint.
      */
    var Endpoint: js.UndefOr[Endpoint] = js.undefined
  }
  
  trait ModifyEventSubscriptionMessage extends js.Object {
    /**
      *  A Boolean value; set to true to activate the subscription. 
      */
    var Enabled: js.UndefOr[BooleanOptional] = js.undefined
    /**
      *  A list of event categories for a source type that you want to subscribe to. Use the DescribeEventCategories action to see a list of event categories. 
      */
    var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
      */
    var SnsTopicArn: js.UndefOr[String] = js.undefined
    /**
      *  The type of AWS DMS resource that generates the events you want to subscribe to.  Valid values: replication-instance | migration-task
      */
    var SourceType: js.UndefOr[String] = js.undefined
    /**
      * The name of the AWS DMS event notification subscription to be modified.
      */
    var SubscriptionName: String
  }
  
  trait ModifyEventSubscriptionResponse extends js.Object {
    /**
      * The modified event subscription.
      */
    var EventSubscription: js.UndefOr[EventSubscription] = js.undefined
  }
  
  trait ModifyReplicationInstanceMessage extends js.Object {
    /**
      * The amount of storage (in gigabytes) to be allocated for the replication instance.
      */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the change is asynchronously applied as soon as possible. Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a different major version than the replication instance's current version.
      */
    var AllowMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * Indicates whether the changes should be applied immediately or during the next maintenance window.
      */
    var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
    /**
      *  Indicates that minor version upgrades will be applied automatically to the replication instance during the maintenance window. Changing this parameter does not result in an outage except in the following case and the change is asynchronously applied as soon as possible. An outage will result if this parameter is set to true during the maintenance window, and a newer minor version is available, and AWS DMS has enabled auto patching for that engine version. 
      */
    var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The engine version number of the replication instance.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
      */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter does not result in an outage, except in the following situation, and the change is asynchronously applied as soon as possible. If moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure pending changes are applied. Default: Uses existing setting Format: ddd:hh24:mi-ddd:hh24:mi Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun Constraints: Must be at least 30 minutes
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
    /**
      * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
      */
    var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string.
      */
    var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
      */
    var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
  }
  
  trait ModifyReplicationInstanceResponse extends js.Object {
    /**
      * The modified replication instance.
      */
    var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
  }
  
  trait ModifyReplicationSubnetGroupMessage extends js.Object {
    /**
      * The description of the replication instance subnet group.
      */
    var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The name of the replication instance subnet group.
      */
    var ReplicationSubnetGroupIdentifier: String
    /**
      * A list of subnet IDs.
      */
    var SubnetIds: SubnetIdentifierList
  }
  
  trait ModifyReplicationSubnetGroupResponse extends js.Object {
    /**
      * The modified replication subnet group.
      */
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
  }
  
  trait ModifyReplicationTaskMessage extends js.Object {
    /**
      * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
      */
    var CdcStartPosition: js.UndefOr[String] = js.undefined
    /**
      * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
      */
    var CdcStartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
      */
    var CdcStopPosition: js.UndefOr[String] = js.undefined
    /**
      * The migration type. Valid values: full-load | cdc | full-load-and-cdc
      */
    var MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task.
      */
    var ReplicationTaskArn: String
    /**
      * The replication task identifier. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
    /**
      * JSON file that contains settings for the task, such as target metadata settings.
      */
    var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
    /**
      * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with "file://". When working with the DMS API, provide the JSON as the parameter value. For example, --table-mappings file://mappingfile.json
      */
    var TableMappings: js.UndefOr[String] = js.undefined
  }
  
  trait ModifyReplicationTaskResponse extends js.Object {
    /**
      * The replication task that was modified.
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait MongoDbSettings extends js.Object {
    /**
      *  The authentication mechanism you use to access the MongoDB source endpoint. Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1  DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is not used when authType=No.
      */
    var AuthMechanism: js.UndefOr[AuthMechanismValue] = js.undefined
    /**
      *  The MongoDB database name. This attribute is not used when authType=NO.  The default is admin.
      */
    var AuthSource: js.UndefOr[String] = js.undefined
    /**
      *  The authentication type you use to access the MongoDB source endpoint. Valid values: NO, PASSWORD  When NO is selected, user name and password parameters are not used and can be empty. 
      */
    var AuthType: js.UndefOr[AuthTypeValue] = js.undefined
    /**
      *  The database name on the MongoDB source endpoint. 
      */
    var DatabaseName: js.UndefOr[String] = js.undefined
    /**
      *  Indicates the number of documents to preview to determine the document organization. Use this attribute when NestingLevel is set to ONE.  Must be a positive value greater than 0. Default value is 1000.
      */
    var DocsToInvestigate: js.UndefOr[String] = js.undefined
    /**
      *  Specifies the document ID. Use this attribute when NestingLevel is set to NONE.  Default value is false. 
      */
    var ExtractDocId: js.UndefOr[String] = js.undefined
    /**
      * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      *  Specifies either document or table mode.  Valid values: NONE, ONE Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
      */
    var NestingLevel: js.UndefOr[NestingLevelValue] = js.undefined
    /**
      *  The password for the user account you use to access the MongoDB source endpoint. 
      */
    var Password: js.UndefOr[SecretString] = js.undefined
    /**
      *  The port value for the MongoDB source endpoint. 
      */
    var Port: js.UndefOr[IntegerOptional] = js.undefined
    /**
      *  The name of the server on the MongoDB source endpoint. 
      */
    var ServerName: js.UndefOr[String] = js.undefined
    /**
      * The user name you use to access the MongoDB source endpoint. 
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait OrderableReplicationInstance extends js.Object {
    /**
      * The default amount of storage (in gigabytes) that is allocated for the replication instance.
      */
    var DefaultAllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
      * The version of the replication engine.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      * The amount of storage (in gigabytes) that is allocated for the replication instance.
      */
    var IncludedAllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
      * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
      */
    var MaxAllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
      * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
      */
    var MinAllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
      * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
      */
    var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The type of storage used by the replication instance.
      */
    var StorageType: js.UndefOr[String] = js.undefined
  }
  
  trait RebootReplicationInstanceMessage extends js.Object {
    /**
      * If this parameter is true, the reboot is conducted through a Multi-AZ failover. (If the instance isn't configured for Multi-AZ, then you can't specify true.)
      */
    var ForceFailover: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
  }
  
  trait RebootReplicationInstanceResponse extends js.Object {
    /**
      * The replication instance that is being rebooted. 
      */
    var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
  }
  
  trait RefreshSchemasMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
  }
  
  trait RefreshSchemasResponse extends js.Object {
    /**
      * The status of the refreshed schema.
      */
    var RefreshSchemasStatus: js.UndefOr[RefreshSchemasStatus] = js.undefined
  }
  
  trait RefreshSchemasStatus extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: js.UndefOr[String] = js.undefined
    /**
      * The last failure message for the schema.
      */
    var LastFailureMessage: js.UndefOr[String] = js.undefined
    /**
      * The date the schema was last refreshed.
      */
    var LastRefreshDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the schema.
      */
    var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined
  }
  
  trait ReloadTablesMessage extends js.Object {
    /**
      * Options for reload. Specify data-reload to reload the data and re-validate it if validation is enabled. Specify validate-only to re-validate the table. This option applies only when validation is enabled for the task.  Valid values: data-reload, validate-only Default value is data-reload.
      */
    var ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task. 
      */
    var ReplicationTaskArn: String
    /**
      * The name and schema of the table to be reloaded. 
      */
    var TablesToReload: TableListToReload
  }
  
  trait ReloadTablesResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the replication task. 
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  }
  
  trait RemoveTagsFromResourceMessage extends js.Object {
    /**
      * &gt;The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be removed from.
      */
    var ResourceArn: String
    /**
      * The tag key (name) of the tag to be removed.
      */
    var TagKeys: KeyList
  }
  
  trait RemoveTagsFromResourceResponse extends js.Object
  
  trait ReplicationInstance extends js.Object {
    /**
      * The amount of storage (in gigabytes) that is allocated for the replication instance.
      */
    var AllocatedStorage: js.UndefOr[Integer] = js.undefined
    /**
      * Boolean value indicating if minor version upgrades will be automatically applied to the instance.
      */
    var AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
    /**
      * The Availability Zone for the instance.
      */
    var AvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The DNS name servers for the replication instance.
      */
    var DnsNameServers: js.UndefOr[String] = js.undefined
    /**
      * The engine version number of the replication instance.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      *  The expiration date of the free replication instance that is part of the Free DMS program. 
      */
    var FreeUntil: js.UndefOr[TStamp] = js.undefined
    /**
      * The time the replication instance was created.
      */
    var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
      */
    var MultiAZ: js.UndefOr[Boolean] = js.undefined
    /**
      * The pending modification values.
      */
    var PendingModifiedValues: js.UndefOr[ReplicationPendingModifiedValues] = js.undefined
    /**
      * The maintenance window times for the replication instance.
      */
    var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
    /**
      *  Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true. 
      */
    var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
      */
    var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
    /**
      * The replication instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
      */
    var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The private IP address of the replication instance.
      */
    var ReplicationInstancePrivateIpAddress: js.UndefOr[String] = js.undefined
    /**
      * The private IP address of the replication instance.
      */
    var ReplicationInstancePrivateIpAddresses: js.UndefOr[ReplicationInstancePrivateIpAddressList] = js.undefined
    /**
      * The public IP address of the replication instance.
      */
    var ReplicationInstancePublicIpAddress: js.UndefOr[String] = js.undefined
    /**
      * The public IP address of the replication instance.
      */
    var ReplicationInstancePublicIpAddresses: js.UndefOr[ReplicationInstancePublicIpAddressList] = js.undefined
    /**
      * The status of the replication instance.
      */
    var ReplicationInstanceStatus: js.UndefOr[String] = js.undefined
    /**
      * The subnet group for the replication instance.
      */
    var ReplicationSubnetGroup: js.UndefOr[ReplicationSubnetGroup] = js.undefined
    /**
      * The availability zone of the standby replication instance in a Multi-AZ deployment.
      */
    var SecondaryAvailabilityZone: js.UndefOr[String] = js.undefined
    /**
      * The VPC security group for the instance.
      */
    var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
  }
  
  trait ReplicationInstanceTaskLog extends js.Object {
    /**
      * The size, in bytes, of the replication task log.
      */
    var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task.
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
    /**
      * The name of the replication task.
      */
    var ReplicationTaskName: js.UndefOr[String] = js.undefined
  }
  
  trait ReplicationPendingModifiedValues extends js.Object {
    /**
      * The amount of storage (in gigabytes) that is allocated for the replication instance.
      */
    var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
    /**
      * The engine version number of the replication instance.
      */
    var EngineVersion: js.UndefOr[String] = js.undefined
    /**
      *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
      */
    var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
    /**
      * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
      */
    var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
  }
  
  trait ReplicationSubnetGroup extends js.Object {
    /**
      * The description of the replication subnet group.
      */
    var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
    /**
      * The identifier of the replication instance subnet group.
      */
    var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The status of the subnet group.
      */
    var SubnetGroupStatus: js.UndefOr[String] = js.undefined
    /**
      * The subnets that are in the subnet group.
      */
    var Subnets: js.UndefOr[SubnetList] = js.undefined
    /**
      * The ID of the VPC.
      */
    var VpcId: js.UndefOr[String] = js.undefined
  }
  
  trait ReplicationTask extends js.Object {
    /**
      * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
      */
    var CdcStartPosition: js.UndefOr[String] = js.undefined
    /**
      * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
      */
    var CdcStopPosition: js.UndefOr[String] = js.undefined
    /**
      * The last error (failure) message generated for the replication instance.
      */
    var LastFailureMessage: js.UndefOr[String] = js.undefined
    /**
      * The type of migration.
      */
    var MigrationType: js.UndefOr[MigrationTypeValue] = js.undefined
    /**
      * Indicates the last checkpoint that occurred during a change data capture (CDC) operation. You can provide this value to the CdcStartPosition parameter to start a CDC operation that begins at that checkpoint.
      */
    var RecoveryCheckpoint: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task.
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
    /**
      * The date the replication task was created.
      */
    var ReplicationTaskCreationDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The user-assigned replication task identifier or name. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
      */
    var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The settings for the replication task.
      */
    var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
    /**
      * The date the replication task is scheduled to start.
      */
    var ReplicationTaskStartDate: js.UndefOr[TStamp] = js.undefined
    /**
      * The statistics for the task, including elapsed time, tables loaded, and table errors.
      */
    var ReplicationTaskStats: js.UndefOr[ReplicationTaskStats] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var SourceEndpointArn: js.UndefOr[String] = js.undefined
    /**
      * The status of the replication task.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The reason the replication task was stopped.
      */
    var StopReason: js.UndefOr[String] = js.undefined
    /**
      * Table mappings specified in the task.
      */
    var TableMappings: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var TargetEndpointArn: js.UndefOr[String] = js.undefined
  }
  
  trait ReplicationTaskAssessmentResult extends js.Object {
    /**
      *  The task assessment results in JSON format. 
      */
    var AssessmentResults: js.UndefOr[String] = js.undefined
    /**
      *  The file containing the results of the task assessment. 
      */
    var AssessmentResultsFile: js.UndefOr[String] = js.undefined
    /**
      *  The status of the task assessment. 
      */
    var AssessmentStatus: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task. 
      */
    var ReplicationTaskArn: js.UndefOr[String] = js.undefined
    /**
      *  The replication task identifier of the task on which the task assessment was run. 
      */
    var ReplicationTaskIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The date the task assessment was completed. 
      */
    var ReplicationTaskLastAssessmentDate: js.UndefOr[TStamp] = js.undefined
    /**
      *  The URL of the S3 object containing the task assessment results. 
      */
    var S3ObjectUrl: js.UndefOr[String] = js.undefined
  }
  
  trait ReplicationTaskStats extends js.Object {
    /**
      * The elapsed time of the task, in milliseconds.
      */
    var ElapsedTimeMillis: js.UndefOr[Long] = js.undefined
    /**
      * The percent complete for the full load migration task.
      */
    var FullLoadProgressPercent: js.UndefOr[Integer] = js.undefined
    /**
      * The number of errors that have occurred during this task.
      */
    var TablesErrored: js.UndefOr[Integer] = js.undefined
    /**
      * The number of tables loaded for this task.
      */
    var TablesLoaded: js.UndefOr[Integer] = js.undefined
    /**
      * The number of tables currently loading for this task.
      */
    var TablesLoading: js.UndefOr[Integer] = js.undefined
    /**
      * The number of tables queued for this task.
      */
    var TablesQueued: js.UndefOr[Integer] = js.undefined
  }
  
  trait S3Settings extends js.Object {
    /**
      *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path used is &lt;schema_name&gt;/&lt;table_name&gt;/. 
      */
    var BucketFolder: js.UndefOr[String] = js.undefined
    /**
      *  The name of the S3 bucket. 
      */
    var BucketName: js.UndefOr[String] = js.undefined
    /**
      *  An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed. 
      */
    var CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined
    /**
      *  The delimiter used to separate columns in the source files. The default is a comma. 
      */
    var CsvDelimiter: js.UndefOr[String] = js.undefined
    /**
      *  The delimiter used to separate rows in the source files. The default is a carriage return (\n). 
      */
    var CsvRowDelimiter: js.UndefOr[String] = js.undefined
    /**
      *  The external table definition. 
      */
    var ExternalTableDefinition: js.UndefOr[String] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) used by the service access IAM role. 
      */
    var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  }
  
  trait StartReplicationTaskAssessmentMessage extends js.Object {
    /**
      *  The Amazon Resource Name (ARN) of the replication task. 
      */
    var ReplicationTaskArn: String
  }
  
  trait StartReplicationTaskAssessmentResponse extends js.Object {
    /**
      *  The assessed replication task. 
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait StartReplicationTaskMessage extends js.Object {
    /**
      * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
      */
    var CdcStartPosition: js.UndefOr[String] = js.undefined
    /**
      * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
      */
    var CdcStartTime: js.UndefOr[TStamp] = js.undefined
    /**
      * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
      */
    var CdcStopPosition: js.UndefOr[String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the replication task to be started.
      */
    var ReplicationTaskArn: String
    /**
      * The type of replication task.
      */
    var StartReplicationTaskType: StartReplicationTaskTypeValue
  }
  
  trait StartReplicationTaskResponse extends js.Object {
    /**
      * The replication task started.
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait StopReplicationTaskMessage extends js.Object {
    /**
      * The Amazon Resource Name(ARN) of the replication task to be stopped.
      */
    var ReplicationTaskArn: String
  }
  
  trait StopReplicationTaskResponse extends js.Object {
    /**
      * The replication task stopped.
      */
    var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
  }
  
  trait Subnet extends js.Object {
    /**
      * The Availability Zone of the subnet.
      */
    var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
    /**
      * The subnet identifier.
      */
    var SubnetIdentifier: js.UndefOr[String] = js.undefined
    /**
      * The status of the subnet.
      */
    var SubnetStatus: js.UndefOr[String] = js.undefined
  }
  
  trait SupportedEndpointType extends js.Object {
    /**
      * The type of endpoint.
      */
    var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
    /**
      * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
      */
    var EngineDisplayName: js.UndefOr[String] = js.undefined
    /**
      * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
      */
    var EngineName: js.UndefOr[String] = js.undefined
    /**
      * Indicates if Change Data Capture (CDC) is supported.
      */
    var SupportsCDC: js.UndefOr[Boolean] = js.undefined
  }
  
  trait TableStatistics extends js.Object {
    /**
      * The Data Definition Language (DDL) used to build and modify the structure of your tables.
      */
    var Ddls: js.UndefOr[Long] = js.undefined
    /**
      * The number of delete actions performed on a table.
      */
    var Deletes: js.UndefOr[Long] = js.undefined
    /**
      * The number of rows that failed conditional checks during the Full Load operation (valid only for DynamoDB as a target migrations).
      */
    var FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.undefined
    /**
      * The number of rows that failed to load during the Full Load operation (valid only for DynamoDB as a target migrations).
      */
    var FullLoadErrorRows: js.UndefOr[Long] = js.undefined
    /**
      * The number of rows added during the Full Load operation.
      */
    var FullLoadRows: js.UndefOr[Long] = js.undefined
    /**
      * The number of insert actions performed on a table.
      */
    var Inserts: js.UndefOr[Long] = js.undefined
    /**
      * The last time the table was updated.
      */
    var LastUpdateTime: js.UndefOr[TStamp] = js.undefined
    /**
      * The schema name.
      */
    var SchemaName: js.UndefOr[String] = js.undefined
    /**
      * The name of the table.
      */
    var TableName: js.UndefOr[String] = js.undefined
    /**
      * The state of the tables described. Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error | Table all | Table updates | Table is being reloaded
      */
    var TableState: js.UndefOr[String] = js.undefined
    /**
      * The number of update actions performed on a table.
      */
    var Updates: js.UndefOr[Long] = js.undefined
    /**
      * The number of records that failed validation.
      */
    var ValidationFailedRecords: js.UndefOr[Long] = js.undefined
    /**
      * The number of records that have yet to be validated.
      */
    var ValidationPendingRecords: js.UndefOr[Long] = js.undefined
    /**
      * The validation state of the table. The parameter can have the following values   Not enabled—Validation is not enabled for the table in the migration task.   Pending records—Some records in the table are waiting for validation.   Mismatched records—Some records in the table do not match between the source and target.   Suspended records—Some records in the table could not be validated.   No primary key—The table could not be validated because it had no primary key.   Table error—The table was not validated because it was in an error state and some data was not migrated.   Validated—All rows in the table were validated. If the table is updated, the status can change from Validated.   Error—The table could not be validated because of an unexpected error.  
      */
    var ValidationState: js.UndefOr[String] = js.undefined
    /**
      * Additional details about the state of validation.
      */
    var ValidationStateDetails: js.UndefOr[String] = js.undefined
    /**
      * The number of records that could not be validated.
      */
    var ValidationSuspendedRecords: js.UndefOr[Long] = js.undefined
  }
  
  trait TableToReload extends js.Object {
    /**
      * The schema name of the table to be reloaded.
      */
    var SchemaName: js.UndefOr[String] = js.undefined
    /**
      * The table name of the table to be reloaded.
      */
    var TableName: js.UndefOr[String] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Key: js.UndefOr[String] = js.undefined
    /**
      * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait TestConnectionMessage extends js.Object {
    /**
      * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
      */
    var EndpointArn: String
    /**
      * The Amazon Resource Name (ARN) of the replication instance.
      */
    var ReplicationInstanceArn: String
  }
  
  trait TestConnectionResponse extends js.Object {
    /**
      * The connection tested.
      */
    var Connection: js.UndefOr[Connection] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
      */
    def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or used in a Condition statement in an IAM policy for DMS.
      */
    def addTagsToResource(params: AddTagsToResourceMessage): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToResource(
      params: AddTagsToResourceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddTagsToResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an endpoint using the provided settings.
      */
    def createEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an endpoint using the provided settings.
      */
    def createEndpoint(params: CreateEndpointMessage): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEndpoint(
      params: CreateEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
      */
    def createEventSubscription(): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates an AWS DMS event notification subscription.  You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you want to be notified of. If you specify both the SourceType and SourceIds, such as SourceType = replication-instance and SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for the specified source. If you specify a SourceType but don't specify a SourceIdentifier, you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either SourceType nor SourceIdentifier, you will be notified of events generated from all AWS DMS sources belonging to your customer account. For more information about AWS DMS events, see Working with Events and Notifications in the AWS Database Migration Service User Guide. 
      */
    def createEventSubscription(params: CreateEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createEventSubscription(
      params: CreateEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the replication instance using the specified parameters.
      */
    def createReplicationInstance(): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the replication instance using the specified parameters.
      */
    def createReplicationInstance(params: CreateReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationInstance(
      params: CreateReplicationInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a replication subnet group given a list of the subnet IDs in a VPC.
      */
    def createReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a replication subnet group given a list of the subnet IDs in a VPC.
      */
    def createReplicationSubnetGroup(params: CreateReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationSubnetGroup(
      params: CreateReplicationSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a replication task using the specified parameters.
      */
    def createReplicationTask(): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a replication task using the specified parameters.
      */
    def createReplicationTask(params: CreateReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createReplicationTask(
      params: CreateReplicationTaskMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified certificate. 
      */
    def deleteCertificate(): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified certificate. 
      */
    def deleteCertificate(params: DeleteCertificateMessage): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCertificate(
      params: DeleteCertificateMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
      */
    def deleteEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified endpoint.  All tasks associated with the endpoint must be deleted before you can delete the endpoint.  
      */
    def deleteEndpoint(params: DeleteEndpointMessage): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEndpoint(
      params: DeleteEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes an AWS DMS event subscription. 
      */
    def deleteEventSubscription(): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes an AWS DMS event subscription. 
      */
    def deleteEventSubscription(params: DeleteEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteEventSubscription(
      params: DeleteEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
      */
    def deleteReplicationInstance(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified replication instance.  You must delete any migration tasks that are associated with the replication instance before you can delete it.  
      */
    def deleteReplicationInstance(params: DeleteReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationInstance(
      params: DeleteReplicationInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a subnet group.
      */
    def deleteReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a subnet group.
      */
    def deleteReplicationSubnetGroup(params: DeleteReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationSubnetGroup(
      params: DeleteReplicationSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified replication task.
      */
    def deleteReplicationTask(): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified replication task.
      */
    def deleteReplicationTask(params: DeleteReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteReplicationTask(
      params: DeleteReplicationTaskMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
      */
    def describeAccountAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the account, such as the number of replication instances allowed. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. This command does not take any parameters.
      */
    def describeAccountAttributes(params: DescribeAccountAttributesMessage): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountAttributes(
      params: DescribeAccountAttributesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a description of the certificate.
      */
    def describeCertificates(): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides a description of the certificate.
      */
    def describeCertificates(params: DescribeCertificatesMessage): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCertificates(
      params: DescribeCertificatesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCertificatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCertificatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
      */
    def describeConnections(): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConnections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the status of the connections that have been made between the replication instance and an endpoint. Connections are created when you test an endpoint.
      */
    def describeConnections(params: DescribeConnectionsMessage): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeConnections(
      params: DescribeConnectionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the type of endpoints available.
      */
    def describeEndpointTypes(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpointTypes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the type of endpoints available.
      */
    def describeEndpointTypes(params: DescribeEndpointTypesMessage): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpointTypes(
      params: DescribeEndpointTypesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointTypesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointTypesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the endpoints for your account in the current region.
      */
    def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the endpoints for your account in the current region.
      */
    def describeEndpoints(params: DescribeEndpointsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEndpoints(
      params: DescribeEndpointsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
      */
    def describeEventCategories(): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventCategoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of the event categories and source types in Working with Events and Notifications in the AWS Database Migration Service User Guide. 
      */
    def describeEventCategories(params: DescribeEventCategoriesMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventCategories(
      params: DescribeEventCategoriesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventCategoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
      */
    def describeEventSubscriptions(): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventSubscriptions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all the event subscriptions for a customer account. The description of a subscription includes SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.  If you specify SubscriptionName, this action lists the description for that subscription.
      */
    def describeEventSubscriptions(params: DescribeEventSubscriptionsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEventSubscriptions(
      params: DescribeEventSubscriptionsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventSubscriptionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventSubscriptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
      */
    def describeEvents(): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Lists events for a given source identifier and source type. You can also specify a start and end time. For more information on AWS DMS events, see Working with Events and Notifications in the AWS Database Migration User Guide. 
      */
    def describeEvents(params: DescribeEventsMessage): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEvents(
      params: DescribeEventsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the replication instance types that can be created in the specified region.
      */
    def describeOrderableReplicationInstances(): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableReplicationInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOrderableReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the replication instance types that can be created in the specified region.
      */
    def describeOrderableReplicationInstances(params: DescribeOrderableReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeOrderableReplicationInstances(
      params: DescribeOrderableReplicationInstancesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeOrderableReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeOrderableReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the status of the RefreshSchemas operation.
      */
    def describeRefreshSchemasStatus(): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRefreshSchemasStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRefreshSchemasStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the status of the RefreshSchemas operation.
      */
    def describeRefreshSchemasStatus(params: DescribeRefreshSchemasStatusMessage): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRefreshSchemasStatus(
      params: DescribeRefreshSchemasStatusMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRefreshSchemasStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRefreshSchemasStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the task logs for the specified task.
      */
    def describeReplicationInstanceTaskLogs(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationInstanceTaskLogs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstanceTaskLogsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the task logs for the specified task.
      */
    def describeReplicationInstanceTaskLogs(params: DescribeReplicationInstanceTaskLogsMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationInstanceTaskLogs(
      params: DescribeReplicationInstanceTaskLogsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstanceTaskLogsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstanceTaskLogsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about replication instances for your account in the current region.
      */
    def describeReplicationInstances(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about replication instances for your account in the current region.
      */
    def describeReplicationInstances(params: DescribeReplicationInstancesMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationInstances(
      params: DescribeReplicationInstancesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the replication subnet groups.
      */
    def describeReplicationSubnetGroups(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationSubnetGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationSubnetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the replication subnet groups.
      */
    def describeReplicationSubnetGroups(params: DescribeReplicationSubnetGroupsMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationSubnetGroups(
      params: DescribeReplicationSubnetGroupsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationSubnetGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationSubnetGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the task assessment results from Amazon S3. This action always returns the latest results.
      */
    def describeReplicationTaskAssessmentResults(): awsDashSdkLib.libRequestMod.Request[
        DescribeReplicationTaskAssessmentResultsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeReplicationTaskAssessmentResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeReplicationTaskAssessmentResultsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Returns the task assessment results from Amazon S3. This action always returns the latest results.
      */
    def describeReplicationTaskAssessmentResults(params: DescribeReplicationTaskAssessmentResultsMessage): awsDashSdkLib.libRequestMod.Request[
        DescribeReplicationTaskAssessmentResultsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    def describeReplicationTaskAssessmentResults(
      params: DescribeReplicationTaskAssessmentResultsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTaskAssessmentResultsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[
        DescribeReplicationTaskAssessmentResultsResponse, 
        awsDashSdkLib.libErrorMod.AWSError
      ] = js.native
    /**
      * Returns information about replication tasks for your account in the current region.
      */
    def describeReplicationTasks(): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationTasks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about replication tasks for your account in the current region.
      */
    def describeReplicationTasks(params: DescribeReplicationTasksMessage): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeReplicationTasks(
      params: DescribeReplicationTasksMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the schema for the specified endpoint. 
      */
    def describeSchemas(): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSchemas(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSchemasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about the schema for the specified endpoint. 
      */
    def describeSchemas(params: DescribeSchemasMessage): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSchemas(
      params: DescribeSchemasMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSchemasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
      */
    def describeTableStatistics(): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTableStatistics(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableStatisticsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and rows deleted. Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table statistics record for a table. It does not indicate the time of the last update to the table.
      */
    def describeTableStatistics(params: DescribeTableStatisticsMessage): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTableStatistics(
      params: DescribeTableStatisticsMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTableStatisticsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTableStatisticsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads the specified certificate.
      */
    def importCertificate(): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads the specified certificate.
      */
    def importCertificate(params: ImportCertificateMessage): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importCertificate(
      params: ImportCertificateMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportCertificateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags for an AWS DMS resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags for an AWS DMS resource.
      */
    def listTagsForResource(params: ListTagsForResourceMessage): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified endpoint.
      */
    def modifyEndpoint(): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEndpoint(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified endpoint.
      */
    def modifyEndpoint(params: ModifyEndpointMessage): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEndpoint(
      params: ModifyEndpointMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEndpointResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing AWS DMS event notification subscription. 
      */
    def modifyEventSubscription(): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEventSubscription(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies an existing AWS DMS event notification subscription. 
      */
    def modifyEventSubscription(params: ModifyEventSubscriptionMessage): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyEventSubscription(
      params: ModifyEventSubscriptionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyEventSubscriptionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyEventSubscriptionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
      */
    def modifyReplicationInstance(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying these parameters and the new values in the request. Some settings are applied during the maintenance window. 
      */
    def modifyReplicationInstance(params: ModifyReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationInstance(
      params: ModifyReplicationInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for the specified replication subnet group.
      */
    def modifyReplicationSubnetGroup(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationSubnetGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the settings for the specified replication subnet group.
      */
    def modifyReplicationSubnetGroup(params: ModifyReplicationSubnetGroupMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationSubnetGroup(
      params: ModifyReplicationSubnetGroupMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationSubnetGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationSubnetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
      */
    def modifyReplicationTask(): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified replication task. You can't modify the task endpoints. The task must be stopped before you can modify it.  For more information about AWS DMS tasks, see Working with Migration Tasks in the AWS Database Migration Service User Guide.
      */
    def modifyReplicationTask(params: ModifyReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyReplicationTask(
      params: ModifyReplicationTaskMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
      */
    def rebootReplicationInstance(): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootReplicationInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes available again.
      */
    def rebootReplicationInstance(params: RebootReplicationInstanceMessage): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootReplicationInstance(
      params: RebootReplicationInstanceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootReplicationInstanceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootReplicationInstanceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
      */
    def refreshSchemas(): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshSchemas(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshSchemasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes. You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
      */
    def refreshSchemas(params: RefreshSchemasMessage): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def refreshSchemas(
      params: RefreshSchemasMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RefreshSchemasResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RefreshSchemasResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reloads the target database table with the source data. 
      */
    def reloadTables(): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reloadTables(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReloadTablesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reloads the target database table with the source data. 
      */
    def reloadTables(params: ReloadTablesMessage): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reloadTables(
      params: ReloadTablesMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReloadTablesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReloadTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from a DMS resource.
      */
    def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from a DMS resource.
      */
    def removeTagsFromResource(params: RemoveTagsFromResourceMessage): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromResource(
      params: RemoveTagsFromResourceMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsFromResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
      */
    def startReplicationTask(): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startReplicationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the replication task. For more information about AWS DMS tasks, see Working with Migration Tasks  in the AWS Database Migration Service User Guide. 
      */
    def startReplicationTask(params: StartReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startReplicationTask(
      params: StartReplicationTaskMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Starts the replication task assessment for unsupported data types in the source database. 
      */
    def startReplicationTaskAssessment(): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startReplicationTaskAssessment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartReplicationTaskAssessmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Starts the replication task assessment for unsupported data types in the source database. 
      */
    def startReplicationTaskAssessment(params: StartReplicationTaskAssessmentMessage): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startReplicationTaskAssessment(
      params: StartReplicationTaskAssessmentMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartReplicationTaskAssessmentResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartReplicationTaskAssessmentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the replication task. 
      */
    def stopReplicationTask(): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopReplicationTask(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the replication task. 
      */
    def stopReplicationTask(params: StopReplicationTaskMessage): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopReplicationTask(
      params: StopReplicationTaskMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopReplicationTaskResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopReplicationTaskResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the connection between the replication instance and the endpoint.
      */
    def testConnection(): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Tests the connection between the replication instance and the endpoint.
      */
    def testConnection(params: TestConnectionMessage): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def testConnection(
      params: TestConnectionMessage,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TestConnectionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TestConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
      */
    @JSName("waitFor")
    def waitFor_endpointDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_endpointDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the endpointDeleted state by periodically calling the underlying DMS.describeEndpointsoperation every 5 seconds (at most 60 times). Wait until testing endpoint is deleted.
      */
    @JSName("waitFor")
    def waitFor_endpointDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
      params: DescribeEndpointsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_endpointDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.endpointDeleted,
      params: DescribeEndpointsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
      */
    @JSName("waitFor")
    def waitFor_replicationInstanceAvailable(state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationInstanceAvailable state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 60 seconds (at most 60 times). Wait until DMS replication instance is available.
      */
    @JSName("waitFor")
    def waitFor_replicationInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
      params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationInstanceAvailable(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceAvailable,
      params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationInstanceDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationInstanceDeleted state by periodically calling the underlying DMS.describeReplicationInstancesoperation every 15 seconds (at most 60 times). Wait until DMS replication instance is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
      params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationInstanceDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationInstanceDeleted,
      params: DescribeReplicationInstancesMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationInstancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationInstancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskDeleted state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is deleted.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskDeleted,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskReady(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskReady(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskReady state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is ready.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskReady(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskReady(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskReady,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskRunning(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskRunning state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is running.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskRunning(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskRunning,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskStopped(state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the replicationTaskStopped state by periodically calling the underlying DMS.describeReplicationTasksoperation every 15 seconds (at most 60 times). Wait until DMS replication task is stopped.
      */
    @JSName("waitFor")
    def waitFor_replicationTaskStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_replicationTaskStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.replicationTaskStopped,
      params: DescribeReplicationTasksMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeReplicationTasksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeReplicationTasksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
      */
    @JSName("waitFor")
    def waitFor_testConnectionSucceeds(state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_testConnectionSucceeds(
      state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the testConnectionSucceeds state by periodically calling the underlying DMS.describeConnectionsoperation every 5 seconds (at most 60 times). Wait until testing connection succeeds.
      */
    @JSName("waitFor")
    def waitFor_testConnectionSucceeds(
      state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
      params: DescribeConnectionsMessage with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_testConnectionSucceeds(
      state: awsDashSdkLib.awsDashSdkLibStrings.testConnectionSucceeds,
      params: DescribeConnectionsMessage with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConnectionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait VpcSecurityGroupMembership extends js.Object {
    /**
      * The status of the VPC security group.
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The VPC security group Id.
      */
    var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
  }
  
  trait _AuthMechanismValue extends js.Object
  
  trait _AuthTypeValue extends js.Object
  
  trait _CompressionTypeValue extends js.Object
  
  trait _DmsSslModeValue extends js.Object
  
  trait _MigrationTypeValue extends js.Object
  
  trait _NestingLevelValue extends js.Object
  
  trait _RefreshSchemasStatusTypeValue extends js.Object
  
  trait _ReloadOptionValue extends js.Object
  
  trait _ReplicationEndpointTypeValue extends js.Object
  
  trait _StartReplicationTaskTypeValue extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AccountQuotaList = js.Array[AccountQuota]
  type AuthMechanismValue = _AuthMechanismValue | java.lang.String
  type AuthTypeValue = _AuthTypeValue | java.lang.String
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[Certificate]
  type CertificateWallet = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsDmsMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompressionTypeValue = _CompressionTypeValue | java.lang.String
  type ConnectionList = js.Array[Connection]
  type DmsSslModeValue = _DmsSslModeValue | java.lang.String
  type EndpointList = js.Array[Endpoint]
  type EventCategoriesList = js.Array[String]
  type EventCategoryGroupList = js.Array[EventCategoryGroup]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type FilterList = js.Array[Filter]
  type FilterValueList = js.Array[String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[String]
  type Long = scala.Double
  type MessageFormatValue = awsDashSdkLib.awsDashSdkLibStrings.json | java.lang.String
  type MigrationTypeValue = _MigrationTypeValue | java.lang.String
  type NestingLevelValue = _NestingLevelValue | java.lang.String
  type OrderableReplicationInstanceList = js.Array[OrderableReplicationInstance]
  type RefreshSchemasStatusTypeValue = _RefreshSchemasStatusTypeValue | java.lang.String
  type ReloadOptionValue = _ReloadOptionValue | java.lang.String
  type ReplicationEndpointTypeValue = _ReplicationEndpointTypeValue | java.lang.String
  type ReplicationInstanceList = js.Array[ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[String]
  type ReplicationInstancePublicIpAddressList = js.Array[String]
  type ReplicationInstanceTaskLogsList = js.Array[ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[ReplicationTaskAssessmentResult]
  type ReplicationTaskList = js.Array[ReplicationTask]
  type SchemaList = js.Array[String]
  type SecretString = java.lang.String
  type SourceIdsList = js.Array[String]
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.`replication-instance` | java.lang.String
  type StartReplicationTaskTypeValue = _StartReplicationTaskTypeValue | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedEndpointTypeList = js.Array[SupportedEndpointType]
  type TStamp = stdLib.Date
  type TableListToReload = js.Array[TableToReload]
  type TableStatisticsList = js.Array[TableStatistics]
  type TagList = js.Array[Tag]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  type apiVersion = _apiVersion | java.lang.String
}

