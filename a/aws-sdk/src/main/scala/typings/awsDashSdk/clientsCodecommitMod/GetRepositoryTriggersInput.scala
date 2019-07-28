package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryTriggersInput extends js.Object {
  /**
    * The name of the repository for which the trigger is configured.
    */
  var repositoryName: RepositoryName
}

object GetRepositoryTriggersInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): GetRepositoryTriggersInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryTriggersInput]
  }
}

