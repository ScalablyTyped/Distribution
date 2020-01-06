package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityConfigurationOutput extends js.Object {
  /**
    * The date and time the security configuration was created
    */
  var CreationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.native
  /**
    * The security configuration details in JSON format.
    */
  var SecurityConfiguration: js.UndefOr[String] = js.native
}

object DescribeSecurityConfigurationOutput {
  @scala.inline
  def apply(CreationDateTime: _Date = null, Name: XmlString = null, SecurityConfiguration: String = null): DescribeSecurityConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityConfigurationOutput]
  }
}

