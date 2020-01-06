package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotStatement extends js.Object {
  /**
    * The statement to negate. You can use any statement that can be nested.
    */
  var Statement: typings.awsDashSdk.clientsWafv2Mod.Statement = js.native
}

object NotStatement {
  @scala.inline
  def apply(Statement: Statement): NotStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotStatement]
  }
}

