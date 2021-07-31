package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppsResult extends StObject {
  
  /**
    *  A list of Amplify apps. 
    */
  var apps: Apps
  
  /**
    *  A pagination token. Set to null to start listing apps from start. If non-null, the pagination token is returned in a result. Pass its value in here to list more projects. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppsResult {
  
  @scala.inline
  def apply(apps: Apps): ListAppsResult = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppsResult]
  }
  
  @scala.inline
  implicit class ListAppsResultMutableBuilder[Self <: ListAppsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApps(value: Apps): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsVarargs(value: App*): Self = StObject.set(x, "apps", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
