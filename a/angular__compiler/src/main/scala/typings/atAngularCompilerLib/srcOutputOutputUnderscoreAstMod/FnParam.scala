package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "FnParam")
@js.native
class FnParam protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, `type`: Type) = this()
  var name: java.lang.String = js.native
  var `type`: Type | scala.Null = js.native
  def isEquivalent(param: FnParam): scala.Boolean = js.native
}

