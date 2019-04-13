package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  /**
    * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar provisions the new repository, the source code files provided with the project request are placed in the repository.
    */
  var destination: CodeDestination
  /**
    * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the files during project creation.
    */
  var source: CodeSource
}

object Code {
  @scala.inline
  def apply(destination: CodeDestination, source: CodeSource): Code = {
    val __obj = js.Dynamic.literal(destination = destination, source = source)
  
    __obj.asInstanceOf[Code]
  }
}

