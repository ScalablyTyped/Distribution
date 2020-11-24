package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "PropertyRead")
@js.native
class PropertyRead protected ()
  extends typings.angularCompiler.srcCompilerMod.PropertyRead {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    nameSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    receiver: typings.angularCompiler.astMod.AST,
    name: String
  ) = this()
}
