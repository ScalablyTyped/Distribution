package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterResult extends StObject {
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClusterId] = js.undefined
  
  /**
    * List of jobs created for this cluster. For syntax, see ListJobsResult$JobListEntries in this guide.
    */
  var JobListEntries: js.UndefOr[JobListEntryList] = js.undefined
}
object CreateClusterResult {
  
  inline def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterResult] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setJobListEntries(value: JobListEntryList): Self = StObject.set(x, "JobListEntries", value.asInstanceOf[js.Any])
    
    inline def setJobListEntriesUndefined: Self = StObject.set(x, "JobListEntries", js.undefined)
    
    inline def setJobListEntriesVarargs(value: JobListEntry*): Self = StObject.set(x, "JobListEntries", js.Array(value*))
  }
}
