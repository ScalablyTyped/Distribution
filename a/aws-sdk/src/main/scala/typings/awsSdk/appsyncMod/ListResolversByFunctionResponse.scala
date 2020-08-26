package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResolversByFunctionResponse extends js.Object {
  /**
    * An identifier that can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of resolvers.
    */
  var resolvers: js.UndefOr[Resolvers] = js.native
}

object ListResolversByFunctionResponse {
  @scala.inline
  def apply(): ListResolversByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolversByFunctionResponse]
  }
  @scala.inline
  implicit class ListResolversByFunctionResponseOps[Self <: ListResolversByFunctionResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setResolversVarargs(value: Resolver*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: Resolvers): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
  }
  
}

