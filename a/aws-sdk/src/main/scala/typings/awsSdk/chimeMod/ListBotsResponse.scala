package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBotsResponse extends StObject {
  
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
  implicit class ListBotsResponseMutableBuilder[Self <: ListBotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBots(value: BotList): Self = StObject.set(x, "Bots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotsUndefined: Self = StObject.set(x, "Bots", js.undefined)
    
    @scala.inline
    def setBotsVarargs(value: Bot*): Self = StObject.set(x, "Bots", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
