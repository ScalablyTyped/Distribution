package typings
package aureliaDashMetadataLib.aureliaDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtocolOptions extends js.Object {
  /**
    * A function which has the opportunity to compose additional behavior into the decorated class when the protocol is applied.
    */
  var compose: js.UndefOr[js.Function1[/* target */ js.Any, scala.Unit]] = js.undefined
  /**
    * A function that will be run to validate the decorated class when the protocol is applied. It is also used to validate adhoc instances.
    * If the validation fails, a message should be returned which directs the developer in how to address the issue.
    */
  var validate: js.UndefOr[js.Function1[/* target */ js.Any, java.lang.String | scala.Boolean]] = js.undefined
}

object ProtocolOptions {
  @scala.inline
  def apply(
    compose: js.Function1[/* target */ js.Any, scala.Unit] = null,
    validate: js.Function1[/* target */ js.Any, java.lang.String | scala.Boolean] = null
  ): ProtocolOptions = {
    val __obj = js.Dynamic.literal()
    if (compose != null) __obj.updateDynamic("compose")(compose)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ProtocolOptions]
  }
}

