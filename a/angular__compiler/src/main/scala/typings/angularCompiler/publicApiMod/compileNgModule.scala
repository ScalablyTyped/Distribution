package typings.angularCompiler.publicApiMod

import typings.angularCompiler.r3ModuleCompilerMod.R3NgModuleDef
import typings.angularCompiler.r3ModuleCompilerMod.R3NgModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "compileNgModule")
@js.native
object compileNgModule extends js.Object {
  def apply(meta: R3NgModuleMetadata): R3NgModuleDef = js.native
}

