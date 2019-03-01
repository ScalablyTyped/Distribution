package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinition extends js.Object {
  var forClient: js.UndefOr[js.Function1[/* body */ js.Any, arangodbLib.Anon_Data]] = js.undefined
  var fromClient: js.UndefOr[
    js.Function3[
      /* body */ java.lang.String | nodeLib.Buffer, 
      /* req */ Request, 
      /* type */ MediaType, 
      _
    ]
  ] = js.undefined
}

object TypeDefinition {
  @scala.inline
  def apply(
    forClient: js.Function1[/* body */ js.Any, arangodbLib.Anon_Data] = null,
    fromClient: js.Function3[
      /* body */ java.lang.String | nodeLib.Buffer, 
      /* req */ Request, 
      /* type */ MediaType, 
      _
    ] = null
  ): TypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (forClient != null) __obj.updateDynamic("forClient")(forClient)
    if (fromClient != null) __obj.updateDynamic("fromClient")(fromClient)
    __obj.asInstanceOf[TypeDefinition]
  }
}

