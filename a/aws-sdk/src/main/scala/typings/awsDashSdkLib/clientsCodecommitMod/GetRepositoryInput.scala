package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryInput extends js.Object {
  /**
    * The name of the repository to get information about.
    */
  var repositoryName: RepositoryName
}

object GetRepositoryInput {
  @scala.inline
  def apply(repositoryName: RepositoryName): GetRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetRepositoryInput]
  }
}

