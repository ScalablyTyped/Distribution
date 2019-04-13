package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCustomActionTypeInput extends js.Object {
  /**
    * The category of the custom action that you want to delete, such as source or deploy.
    */
  var category: ActionCategory
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider
  /**
    * The version of the custom action to delete.
    */
  var version: Version
}

object DeleteCustomActionTypeInput {
  @scala.inline
  def apply(category: ActionCategory, provider: ActionProvider, version: Version): DeleteCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], provider = provider, version = version)
  
    __obj.asInstanceOf[DeleteCustomActionTypeInput]
  }
}

