package typings.atAngularCompiler.srcParseUnderscoreUtilMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/parse_util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EMPTY_PARSE_LOCATION: ParseLocation = js.native
  val EMPTY_SOURCE_SPAN: ParseSourceSpan = js.native
  def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = js.native
  def typeSourceSpan(kind: String, `type`: CompileIdentifierMetadata): ParseSourceSpan = js.native
}

