package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedNamedQueryId extends js.Object {
  
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.native
  
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.native
  
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.native
}
object UnprocessedNamedQueryId {
  
  @scala.inline
  def apply(): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
  
  @scala.inline
  implicit class UnprocessedNamedQueryIdOps[Self <: UnprocessedNamedQueryId] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = this.set("NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedQueryId: Self = this.set("NamedQueryId", js.undefined)
  }
}
