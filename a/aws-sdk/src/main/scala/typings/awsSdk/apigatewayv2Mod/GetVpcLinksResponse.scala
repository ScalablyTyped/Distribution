package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinksResponse extends js.Object {
  /**
    * A collection of VPC links.
    */
  var Items: js.UndefOr[listOfVpcLink] = js.native
  /**
    * The next page of elements from this collection. Not valid for the last element of the collection.
    */
  var NextToken: js.UndefOr[typings.awsSdk.apigatewayv2Mod.NextToken] = js.native
}

object GetVpcLinksResponse {
  @scala.inline
  def apply(): GetVpcLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcLinksResponse]
  }
  @scala.inline
  implicit class GetVpcLinksResponseOps[Self <: GetVpcLinksResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: VpcLink*): Self = this.set("Items", js.Array(value :_*))
    @scala.inline
    def setItems(value: listOfVpcLink): Self = this.set("Items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

