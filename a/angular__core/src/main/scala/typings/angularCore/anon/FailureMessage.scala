package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureMessage extends js.Object {
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null = js.native
  /** Transformed call expression. */
  var node: CallExpression = js.native
}

object FailureMessage {
  @scala.inline
  def apply(node: CallExpression): FailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureMessage]
  }
  @scala.inline
  implicit class FailureMessageOps[Self <: FailureMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: CallExpression): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureMessageNull: Self = this.set("failureMessage", null)
  }
  
}

