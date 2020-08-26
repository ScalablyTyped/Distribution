package typings.apolloServerErrors.mod

import org.scalablytyped.runtime.Instantiable3
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOptions extends js.Object {
  var code: js.UndefOr[String] = js.native
  var errorClass: js.UndefOr[
    Instantiable3[
      /* message */ String, 
      /* code */ js.UndefOr[String], 
      /* extensions */ js.UndefOr[Record[String, js.Any]], 
      ApolloError
    ]
  ] = js.native
}

object ErrorOptions {
  @scala.inline
  def apply(): ErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOptions]
  }
  @scala.inline
  implicit class ErrorOptionsOps[Self <: ErrorOptions] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setErrorClass(
      value: Instantiable3[
          /* message */ String, 
          /* code */ js.UndefOr[String], 
          /* extensions */ js.UndefOr[Record[String, js.Any]], 
          ApolloError
        ]
    ): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorClass: Self = this.set("errorClass", js.undefined)
  }
  
}

