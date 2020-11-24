package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGraphqlApisResponse extends js.Object {
  
  /**
    * The GraphqlApi objects.
    */
  var graphqlApis: js.UndefOr[GraphqlApis] = js.native
  
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListGraphqlApisResponse {
  
  @scala.inline
  def apply(): ListGraphqlApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisResponse]
  }
  
  @scala.inline
  implicit class ListGraphqlApisResponseOps[Self <: ListGraphqlApisResponse] (val x: Self) extends AnyVal {
    
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
    def setGraphqlApisVarargs(value: GraphqlApi*): Self = this.set("graphqlApis", js.Array(value :_*))
    
    @scala.inline
    def setGraphqlApis(value: GraphqlApis): Self = this.set("graphqlApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphqlApis: Self = this.set("graphqlApis", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
