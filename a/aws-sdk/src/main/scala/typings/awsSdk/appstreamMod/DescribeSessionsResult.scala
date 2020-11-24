package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSessionsResult extends js.Object {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the streaming sessions.
    */
  var Sessions: js.UndefOr[SessionList] = js.native
}
object DescribeSessionsResult {
  
  @scala.inline
  def apply(): DescribeSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSessionsResult]
  }
  
  @scala.inline
  implicit class DescribeSessionsResultOps[Self <: DescribeSessionsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = this.set("Sessions", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: SessionList): Self = this.set("Sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("Sessions", js.undefined)
  }
}
