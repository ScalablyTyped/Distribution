package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionBranch extends StObject {
  
  /**
    *  The branch name for the production branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    *  The last deploy time of the production branch. 
    */
  var lastDeployTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The status of the production branch. 
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    *  The thumbnail URL for the production branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
}
object ProductionBranch {
  
  inline def apply(): ProductionBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductionBranch]
  }
  
  extension [Self <: ProductionBranch](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
    
    inline def setLastDeployTime(value: js.Date): Self = StObject.set(x, "lastDeployTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeployTimeUndefined: Self = StObject.set(x, "lastDeployTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setThumbnailUrl(value: ThumbnailUrl): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
