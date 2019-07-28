package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typings.atAngularCompiler.Anon_IsInline
import typings.atAngularCompiler.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def componentFactoryName(compType: js.Any): String = js.native
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def hostViewClassName(compType: js.Any): String = js.native
  def identifierModuleUrl(compileIdentifier: CompileIdentifierMetadata): String = js.native
  def identifierName(): String | Null = js.native
  def identifierName(compileIdentifier: CompileIdentifierMetadata): String | Null = js.native
  def ngModuleJitUrl(moduleMeta: CompileNgModuleMetadata): String = js.native
  def rendererTypeName(compType: js.Any): String = js.native
  def sanitizeIdentifier(name: String): String = js.native
  def sharedStylesheetJitUrl(meta: CompileStylesheetMetadata, id: Double): String = js.native
  def templateJitUrl(ngModuleType: CompileIdentifierMetadata, compMeta: CompileDirectiveMetadata): String = js.native
  def templateSourceUrl(ngModuleType: CompileIdentifierMetadata, compMeta: Anon_Type, templateMeta: Anon_IsInline): String = js.native
  def tokenName(token: CompileTokenMetadata): String | Null = js.native
  def tokenReference(token: CompileTokenMetadata): js.Any = js.native
  def viewClassName(compType: js.Any, embeddedTemplateIndex: Double): String = js.native
}

