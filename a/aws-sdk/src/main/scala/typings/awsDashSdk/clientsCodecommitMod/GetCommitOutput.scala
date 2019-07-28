package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommitOutput extends js.Object {
  /**
    * A commit data type object that contains information about the specified commit.
    */
  var commit: Commit
}

object GetCommitOutput {
  @scala.inline
  def apply(commit: Commit): GetCommitOutput = {
    val __obj = js.Dynamic.literal(commit = commit)
  
    __obj.asInstanceOf[GetCommitOutput]
  }
}

