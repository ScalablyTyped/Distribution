package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessage extends js.Object {
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[ValidationMessageString] = js.undefined
  /**
    * The namespace to which the option belongs.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
  /**
    * An indication of the severity of this message:    error: This message indicates that this is not a valid setting for an option.    warning: This message is providing information you should take into account.  
    */
  var Severity: js.UndefOr[ValidationSeverity] = js.undefined
}

object ValidationMessage {
  @scala.inline
  def apply(
    Message: ValidationMessageString = null,
    Namespace: OptionNamespace = null,
    OptionName: ConfigurationOptionName = null,
    Severity: ValidationSeverity = null
  ): ValidationMessage = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessage]
  }
}

