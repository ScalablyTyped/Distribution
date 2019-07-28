package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetRepositoriesInput extends js.Object {
  /**
    * The names of the repositories to get information about.
    */
  var repositoryNames: RepositoryNameList
}

object BatchGetRepositoriesInput {
  @scala.inline
  def apply(repositoryNames: RepositoryNameList): BatchGetRepositoriesInput = {
    val __obj = js.Dynamic.literal(repositoryNames = repositoryNames)
  
    __obj.asInstanceOf[BatchGetRepositoriesInput]
  }
}

