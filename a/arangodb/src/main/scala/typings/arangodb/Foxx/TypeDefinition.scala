package typings.arangodb.Foxx

import typings.arangodb.Anon_Data
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinition extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, Anon_Data]] = js.undefined
  var fromClient: js.UndefOr[
    js.Function3[/* body */ String | Buffer, /* req */ Request, /* type */ MediaType, _]
  ] = js.undefined
}

object TypeDefinition {
  @scala.inline
  def apply(
    forClient: /* body */ js.Any => Anon_Data = null,
    fromClient: (/* body */ String | Buffer, /* req */ Request, /* type */ MediaType) => _ = null
  ): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (forClient != null) __obj.updateDynamic("forClient")(js.Any.fromFunction1(forClient))
    if (fromClient != null) __obj.updateDynamic("fromClient")(js.Any.fromFunction3(fromClient))
    __obj.asInstanceOf[TypeDefinition]
  }
}

