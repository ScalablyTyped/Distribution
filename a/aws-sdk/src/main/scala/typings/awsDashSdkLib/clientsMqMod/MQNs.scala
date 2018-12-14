package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mq", "MQ")
@js.native
object MQNs extends js.Object {
  
  trait BrokerInstance extends js.Object {
    /**
         * The URL of the broker's ActiveMQ Web Console.
         */
    var ConsoleURL: js.UndefOr[__string] = js.undefined
    /**
         * The broker's wire-level protocol endpoints.
         */
    var Endpoints: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The IP address of the Elastic Network Interface (ENI) attached to the broker.
         */
    var IpAddress: js.UndefOr[__string] = js.undefined
  }
  
  
  trait BrokerSummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the broker.
         */
    var BrokerArn: js.UndefOr[__string] = js.undefined
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
    /**
         * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerName: js.UndefOr[__string] = js.undefined
    /**
         * The status of the broker.
         */
    var BrokerState: js.UndefOr[BrokerState] = js.undefined
    /**
         * The time when the broker was created.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The deployment mode of the broker.
         */
    var DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined
    /**
         * The broker's instance type.
         */
    var HostInstanceType: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Configuration extends js.Object {
    /**
         * Required. The ARN of the configuration.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * Required. The date and time of the configuration revision.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The description of the configuration.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
         */
    var EngineType: js.UndefOr[EngineType] = js.undefined
    /**
         * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * Required. The latest revision of the configuration.
         */
    var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
    /**
         * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The list of all tags associated with this configuration.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait ConfigurationId extends js.Object {
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * The revision number of the configuration.
         */
    var Revision: js.UndefOr[__integer] = js.undefined
  }
  
  
  trait ConfigurationRevision extends js.Object {
    /**
         * Required. The date and time of the configuration revision.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * The description of the configuration revision.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * Required. The revision number of the configuration.
         */
    var Revision: js.UndefOr[__integer] = js.undefined
  }
  
  
  trait Configurations extends js.Object {
    /**
         * The current configuration of the broker.
         */
    var Current: js.UndefOr[ConfigurationId] = js.undefined
    /**
         * The history of configurations applied to the broker.
         */
    var History: js.UndefOr[__listOfConfigurationId] = js.undefined
    /**
         * The pending configuration of the broker.
         */
    var Pending: js.UndefOr[ConfigurationId] = js.undefined
  }
  
  
  trait CreateBrokerRequest extends js.Object {
    /**
         * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
    /**
         * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerName: js.UndefOr[__string] = js.undefined
    /**
         * A list of information about the configuration.
         */
    var Configuration: js.UndefOr[ConfigurationId] = js.undefined
    /**
         * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the creatorRequestId if your application doesn't require idempotency.
         */
    var CreatorRequestId: js.UndefOr[__string] = js.undefined
    /**
         * Required. The deployment mode of the broker.
         */
    var DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined
    /**
         * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
         */
    var EngineType: js.UndefOr[EngineType] = js.undefined
    /**
         * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Required. The broker's instance type.
         */
    var HostInstanceType: js.UndefOr[__string] = js.undefined
    /**
         * Enables Amazon CloudWatch logging for brokers.
         */
    var Logs: js.UndefOr[Logs] = js.undefined
    /**
         * The parameters that determine the WeeklyStartTime.
         */
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
    /**
         * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
         */
    var PubliclyAccessible: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
         */
    var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
         */
    var SubnetIds: js.UndefOr[__listOf__string] = js.undefined
    /**
         * Create tags when creating the broker.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
    /**
         * Required. The list of ActiveMQ users (persons or applications) who can access queues and topics. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Users: js.UndefOr[__listOfUser] = js.undefined
  }
  
  
  trait CreateBrokerResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the broker.
         */
    var BrokerArn: js.UndefOr[__string] = js.undefined
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateConfigurationRequest extends js.Object {
    /**
         * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
         */
    var EngineType: js.UndefOr[EngineType] = js.undefined
    /**
         * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * Create tags when creating the configuration.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreateConfigurationResponse extends js.Object {
    /**
         * Required. The Amazon Resource Name (ARN) of the configuration.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * Required. The date and time of the configuration.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * The latest revision of the configuration.
         */
    var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
    /**
         * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
         */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateTagsRequest extends js.Object {
    /**
         * the Amazon Resource Name (ARN)
         */
    var ResourceArn: __string
    /**
         * The key-value pair for the resource tag.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreateUserRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
    /**
         * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
         */
    var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Groups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * Required. The password of the user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
         */
    var Password: js.UndefOr[__string] = js.undefined
    /**
         * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: __string
  }
  
  
  trait CreateUserResponse extends js.Object
  
  
  trait DeleteBrokerRequest extends js.Object {
    /**
         * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerId: __string
  }
  
  
  trait DeleteBrokerResponse extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeleteTagsRequest extends js.Object {
    /**
         * the Amazon Resource Name (ARN)
         */
    var ResourceArn: __string
    /**
         * An array of tag keys to delete
         */
    var TagKeys: __listOf__string
  }
  
  
  trait DeleteUserRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
    /**
         * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: __string
  }
  
  
  trait DeleteUserResponse extends js.Object
  
  
  trait DescribeBrokerRequest extends js.Object {
    /**
         * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerId: __string
  }
  
  
  trait DescribeBrokerResponse extends js.Object {
    /**
         * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the broker.
         */
    var BrokerArn: js.UndefOr[__string] = js.undefined
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
    /**
         * A list of information about allocated brokers.
         */
    var BrokerInstances: js.UndefOr[__listOfBrokerInstance] = js.undefined
    /**
         * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerName: js.UndefOr[__string] = js.undefined
    /**
         * The status of the broker.
         */
    var BrokerState: js.UndefOr[BrokerState] = js.undefined
    /**
         * The list of all revisions for the specified configuration.
         */
    var Configurations: js.UndefOr[Configurations] = js.undefined
    /**
         * The time when the broker was created.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The deployment mode of the broker.
         */
    var DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined
    /**
         * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
         */
    var EngineType: js.UndefOr[EngineType] = js.undefined
    /**
         * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * The broker's instance type.
         */
    var HostInstanceType: js.UndefOr[__string] = js.undefined
    /**
         * The list of information about logs currently enabled and pending to be deployed for the specified broker.
         */
    var Logs: js.UndefOr[LogsSummary] = js.undefined
    /**
         * The parameters that determine the WeeklyStartTime.
         */
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
    /**
         * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var PendingEngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
         */
    var PubliclyAccessible: js.UndefOr[__boolean] = js.undefined
    /**
         * Required. The list of rules (1 minimum, 125 maximum) that authorize connections to brokers.
         */
    var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
         */
    var SubnetIds: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The list of all tags associated with this broker.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
    /**
         * The list of all ActiveMQ usernames for the specified broker.
         */
    var Users: js.UndefOr[__listOfUserSummary] = js.undefined
  }
  
  
  trait DescribeConfigurationRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: __string
  }
  
  
  trait DescribeConfigurationResponse extends js.Object {
    /**
         * Required. The ARN of the configuration.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * Required. The date and time of the configuration revision.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The description of the configuration.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
         */
    var EngineType: js.UndefOr[EngineType] = js.undefined
    /**
         * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * Required. The latest revision of the configuration.
         */
    var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
    /**
         * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The list of all tags associated with this configuration.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait DescribeConfigurationRevisionRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: __string
    /**
         * The revision of the configuration.
         */
    var ConfigurationRevision: __string
  }
  
  
  trait DescribeConfigurationRevisionResponse extends js.Object {
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: js.UndefOr[__string] = js.undefined
    /**
         * Required. The date and time of the configuration.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The base64-encoded XML configuration.
         */
    var Data: js.UndefOr[__string] = js.undefined
    /**
         * The description of the configuration.
         */
    var Description: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DescribeUserRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
    /**
         * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: __string
  }
  
  
  trait DescribeUserResponse extends js.Object {
    /**
         * Required. The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
    /**
         * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
         */
    var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Groups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The status of the changes pending for the ActiveMQ user.
         */
    var Pending: js.UndefOr[UserPendingChanges] = js.undefined
    /**
         * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListBrokersRequest extends js.Object {
    /**
         * The maximum number of brokers that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListBrokersResponse extends js.Object {
    /**
         * A list of information about all brokers.
         */
    var BrokerSummaries: js.UndefOr[__listOfBrokerSummary] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListConfigurationRevisionsRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: __string
    /**
         * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListConfigurationRevisionsResponse extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: js.UndefOr[__string] = js.undefined
    /**
         * The maximum number of configuration revisions that can be returned per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[__integer] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * The list of all revisions for the specified configuration.
         */
    var Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
  }
  
  
  trait ListConfigurationsRequest extends js.Object {
    /**
         * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListConfigurationsResponse extends js.Object {
    /**
         * The list of all revisions for the specified configuration.
         */
    var Configurations: js.UndefOr[__listOfConfiguration] = js.undefined
    /**
         * The maximum number of configurations that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[__integer] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListTagsRequest extends js.Object {
    /**
         * the Amazon Resource Name (ARN)
         */
    var ResourceArn: __string
  }
  
  
  trait ListTagsResponse extends js.Object {
    /**
         * The key-value pair for the resource tag.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait ListUsersRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
    /**
         * The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListUsersResponse extends js.Object {
    /**
         * Required. The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
    /**
         * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be an integer from 5 to 100.
         */
    var MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined
    /**
         * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * Required. The list of all ActiveMQ usernames for the specified broker.
         */
    var Users: js.UndefOr[__listOfUserSummary] = js.undefined
  }
  
  
  trait Logs extends js.Object {
    /**
         * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
         */
    var Audit: js.UndefOr[__boolean] = js.undefined
    /**
         * Enables general logging.
         */
    var General: js.UndefOr[__boolean] = js.undefined
  }
  
  
  trait LogsSummary extends js.Object {
    /**
         * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
         */
    var Audit: js.UndefOr[__boolean] = js.undefined
    /**
         * The location of the CloudWatch Logs log group where audit logs are sent.
         */
    var AuditLogGroup: js.UndefOr[__string] = js.undefined
    /**
         * Enables general logging.
         */
    var General: js.UndefOr[__boolean] = js.undefined
    /**
         * The location of the CloudWatch Logs log group where general logs are sent.
         */
    var GeneralLogGroup: js.UndefOr[__string] = js.undefined
    /**
         * The list of information about logs pending to be deployed for the specified broker.
         */
    var Pending: js.UndefOr[PendingLogs] = js.undefined
  }
  
  
  trait PendingLogs extends js.Object {
    /**
         * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
         */
    var Audit: js.UndefOr[__boolean] = js.undefined
    /**
         * Enables general logging.
         */
    var General: js.UndefOr[__boolean] = js.undefined
  }
  
  
  trait RebootBrokerRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
  }
  
  
  trait RebootBrokerResponse extends js.Object
  
  
  trait SanitizationWarning extends js.Object {
    /**
         * The name of the XML attribute that has been sanitized.
         */
    var AttributeName: js.UndefOr[__string] = js.undefined
    /**
         * The name of the XML element that has been sanitized.
         */
    var ElementName: js.UndefOr[__string] = js.undefined
    /**
         * Required. The reason for which the XML elements or attributes were sanitized.
         */
    var Reason: js.UndefOr[SanitizationWarningReason] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a broker. Note: This API is asynchronous.
       */
    def createBroker(): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a broker. Note: This API is asynchronous.
       */
    def createBroker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a broker. Note: This API is asynchronous.
       */
    def createBroker(params: CreateBrokerRequest): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a broker. Note: This API is asynchronous.
       */
    def createBroker(
      params: CreateBrokerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
       */
    def createConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
       */
    def createConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
       */
    def createConfiguration(params: CreateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
       */
    def createConfiguration(
      params: CreateConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a tag to a resource.
       */
    def createTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a tag to a resource.
       */
    def createTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a tag to a resource.
       */
    def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add a tag to a resource.
       */
    def createTags(
      params: CreateTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an ActiveMQ user.
       */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an ActiveMQ user.
       */
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an ActiveMQ user.
       */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an ActiveMQ user.
       */
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a broker. Note: This API is asynchronous.
       */
    def deleteBroker(): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a broker. Note: This API is asynchronous.
       */
    def deleteBroker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a broker. Note: This API is asynchronous.
       */
    def deleteBroker(params: DeleteBrokerRequest): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a broker. Note: This API is asynchronous.
       */
    def deleteBroker(
      params: DeleteBrokerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove a tag from a resource.
       */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove a tag from a resource.
       */
    def deleteTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove a tag from a resource.
       */
    def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove a tag from a resource.
       */
    def deleteTags(
      params: DeleteTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an ActiveMQ user.
       */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an ActiveMQ user.
       */
    def deleteUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an ActiveMQ user.
       */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an ActiveMQ user.
       */
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified broker.
       */
    def describeBroker(): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified broker.
       */
    def describeBroker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified broker.
       */
    def describeBroker(params: DescribeBrokerRequest): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified broker.
       */
    def describeBroker(
      params: DescribeBrokerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified configuration.
       */
    def describeConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified configuration.
       */
    def describeConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified configuration.
       */
    def describeConfiguration(params: DescribeConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about the specified configuration.
       */
    def describeConfiguration(
      params: DescribeConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified configuration revision for the specified configuration.
       */
    def describeConfigurationRevision(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified configuration revision for the specified configuration.
       */
    def describeConfigurationRevision(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRevisionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified configuration revision for the specified configuration.
       */
    def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the specified configuration revision for the specified configuration.
       */
    def describeConfigurationRevision(
      params: DescribeConfigurationRevisionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeConfigurationRevisionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about an ActiveMQ user.
       */
    def describeUser(): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about an ActiveMQ user.
       */
    def describeUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about an ActiveMQ user.
       */
    def describeUser(params: DescribeUserRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns information about an ActiveMQ user.
       */
    def describeUser(
      params: DescribeUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all brokers.
       */
    def listBrokers(): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all brokers.
       */
    def listBrokers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBrokersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all brokers.
       */
    def listBrokers(params: ListBrokersRequest): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all brokers.
       */
    def listBrokers(
      params: ListBrokersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBrokersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all revisions for the specified configuration.
       */
    def listConfigurationRevisions(): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all revisions for the specified configuration.
       */
    def listConfigurationRevisions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationRevisionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all revisions for the specified configuration.
       */
    def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all revisions for the specified configuration.
       */
    def listConfigurationRevisions(
      params: ListConfigurationRevisionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationRevisionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all configurations.
       */
    def listConfigurations(): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all configurations.
       */
    def listConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all configurations.
       */
    def listConfigurations(params: ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all configurations.
       */
    def listConfigurations(
      params: ListConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists tags for a resource.
       */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists tags for a resource.
       */
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists tags for a resource.
       */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists tags for a resource.
       */
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all ActiveMQ users.
       */
    def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all ActiveMQ users.
       */
    def listUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all ActiveMQ users.
       */
    def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all ActiveMQ users.
       */
    def listUsers(
      params: ListUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reboots a broker. Note: This API is asynchronous.
       */
    def rebootBroker(): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reboots a broker. Note: This API is asynchronous.
       */
    def rebootBroker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reboots a broker. Note: This API is asynchronous.
       */
    def rebootBroker(params: RebootBrokerRequest): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Reboots a broker. Note: This API is asynchronous.
       */
    def rebootBroker(
      params: RebootBrokerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a pending configuration change to a broker.
       */
    def updateBroker(): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a pending configuration change to a broker.
       */
    def updateBroker(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a pending configuration change to a broker.
       */
    def updateBroker(params: UpdateBrokerRequest): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a pending configuration change to a broker.
       */
    def updateBroker(
      params: UpdateBrokerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBrokerResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified configuration.
       */
    def updateConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified configuration.
       */
    def updateConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified configuration.
       */
    def updateConfiguration(params: UpdateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified configuration.
       */
    def updateConfiguration(
      params: UpdateConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the information for an ActiveMQ user.
       */
    def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the information for an ActiveMQ user.
       */
    def updateUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the information for an ActiveMQ user.
       */
    def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the information for an ActiveMQ user.
       */
    def updateUser(
      params: UpdateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateBrokerRequest extends js.Object {
    /**
         * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
    /**
         * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
         */
    var BrokerId: __string
    /**
         * A list of information about the configuration.
         */
    var Configuration: js.UndefOr[ConfigurationId] = js.undefined
    /**
         * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * Enables Amazon CloudWatch logging for brokers.
         */
    var Logs: js.UndefOr[Logs] = js.undefined
  }
  
  
  trait UpdateBrokerResponse extends js.Object {
    /**
         * The new value of automatic upgrades to new minor version for brokers.
         */
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined
    /**
         * Required. The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: js.UndefOr[__string] = js.undefined
    /**
         * The ID of the updated configuration.
         */
    var Configuration: js.UndefOr[ConfigurationId] = js.undefined
    /**
         * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
         */
    var EngineVersion: js.UndefOr[__string] = js.undefined
    /**
         * The list of information about logs to be enabled for the specified broker.
         */
    var Logs: js.UndefOr[Logs] = js.undefined
  }
  
  
  trait UpdateConfigurationRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the configuration.
         */
    var ConfigurationId: __string
    /**
         * Required. The base64-encoded XML configuration.
         */
    var Data: js.UndefOr[__string] = js.undefined
    /**
         * The description of the configuration.
         */
    var Description: js.UndefOr[__string] = js.undefined
  }
  
  
  trait UpdateConfigurationResponse extends js.Object {
    /**
         * Required. The Amazon Resource Name (ARN) of the configuration.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * Required. The date and time of the configuration.
         */
    var Created: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Required. The unique ID that Amazon MQ generates for the configuration.
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * The latest revision of the configuration.
         */
    var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
    /**
         * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The list of the first 20 warnings about the configuration XML elements or attributes that were sanitized.
         */
    var Warnings: js.UndefOr[__listOfSanitizationWarning] = js.undefined
  }
  
  
  trait UpdateUserRequest extends js.Object {
    /**
         * The unique ID that Amazon MQ generates for the broker.
         */
    var BrokerId: __string
    /**
         * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
         */
    var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Groups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
         */
    var Password: js.UndefOr[__string] = js.undefined
    /**
         * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: __string
  }
  
  
  trait UpdateUserResponse extends js.Object
  
  
  trait User extends js.Object {
    /**
         * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
         */
    var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Groups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * Required. The password of the ActiveMQ user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
         */
    var Password: js.UndefOr[__string] = js.undefined
    /**
         * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  
  trait UserPendingChanges extends js.Object {
    /**
         * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
         */
    var ConsoleAccess: js.UndefOr[__boolean] = js.undefined
    /**
         * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Groups: js.UndefOr[__listOf__string] = js.undefined
    /**
         * Required. The type of change pending for the ActiveMQ user.
         */
    var PendingChange: js.UndefOr[ChangeType] = js.undefined
  }
  
  
  trait UserSummary extends js.Object {
    /**
         * The type of change pending for the ActiveMQ user.
         */
    var PendingChange: js.UndefOr[ChangeType] = js.undefined
    /**
         * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
         */
    var Username: js.UndefOr[__string] = js.undefined
  }
  
  
  trait WeeklyStartTime extends js.Object {
    /**
         * Required. The day of the week.
         */
    var DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined
    /**
         * Required. The time, in 24-hour format.
         */
    var TimeOfDay: js.UndefOr[__string] = js.undefined
    /**
         * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
         */
    var TimeZone: js.UndefOr[__string] = js.undefined
  }
  
  
  trait __mapOf__string
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__string]
  
  val TypesNs: this.type = js.native
  type BrokerState = awsDashSdkLib.awsDashSdkLibStrings.CREATION_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.CREATION_FAILED | awsDashSdkLib.awsDashSdkLibStrings.DELETION_IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.REBOOT_IN_PROGRESS | java.lang.String
  type ChangeType = awsDashSdkLib.awsDashSdkLibStrings.CREATE | awsDashSdkLib.awsDashSdkLibStrings.UPDATE | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DayOfWeek = awsDashSdkLib.awsDashSdkLibStrings.MONDAY | awsDashSdkLib.awsDashSdkLibStrings.TUESDAY | awsDashSdkLib.awsDashSdkLibStrings.WEDNESDAY | awsDashSdkLib.awsDashSdkLibStrings.THURSDAY | awsDashSdkLib.awsDashSdkLibStrings.FRIDAY | awsDashSdkLib.awsDashSdkLibStrings.SATURDAY | awsDashSdkLib.awsDashSdkLibStrings.SUNDAY | java.lang.String
  type DeploymentMode = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_INSTANCE | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE_STANDBY_MULTI_AZ | java.lang.String
  type EngineType = awsDashSdkLib.awsDashSdkLibStrings.ACTIVEMQ | java.lang.String
  type MaxResults = scala.Double
  type SanitizationWarningReason = awsDashSdkLib.awsDashSdkLibStrings.DISALLOWED_ELEMENT_REMOVED | awsDashSdkLib.awsDashSdkLibStrings.DISALLOWED_ATTRIBUTE_REMOVED | awsDashSdkLib.awsDashSdkLibStrings.INVALID_ATTRIBUTE_VALUE_REMOVED | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __integerMin5Max100 = scala.Double
  type __listOfBrokerInstance = js.Array[BrokerInstance]
  type __listOfBrokerSummary = js.Array[BrokerSummary]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationId = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfSanitizationWarning = js.Array[SanitizationWarning]
  type __listOfUser = js.Array[User]
  type __listOfUserSummary = js.Array[UserSummary]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type __timestampIso8601 = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-27` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

