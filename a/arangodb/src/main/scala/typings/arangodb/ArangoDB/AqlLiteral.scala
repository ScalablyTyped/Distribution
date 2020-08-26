package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AqlLiteral extends js.Object {
  def toAQL(): String = js.native
}

object AqlLiteral {
  @scala.inline
  def apply(toAQL: () => String): AqlLiteral = {
    val __obj = js.Dynamic.literal(toAQL = js.Any.fromFunction0(toAQL))
    __obj.asInstanceOf[AqlLiteral]
  }
  @scala.inline
  implicit class AqlLiteralOps[Self <: AqlLiteral] (val x: Self) extends AnyVal {
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
    def setToAQL(value: () => String): Self = this.set("toAQL", js.Any.fromFunction0(value))
  }
  
}

