package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportServerEngineAttributeRequest extends js.Object {
  /**
    * The name of the export attribute. Currently, the supported export attribute is Userdata. This exports a user data script that includes parameters and values provided in the InputAttributes list.
    */
  var ExportAttributeName: String
  /**
    * The list of engine attributes. The list type is EngineAttribute. An EngineAttribute list item is a pair that includes an attribute name and its value. For the Userdata ExportAttributeName, the following are supported engine attribute names.    RunList In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter is ignored.    OrganizationName In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the organization default. In Puppet, this parameter is ignored.    NodeEnvironment In Chef, a node environment (for example, development, staging, or one-box). In Puppet, this parameter is ignored.    NodeClientVersion In Chef, the version of the Chef engine (three numbers separated by dots, such as 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this parameter is ignored.  
    */
  var InputAttributes: js.UndefOr[EngineAttributes] = js.undefined
  /**
    * The name of the server from which you are exporting the attribute.
    */
  var ServerName: awsDashSdkLib.clientsOpsworkscmMod.ServerName
}

object ExportServerEngineAttributeRequest {
  @scala.inline
  def apply(ExportAttributeName: String, ServerName: ServerName, InputAttributes: EngineAttributes = null): ExportServerEngineAttributeRequest = {
    val __obj = js.Dynamic.literal(ExportAttributeName = ExportAttributeName, ServerName = ServerName)
    if (InputAttributes != null) __obj.updateDynamic("InputAttributes")(InputAttributes)
    __obj.asInstanceOf[ExportServerEngineAttributeRequest]
  }
}

