package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppsResult extends js.Object {
  
  /**
    *  A list of Amplify apps. 
    */
  var apps: Apps = js.native
  
  /**
    *  A pagination token. Set to null to start listing apps from start. If non-null, the pagination token is returned in a result. Pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListAppsResult {
  
  @scala.inline
  def apply(apps: Apps): ListAppsResult = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResult]
  }
  
  @scala.inline
  implicit class ListAppsResultOps[Self <: ListAppsResult] (val x: Self) extends AnyVal {
    
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
    def setAppsVarargs(value: App*): Self = this.set("apps", js.Array(value :_*))
    
    @scala.inline
    def setApps(value: Apps): Self = this.set("apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
