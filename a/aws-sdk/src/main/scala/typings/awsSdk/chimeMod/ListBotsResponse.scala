package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBotsResponse extends js.Object {
  
  /**
    * List of bots and bot details.
    */
  var Bots: js.UndefOr[BotList] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListBotsResponse {
  
  @scala.inline
  def apply(): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotsResponse]
  }
  
  @scala.inline
  implicit class ListBotsResponseOps[Self <: ListBotsResponse] (val x: Self) extends AnyVal {
    
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
    def setBotsVarargs(value: Bot*): Self = this.set("Bots", js.Array(value :_*))
    
    @scala.inline
    def setBots(value: BotList): Self = this.set("Bots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBots: Self = this.set("Bots", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
