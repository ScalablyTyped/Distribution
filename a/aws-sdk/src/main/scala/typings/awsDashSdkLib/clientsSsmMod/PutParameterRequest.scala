package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutParameterRequest extends js.Object {
  /**
    * A regular expression used to validate the parameter value. For example, for String types with values restricted to numbers, you can specify the following: AllowedPattern=^\d+$ 
    */
  var AllowedPattern: js.UndefOr[AllowedPattern] = js.undefined
  /**
    * Information about the parameter that you want to add to the system. Optional but recommended.  Do not enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ParameterDescription] = js.undefined
  /**
    * The KMS Key ID that you want to use to encrypt a parameter. Either the default AWS Key Management Service (AWS KMS) key automatically assigned to your AWS account or a custom key. Required for parameters that use the SecureString data type. If you don't specify a key ID, the system uses the default key associated with your AWS account.   To use your default AWS KMS key, choose the SecureString data type, and do not specify the Key ID when you create the parameter. The system automatically populates Key ID with your default KMS key.   To use a custom KMS key, choose the SecureString data type with the Key ID parameter.  
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.undefined
  /**
    * The fully qualified name of the parameter that you want to add to the system. The fully qualified name includes the complete hierarchy of the parameter path and name. For example: /Dev/DBServer/MySQL/db-string13  Naming Constraints:   Parameter names are case sensitive.   A parameter name must be unique within an AWS Region   A parameter name can't be prefixed with "aws" or "ssm" (case-insensitive).   Parameter names can include only the following symbols and letters: a-zA-Z0-9_.-/    A parameter name can't include spaces.   Parameter hierarchies are limited to a maximum depth of fifteen levels.   For additional information about valid values for parameter names, see Requirements and Constraints for Parameter Names in the AWS Systems Manager User Guide.  The maximum length constraint listed below includes capacity for additional system attributes that are not part of the name. The maximum length for the fully qualified parameter name is 1011 characters.  
    */
  var Name: PSParameterName
  /**
    * Overwrite an existing parameter. If not specified, will default to "false".
    */
  var Overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a Systems Manager parameter to identify the type of resource to which it applies, the environment, or the type of configuration data referenced by the parameter. In this case, you could specify the following key name/value pairs:    Key=Resource,Value=S3bucket     Key=OS,Value=Windows     Key=ParameterType,Value=LicenseKey     To add tags to an existing Systems Manager parameter, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The type of parameter that you want to add to the system. Items in a StringList must be separated by a comma (,). You can't use other punctuation or special character to escape items in the list. If you have a parameter value that requires a comma, then use the String data type.   SecureString is not currently supported for AWS CloudFormation templates or in the China Regions. 
    */
  var Type: ParameterType
  /**
    * The parameter value that you want to add to the system.
    */
  var Value: PSParameterValue
}

object PutParameterRequest {
  @scala.inline
  def apply(
    Name: PSParameterName,
    Type: ParameterType,
    Value: PSParameterValue,
    AllowedPattern: AllowedPattern = null,
    Description: ParameterDescription = null,
    KeyId: ParameterKeyId = null,
    Overwrite: js.UndefOr[Boolean] = js.undefined,
    Tags: TagList = null
  ): PutParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type.asInstanceOf[js.Any], Value = Value)
    if (AllowedPattern != null) __obj.updateDynamic("AllowedPattern")(AllowedPattern)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    if (!js.isUndefined(Overwrite)) __obj.updateDynamic("Overwrite")(Overwrite)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutParameterRequest]
  }
}

