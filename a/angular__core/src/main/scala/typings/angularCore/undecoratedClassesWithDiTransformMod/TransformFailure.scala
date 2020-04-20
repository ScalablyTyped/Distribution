package typings.angularCore.undecoratedClassesWithDiTransformMod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformFailure extends js.Object {
  var message: String
  var node: Node
}

object TransformFailure {
  @scala.inline
  def apply(message: String, node: Node): TransformFailure = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformFailure]
  }
}

