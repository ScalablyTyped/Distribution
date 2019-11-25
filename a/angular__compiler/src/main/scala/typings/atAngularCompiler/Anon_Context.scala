package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: EmitterVisitorContext
  var sourceText: String
}

object Anon_Context {
  @scala.inline
  def apply(context: EmitterVisitorContext, sourceText: String): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Context]
  }
}

