package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension.
    */
  var Arn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * Whether CloudFormation automatically updates the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated. For more information, see Activating public extensions for use in your account in the CloudFormation User Guide.
    */
  var AutoUpdate: js.UndefOr[typings.awsSdk.clientsCloudformationMod.AutoUpdate] = js.undefined
  
  /**
    * A JSON string that represent the current configuration data for the extension in this account and region. To set the configuration data for an extension, use SetTypeConfiguration. For more information, see Configuring extensions at the account level in the CloudFormation User Guide.
    */
  var ConfigurationSchema: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ConfigurationSchema] = js.undefined
  
  /**
    * The ID of the default version of the extension. The default version is used when the extension version isn't specified. This applies only to private extensions you have registered in your account. For public extensions, both those provided by Amazon Web Services and published by third parties, CloudFormation returns null. For more information, see RegisterType. To set the default version of an extension, use  SetTypeDefaultVersion .
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.undefined
  
  /**
    * The deprecation status of the extension version. Valid values include:    LIVE: The extension is activated or registered and can be used in CloudFormation operations, dependent on its provisioning behavior and visibility scope.    DEPRECATED: The extension has been deactivated or deregistered and can no longer be used in CloudFormation operations.   For public third-party extensions, CloudFormation returns null.
    */
  var DeprecatedStatus: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DeprecatedStatus] = js.undefined
  
  /**
    * The description of the extension.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * The URL of a page providing detailed documentation for this extension.
    */
  var DocumentationUrl: js.UndefOr[OptionalSecureUrl] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM execution role used to register the extension. This applies only to private extensions you have registered in your account. For more information, see RegisterType. If the registered extension calls any Amazon Web Services APIs, you must create an  IAM execution role  that includes the necessary permissions to call those Amazon Web Services APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your extension with the appropriate credentials.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Whether the extension is activated in the account and region. This only applies to public third-party extensions. For all other extensions, CloudFormation returns null.
    */
  var IsActivated: js.UndefOr[typings.awsSdk.clientsCloudformationMod.IsActivated] = js.undefined
  
  /**
    * Whether the specified extension version is set as the default version. This applies only to private extensions you have registered in your account, and extensions published by Amazon Web Services. For public third-party extensions, whether they are activated in your account, CloudFormation returns null.
    */
  var IsDefaultVersion: js.UndefOr[typings.awsSdk.clientsCloudformationMod.IsDefaultVersion] = js.undefined
  
  /**
    * When the specified extension version was registered. This applies only to:   Private extensions you have registered in your account. For more information, see RegisterType.   Public extensions you have activated in your account with auto-update specified. For more information, see ActivateType.  
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest version of a public extension that is available for use. This only applies if you specify a public extension, and you don't specify a version. For all other requests, CloudFormation returns null.
    */
  var LatestPublicVersion: js.UndefOr[PublicVersionNumber] = js.undefined
  
  /**
    * Contains logging configuration information for private extensions. This applies only to private extensions you have registered in your account. For public extensions, both those provided by Amazon Web Services and published by third parties, CloudFormation returns null. For more information, see RegisterType.
    */
  var LoggingConfig: js.UndefOr[typings.awsSdk.clientsCloudformationMod.LoggingConfig] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the Amazon Resource Name (ARN) of the public extension.
    */
  var OriginalTypeArn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the type name of the public extension. If you specified a TypeNameAlias when enabling the extension in this account and region, CloudFormation treats that alias as the extension's type name within the account and region, not the type name of the public extension. For more information, see Specifying aliases to refer to extensions in the CloudFormation User Guide.
    */
  var OriginalTypeName: js.UndefOr[TypeName] = js.undefined
  
  /**
    * For resource type extensions, the provisioning behavior of the resource type. CloudFormation determines the provisioning type during registration, based on the types of handlers in the schema handler package submitted. Valid values include:    FULLY_MUTABLE: The resource type includes an update handler to process updates to the type during stack update operations.    IMMUTABLE: The resource type doesn't include an update handler, so the type can't be updated and must instead be replaced during stack update operations.    NON_PROVISIONABLE: The resource type doesn't include all the following handlers, and therefore can't actually be provisioned.   create   read   delete    
    */
  var ProvisioningType: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ProvisioningType] = js.undefined
  
  /**
    * The version number of a public third-party extension. This applies only if you specify a public extension you have activated in your account, or specify a public extension without specifying a version. For all other extensions, CloudFormation returns null.
    */
  var PublicVersionNumber: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublicVersionNumber] = js.undefined
  
  /**
    * The publisher ID of the extension publisher. This applies only to public third-party extensions. For private registered extensions, and extensions provided by Amazon Web Services, CloudFormation returns null.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
  
  /**
    * For extensions that are modules, the public third-party extensions that must be activated in your account in order for the module itself to be activated.
    */
  var RequiredActivatedTypes: js.UndefOr[typings.awsSdk.clientsCloudformationMod.RequiredActivatedTypes] = js.undefined
  
  /**
    * The schema that defines the extension. For more information about extension schemas, see Resource Provider Schema in the CloudFormation CLI User Guide.
    */
  var Schema: js.UndefOr[TypeSchema] = js.undefined
  
  /**
    * The URL of the source code for the extension.
    */
  var SourceUrl: js.UndefOr[OptionalSecureUrl] = js.undefined
  
  /**
    * When the specified private extension version was registered or activated in your account.
    */
  var TimeCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The kind of extension.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the extension. If the extension is a public third-party type you have activated with a type name alias, CloudFormation returns the type name alias. For more information, see ActivateType.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
  
  /**
    * The contract test status of the registered extension version. To return the extension test status of a specific extension version, you must specify VersionId. This applies only to registered private extension versions. CloudFormation doesn't return this information for public extensions, whether they are activated in your account.    PASSED: The extension has passed all its contract tests. An extension must have a test status of PASSED before it can be published. For more information, see Publishing extensions to make them available for public use in the CloudFormation Command Line Interface User Guide.    FAILED: The extension has failed one or more contract tests.    IN_PROGRESS: Contract tests are currently being performed on the extension.    NOT_TESTED: Contract tests haven't been performed on the extension.  
    */
  var TypeTestsStatus: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeTestsStatus] = js.undefined
  
  /**
    * The description of the test status. To return the extension test status of a specific extension version, you must specify VersionId. This applies only to registered private extension versions. CloudFormation doesn't return this information for public extensions, whether they are activated in your account.
    */
  var TypeTestsStatusDescription: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeTestsStatusDescription] = js.undefined
  
  /**
    * The scope at which the extension is visible and usable in CloudFormation operations. Valid values include:    PRIVATE: The extension is only visible and usable within the account in which it is registered. CloudFormation marks any extensions you register as PRIVATE.    PUBLIC: The extension is publicly visible and usable within any Amazon Web Services account.  
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Visibility] = js.undefined
}
object DescribeTypeOutput {
  
  inline def apply(): DescribeTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTypeOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutoUpdate(value: AutoUpdate): Self = StObject.set(x, "AutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "AutoUpdate", js.undefined)
    
    inline def setConfigurationSchema(value: ConfigurationSchema): Self = StObject.set(x, "ConfigurationSchema", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSchemaUndefined: Self = StObject.set(x, "ConfigurationSchema", js.undefined)
    
    inline def setDefaultVersionId(value: TypeVersionId): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    inline def setDeprecatedStatus(value: DeprecatedStatus): Self = StObject.set(x, "DeprecatedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedStatusUndefined: Self = StObject.set(x, "DeprecatedStatus", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDocumentationUrl(value: OptionalSecureUrl): Self = StObject.set(x, "DocumentationUrl", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUrlUndefined: Self = StObject.set(x, "DocumentationUrl", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setIsActivated(value: IsActivated): Self = StObject.set(x, "IsActivated", value.asInstanceOf[js.Any])
    
    inline def setIsActivatedUndefined: Self = StObject.set(x, "IsActivated", js.undefined)
    
    inline def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setLatestPublicVersion(value: PublicVersionNumber): Self = StObject.set(x, "LatestPublicVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestPublicVersionUndefined: Self = StObject.set(x, "LatestPublicVersion", js.undefined)
    
    inline def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "LoggingConfig", value.asInstanceOf[js.Any])
    
    inline def setLoggingConfigUndefined: Self = StObject.set(x, "LoggingConfig", js.undefined)
    
    inline def setOriginalTypeArn(value: TypeArn): Self = StObject.set(x, "OriginalTypeArn", value.asInstanceOf[js.Any])
    
    inline def setOriginalTypeArnUndefined: Self = StObject.set(x, "OriginalTypeArn", js.undefined)
    
    inline def setOriginalTypeName(value: TypeName): Self = StObject.set(x, "OriginalTypeName", value.asInstanceOf[js.Any])
    
    inline def setOriginalTypeNameUndefined: Self = StObject.set(x, "OriginalTypeName", js.undefined)
    
    inline def setProvisioningType(value: ProvisioningType): Self = StObject.set(x, "ProvisioningType", value.asInstanceOf[js.Any])
    
    inline def setProvisioningTypeUndefined: Self = StObject.set(x, "ProvisioningType", js.undefined)
    
    inline def setPublicVersionNumber(value: PublicVersionNumber): Self = StObject.set(x, "PublicVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicVersionNumberUndefined: Self = StObject.set(x, "PublicVersionNumber", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setRequiredActivatedTypes(value: RequiredActivatedTypes): Self = StObject.set(x, "RequiredActivatedTypes", value.asInstanceOf[js.Any])
    
    inline def setRequiredActivatedTypesUndefined: Self = StObject.set(x, "RequiredActivatedTypes", js.undefined)
    
    inline def setRequiredActivatedTypesVarargs(value: RequiredActivatedType*): Self = StObject.set(x, "RequiredActivatedTypes", js.Array(value*))
    
    inline def setSchema(value: TypeSchema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    inline def setSourceUrl(value: OptionalSecureUrl): Self = StObject.set(x, "SourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "SourceUrl", js.undefined)
    
    inline def setTimeCreated(value: js.Date): Self = StObject.set(x, "TimeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "TimeCreated", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeTestsStatus(value: TypeTestsStatus): Self = StObject.set(x, "TypeTestsStatus", value.asInstanceOf[js.Any])
    
    inline def setTypeTestsStatusDescription(value: TypeTestsStatusDescription): Self = StObject.set(x, "TypeTestsStatusDescription", value.asInstanceOf[js.Any])
    
    inline def setTypeTestsStatusDescriptionUndefined: Self = StObject.set(x, "TypeTestsStatusDescription", js.undefined)
    
    inline def setTypeTestsStatusUndefined: Self = StObject.set(x, "TypeTestsStatus", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
