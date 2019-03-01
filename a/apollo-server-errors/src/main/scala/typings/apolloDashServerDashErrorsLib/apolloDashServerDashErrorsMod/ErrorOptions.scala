package typings
package apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOptions extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errorClass: js.UndefOr[
    org.scalablytyped.runtime.Instantiable3[
      /* message */ java.lang.String, 
      /* code */ js.UndefOr[/* code */ java.lang.String], 
      /* properties */ js.UndefOr[/* properties */ stdLib.Record[java.lang.String, js.Any]], 
      ApolloError
    ]
  ] = js.undefined
}

object ErrorOptions {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    errorClass: org.scalablytyped.runtime.Instantiable3[
      /* message */ java.lang.String, 
      /* code */ js.UndefOr[/* code */ java.lang.String], 
      /* properties */ js.UndefOr[/* properties */ stdLib.Record[java.lang.String, js.Any]], 
      ApolloError
    ] = null
  ): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (errorClass != null) __obj.updateDynamic("errorClass")(errorClass)
    __obj.asInstanceOf[ErrorOptions]
  }
}

