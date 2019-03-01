package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
  var sourceText: java.lang.String
}

object Anon_Context {
  @scala.inline
  def apply(
    context: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext,
    sourceText: java.lang.String
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("sourceText")(sourceText)
    __obj.asInstanceOf[Anon_Context]
  }
}

