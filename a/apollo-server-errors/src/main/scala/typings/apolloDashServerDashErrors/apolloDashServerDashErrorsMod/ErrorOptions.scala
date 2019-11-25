package typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod

import org.scalablytyped.runtime.Instantiable3
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOptions extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var errorClass: js.UndefOr[
    Instantiable3[
      /* message */ String, 
      js.UndefOr[/* code */ String], 
      js.UndefOr[/* extensions */ Record[String, js.Any]], 
      ApolloError
    ]
  ] = js.undefined
}

object ErrorOptions {
  @scala.inline
  def apply(
    code: String = null,
    errorClass: Instantiable3[
      /* message */ String, 
      js.UndefOr[/* code */ String], 
      js.UndefOr[/* extensions */ Record[String, js.Any]], 
      ApolloError
    ] = null
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOptions]
  }
}

