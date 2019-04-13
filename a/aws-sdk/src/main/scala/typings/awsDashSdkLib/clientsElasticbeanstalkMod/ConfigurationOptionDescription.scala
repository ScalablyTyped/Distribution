package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptionDescription extends js.Object {
  /**
    * An indication of which action is required if the value for this configuration option changes:    NoInterruption : There is no interruption to the environment or application availability.    RestartEnvironment : The environment is entirely restarted, all AWS resources are deleted and recreated, and the environment is unavailable during the process.    RestartApplicationServer : The environment is available the entire time. However, a short application outage occurs when the application servers on the running Amazon EC2 instances are restarted.  
    */
  var ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.undefined
  /**
    * The default value for this configuration option.
    */
  var DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.undefined
  /**
    * If specified, the configuration option must be a string value no longer than this value.
    */
  var MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined
  /**
    * If specified, the configuration option must be a numeric value less than this value.
    */
  var MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined
  /**
    * If specified, the configuration option must be a numeric value greater than this value.
    */
  var MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined
  /**
    * The name of the configuration option.
    */
  var Name: js.UndefOr[ConfigurationOptionName] = js.undefined
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  /**
    * If specified, the configuration option must be a string value that satisfies this regular expression.
    */
  var Regex: js.UndefOr[OptionRestrictionRegex] = js.undefined
  /**
    * An indication of whether the user defined this configuration option:    true : This configuration option was defined by the user. It is a valid choice for specifying if this as an Option to Remove when updating configuration settings.     false : This configuration was not defined by the user.    Constraint: You can remove only UserDefined options from a configuration.   Valid Values: true | false 
    */
  var UserDefined: js.UndefOr[UserDefinedOption] = js.undefined
  /**
    * If specified, values for the configuration option are selected from this list.
    */
  var ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.undefined
  /**
    * An indication of which type of values this option has and whether it is allowable to select one or more than one of the possible values:    Scalar : Values for this option are a single selection from the possible values, or an unformatted string, or numeric value governed by the MIN/MAX/Regex constraints.    List : Values for this option are multiple selections from the possible values.    Boolean : Values for this option are either true or false .    Json : Values for this option are a JSON representation of a ConfigDocument.  
    */
  var ValueType: js.UndefOr[ConfigurationOptionValueType] = js.undefined
}

object ConfigurationOptionDescription {
  @scala.inline
  def apply(
    ChangeSeverity: ConfigurationOptionSeverity = null,
    DefaultValue: ConfigurationOptionDefaultValue = null,
    MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined,
    MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined,
    MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined,
    Name: ConfigurationOptionName = null,
    Namespace: OptionNamespace = null,
    Regex: OptionRestrictionRegex = null,
    UserDefined: js.UndefOr[UserDefinedOption] = js.undefined,
    ValueOptions: ConfigurationOptionPossibleValues = null,
    ValueType: ConfigurationOptionValueType = null
  ): ConfigurationOptionDescription = {
    val __obj = js.Dynamic.literal()
    if (ChangeSeverity != null) __obj.updateDynamic("ChangeSeverity")(ChangeSeverity)
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(MaxLength)) __obj.updateDynamic("MaxLength")(MaxLength)
    if (!js.isUndefined(MaxValue)) __obj.updateDynamic("MaxValue")(MaxValue)
    if (!js.isUndefined(MinValue)) __obj.updateDynamic("MinValue")(MinValue)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (Regex != null) __obj.updateDynamic("Regex")(Regex)
    if (!js.isUndefined(UserDefined)) __obj.updateDynamic("UserDefined")(UserDefined)
    if (ValueOptions != null) __obj.updateDynamic("ValueOptions")(ValueOptions)
    if (ValueType != null) __obj.updateDynamic("ValueType")(ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionDescription]
  }
}

