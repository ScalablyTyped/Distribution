package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "PropertyWrite")
@js.native
class PropertyWrite protected ()
  extends typings.angularCompiler.srcCompilerMod.PropertyWrite {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String,
    value: typings.angularCompiler.astMod.AST
  ) = this()
}
