package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.ModuleUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compile_metadata", "CompileStylesheetMetadata")
@js.native
class CompileStylesheetMetadata () extends StObject {
  def this(hasModuleUrlStylesStyleUrls: ModuleUrl) = this()
  
  var moduleUrl: String | Null = js.native
  
  var styleUrls: js.Array[String] = js.native
  
  var styles: js.Array[String] = js.native
}
