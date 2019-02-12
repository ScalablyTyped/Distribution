package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/appstream", "AppStream")
@js.native
object AppStreamNs extends js.Object {
  trait Application extends js.Object {
    /**
      * The application name to display.
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
      * If there is a problem, the application can be disabled after image creation.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The URL for the application icon. This URL might be time-limited.
      */
    var IconURL: js.UndefOr[String] = js.undefined
    /**
      * The arguments that are passed to the application at launch.
      */
    var LaunchParameters: js.UndefOr[String] = js.undefined
    /**
      * The path to the application executable in the instance.
      */
    var LaunchPath: js.UndefOr[String] = js.undefined
    /**
      * Additional attributes that describe the application.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * The name of the application.
      */
    var Name: js.UndefOr[String] = js.undefined
  }
  
  trait ApplicationSettings extends js.Object {
    /**
      * Enables or disables persistent application settings for users during their streaming sessions. 
      */
    var Enabled: Boolean
    /**
      * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same persistent application settings to be used across multiple stacks by specifying the same settings group for each stack. 
      */
    var SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined
  }
  
  trait ApplicationSettingsResponse extends js.Object {
    /**
      * Specifies whether persistent application settings are enabled for users during their streaming sessions.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the AWS account and the Region. 
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * The path prefix for the S3 bucket where users’ persistent application settings are stored.
      */
    var SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined
  }
  
  trait AssociateFleetRequest extends js.Object {
    /**
      * The name of the fleet. 
      */
    var FleetName: String
    /**
      * The name of the stack.
      */
    var StackName: String
  }
  
  trait AssociateFleetResult extends js.Object
  
  trait BatchAssociateUserStackRequest extends js.Object {
    /**
      * The list of UserStackAssociation objects.
      */
    var UserStackAssociations: UserStackAssociationList
  }
  
  trait BatchAssociateUserStackResult extends js.Object {
    /**
      * The list of UserStackAssociationError objects.
      */
    var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
  }
  
  trait BatchDisassociateUserStackRequest extends js.Object {
    /**
      * The list of UserStackAssociation objects.
      */
    var UserStackAssociations: UserStackAssociationList
  }
  
