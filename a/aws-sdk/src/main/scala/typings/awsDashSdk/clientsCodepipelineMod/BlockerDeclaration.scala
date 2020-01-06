package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockerDeclaration extends js.Object {
  /**
    * Reserved for future use.
    */
  var name: BlockerName = js.native
  /**
    * Reserved for future use.
    */
  var `type`: BlockerType = js.native
}

object BlockerDeclaration {
  @scala.inline
  def apply(name: BlockerName, `type`: BlockerType): BlockerDeclaration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockerDeclaration]
  }
}

