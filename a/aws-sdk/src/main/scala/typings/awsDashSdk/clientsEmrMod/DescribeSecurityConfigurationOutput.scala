package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.undefined
  /**
    * The security configuration details in JSON format.
    */
  var SecurityConfiguration: js.UndefOr[String] = js.undefined
}

object DescribeSecurityConfigurationOutput {
  @scala.inline
  def apply(CreationDateTime: _Date = null, Name: XmlString = null, SecurityConfiguration: String = null): DescribeSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    __obj.asInstanceOf[DescribeSecurityConfigurationOutput]
  }
}

