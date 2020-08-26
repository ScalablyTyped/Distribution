package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverResponse extends js.Object {
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object GetResolverResponse {
  @scala.inline
  def apply(): GetResolverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverResponse]
  }
  @scala.inline
  implicit class GetResolverResponseOps[Self <: GetResolverResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolver(value: Resolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
  }
  
}

