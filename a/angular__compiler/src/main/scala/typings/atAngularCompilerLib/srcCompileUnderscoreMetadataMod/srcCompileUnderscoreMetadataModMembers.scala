package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", JSImport.Namespace)
@js.native
object srcCompileUnderscoreMetadataModMembers extends js.Object {
  def componentFactoryName(compType: js.Any): java.lang.String = js.native
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def hostViewClassName(compType: js.Any): java.lang.String = js.native
  def identifierModuleUrl(compileIdentifier: CompileIdentifierMetadata): java.lang.String = js.native
  def identifierName(): java.lang.String | scala.Null = js.native
  def identifierName(compileIdentifier: CompileIdentifierMetadata): java.lang.String | scala.Null = js.native
  def ngModuleJitUrl(moduleMeta: CompileNgModuleMetadata): java.lang.String = js.native
  def rendererTypeName(compType: js.Any): java.lang.String = js.native
  def sanitizeIdentifier(name: java.lang.String): java.lang.String = js.native
  def sharedStylesheetJitUrl(meta: CompileStylesheetMetadata, id: scala.Double): java.lang.String = js.native
  def templateJitUrl(ngModuleType: CompileIdentifierMetadata, compMeta: CompileDirectiveMetadata): java.lang.String = js.native
  def templateSourceUrl(
    ngModuleType: CompileIdentifierMetadata,
    compMeta: atAngularCompilerLib.Anon_Type,
    templateMeta: atAngularCompilerLib.Anon_IsInline
  ): java.lang.String = js.native
  def tokenName(token: CompileTokenMetadata): java.lang.String | scala.Null = js.native
  def tokenReference(token: CompileTokenMetadata): js.Any = js.native
  def viewClassName(compType: js.Any, embeddedTemplateIndex: scala.Double): java.lang.String = js.native
}

