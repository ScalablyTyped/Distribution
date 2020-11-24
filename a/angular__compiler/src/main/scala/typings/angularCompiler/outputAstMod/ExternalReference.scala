package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ExternalReference")
@js.native
class ExternalReference () extends js.Object {
  def this(moduleName: String) = this()
  def this(moduleName: String, name: String) = this()
  def this(moduleName: Null, name: String) = this()
  def this(moduleName: String, name: String, runtime: js.Any) = this()
  def this(moduleName: String, name: Null, runtime: js.Any) = this()
  def this(moduleName: Null, name: String, runtime: js.Any) = this()
  def this(moduleName: Null, name: Null, runtime: js.Any) = this()
  
  var moduleName: String | Null = js.native
  
  var name: String | Null = js.native
  
  var runtime: js.UndefOr[js.Any] = js.native
}
