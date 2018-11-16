package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/serverlessapplicationrepository", "ServerlessApplicationRepository")
@js.native
object ServerlessApplicationRepositoryNs extends js.Object {
  
  trait ApplicationPolicyStatement extends js.Object {
    /**
         * See Application Permissions for the list of supported actions.
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
     The file is of the format file://&lt;path>/&lt;filename>.Maximum size 5 MBNote: Only one of licenseBody and licenseUrl can be specified, otherwise an error will result.
         */
    var LicenseBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your application.Maximum size 5 MBNote: Only one of licenseBody and licenseUrl can be specified, otherwise an error will result.
         */
    var LicenseUrl: js.UndefOr[__string] = js.undefined
    /**
         * The name of the application that you want to publish.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
         */
    var Name: __string
    /**
         * A local text readme file in Markdown language that contains a more detailed description of the application and how it works.
     The file is of the format file://&lt;path>/&lt;filename>.Maximum size 5 MBNote: Only one of readmeBody and readmeUrl can be specified, otherwise an error will result.
         */
    var ReadmeBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MBNote: Only one of readmeBody and readmeUrl can be specified, otherwise an error will result.
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
     The file is of the format file://&lt;path>/&lt;filename>.Note: Only one of templateBody and templateUrl can be specified, otherwise an error will result.
         */
    var TemplateBody: js.UndefOr[__string] = js.undefined
    /**
         * A link to the S3 object cotaining the packaged AWS SAM template of your application.Note: Only one of templateBody and templateUrl can be specified, otherwise an error will result.
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
         * A list of parameter values for the parameters of the application.
         */
    var ParameterOverrides: js.UndefOr[__listOfParameterValue] = js.undefined
    /**
         * The semantic version of the application:
     https://semver.org/
     
         */
    var SemanticVersion: js.UndefOr[__string] = js.undefined
    /**
         * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates
     the change set by comparing this stack's information with the information that you submit, such as a modified
     template or different parameter input values. Constraints: Minimum length of 1.Pattern: ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
         */
    var StackName: __string
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
       * Sets the permission policy for an application. See
     Application Permissions
     for the list of supported actions that can be used with this operation.
       */
    def putApplicationPolicy(): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. See
     Application Permissions
     for the list of supported actions that can be used with this operation.
       */
    def putApplicationPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutApplicationPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. See
     Application Permissions
     for the list of supported actions that can be used with this operation.
       */
    def putApplicationPolicy(params: PutApplicationPolicyRequest): awsDashSdkLib.libRequestMod.Request[PutApplicationPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sets the permission policy for an application. See
     Application Permissions
     for the list of supported actions that can be used with this operation.
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
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type MaxItems = scala.Double
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfApplicationPolicyStatement = js.Array[ApplicationPolicyStatement]
  type __listOfApplicationSummary = js.Array[ApplicationSummary]
  type __listOfParameterDefinition = js.Array[ParameterDefinition]
  type __listOfParameterValue = js.Array[ParameterValue]
  type __listOfVersionSummary = js.Array[VersionSummary]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-09-08` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

