package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceRepositoryBranchesItem extends StObject {
  
  /**
    * The commit ID of the tip of the branch at the time of the request, also known as the head commit.
    */
  var headCommitId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the branch was last updated, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the branch.
    */
  var name: js.UndefOr[SourceRepositoryBranchString] = js.undefined
  
  /**
    * The Git reference name of the branch.
    */
  var ref: js.UndefOr[SourceRepositoryBranchRefString] = js.undefined
}
object ListSourceRepositoryBranchesItem {
  
  inline def apply(): ListSourceRepositoryBranchesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceRepositoryBranchesItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceRepositoryBranchesItem] (val x: Self) extends AnyVal {
    
    inline def setHeadCommitId(value: String): Self = StObject.set(x, "headCommitId", value.asInstanceOf[js.Any])
    
    inline def setHeadCommitIdUndefined: Self = StObject.set(x, "headCommitId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: SourceRepositoryBranchString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRef(value: SourceRepositoryBranchRefString): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
