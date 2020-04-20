package typings.angularCompiler

import typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: EmitterVisitorContext
  var sourceText: String
}

object AnonContext {
  @scala.inline
  def apply(context: EmitterVisitorContext, sourceText: String): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

