package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def componentFactoryName(compType: js.Any): java.lang.String = js.native
  def flatten[T](list: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def hostViewClassName(compType: js.Any): java.lang.String = js.native
  def identifierModuleUrl(compileIdentifier: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata): java.lang.String = js.native
  def identifierName(): java.lang.String | scala.Null = js.native
  def identifierName(compileIdentifier: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata): java.lang.String | scala.Null = js.native
  def ngModuleJitUrl(moduleMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleMetadata): java.lang.String = js.native
  def rendererTypeName(compType: js.Any): java.lang.String = js.native
  def sanitizeIdentifier(name: java.lang.String): java.lang.String = js.native
  def sharedStylesheetJitUrl(
    meta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata,
    id: scala.Double
  ): java.lang.String = js.native
  def templateJitUrl(
    ngModuleType: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata,
    compMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
  ): java.lang.String = js.native
  def templateSourceUrl(
    ngModuleType: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata,
    compMeta: atAngularCompilerLib.Anon_Type,
    templateMeta: atAngularCompilerLib.Anon_IsInline
  ): java.lang.String = js.native
  def tokenName(token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata): java.lang.String | scala.Null = js.native
  def tokenReference(token: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTokenMetadata): js.Any = js.native
  def viewClassName(compType: js.Any, embeddedTemplateIndex: scala.Double): java.lang.String = js.native
}

