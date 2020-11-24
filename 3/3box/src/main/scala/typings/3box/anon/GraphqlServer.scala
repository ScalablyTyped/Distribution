package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphqlServer extends js.Object {
  
  var graphqlServer: js.UndefOr[String] = js.native
}
object GraphqlServer {
  
  @scala.inline
  def apply(): GraphqlServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphqlServer]
  }
  
  @scala.inline
  implicit class GraphqlServerOps[Self <: GraphqlServer] (val x: Self) extends AnyVal {
    
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
    def setGraphqlServer(value: String): Self = this.set("graphqlServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphqlServer: Self = this.set("graphqlServer", js.undefined)
  }
}
