package typings.angularCompiler

import typings.angularCompiler.compilerMod.AotCompiler
import typings.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompiler extends js.Object {
  var compiler: AotCompiler
  var reflector: StaticReflector
}

object AnonCompiler {
  @scala.inline
  def apply(compiler: AotCompiler, reflector: StaticReflector): AnonCompiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompiler]
  }
}