  trait BatchDisassociateUserStackResult extends js.Object {
    /**
      * The list of UserStackAssociationError objects.
      */
    var errors: js.UndefOr[UserStackAssociationErrorList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ComputeCapacity extends js.Object {
    /**
      * The desired number of streaming instances.
      */
    var DesiredInstances: Integer
  }
  
  trait ComputeCapacityStatus extends js.Object {
    /**
      * The number of currently available instances that can be used to stream sessions.
      */
    var Available: js.UndefOr[Integer] = js.undefined
    /**
      * The desired number of streaming instances.
      */
    var Desired: Integer
    /**
      * The number of instances in use for streaming.
      */
    var InUse: js.UndefOr[Integer] = js.undefined
    /**
      * The total number of simultaneous streaming instances that are running.
      */
    var Running: js.UndefOr[Integer] = js.undefined
  }
  
  trait CopyImageRequest extends js.Object {
    /**
      * The description that the image will have when it is copied to the destination.
      */
    var DestinationImageDescription: js.UndefOr[Description] = js.undefined
    /**
      * The name that the image will have when it is copied to the destination.
      */
    var DestinationImageName: Name
    /**
      * The destination region to which the image will be copied. This parameter is required, even if you are copying an image within the same region.
      */
    var DestinationRegion: RegionName
    /**
      * The name of the image to copy.
      */
    var SourceImageName: Name
  }
  
  trait CopyImageResponse extends js.Object {
    /**
      * The name of the destination image.
      */
    var DestinationImageName: js.UndefOr[Name] = js.undefined
  }
  
  trait CreateDirectoryConfigRequest extends js.Object {
    /**
      * The fully qualified name of the directory (for example, corp.example.com).
      */
    var DirectoryName: DirectoryName
    /**
      * The distinguished names of the organizational units for computer accounts.
      */
    var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
    /**
      * The credentials for the service account used by the streaming instance to connect to the directory.
      */
    var ServiceAccountCredentials: ServiceAccountCredentials
  }
  
  trait CreateDirectoryConfigResult extends js.Object {
    /**
      * Information about the directory configuration.
      */
    var DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined
  }
  
  trait CreateFleetRequest extends js.Object {
    /**
      * The desired capacity for the fleet.
      */
    var ComputeCapacity: ComputeCapacity
    /**
      * The description to display.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The time after disconnection when a session is considered to have ended, in seconds. If a user who was disconnected reconnects within this time interval, the user is connected to their previous session. Specify a value between 60 and 360000.
      */
    var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * The fleet name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
      */
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
    /**
      * Enables or disables default internet access for the fleet.
      */
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
      */
    var FleetType: js.UndefOr[FleetType] = js.undefined
    /**
      * The ARN of the public, private, or shared image to use.
      */
    var ImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the image used to create the fleet.
      */
    var ImageName: js.UndefOr[String] = js.undefined
    /**
      * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
      */
    var InstanceType: String
    /**
      * The maximum time that a streaming session can run, in seconds. Specify a value between 600 and 360000.
      */
    var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * A unique name for the fleet.
      */
    var Name: Name
    /**
      * The tags to associate with the fleet. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. For more information, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The VPC configuration for the fleet.
      */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  trait CreateFleetResult extends js.Object {
    /**
      * Information about the fleet.
      */
    var Fleet: js.UndefOr[Fleet] = js.undefined
  }
  
  trait CreateImageBuilderRequest extends js.Object {
    /**
      * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
      */
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The image builder name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
      */
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
    /**
      * Enables or disables default internet access for the image builder.
      */
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The ARN of the public, private, or shared image to use.
      */
    var ImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the image used to create the image builder.
      */
    var ImageName: js.UndefOr[String] = js.undefined
    /**
      * The instance type to use when launching the image builder.
      */
    var InstanceType: String
    /**
      * A unique name for the image builder.
      */
    var Name: Name
    /**
      * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The VPC configuration for the image builder. You can specify only one subnet.
      */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  trait CreateImageBuilderResult extends js.Object {
    /**
      * Information about the image builder.
      */
    var ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
  }
  
  trait CreateImageBuilderStreamingURLRequest extends js.Object {
    /**
      * The name of the image builder.
      */
    var Name: String
    /**
      * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 3600 seconds.
      */
    var Validity: js.UndefOr[Long] = js.undefined
  }
  
  trait CreateImageBuilderStreamingURLResult extends js.Object {
    /**
      * The elapsed time, in seconds after the Unix epoch, when this URL expires.
      */
    var Expires: js.UndefOr[Timestamp] = js.undefined
    /**
      * The URL to start the AppStream 2.0 streaming session.
      */
    var StreamingURL: js.UndefOr[String] = js.undefined
  }
  
  trait CreateStackRequest extends js.Object {
    /**
      * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
      */
    var ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The stack name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
      */
    var FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined
    /**
      * The name of the stack.
      */
    var Name: Name
    /**
      * The URL that users are redirected to after their streaming session ends.
      */
    var RedirectURL: js.UndefOr[RedirectURL] = js.undefined
    /**
      * The storage connectors to enable.
      */
    var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
    /**
      * The tags to associate with the stack. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. 
      */
    var UserSettings: js.UndefOr[UserSettingList] = js.undefined
  }
  
  trait CreateStackResult extends js.Object {
    /**
      * Information about the stack.
      */
    var Stack: js.UndefOr[Stack] = js.undefined
  }
  
  trait CreateStreamingURLRequest extends js.Object {
    /**
      * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    /**
      * The name of the fleet.
      */
    var FleetName: String
    /**
      * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Developer Guide.
      */
    var SessionContext: js.UndefOr[String] = js.undefined
    /**
      * The name of the stack.
      */
    var StackName: String
    /**
      * The identifier of the user.
      */
    var UserId: StreamingUrlUserId
    /**
      * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
      */
    var Validity: js.UndefOr[Long] = js.undefined
  }
  
  trait CreateStreamingURLResult extends js.Object {
    /**
      * The elapsed time, in seconds after the Unix epoch, when this URL expires.
      */
    var Expires: js.UndefOr[Timestamp] = js.undefined
    /**
      * The URL to start the AppStream 2.0 streaming session.
      */
    var StreamingURL: js.UndefOr[String] = js.undefined
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      * The authentication type for the user. You must specify USERPOOL. 
      */
    var AuthenticationType: AuthenticationType
    /**
      * The first name, or given name, of the user.
      */
    var FirstName: js.UndefOr[UserAttributeValue] = js.undefined
    /**
      * The last name, or surname, of the user.
      */
    var LastName: js.UndefOr[UserAttributeValue] = js.undefined
    /**
      * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the user. If the value is null, the email is sent.   The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7 days, you must send them a new welcome email. 
      */
    var MessageAction: js.UndefOr[MessageAction] = js.undefined
    /**
      * The email address of the user.
      */
    var UserName: Username
  }
  
  trait CreateUserResult extends js.Object
  
  trait DeleteDirectoryConfigRequest extends js.Object {
    /**
      * The name of the directory configuration.
      */
    var DirectoryName: DirectoryName
  }
  
  trait DeleteDirectoryConfigResult extends js.Object
  
  trait DeleteFleetRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var Name: String
  }
  
  trait DeleteFleetResult extends js.Object
  
  trait DeleteImageBuilderRequest extends js.Object {
    /**
      * The name of the image builder.
      */
    var Name: Name
  }
  
  trait DeleteImageBuilderResult extends js.Object {
    /**
      * Information about the image builder.
      */
    var ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
  }
  
  trait DeleteImagePermissionsRequest extends js.Object {
    /**
      * The name of the private image.
      */
    var Name: Name
    /**
      * The 12-digit identifier of the AWS account for which to delete image permissions.
      */
    var SharedAccountId: AwsAccountId
  }
  
  trait DeleteImagePermissionsResult extends js.Object
  
  trait DeleteImageRequest extends js.Object {
    /**
      * The name of the image.
      */
    var Name: Name
  }
  
  trait DeleteImageResult extends js.Object {
    /**
      * Information about the image.
      */
    var Image: js.UndefOr[Image] = js.undefined
  }
  
  trait DeleteStackRequest extends js.Object {
    /**
      * The name of the stack.
      */
    var Name: String
  }
  
  trait DeleteStackResult extends js.Object
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The authentication type for the user. You must specify USERPOOL.
      */
    var AuthenticationType: AuthenticationType
    /**
      * The email address of the user.
      */
    var UserName: Username
  }
  
  trait DeleteUserResult extends js.Object
  
  trait DescribeDirectoryConfigsRequest extends js.Object {
    /**
      * The directory names.
      */
    var DirectoryNames: js.UndefOr[DirectoryNameList] = js.undefined
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeDirectoryConfigsResult extends js.Object {
    /**
      * Information about the directory configurations. Note that although the response syntax in this topic includes the account password, this password is not returned in the actual response. 
      */
    var DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeFleetsRequest extends js.Object {
    /**
      * The names of the fleets to describe.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeFleetsResult extends js.Object {
    /**
      * Information about the fleets.
      */
    var Fleets: js.UndefOr[FleetList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeImageBuildersRequest extends js.Object {
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The names of the image builders to describe.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeImageBuildersResult extends js.Object {
    /**
      * Information about the image builders.
      */
    var ImageBuilders: js.UndefOr[ImageBuilderList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeImagePermissionsRequest extends js.Object {
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The name of the private image for which to describe permissions. The image must be one that you own. 
      */
    var Name: Name
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The 12-digit identifier of one or more AWS accounts with which the image is shared.
      */
    var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.undefined
  }
  
  trait DescribeImagePermissionsResult extends js.Object {
    /**
      * The name of the private image.
      */
    var Name: js.UndefOr[Name] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The permissions for a private image that you own. 
      */
    var SharedImagePermissionsList: js.UndefOr[SharedImagePermissionsList] = js.undefined
  }
  
  trait DescribeImagesRequest extends js.Object {
    /**
      * The ARNs of the public, private, and shared images to describe.
      */
    var Arns: js.UndefOr[ArnList] = js.undefined
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[DescribeImagesMaxResults] = js.undefined
    /**
      * The names of the public or private images to describe.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The type of image (public, private, or shared) to describe. 
      */
    var Type: js.UndefOr[VisibilityType] = js.undefined
  }
  
  trait DescribeImagesResult extends js.Object {
    /**
      * Information about the images.
      */
    var Images: js.UndefOr[ImageList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeSessionsRequest extends js.Object {
    /**
      * The authentication method. Specify API for a user authenticated using a streaming URL, SAML for a SAML 2.0-federated user, or USERPOOL for a user in the AppStream 2.0 user pool. The default is to authenticate users using a streaming URL.
      */
    var AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
      * The name of the fleet. This value is case-sensitive.
      */
    var FleetName: String
    /**
      * The size of each page of results. The default value is 20 and the maximum value is 50.
      */
    var Limit: js.UndefOr[Integer] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the stack. This value is case-sensitive.
      */
    var StackName: String
    /**
      * The user identifier.
      */
    var UserId: js.UndefOr[UserId] = js.undefined
  }
  
  trait DescribeSessionsResult extends js.Object {
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the streaming sessions.
      */
    var Sessions: js.UndefOr[SessionList] = js.undefined
  }
  
  trait DescribeStacksRequest extends js.Object {
    /**
      * The names of the stacks to describe.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeStacksResult extends js.Object {
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about the stacks.
      */
    var Stacks: js.UndefOr[StackList] = js.undefined
  }
  
  trait DescribeUserStackAssociationsRequest extends js.Object {
    /**
      * The authentication type for the user who is associated with the stack. You must specify USERPOOL.
      */
    var AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the stack that is associated with the user.
      */
    var StackName: js.UndefOr[String] = js.undefined
    /**
      * The email address of the user who is associated with the stack.
      */
    var UserName: js.UndefOr[Username] = js.undefined
  }
  
  trait DescribeUserStackAssociationsResult extends js.Object {
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The UserStackAssociation objects.
      */
    var UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined
  }
  
  trait DescribeUsersRequest extends js.Object {
    /**
      * The authentication type for the users in the user pool to describe. You must specify USERPOOL.
      */
    var AuthenticationType: AuthenticationType
    /**
      * The maximum size of each page of results.
      */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait DescribeUsersResult extends js.Object {
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Information about users in the user pool.
      */
    var Users: js.UndefOr[UserList] = js.undefined
  }
  
  trait DirectoryConfig extends js.Object {
    /**
      * The time the directory configuration was created.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The fully qualified name of the directory (for example, corp.example.com).
      */
    var DirectoryName: DirectoryName
    /**
      * The distinguished names of the organizational units for computer accounts.
      */
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
    /**
      * The credentials for the service account used by the streaming instance to connect to the directory.
      */
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
  }
  
  trait DisableUserRequest extends js.Object {
    /**
      * The authentication type for the user. You must specify USERPOOL.
      */
    var AuthenticationType: AuthenticationType
    /**
      * The email address of the user.
      */
    var UserName: Username
  }
  
  trait DisableUserResult extends js.Object
  
  trait DisassociateFleetRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var FleetName: String
    /**
      * The name of the stack.
      */
    var StackName: String
  }
  
  trait DisassociateFleetResult extends js.Object
  
  trait DomainJoinInfo extends js.Object {
    /**
      * The fully qualified name of the directory (for example, corp.example.com).
      */
    var DirectoryName: js.UndefOr[DirectoryName] = js.undefined
    /**
      * The distinguished name of the organizational unit for computer accounts.
      */
    var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
  }
  
  trait EnableUserRequest extends js.Object {
    /**
      * The authentication type for the user. You must specify USERPOOL.
      */
    var AuthenticationType: AuthenticationType
    /**
      * The email address of the user.
      */
    var UserName: Username
  }
  
  trait EnableUserResult extends js.Object
  
  trait ExpireSessionRequest extends js.Object {
    /**
      * The identifier of the streaming session.
      */
    var SessionId: String
  }
  
  trait ExpireSessionResult extends js.Object
  
  trait Fleet extends js.Object {
    /**
      * The ARN for the fleet.
      */
    var Arn: Arn
    /**
      * The capacity status for the fleet.
      */
    var ComputeCapacityStatus: ComputeCapacityStatus
    /**
      * The time the fleet was created.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The time after disconnection when a session is considered to have ended, in seconds. If a user who was disconnected reconnects within this time interval, the user is connected to their previous session. Specify a value between 60 and 360000. By default, this value is 900 seconds (15 minutes).
      */
    var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * The fleet name to display.
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
      * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
      */
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
    /**
      * Indicates whether default internet access is enabled for the fleet.
      */
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The fleet errors.
      */
    var FleetErrors: js.UndefOr[FleetErrors] = js.undefined
    /**
      * The fleet type.  ALWAYS_ON  Provides users with instant-on access to their apps. You are charged for all running instances in your fleet, even if no users are streaming apps.  ON_DEMAND  Provide users with access to applications after they connect, which takes one to two minutes. You are charged for instance streaming when users are connected and a small hourly fee for instances that are not streaming apps.  
      */
    var FleetType: js.UndefOr[FleetType] = js.undefined
    /**
      * The ARN for the public, private, or shared image.
      */
    var ImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the image used to create the fleet.
      */
    var ImageName: js.UndefOr[String] = js.undefined
    /**
      * The instance type to use when launching fleet instances.
      */
    var InstanceType: String
    /**
      * The maximum time that a streaming session can run, in seconds. Specify a value between 600 and 360000.
      */
    var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * The name of the fleet.
      */
    var Name: String
    /**
      * The current state for the fleet.
      */
    var State: FleetState
    /**
      * The VPC configuration for the fleet.
      */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  trait FleetError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
  }
  
  trait Image extends js.Object {
    /**
      * The applications associated with the image.
      */
    var Applications: js.UndefOr[Applications] = js.undefined
    /**
      * The version of the AppStream 2.0 agent to use for instances that are launched from this image. 
      */
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
    /**
      * The ARN of the image.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of the image from which this image was created.
      */
    var BaseImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The time the image was created.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The image name to display.
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
      * Indicates whether an image builder can be launched from this image.
      */
    var ImageBuilderSupported: js.UndefOr[Boolean] = js.undefined
    /**
      * The permissions to provide to the destination AWS account for the specified image.
      */
    var ImagePermissions: js.UndefOr[ImagePermissions] = js.undefined
    /**
      * The name of the image.
      */
    var Name: String
    /**
      * The operating system platform of the image.
      */
    var Platform: js.UndefOr[PlatformType] = js.undefined
    /**
      * The release date of the public base image. For private images, this date is the release date of the base image from which the image was created.
      */
    var PublicBaseImageReleasedDate: js.UndefOr[Timestamp] = js.undefined
    /**
      * The image starts in the PENDING state. If image creation succeeds, the state is AVAILABLE. If image creation fails, the state is FAILED.
      */
    var State: js.UndefOr[ImageState] = js.undefined
    /**
      * The reason why the last state change occurred.
      */
    var StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.undefined
    /**
      * Indicates whether the image is public or private.
      */
    var Visibility: js.UndefOr[VisibilityType] = js.undefined
  }
  
  trait ImageBuilder extends js.Object {
    /**
      * The version of the AppStream 2.0 agent that is currently being used by the image builder. 
      */
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
    /**
      * The ARN for the image builder.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time stamp when the image builder was created.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The image builder name to display.
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
      * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
      */
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
    /**
      * Enables or disables default internet access for the image builder.
      */
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The ARN of the image from which this builder was created.
      */
    var ImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The image builder errors.
      */
    var ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.undefined
    /**
      * The instance type for the image builder.
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The name of the image builder.
      */
    var Name: String
    /**
      * The operating system platform of the image builder.
      */
    var Platform: js.UndefOr[PlatformType] = js.undefined
    /**
      * The state of the image builder.
      */
    var State: js.UndefOr[ImageBuilderState] = js.undefined
    /**
      * The reason why the last state change occurred.
      */
    var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.undefined
    /**
      * The VPC configuration of the image builder.
      */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  trait ImageBuilderStateChangeReason extends js.Object {
    /**
      * The state change reason code.
      */
    var Code: js.UndefOr[ImageBuilderStateChangeReasonCode] = js.undefined
    /**
      * The state change reason message.
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  trait ImagePermissions extends js.Object {
    /**
      * Indicates whether the image can be used for a fleet.
      */
    var allowFleet: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Indicates whether the image can be used for an image builder.
      */
    var allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined
  }
  
  trait ImageStateChangeReason extends js.Object {
    /**
      * The state change reason code.
      */
    var Code: js.UndefOr[ImageStateChangeReasonCode] = js.undefined
    /**
      * The state change reason message.
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  
  trait ListAssociatedFleetsRequest extends js.Object {
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the stack.
      */
    var StackName: String
  }
  
  trait ListAssociatedFleetsResult extends js.Object {
    /**
      * The name of the fleet.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListAssociatedStacksRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var FleetName: String
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListAssociatedStacksResult extends js.Object {
    /**
      * The name of the stack.
      */
    var Names: js.UndefOr[StringList] = js.undefined
    /**
      * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var ResourceArn: Arn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The information about the tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait Metadata
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String]
  
  trait NetworkAccessConfiguration extends js.Object {
    /**
      * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
      */
    var EniId: js.UndefOr[String] = js.undefined
    /**
      * The private IP address of the elastic network interface that is attached to instances in your VPC.
      */
    var EniPrivateIpAddress: js.UndefOr[String] = js.undefined
  }
  
  trait ResourceError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[FleetErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
      * The time the error occurred.
      */
    var ErrorTimestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait ServiceAccountCredentials extends js.Object {
    /**
      * The user name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
      */
    var AccountName: AccountName
    /**
      * The password for the account.
      */
    var AccountPassword: AccountPassword
  }
  
  trait Session extends js.Object {
    /**
      * The authentication method. The user is authenticated using a streaming URL (API), SAML 2.0 federation (SAML), or the AppStream 2.0 user pool (USERPOOL). The default is to authenticate users using a streaming URL. 
      */
    var AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined
    /**
      * Specifies whether a user is connected to the streaming session. 
      */
    var ConnectionState: js.UndefOr[SessionConnectionState] = js.undefined
    /**
      * The name of the fleet for the streaming session.
      */
    var FleetName: String
    /**
      * The identifier of the streaming session.
      */
    var Id: String
    /**
      * The time when the streaming session is set to expire. This time is based on the MaxUserDurationinSeconds value, which determines the maximum length of time that a streaming session can run. A streaming session might end earlier than the time specified in SessionMaxExpirationTime, when the DisconnectTimeOutInSeconds elapses or the user chooses to end his or her session. If the DisconnectTimeOutInSeconds elapses, or the user chooses to end his or her session, the streaming instance is terminated and the streaming session ends.
      */
    var MaxExpirationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The network details for the streaming session.
      */
    var NetworkAccessConfiguration: js.UndefOr[NetworkAccessConfiguration] = js.undefined
    /**
      * The name of the stack for the streaming session.
      */
    var StackName: String
    /**
      * The time when a streaming instance is dedicated for the user. 
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The current state of the streaming session.
      */
    var State: SessionState
    /**
      * The identifier of the user for whom the session was created.
      */
    var UserId: UserId
  }
  
  trait SharedImagePermissions extends js.Object {
    /**
      * Describes the permissions for a shared image.
      */
    var imagePermissions: ImagePermissions
    /**
      * The 12-digit identifier of the AWS account with which the image is shared.
      */
    var sharedAccountId: AwsAccountId
  }
  
  trait Stack extends js.Object {
    /**
      * The persistent application settings for users of the stack.
      */
    var ApplicationSettings: js.UndefOr[ApplicationSettingsResponse] = js.undefined
    /**
      * The ARN of the stack.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time the stack was created.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[String] = js.undefined
    /**
      * The stack name to display.
      */
    var DisplayName: js.UndefOr[String] = js.undefined
    /**
      * The URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
      */
    var FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined
    /**
      * The name of the stack.
      */
    var Name: String
    /**
      * The URL that users are redirected to after their streaming session ends.
      */
    var RedirectURL: js.UndefOr[RedirectURL] = js.undefined
    /**
      * The errors for the stack.
      */
    var StackErrors: js.UndefOr[StackErrors] = js.undefined
    /**
      * The storage connectors to enable.
      */
    var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
    /**
      * The actions that are enabled or disabled for users during their streaming sessions. By default these actions are enabled.
      */
    var UserSettings: js.UndefOr[UserSettingList] = js.undefined
  }
  
  trait StackError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[StackErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
  }
  
  trait StartFleetRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var Name: String
  }
  
  trait StartFleetResult extends js.Object
  
  trait StartImageBuilderRequest extends js.Object {
    /**
      * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
      */
    var AppstreamAgentVersion: js.UndefOr[AppstreamAgentVersion] = js.undefined
    /**
      * The name of the image builder.
      */
    var Name: String
  }
  
  trait StartImageBuilderResult extends js.Object {
    /**
      * Information about the image builder.
      */
    var ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
  }
  
  trait StopFleetRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var Name: String
  }
  
  trait StopFleetResult extends js.Object
  
  trait StopImageBuilderRequest extends js.Object {
    /**
      * The name of the image builder.
      */
    var Name: String
  }
  
  trait StopImageBuilderResult extends js.Object {
    /**
      * Information about the image builder.
      */
    var ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
  }
  
  trait StorageConnector extends js.Object {
    /**
      * The type of storage connector.
      */
    var ConnectorType: StorageConnectorType
    /**
      * The names of the domains for the account.
      */
    var Domains: js.UndefOr[DomainList] = js.undefined
    /**
      * The ARN of the storage connector.
      */
    var ResourceIdentifier: js.UndefOr[ResourceIdentifier] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var ResourceArn: Arn
    /**
      * The tags to associate. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  If you do not specify a value, the value is set to an empty string.
      */
    var Tags: Tags
  }
  
  trait TagResourceResponse extends js.Object
  
  trait Tags
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates the specified fleet with the specified stack.
      */
    def associateFleet(): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified fleet with the specified stack.
      */
    def associateFleet(params: AssociateFleetRequest): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateFleet(
      params: AssociateFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
      */
    def batchAssociateUserStack(): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchAssociateUserStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchAssociateUserStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified users with the specified stacks. Users in a user pool cannot be assigned to stacks with fleets that are joined to an Active Directory domain.
      */
    def batchAssociateUserStack(params: BatchAssociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchAssociateUserStack(
      params: BatchAssociateUserStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchAssociateUserStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchAssociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified users from the specified stacks.
      */
    def batchDisassociateUserStack(): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDisassociateUserStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDisassociateUserStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified users from the specified stacks.
      */
    def batchDisassociateUserStack(params: BatchDisassociateUserStackRequest): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDisassociateUserStack(
      params: BatchDisassociateUserStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDisassociateUserStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDisassociateUserStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
      */
    def copyImage(): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Copies the image within the same region or to a new region within the same AWS account. Note that any tags you added to the image will not be copied.
      */
    def copyImage(params: CopyImageRequest): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyImage(
      params: CopyImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyImageResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyImageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def createDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDirectoryConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def createDirectoryConfig(params: CreateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDirectoryConfig(
      params: CreateDirectoryConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a fleet. A fleet consists of streaming instances that run a specified image.
      */
    def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a fleet. A fleet consists of streaming instances that run a specified image.
      */
    def createFleet(params: CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      params: CreateFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
      */
    def createImageBuilder(): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImageBuilder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an image builder. An image builder is a virtual machine that is used to create an image. The initial state of the builder is PENDING. When it is ready, the state is RUNNING.
      */
    def createImageBuilder(params: CreateImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImageBuilder(
      params: CreateImageBuilderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a URL to start an image builder streaming session.
      */
    def createImageBuilderStreamingURL(): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImageBuilderStreamingURL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImageBuilderStreamingURLResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a URL to start an image builder streaming session.
      */
    def createImageBuilderStreamingURL(params: CreateImageBuilderStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createImageBuilderStreamingURL(
      params: CreateImageBuilderStreamingURLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateImageBuilderStreamingURLResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateImageBuilderStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
      */
    def createStack(): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack to start streaming applications to users. A stack consists of an associated fleet, user access policies, and storage configurations. 
      */
    def createStack(params: CreateStackRequest): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      params: CreateStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
      */
    def createStreamingURL(): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingURL(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingURLResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a temporary URL to start an AppStream 2.0 streaming session for the specified user. A streaming URL enables application streaming to be tested without user setup. 
      */
    def createStreamingURL(params: CreateStreamingURLRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingURL(
      params: CreateStreamingURLRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingURLResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingURLResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new user in the user pool.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new user in the user pool.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def deleteDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDirectoryConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified Directory Config object from AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def deleteDirectoryConfig(params: DeleteDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDirectoryConfig(
      params: DeleteDirectoryConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified fleet.
      */
    def deleteFleet(): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified fleet.
      */
    def deleteFleet(params: DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      params: DeleteFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
      */
    def deleteImage(): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image. You cannot delete an image when it is in use. After you delete an image, you cannot provision new capacity using the image.
      */
    def deleteImage(params: DeleteImageRequest): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImage(
      params: DeleteImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image builder and releases the capacity.
      */
    def deleteImageBuilder(): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImageBuilder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image builder and releases the capacity.
      */
    def deleteImageBuilder(params: DeleteImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImageBuilder(
      params: DeleteImageBuilderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
      */
    def deleteImagePermissions(): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImagePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes permissions for the specified private image. After you delete permissions for an image, AWS accounts to which you previously granted these permissions can no longer use the image.
      */
    def deleteImagePermissions(params: DeleteImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImagePermissions(
      params: DeleteImagePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
      */
    def deleteStack(): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified stack. After the stack is deleted, the application streaming environment provided by the stack is no longer available to users. Also, any reservations made for application streaming sessions for the stack are released.
      */
    def deleteStack(params: DeleteStackRequest): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      params: DeleteStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user from the user pool.
      */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a user from the user pool.
      */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
      */
    def describeDirectoryConfigs(): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDirectoryConfigs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDirectoryConfigsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified Directory Config objects for AppStream 2.0, if the names for these objects are provided. Otherwise, all Directory Config objects in the account are described. These objects include the information required to join streaming instances to an Active Directory domain.  Although the response syntax in this topic includes the account password, this password is not returned in the actual response.
      */
    def describeDirectoryConfigs(params: DescribeDirectoryConfigsRequest): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDirectoryConfigs(
      params: DescribeDirectoryConfigsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDirectoryConfigsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDirectoryConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
      */
    def describeFleets(): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified fleets, if the fleet names are provided. Otherwise, all fleets in the account are described.
      */
    def describeFleets(params: DescribeFleetsRequest): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleets(
      params: DescribeFleetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
      */
    def describeImageBuilders(): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImageBuilders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImageBuildersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified image builders, if the image builder names are provided. Otherwise, all image builders in the account are described.
      */
    def describeImageBuilders(params: DescribeImageBuildersRequest): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImageBuilders(
      params: DescribeImageBuildersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImageBuildersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImageBuildersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
      */
    def describeImagePermissions(): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImagePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the permissions for shared AWS account IDs on a private image that you own. 
      */
    def describeImagePermissions(params: DescribeImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImagePermissions(
      params: DescribeImagePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
      */
    def describeImages(): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified images, if the image names or image ARNs are provided. Otherwise, all images in the account are described.
      */
    def describeImages(params: DescribeImagesRequest): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeImages(
      params: DescribeImagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
      */
    def describeSessions(): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSessionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the active streaming sessions for a specified stack and fleet. If a value for UserId is provided for the stack and fleet, only streaming sessions for that user are described. If an authentication type is not provided, the default is to authenticate users using a streaming URL.
      */
    def describeSessions(params: DescribeSessionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSessions(
      params: DescribeSessionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSessionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSessionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
      */
    def describeStacks(): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified stacks, if the stack names are provided. Otherwise, all stacks in the account are described.
      */
    def describeStacks(params: DescribeStacksRequest): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      params: DescribeStacksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
      */
    def describeUserStackAssociations(): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserStackAssociations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserStackAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the UserStackAssociation objects. You must specify either or both of the following:   The stack name   The user name (email address of the user associated with the stack) and the authentication type for the user  
      */
    def describeUserStackAssociations(params: DescribeUserStackAssociationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUserStackAssociations(
      params: DescribeUserStackAssociationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUserStackAssociationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUserStackAssociationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified users in the user pool.
      */
    def describeUsers(): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUsersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified users in the user pool.
      */
    def describeUsers(params: DescribeUsersRequest): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUsers(
      params: DescribeUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUsersResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUsersResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
      */
    def disableUser(): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables the specified user in the user pool. Users can't sign in to AppStream 2.0 until they are re-enabled. This action does not delete the user. 
      */
    def disableUser(params: DisableUserRequest): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableUser(
      params: DisableUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified fleet from the specified stack.
      */
    def disassociateFleet(): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified fleet from the specified stack.
      */
    def disassociateFleet(params: DisassociateFleetRequest): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateFleet(
      params: DisassociateFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
      */
    def enableUser(): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables a user in the user pool. After being enabled, users can sign in to AppStream 2.0 and open applications from the stacks to which they are assigned.
      */
    def enableUser(params: EnableUserRequest): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableUser(
      params: EnableUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableUserResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableUserResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Immediately stops the specified streaming session.
      */
    def expireSession(): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def expireSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExpireSessionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Immediately stops the specified streaming session.
      */
    def expireSession(params: ExpireSessionRequest): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def expireSession(
      params: ExpireSessionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExpireSessionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExpireSessionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the name of the fleet that is associated with the specified stack.
      */
    def listAssociatedFleets(): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociatedFleets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociatedFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the name of the fleet that is associated with the specified stack.
      */
    def listAssociatedFleets(params: ListAssociatedFleetsRequest): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociatedFleets(
      params: ListAssociatedFleetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociatedFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociatedFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the name of the stack with which the specified fleet is associated.
      */
    def listAssociatedStacks(): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociatedStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociatedStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the name of the stack with which the specified fleet is associated.
      */
    def listAssociatedStacks(params: ListAssociatedStacksRequest): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAssociatedStacks(
      params: ListAssociatedStacksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAssociatedStacksResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAssociatedStacksResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
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
      * Retrieves a list of all tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified fleet.
      */
    def startFleet(): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified fleet.
      */
    def startFleet(params: StartFleetRequest): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFleet(
      params: StartFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified image builder.
      */
    def startImageBuilder(): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImageBuilder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified image builder.
      */
    def startImageBuilder(params: StartImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startImageBuilder(
      params: StartImageBuilderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the specified fleet.
      */
    def stopFleet(): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopFleet(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopFleetResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the specified fleet.
      */
    def stopFleet(params: StopFleetRequest): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopFleet(
      params: StopFleetRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopFleetResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the specified image builder.
      */
    def stopImageBuilder(): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopImageBuilder(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops the specified image builder.
      */
    def stopImageBuilder(params: StopImageBuilderRequest): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopImageBuilder(
      params: StopImageBuilderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopImageBuilderResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopImageBuilderResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images, fleets, and stacks. Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this operation updates its value. To list the current tags for your resources, use ListTagsForResource. To disassociate tags from your resources, use UntagResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates one or more specified tags from the specified AppStream 2.0 resource. To list the current tags for your resources, use ListTagsForResource. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Developer Guide.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def updateDirectoryConfig(): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDirectoryConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified Directory Config object in AppStream 2.0. This object includes the information required to join streaming instances to an Active Directory domain.
      */
    def updateDirectoryConfig(params: UpdateDirectoryConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDirectoryConfig(
      params: UpdateDirectoryConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDirectoryConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDirectoryConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
      */
    def updateFleet(): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified fleet. If the fleet is in the STOPPED state, you can update any attribute except the fleet name. If the fleet is in the RUNNING state, you can update the DisplayName and ComputeCapacity attributes. If the fleet is in the STARTING or STOPPING state, you can't update it.
      */
    def updateFleet(params: UpdateFleetRequest): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleet(
      params: UpdateFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates permissions for the specified private image. 
      */
    def updateImagePermissions(): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateImagePermissions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or updates permissions for the specified private image. 
      */
    def updateImagePermissions(params: UpdateImagePermissionsRequest): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateImagePermissions(
      params: UpdateImagePermissionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateImagePermissionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateImagePermissionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified fields for the specified stack.
      */
    def updateStack(): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the specified fields for the specified stack.
      */
    def updateStack(params: UpdateStackRequest): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      params: UpdateStackRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_fleetStarted(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_fleetStarted(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the fleetStarted state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_fleetStarted(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
      params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_fleetStarted(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStarted,
      params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_fleetStopped(state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_fleetStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the fleetStopped state by periodically calling the underlying AppStream.describeFleetsoperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_fleetStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
      params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_fleetStopped(
      state: awsDashSdkLib.awsDashSdkLibStrings.fleetStopped,
      params: DescribeFleetsRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the resource.
      */
    var ResourceArn: Arn
    /**
      * The tag keys for the tags to disassociate.
      */
    var TagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateDirectoryConfigRequest extends js.Object {
    /**
      * The name of the Directory Config object.
      */
    var DirectoryName: DirectoryName
    /**
      * The distinguished names of the organizational units for computer accounts.
      */
    var OrganizationalUnitDistinguishedNames: js.UndefOr[OrganizationalUnitDistinguishedNamesList] = js.undefined
    /**
      * The credentials for the service account used by the streaming instance to connect to the directory.
      */
    var ServiceAccountCredentials: js.UndefOr[ServiceAccountCredentials] = js.undefined
  }
  
  trait UpdateDirectoryConfigResult extends js.Object {
    /**
      * Information about the Directory Config object.
      */
    var DirectoryConfig: js.UndefOr[DirectoryConfig] = js.undefined
  }
  
  trait UpdateFleetRequest extends js.Object {
    /**
      * The fleet attributes to delete.
      */
    var AttributesToDelete: js.UndefOr[FleetAttributes] = js.undefined
    /**
      * The desired capacity for the fleet.
      */
    var ComputeCapacity: js.UndefOr[ComputeCapacity] = js.undefined
    /**
      * Deletes the VPC association for the specified fleet.
      */
    var DeleteVpcConfig: js.UndefOr[Boolean] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The time after disconnection when a session is considered to have ended, in seconds. If a user who was disconnected reconnects within this time interval, the user is connected to their previous session. Specify a value between 60 and 360000. By default, the value is 900 seconds (15 minutes).
      */
    var DisconnectTimeoutInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * The fleet name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The name of the directory and organizational unit (OU) to use to join the fleet to a Microsoft Active Directory domain. 
      */
    var DomainJoinInfo: js.UndefOr[DomainJoinInfo] = js.undefined
    /**
      * Enables or disables default internet access for the fleet.
      */
    var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The ARN of the public, private, or shared image to use.
      */
    var ImageArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the image used to create the fleet.
      */
    var ImageName: js.UndefOr[String] = js.undefined
    /**
      * The instance type to use when launching fleet instances. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
      */
    var InstanceType: js.UndefOr[String] = js.undefined
    /**
      * The maximum time that a streaming session can run, in seconds. Specify a value between 600 and 360000. By default, the value is 900 seconds (15 minutes).
      */
    var MaxUserDurationInSeconds: js.UndefOr[Integer] = js.undefined
    /**
      * A unique name for the fleet.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The VPC configuration for the fleet.
      */
    var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  trait UpdateFleetResult extends js.Object {
    /**
      * Information about the fleet.
      */
    var Fleet: js.UndefOr[Fleet] = js.undefined
  }
  
  trait UpdateImagePermissionsRequest extends js.Object {
    /**
      * The permissions for the image.
      */
    var ImagePermissions: ImagePermissions
    /**
      * The name of the private image.
      */
    var Name: Name
    /**
      * The 12-digit identifier of the AWS account for which you want add or update image permissions.
      */
    var SharedAccountId: AwsAccountId
  }
  
  trait UpdateImagePermissionsResult extends js.Object
  
  trait UpdateStackRequest extends js.Object {
    /**
      * The persistent application settings for users of a stack. When these settings are enabled, changes that users make to applications and Windows settings are automatically saved after each session and applied to the next session.
      */
    var ApplicationSettings: js.UndefOr[ApplicationSettings] = js.undefined
    /**
      * The stack attributes to delete.
      */
    var AttributesToDelete: js.UndefOr[StackAttributes] = js.undefined
    /**
      * Deletes the storage connectors currently enabled for the stack.
      */
    var DeleteStorageConnectors: js.UndefOr[Boolean] = js.undefined
    /**
      * The description to display.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The stack name to display.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * The URL that users are redirected to after they choose the Send Feedback link. If no URL is specified, no Send Feedback link is displayed.
      */
    var FeedbackURL: js.UndefOr[FeedbackURL] = js.undefined
    /**
      * The name of the stack.
      */
    var Name: String
    /**
      * The URL that users are redirected to after their streaming session ends.
      */
    var RedirectURL: js.UndefOr[RedirectURL] = js.undefined
    /**
      * The storage connectors to enable.
      */
    var StorageConnectors: js.UndefOr[StorageConnectorList] = js.undefined
    /**
      * The actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled.
      */
    var UserSettings: js.UndefOr[UserSettingList] = js.undefined
  }
  
  trait UpdateStackResult extends js.Object {
    /**
      * Information about the stack.
      */
    var Stack: js.UndefOr[Stack] = js.undefined
  }
  
  trait User extends js.Object {
    /**
      * The ARN of the user.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The authentication type for the user.
      */
    var AuthenticationType: AuthenticationType
    /**
      * The date and time the user was created in the user pool.
      */
    var CreatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Specifies whether the user in the user pool is enabled.
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The first name, or given name, of the user.
      */
    var FirstName: js.UndefOr[UserAttributeValue] = js.undefined
    /**
      * The last name, or surname, of the user.
      */
    var LastName: js.UndefOr[UserAttributeValue] = js.undefined
    /**
      * The status of the user in the user pool. The status can be one of the following:   UNCONFIRMED – The user is created but not confirmed.   CONFIRMED – The user is confirmed.   ARCHIVED – The user is no longer active.   COMPROMISED – The user is disabled because of a potential security threat.   UNKNOWN – The user status is not known.  
      */
    var Status: js.UndefOr[String] = js.undefined
    /**
      * The email address of the user.
      */
    var UserName: js.UndefOr[Username] = js.undefined
  }
  
  trait UserSetting extends js.Object {
    /**
      * The action that is enabled or disabled.
      */
    var Action: Action
    /**
      * Indicates whether the action is enabled or disabled.
      */
    var Permission: Permission
  }
  
  trait UserStackAssociation extends js.Object {
    /**
      * The authentication type for the user.
      */
    var AuthenticationType: AuthenticationType
    /**
      * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
      */
    var SendEmailNotification: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the stack that is associated with the user.
      */
    var StackName: String
    /**
      * The email address of the user who is associated with the stack.
      */
    var UserName: Username
  }
  
  trait UserStackAssociationError extends js.Object {
    /**
      * The error code for the error that is returned when a user can’t be associated with or disassociated from a stack.
      */
    var ErrorCode: js.UndefOr[UserStackAssociationErrorCode] = js.undefined
    /**
      * The error message for the error that is returned when a user can’t be associated with or disassociated from a stack.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
      * Information about the user and associated stack.
      */
    var UserStackAssociation: js.UndefOr[UserStackAssociation] = js.undefined
  }
  
  trait VpcConfig extends js.Object {
    /**
      * The identifiers of the security groups for the fleet or image builder.
      */
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
    /**
      * The identifiers of the subnets to which a network interface is attached from the fleet instance or image builder instance. Fleet instances use one or two subnets. Image builder instances use one subnet.
      */
    var SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AccountName = java.lang.String
  type AccountPassword = java.lang.String
  type Action = awsDashSdkLib.awsDashSdkLibStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE | awsDashSdkLib.awsDashSdkLibStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE | awsDashSdkLib.awsDashSdkLibStrings.FILE_UPLOAD | awsDashSdkLib.awsDashSdkLibStrings.FILE_DOWNLOAD | awsDashSdkLib.awsDashSdkLibStrings.PRINTING_TO_LOCAL_DEVICE | java.lang.String
  type Applications = js.Array[Application]
  type AppstreamAgentVersion = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[Arn]
  type AuthenticationType = awsDashSdkLib.awsDashSdkLibStrings.API | awsDashSdkLib.awsDashSdkLibStrings.SAML | awsDashSdkLib.awsDashSdkLibStrings.USERPOOL | java.lang.String
  type AwsAccountId = java.lang.String
  type AwsAccountIdList = js.Array[AwsAccountId]
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DescribeImagesMaxResults = scala.Double
  type Description = java.lang.String
  type DirectoryConfigList = js.Array[DirectoryConfig]
  type DirectoryName = java.lang.String
  type DirectoryNameList = js.Array[DirectoryName]
  type DisplayName = java.lang.String
  type Domain = java.lang.String
  type DomainList = js.Array[Domain]
  type FeedbackURL = java.lang.String
  type FleetAttribute = awsDashSdkLib.awsDashSdkLibStrings.VPC_CONFIGURATION | awsDashSdkLib.awsDashSdkLibStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_INFO | java.lang.String
  type FleetAttributes = js.Array[FleetAttribute]
  type FleetErrorCode = awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION | awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION | awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION | awsDashSdkLib.awsDashSdkLibStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVICE_ERROR | awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_IS_MISSING | awsDashSdkLib.awsDashSdkLibStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES | awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION | awsDashSdkLib.awsDashSdkLibStrings.SUBNET_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.IMAGE_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.INVALID_SUBNET_CONFIGURATION | awsDashSdkLib.awsDashSdkLibStrings.SECURITY_GROUPS_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.IGW_NOT_ATTACHED | awsDashSdkLib.awsDashSdkLibStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_MORE_DATA | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED | awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR | java.lang.String
  type FleetErrors = js.Array[FleetError]
  type FleetList = js.Array[Fleet]
  type FleetState = awsDashSdkLib.awsDashSdkLibStrings.STARTING | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | java.lang.String
  type FleetType = awsDashSdkLib.awsDashSdkLibStrings.ALWAYS_ON | awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND | java.lang.String
  type ImageBuilderList = js.Array[ImageBuilder]
  type ImageBuilderState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.UPDATING_AGENT | awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.STOPPING | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | awsDashSdkLib.awsDashSdkLibStrings.REBOOTING | awsDashSdkLib.awsDashSdkLibStrings.SNAPSHOTTING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type ImageBuilderStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.IMAGE_UNAVAILABLE | java.lang.String
  type ImageList = js.Array[Image]
  type ImageState = awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.COPYING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | java.lang.String
  type ImageStateChangeReasonCode = awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | awsDashSdkLib.awsDashSdkLibStrings.IMAGE_BUILDER_NOT_AVAILABLE | awsDashSdkLib.awsDashSdkLibStrings.IMAGE_COPY_FAILURE | java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxResults = scala.Double
  type MessageAction = awsDashSdkLib.awsDashSdkLibStrings.SUPPRESS | awsDashSdkLib.awsDashSdkLibStrings.RESEND | java.lang.String
  type Name = java.lang.String
  type OrganizationalUnitDistinguishedName = java.lang.String
  type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]
  type Permission = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type PlatformType = awsDashSdkLib.awsDashSdkLibStrings.WINDOWS | java.lang.String
  type RedirectURL = java.lang.String
  type RegionName = java.lang.String
  type ResourceErrors = js.Array[ResourceError]
  type ResourceIdentifier = java.lang.String
  type SecurityGroupIdList = js.Array[String]
  type SessionConnectionState = awsDashSdkLib.awsDashSdkLibStrings.CONNECTED | awsDashSdkLib.awsDashSdkLibStrings.NOT_CONNECTED | java.lang.String
  type SessionList = js.Array[Session]
  type SessionState = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | java.lang.String
  type SettingsGroup = java.lang.String
  type SharedImagePermissionsList = js.Array[SharedImagePermissions]
  type StackAttribute = awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTORS | awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_HOMEFOLDERS | awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE | awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_ONE_DRIVE | awsDashSdkLib.awsDashSdkLibStrings.REDIRECT_URL | awsDashSdkLib.awsDashSdkLibStrings.FEEDBACK_URL | awsDashSdkLib.awsDashSdkLibStrings.THEME_NAME | awsDashSdkLib.awsDashSdkLibStrings.USER_SETTINGS | java.lang.String
  type StackAttributes = js.Array[StackAttribute]
  type StackErrorCode = awsDashSdkLib.awsDashSdkLibStrings.STORAGE_CONNECTOR_ERROR | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_SERVICE_ERROR | java.lang.String
  type StackErrors = js.Array[StackError]
  type StackList = js.Array[Stack]
  type StorageConnectorList = js.Array[StorageConnector]
  type StorageConnectorType = awsDashSdkLib.awsDashSdkLibStrings.HOMEFOLDERS | awsDashSdkLib.awsDashSdkLibStrings.GOOGLE_DRIVE | awsDashSdkLib.awsDashSdkLibStrings.ONE_DRIVE | java.lang.String
  type StreamingUrlUserId = java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type SubnetIdList = js.Array[String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Timestamp = stdLib.Date
  type UserAttributeValue = java.lang.String
  type UserId = java.lang.String
  type UserList = js.Array[User]
  type UserSettingList = js.Array[UserSetting]
  type UserStackAssociationErrorCode = awsDashSdkLib.awsDashSdkLibStrings.STACK_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.USER_NAME_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_ERROR | java.lang.String
  type UserStackAssociationErrorList = js.Array[UserStackAssociationError]
  type UserStackAssociationList = js.Array[UserStackAssociation]
  type Username = java.lang.String
  type VisibilityType = awsDashSdkLib.awsDashSdkLibStrings.PUBLIC | awsDashSdkLib.awsDashSdkLibStrings.PRIVATE | awsDashSdkLib.awsDashSdkLibStrings.SHARED | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-12-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

