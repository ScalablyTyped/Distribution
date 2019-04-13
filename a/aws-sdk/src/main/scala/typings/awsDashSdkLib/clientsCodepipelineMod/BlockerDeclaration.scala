package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockerDeclaration extends js.Object {
  /**
    * Reserved for future use.
    */
  var name: BlockerName
  /**
    * Reserved for future use.
    */
  var `type`: BlockerType
}

object BlockerDeclaration {
  @scala.inline
  def apply(name: BlockerName, `type`: BlockerType): BlockerDeclaration = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDeclaration]
  }
}

