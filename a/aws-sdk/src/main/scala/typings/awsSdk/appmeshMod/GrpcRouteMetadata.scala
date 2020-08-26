package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcRouteMetadata extends js.Object {
  /**
    * Specify True to match anything except the match criteria. The default value is False.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * An object that represents the data to match from the request.
    */
  var `match`: js.UndefOr[GrpcRouteMetadataMatchMethod] = js.native
  /**
    * The name of the route.
    */
  var name: HeaderName = js.native
}

object GrpcRouteMetadata {
  @scala.inline
  def apply(name: HeaderName): GrpcRouteMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRouteMetadata]
  }
  @scala.inline
  implicit class GrpcRouteMetadataOps[Self <: GrpcRouteMetadata] (val x: Self) extends AnyVal {
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
    def setName(value: HeaderName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setMatch(value: GrpcRouteMetadataMatchMethod): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
  
}

