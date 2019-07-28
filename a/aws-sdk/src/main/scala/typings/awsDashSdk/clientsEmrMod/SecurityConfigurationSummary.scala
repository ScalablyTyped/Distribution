package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationSummary extends js.Object {
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.undefined
}

object SecurityConfigurationSummary {
  @scala.inline
  def apply(CreationDateTime: _Date = null, Name: XmlString = null): SecurityConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SecurityConfigurationSummary]
  }
}

