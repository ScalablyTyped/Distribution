package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compiler extends js.Object {
  var compiler: atAngularCompilerLib.srcAotCompilerMod.AotCompiler
  var reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
}

object Anon_Compiler {
  @scala.inline
  def apply(
    compiler: atAngularCompilerLib.srcAotCompilerMod.AotCompiler,
    reflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
  ): Anon_Compiler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compiler")(compiler)
    __obj.updateDynamic("reflector")(reflector)
    __obj.asInstanceOf[Anon_Compiler]
  }
}

