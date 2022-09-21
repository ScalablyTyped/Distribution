package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ExternalReference")
@js.native
open class ExternalReference () extends StObject {
  def this(moduleName: String) = this()
  def this(moduleName: String, name: String) = this()
  def this(moduleName: Null, name: String) = this()
  def this(moduleName: String, name: String, runtime: Any) = this()
  def this(moduleName: String, name: Null, runtime: Any) = this()
  def this(moduleName: Null, name: String, runtime: Any) = this()
  def this(moduleName: Null, name: Null, runtime: Any) = this()
  
  var moduleName: String | Null = js.native
  
  var name: String | Null = js.native
  
  var runtime: js.UndefOr[Any] = js.native
}
