package typings.angularCompiler.anon

import typings.angularCompiler.abstractEmitterMod.EmitterVisitorContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: EmitterVisitorContext
  var sourceText: String
}

object Context {
  @scala.inline
  def apply(context: EmitterVisitorContext, sourceText: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

