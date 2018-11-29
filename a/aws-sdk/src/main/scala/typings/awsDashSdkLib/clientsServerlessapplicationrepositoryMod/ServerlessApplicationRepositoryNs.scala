package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/serverlessapplicationrepository", "ServerlessApplicationRepository")
@js.native
object ServerlessApplicationRepositoryNs extends js.Object {
  
  trait ApplicationDependencySummary extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the nested application.
         */
    var ApplicationId: __string
    /**
         * The semantic version of the nested application.
         */
    var SemanticVersion: __string
  }
  
  
  trait ApplicationPolicyStatement extends js.Object {
    /**
         * For the list of actions supported for this operation, see Application 
     Permissions.
         */
    var Actions: __listOf__string
    /**
         * An AWS account ID, or * to make the application public.
         */
    var Principals: __listOf__string
    /**
         * A unique ID for the statement.
         */
    var StatementId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ApplicationSummary extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: __string
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: __string
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: __string
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: __string
    /**
         * A valid identifier from https://spdx.org/licenses/.
         */
    var SpdxLicenseId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateApplicationRequest extends js.Object {
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: __string
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: __string
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
     The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
         */
    var LicenseBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your application.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
         */
    var LicenseUrl: js.UndefOr[__string] = js.undefined
    /**
         * The name of the application that you want to publish.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: __string
    /**
         * A local text readme file in Markdown language that contains a more detailed description of the application and how it works.
     The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
         */
    var ReadmeBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
         */
    var ReadmeUrl: js.UndefOr[__string] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * A link to a public repository for the source code of your application.
         */
    var SourceCodeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A valid identifier from https://spdx.org/licenses/.
         */
    var SpdxLicenseId: js.UndefOr[__string] = js.undefined
    /**
         * The local raw packaged AWS SAM template file of your application.
     The file has the format file://&lt;path>/&lt;filename>.You can specify only one of templateBody and templateUrl; otherwise an error results.
         */
    var TemplateBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object containing the packaged AWS SAM template of your application.You can specify only one of templateBody and templateUrl; otherwise an error results.
         */
    var TemplateUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateApplicationResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
         */
    var LicenseUrl: js.UndefOr[__string] = js.undefined
    /**
         * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
         */
    var ReadmeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A valid identifier from https://spdx.org/licenses/.
         */
    var SpdxLicenseId: js.UndefOr[__string] = js.undefined
    /**
         * Version information about the application.
         */
    var Version: js.UndefOr[Version] = js.undefined
  }
  
  
  trait CreateApplicationVersionRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The semantic version of the new version.
         */
    var SemanticVersion: __string
    /**
         * A link to a public repository for the source code of your application.
         */
    var SourceCodeUrl: js.UndefOr[__string] = js.undefined
    /**
         * The raw packaged AWS SAM template of your application.
         */
    var TemplateBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the packaged AWS SAM template of your application.
         */
    var TemplateUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateApplicationVersionResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * An array of parameter types supported by the application.
         */
    var ParameterDefinitions: js.UndefOr[__listOfParameterDefinition] = js.undefined
    /**
         * A list of values that you must specify before you can deploy certain applications.
     Some applications might include resources that can affect permissions in your AWS
     account, for example, by creating new AWS Identity and Access Management (IAM) users.
     For those applications, you must explicitly acknowledge their capabilities by
     specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
     and CAPABILITY_RESOURCE_POLICY.The following resources require you to specify CAPABILITY_IAM or
     CAPABILITY_NAMED_IAM:
     AWS::IAM::Group,
     AWS::IAM::InstanceProfile,
     AWS::IAM::Policy, and
     AWS::IAM::Role.
     If the application contains IAM resources, you can specify either CAPABILITY_IAM
     or CAPABILITY_NAMED_IAM. If the application contains IAM resources
     with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
     AWS::Lambda::Permission,
     AWS::IAM:Policy,
     AWS::ApplicationAutoScaling::ScalingPolicy,
     AWS::S3::BucketPolicy,
     AWS::SQS::QueuePolicy, and
     AWS::SNS::TopicPolicy.If your application template contains any of the above resources, we recommend that you review
     all permissions associated with the application before deploying. If you don't specify
     this parameter for an application that requires capabilities, the call will fail.Valid values: CAPABILITY_IAM | CAPABILITY_NAMED_IAM | CAPABILITY_RESOURCE_POLICY
     
         */
    var RequiredCapabilities: js.UndefOr[__listOfCapability] = js.undefined
    /**
         * Whether all of the AWS resources contained in this application are supported in the region
     in which it is being retrieved.
         */
    var ResourcesSupported: js.UndefOr[__boolean] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * A link to a public repository for the source code of your application.
         */
    var SourceCodeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A link to the packaged AWS SAM template of your application.
         */
    var TemplateUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateCloudFormationChangeSetRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * A list of values that you must specify before you can deploy certain applications.
     Some applications might include resources that can affect permissions in your AWS
     account, for example, by creating new AWS Identity and Access Management (IAM) users.
     For those applications, you must explicitly acknowledge their capabilities by
     specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
     and CAPABILITY_RESOURCE_POLICY.The following resources require you to specify CAPABILITY_IAM or
     CAPABILITY_NAMED_IAM:
     AWS::IAM::Group,
     AWS::IAM::InstanceProfile,
     AWS::IAM::Policy, and
     AWS::IAM::Role.
     If the application contains IAM resources, you can specify either CAPABILITY_IAM
     or CAPABILITY_NAMED_IAM. If the application contains IAM resources
     with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
     AWS::Lambda::Permission,
     AWS::IAM:Policy,
     AWS::ApplicationAutoScaling::ScalingPolicy,
     AWS::S3::BucketPolicy,
     AWS::SQS::QueuePolicy, and
     AWS::SNS:TopicPolicy.If your application template contains any of the above resources, we recommend that you review
     all permissions associated with the application before deploying. If you don't specify
     this parameter for an application that requires capabilities, the call will fail.Valid values: CAPABILITY_IAM | CAPABILITY_NAMED_IAM | CAPABILITY_RESOURCE_POLICY
     
         */
    var Capabilities: js.UndefOr[__listOf__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var ChangeSetName: js.UndefOr[__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var ClientToken: js.UndefOr[__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var NotificationArns: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A list of parameter values for the parameters of the application.
         */
    var ParameterOverrides: js.UndefOr[__listOfParameterValue] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var ResourceTypes: js.UndefOr[__listOf__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var StackName: __string
    /**
         * This property corresponds to the parameter of the same name for the AWS CloudFormation CreateChangeSet API.
         */
    var Tags: js.UndefOr[__listOfTag] = js.undefined
    /**
         * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
         */
    var TemplateId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateCloudFormationChangeSetResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the change set.Length constraints: Minimum length of 1.Pattern: ARN:[-a-zA-Z0-9:/]*
         */
    var ChangeSetId: js.UndefOr[__string] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * The unique ID of the stack.
         */
    var StackId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateCloudFormationTemplateRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateCloudFormationTemplateResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this template expires. Templates
     expire 1 hour after creation.
         */
    var ExpirationTime: js.UndefOr[__string] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
         */
    var Status: js.UndefOr[Status] = js.undefined
    /**
         * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
         */
    var TemplateId: js.UndefOr[__string] = js.undefined
    /**
         * A link to the template that can be used to deploy the application using
     AWS CloudFormation.
         */
    var TemplateUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeleteApplicationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
  }
  
  
  trait GetApplicationPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
  }
  
  
  trait GetApplicationPolicyResponse extends js.Object {
    /**
         * An array of policy statements applied to the application.
         */
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
  }
  
  
  trait GetApplicationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The semantic version of the application to get.
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetApplicationResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
         */
    var LicenseUrl: js.UndefOr[__string] = js.undefined
    /**
         * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
         */
    var ReadmeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A valid identifier from https://spdx.org/licenses/.
         */
    var SpdxLicenseId: js.UndefOr[__string] = js.undefined
    /**
         * Version information about the application.
         */
    var Version: js.UndefOr[Version] = js.undefined
  }
  
  
  trait GetCloudFormationTemplateRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
         */
    var TemplateId: __string
  }
  
  
  trait GetCloudFormationTemplateResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this template expires. Templates
     expire 1 hour after creation.
         */
    var ExpirationTime: js.UndefOr[__string] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * Status of the template creation workflow.Possible values: PREPARING | ACTIVE | EXPIRED
         */
    var Status: js.UndefOr[Status] = js.undefined
    /**
         * The UUID returned by CreateCloudFormationTemplate.Pattern: [0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}
         */
    var TemplateId: js.UndefOr[__string] = js.undefined
    /**
         * A link to the template that can be used to deploy the application using
     AWS CloudFormation.
         */
    var TemplateUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListApplicationDependenciesRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The total number of items to return.
         */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
         * A token to specify where to start paginating.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * The semantic version of the application to get.
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListApplicationDependenciesResponse extends js.Object {
    /**
         * An array of application summaries nested in the application.
         */
    var Dependencies: js.UndefOr[__listOfApplicationDependencySummary] = js.undefined
    /**
         * The token to request the next page of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListApplicationVersionsRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The total number of items to return.
         */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
         * A token to specify where to start paginating.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListApplicationVersionsResponse extends js.Object {
    /**
         * The token to request the next page of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * An array of version summaries for the application.
         */
    var Versions: js.UndefOr[__listOfVersionSummary] = js.undefined
  }
  
  
  trait ListApplicationsRequest extends js.Object {
    /**
         * The total number of items to return.
         */
    var MaxItems: js.UndefOr[MaxItems] = js.undefined
    /**
         * A token to specify where to start paginating.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListApplicationsResponse extends js.Object {
    /**
         * An array of application summaries.
         */
    var Applications: js.UndefOr[__listOfApplicationSummary] = js.undefined
    /**
         * The token to request the next page of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ParameterDefinition extends js.Object {
    /**
         * A regular expression that represents the patterns to allow for String types.
         */
    var AllowedPattern: js.UndefOr[__string] = js.undefined
    /**
         * An array containing the list of values allowed for the parameter.
         */
    var AllowedValues: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A string that explains a constraint when the constraint is violated. For example, without a constraint description,
     a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user
     specifies an invalid value:
     Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
     By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you can display
     the following customized error message:
     Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
     
         */
    var ConstraintDescription: js.UndefOr[__string] = js.undefined
    /**
         * A value of the appropriate type for the template to use if no value is specified when a stack is created.
     If you define constraints for the parameter, you must specify a value that adheres to those constraints.
         */
    var DefaultValue: js.UndefOr[__string] = js.undefined
    /**
         * A string of up to 4,000 characters that describes the parameter.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * An integer value that determines the largest number of characters that you want to allow for String types.
         */
    var MaxLength: js.UndefOr[__integer] = js.undefined
    /**
         * A numeric value that determines the largest numeric value that you want to allow for Number types.
         */
    var MaxValue: js.UndefOr[__integer] = js.undefined
    /**
         * An integer value that determines the smallest number of characters that you want to allow for String types.
         */
    var MinLength: js.UndefOr[__integer] = js.undefined
    /**
         * A numeric value that determines the smallest numeric value that you want to allow for Number types.
         */
    var MinValue: js.UndefOr[__integer] = js.undefined
    /**
         * The name of the parameter.
         */
    var Name: __string
    /**
         * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
     value to true, the parameter value is masked with asterisks (*****).
         */
    var NoEcho: js.UndefOr[__boolean] = js.undefined
    /**
         * A list of AWS SAM resources that use this parameter.
         */
    var ReferencedByResources: __listOf__string
    /**
         * The type of the parameter.Valid values: String | Number | List&lt;Number> | CommaDelimitedList
     
     String: A literal string.For example, users can specify "MyUserName".
     Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use the
     parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a string.For example, users might specify "8888".
     List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the parameter value as numbers. However, when
     you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a list of strings.For example, users might specify "80,20", and then Ref results in ["80","20"].
     CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should be one more than the total number of commas.
     Also, each member string is space-trimmed.For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
         */
    var Type: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ParameterValue extends js.Object {
    /**
         * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation
     uses the default value that is specified in your template.
         */
    var Name: __string
    /**
         * The input value associated with the parameter.
         */
    var Value: __string
  }
  
  
  trait PutApplicationPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * An array of policy statements applied to the application.
         */
    var Statements: __listOfApplicationPolicyStatement
  }
  
  
  trait PutApplicationPolicyResponse extends js.Object {
    /**
         * An array of policy statements applied to the application.
         */
    var Statements: js.UndefOr[__listOfApplicationPolicyStatement] = js.undefined
  }
  
  
  trait RollbackConfiguration extends js.Object {
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration Data Type.
         */
    var MonitoringTimeInMinutes: js.UndefOr[__integer] = js.undefined
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration Data Type.
         */
    var RollbackTriggers: js.UndefOr[__listOfRollbackTrigger] = js.undefined
  }
  
  
  trait RollbackTrigger extends js.Object {
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger Data Type.
         */
    var Arn: __string
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger Data Type.
         */
    var Type: __string
  }
  
  
  trait Tag extends js.Object {
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation Tag Data Type.
         */
    var Key: __string
    /**
         * This property corresponds to the content of the same name for the AWS CloudFormation 
     Tag
     
     Data Type.
         */
    var Value: __string
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
       */
    def createApplication(): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
       */
    def createApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
       */
    def createApplication(params: CreateApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application, optionally including an AWS SAM file to create the first application version in the same call.
       */
    def createApplication(
      params: CreateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application version.
       */
    def createApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application version.
       */
    def createApplicationVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application version.
       */
    def createApplicationVersion(params: CreateApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an application version.
       */
    def createApplicationVersion(
      params: CreateApplicationVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation change set for the given application.
       */
    def createCloudFormationChangeSet(): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation change set for the given application.
       */
    def createCloudFormationChangeSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFormationChangeSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation change set for the given application.
       */
    def createCloudFormationChangeSet(params: CreateCloudFormationChangeSetRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation change set for the given application.
       */
    def createCloudFormationChangeSet(
      params: CreateCloudFormationChangeSetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFormationChangeSetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationChangeSetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation template.
       */
    def createCloudFormationTemplate(): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation template.
       */
    def createCloudFormationTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFormationTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation template.
       */
    def createCloudFormationTemplate(params: CreateCloudFormationTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an AWS CloudFormation template.
       */
    def createCloudFormationTemplate(
      params: CreateCloudFormationTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFormationTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified application.
       */
    def deleteApplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified application.
       */
    def deleteApplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified application.
       */
    def deleteApplication(params: DeleteApplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the specified application.
       */
    def deleteApplication(
      params: DeleteApplicationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified application.
       */
    def getApplication(): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified application.
       */
    def getApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified application.
       */
    def getApplication(params: GetApplicationRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified application.
       */
    def getApplication(
      params: GetApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the policy for the application.
       */
    def getApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the policy for the application.
       */
    def getApplicationPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the policy for the application.
       */
    def getApplicationPolicy(params: GetApplicationPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the policy for the application.
       */
    def getApplicationPolicy(
      params: GetApplicationPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetApplicationPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified AWS CloudFormation template.
       */
    def getCloudFormationTemplate(): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified AWS CloudFormation template.
       */
    def getCloudFormationTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFormationTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified AWS CloudFormation template.
       */
    def getCloudFormationTemplate(params: GetCloudFormationTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the specified AWS CloudFormation template.
       */
    def getCloudFormationTemplate(
      params: GetCloudFormationTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFormationTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFormationTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the list of applications nested in the containing application.
       */
    def listApplicationDependencies(): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the list of applications nested in the containing application.
       */
    def listApplicationDependencies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationDependenciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the list of applications nested in the containing application.
       */
    def listApplicationDependencies(params: ListApplicationDependenciesRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the list of applications nested in the containing application.
       */
    def listApplicationDependencies(
      params: ListApplicationDependenciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationDependenciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationDependenciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists versions for the specified application.
       */
    def listApplicationVersions(): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists versions for the specified application.
       */
    def listApplicationVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists versions for the specified application.
       */
    def listApplicationVersions(params: ListApplicationVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists versions for the specified application.
       */
    def listApplicationVersions(
      params: ListApplicationVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationVersionsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists applications owned by the requester.
       */
    def listApplications(): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists applications owned by the requester.
       */
    def listApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists applications owned by the requester.
       */
    def listApplications(params: ListApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists applications owned by the requester.
       */
    def listApplications(
      params: ListApplicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. For the list of actions supported for this operation, see
     Application 
     Permissions
     .
       */
    def putApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. For the list of actions supported for this operation, see
     Application 
     Permissions
     .
       */
    def putApplicationPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutApplicationPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. For the list of actions supported for this operation, see
     Application 
     Permissions
     .
       */
    def putApplicationPolicy(params: PutApplicationPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. For the list of actions supported for this operation, see
     Application 
     Permissions
     .
       */
    def putApplicationPolicy(
      params: PutApplicationPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutApplicationPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified application.
       */
    def updateApplication(): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified application.
       */
    def updateApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified application.
       */
    def updateApplication(params: UpdateApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the specified application.
       */
    def updateApplication(
      params: UpdateApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateApplicationRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the application.
         */
    var ApplicationId: __string
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: js.UndefOr[__string] = js.undefined
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A text readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
         */
    var ReadmeBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
         */
    var ReadmeUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait UpdateApplicationResponse extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: js.UndefOr[__string] = js.undefined
    /**
         * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
         */
    var Author: js.UndefOr[__string] = js.undefined
    /**
         * The date and time this resource was created.
         */
    var CreationTime: js.UndefOr[__string] = js.undefined
    /**
         * The description of the application.Minimum length=1. Maximum length=256
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * A URL with more information about the application, for example
     the location of your GitHub repository for the application.
         */
    var HomePageUrl: js.UndefOr[__string] = js.undefined
    /**
         * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
         */
    var Labels: js.UndefOr[__listOf__string] = js.undefined
    /**
         * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
         */
    var LicenseUrl: js.UndefOr[__string] = js.undefined
    /**
         * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
         */
    var ReadmeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A valid identifier from https://spdx.org/licenses/.
         */
    var SpdxLicenseId: js.UndefOr[__string] = js.undefined
    /**
         * Version information about the application.
         */
    var Version: js.UndefOr[Version] = js.undefined
  }
  
  
  trait Version extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: __string
    /**
         * The date and time this resource was created.
         */
    var CreationTime: __string
    /**
         * An array of parameter types supported by the application.
         */
    var ParameterDefinitions: __listOfParameterDefinition
    /**
         * A list of values that you must specify before you can deploy certain applications.
     Some applications might include resources that can affect permissions in your AWS
     account, for example, by creating new AWS Identity and Access Management (IAM) users.
     For those applications, you must explicitly acknowledge their capabilities by
     specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
     and CAPABILITY_RESOURCE_POLICY.The following resources require you to specify CAPABILITY_IAM or
     CAPABILITY_NAMED_IAM:
     AWS::IAM::Group,
     AWS::IAM::InstanceProfile,
     AWS::IAM::Policy, and
     AWS::IAM::Role.
     If the application contains IAM resources, you can specify either CAPABILITY_IAM
     or CAPABILITY_NAMED_IAM. If the application contains IAM resources
     with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
     AWS::Lambda::Permission,
     AWS::IAM:Policy,
     AWS::ApplicationAutoScaling::ScalingPolicy,
     AWS::S3::BucketPolicy,
     AWS::SQS::QueuePolicy, and
     AWS::SNS::TopicPolicy.If your application template contains any of the above resources, we recommend that you review
     all permissions associated with the application before deploying. If you don't specify
     this parameter for an application that requires capabilities, the call will fail.Valid values: CAPABILITY_IAM | CAPABILITY_NAMED_IAM | CAPABILITY_RESOURCE_POLICY
     
         */
    var RequiredCapabilities: __listOfCapability
    /**
         * Whether all of the AWS resources contained in this application are supported in the region
     in which it is being retrieved.
         */
    var ResourcesSupported: __boolean
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: __string
    /**
         * A link to a public repository for the source code of your application.
         */
    var SourceCodeUrl: js.UndefOr[__string] = js.undefined
    /**
         * A link to the packaged AWS SAM template of your application.
         */
    var TemplateUrl: __string
  }
  
  
  trait VersionSummary extends js.Object {
    /**
         * The application Amazon Resource Name (ARN).
         */
    var ApplicationId: __string
    /**
         * The date and time this resource was created.
         */
    var CreationTime: __string
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: __string
    /**
         * A link to a public repository for the source code of your application.
         */
    var SourceCodeUrl: js.UndefOr[__string] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Capability = awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_IAM | awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_NAMED_IAM | awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_AUTO_EXPAND | awsDashSdkLib.awsDashSdkLibStrings.CAPABILITY_RESOURCE_POLICY | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type MaxItems = scala.Double
  type Status = awsDashSdkLib.awsDashSdkLibStrings.PREPARING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfApplicationDependencySummary = js.Array[ApplicationDependencySummary]
  type __listOfApplicationPolicyStatement = js.Array[ApplicationPolicyStatement]
  type __listOfApplicationSummary = js.Array[ApplicationSummary]
  type __listOfCapability = js.Array[Capability]
  type __listOfParameterDefinition = js.Array[ParameterDefinition]
  type __listOfParameterValue = js.Array[ParameterValue]
  type __listOfRollbackTrigger = js.Array[RollbackTrigger]
  type __listOfTag = js.Array[Tag]
  type __listOfVersionSummary = js.Array[VersionSummary]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-08` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

