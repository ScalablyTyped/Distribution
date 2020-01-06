package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrStatement extends js.Object {
  /**
    * The statements to combine with OR logic. You can use any statements that can be nested.
    */
  var Statements: typings.awsDashSdk.clientsWafv2Mod.Statements = js.native
}

object OrStatement {
  @scala.inline
  def apply(Statements: Statements): OrStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrStatement]
  }
}

