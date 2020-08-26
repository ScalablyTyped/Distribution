package typings.angularCompiler.compilerMod

import typings.angularCompiler.bindingParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "makeBindingParser")
@js.native
object makeBindingParser extends js.Object {
  def apply(): BindingParser = js.native
  def apply(interpolationConfig: typings.angularCompiler.interpolationConfigMod.InterpolationConfig): BindingParser = js.native
}

