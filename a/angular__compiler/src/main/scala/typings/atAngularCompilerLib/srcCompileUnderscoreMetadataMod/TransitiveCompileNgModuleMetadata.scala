package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "TransitiveCompileNgModuleMetadata")
@js.native
class TransitiveCompileNgModuleMetadata () extends js.Object {
  var directives: js.Array[CompileIdentifierMetadata] = js.native
  var directivesSet: stdLib.Set[_] = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var entryComponentsSet: stdLib.Set[_] = js.native
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var exportedDirectivesSet: stdLib.Set[_] = js.native
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  var exportedPipesSet: stdLib.Set[_] = js.native
  var modules: js.Array[CompileTypeMetadata] = js.native
  var modulesSet: stdLib.Set[_] = js.native
  var pipes: js.Array[CompileIdentifierMetadata] = js.native
  var pipesSet: stdLib.Set[_] = js.native
  var providers: js.Array[atAngularCompilerLib.Anon_Module] = js.native
  def addDirective(id: CompileIdentifierMetadata): scala.Unit = js.native
  def addEntryComponent(ec: CompileEntryComponentMetadata): scala.Unit = js.native
  def addExportedDirective(id: CompileIdentifierMetadata): scala.Unit = js.native
  def addExportedPipe(id: CompileIdentifierMetadata): scala.Unit = js.native
  def addModule(id: CompileTypeMetadata): scala.Unit = js.native
  def addPipe(id: CompileIdentifierMetadata): scala.Unit = js.native
  def addProvider(provider: CompileProviderMetadata, module: CompileIdentifierMetadata): scala.Unit = js.native
}

