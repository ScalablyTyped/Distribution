package typings.angularCore.moduleWithProvidersTransformMod

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisFailure extends js.Object {
  var message: String
  var node: Node
}

object AnalysisFailure {
  @scala.inline
  def apply(message: String, node: Node): AnalysisFailure = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisFailure]
  }
}

