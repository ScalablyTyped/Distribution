package typings.angularCompiler.compilerMod

import typings.angularCompiler.anon.Errors
import typings.angularCompiler.templateMod.ParseTemplateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "parseTemplate")
@js.native
object parseTemplate extends js.Object {
  def apply(template: String, templateUrl: String): Errors = js.native
  def apply(template: String, templateUrl: String, options: ParseTemplateOptions): Errors = js.native
}

