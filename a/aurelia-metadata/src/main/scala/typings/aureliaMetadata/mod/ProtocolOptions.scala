package typings.aureliaMetadata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolOptions extends js.Object {
  /**
    * A function which has the opportunity to compose additional behavior into the decorated class when the protocol is applied.
    */
  var compose: js.UndefOr[js.Function1[/* target */ js.Any, Unit]] = js.undefined
  /**
    * A function that will be run to validate the decorated class when the protocol is applied. It is also used to validate adhoc instances.
    * If the validation fails, a message should be returned which directs the developer in how to address the issue.
    */
  var validate: js.UndefOr[js.Function1[/* target */ js.Any, String | Boolean]] = js.undefined
}

object ProtocolOptions {
  @scala.inline
  def apply(
    compose: /* target */ js.Any => Unit = null,
    validate: /* target */ js.Any => String | Boolean = null
  ): ProtocolOptions = {
    val __obj = js.Dynamic.literal()
    if (compose != null) __obj.updateDynamic("compose")(js.Any.fromFunction1(compose))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[ProtocolOptions]
  }
}

