package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository in which to test the triggers.
    */
  var repositoryName: RepositoryName
  /**
    * The list of triggers to test.
    */
  var triggers: RepositoryTriggersList
}

object TestRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName, triggers: RepositoryTriggersList): TestRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName, triggers = triggers)
  
    __obj.asInstanceOf[TestRepositoryTriggersInput]
  }
}

