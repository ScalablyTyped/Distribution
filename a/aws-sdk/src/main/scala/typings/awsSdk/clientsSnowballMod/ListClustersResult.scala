package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersResult extends StObject {
  
  /**
    * Each ClusterListEntry object contains a cluster's state, a cluster's ID, and other important status information.
    */
  var ClusterListEntries: js.UndefOr[ClusterListEntryList] = js.undefined
  
  /**
    * HTTP requests are stateless. If you use the automatically generated NextToken value in your next ClusterListEntry call, your list of returned clusters will start from this point in the array.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListClustersResult {
  
  inline def apply(): ListClustersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClustersResult] (val x: Self) extends AnyVal {
    
    inline def setClusterListEntries(value: ClusterListEntryList): Self = StObject.set(x, "ClusterListEntries", value.asInstanceOf[js.Any])
    
    inline def setClusterListEntriesUndefined: Self = StObject.set(x, "ClusterListEntries", js.undefined)
    
    inline def setClusterListEntriesVarargs(value: ClusterListEntry*): Self = StObject.set(x, "ClusterListEntries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
