package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository where you want to create or update the trigger.
    */
  var repositoryName: RepositoryName
  /**
    * The JSON block of configuration information for each trigger.
    */
  var triggers: RepositoryTriggersList
}

object PutRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): PutRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName, triggers = triggers)
  
    __obj.asInstanceOf[PutRepositoryTriggersInput]
  }
}

