package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn", "TokenType")
@js.native
class TokenType protected () extends js.Object {
  def this(label: String) = this()
  def this(label: String, conf: js.Any) = this()
  
  var beforeExpr: Boolean = js.native
  
  var binop: Double = js.native
  
  var isAssign: Boolean = js.native
  
  var isLoop: Boolean = js.native
  
  var keyword: String = js.native
  
  var label: String = js.native
  
  var postfix: Boolean = js.native
  
  var prefix: Boolean = js.native
  
  var startsExpr: Boolean = js.native
  
  var updateContext: js.UndefOr[js.Function1[/* prevType */ this.type, Unit]] = js.native
}
