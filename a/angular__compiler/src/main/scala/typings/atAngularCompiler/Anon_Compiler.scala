package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotCompilerMod.AotCompiler
import typings.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compiler extends js.Object {
  var compiler: AotCompiler
  var reflector: StaticReflector
}

object Anon_Compiler {
  @scala.inline
  def apply(compiler: AotCompiler, reflector: StaticReflector): Anon_Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], reflector = reflector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Compiler]
  }
}

