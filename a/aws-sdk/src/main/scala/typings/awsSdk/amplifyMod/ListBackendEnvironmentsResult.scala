package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackendEnvironmentsResult extends js.Object {
  
  /**
    *  The list of backend environments for an Amplify app. 
    */
  var backendEnvironments: BackendEnvironments = js.native
  
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBackendEnvironmentsResult {
  
  @scala.inline
  def apply(backendEnvironments: BackendEnvironments): ListBackendEnvironmentsResult = {
    val __obj = js.Dynamic.literal(backendEnvironments = backendEnvironments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendEnvironmentsResult]
  }
  
  @scala.inline
  implicit class ListBackendEnvironmentsResultOps[Self <: ListBackendEnvironmentsResult] (val x: Self) extends AnyVal {
    
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
    def setBackendEnvironmentsVarargs(value: BackendEnvironment*): Self = this.set("backendEnvironments", js.Array(value :_*))
    
    @scala.inline
    def setBackendEnvironments(value: BackendEnvironments): Self = this.set("backendEnvironments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
