package typings.aureliaMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolOptions extends js.Object {
  /**
    * A function which has the opportunity to compose additional behavior into the decorated class when the protocol is applied.
    */
  var compose: js.UndefOr[js.Function1[/* target */ js.Any, Unit]] = js.native
  /**
    * A function that will be run to validate the decorated class when the protocol is applied. It is also used to validate adhoc instances.
    * If the validation fails, a message should be returned which directs the developer in how to address the issue.
    */
  var validate: js.UndefOr[js.Function1[/* target */ js.Any, String | Boolean]] = js.native
}

object ProtocolOptions {
  @scala.inline
  def apply(): ProtocolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolOptions]
  }
  @scala.inline
  implicit class ProtocolOptionsOps[Self <: ProtocolOptions] (val x: Self) extends AnyVal {
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
    def setCompose(value: /* target */ js.Any => Unit): Self = this.set("compose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompose: Self = this.set("compose", js.undefined)
    @scala.inline
    def setValidate(value: /* target */ js.Any => String | Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

