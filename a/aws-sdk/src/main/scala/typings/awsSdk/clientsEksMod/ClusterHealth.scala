package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealth extends StObject {
  
  /**
    * An object representing the health issues of your local Amazon EKS cluster on an Amazon Web Services Outpost.
    */
  var issues: js.UndefOr[ClusterIssueList] = js.undefined
}
object ClusterHealth {
  
  inline def apply(): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealth]
  }
  
  extension [Self <: ClusterHealth](x: Self) {
    
    inline def setIssues(value: ClusterIssueList): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setIssuesVarargs(value: ClusterIssue*): Self = StObject.set(x, "issues", js.Array(value*))
  }
}
