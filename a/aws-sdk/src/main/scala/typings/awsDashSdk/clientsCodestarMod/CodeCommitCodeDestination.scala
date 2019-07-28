package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCommitCodeDestination extends js.Object {
  /**
    * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
    */
  var name: RepositoryName
}

object CodeCommitCodeDestination {
  @scala.inline
  def apply(name: RepositoryName): CodeCommitCodeDestination = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[CodeCommitCodeDestination]
  }
}

