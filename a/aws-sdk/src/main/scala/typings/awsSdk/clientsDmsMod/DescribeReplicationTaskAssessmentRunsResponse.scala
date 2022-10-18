package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationTaskAssessmentRunsResponse extends StObject {
  
  /**
    * A pagination token returned for you to pass to a subsequent request. If you pass this token as the Marker value in a subsequent request, the response includes only records beyond the marker, up to the value specified in the request by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * One or more premigration assessment runs as specified by Filters.
    */
  var ReplicationTaskAssessmentRuns: js.UndefOr[ReplicationTaskAssessmentRunList] = js.undefined
}
object DescribeReplicationTaskAssessmentRunsResponse {
  
  inline def apply(): DescribeReplicationTaskAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationTaskAssessmentRunsResponse]
  }
  
  extension [Self <: DescribeReplicationTaskAssessmentRunsResponse](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReplicationTaskAssessmentRuns(value: ReplicationTaskAssessmentRunList): Self = StObject.set(x, "ReplicationTaskAssessmentRuns", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskAssessmentRunsUndefined: Self = StObject.set(x, "ReplicationTaskAssessmentRuns", js.undefined)
    
    inline def setReplicationTaskAssessmentRunsVarargs(value: ReplicationTaskAssessmentRun*): Self = StObject.set(x, "ReplicationTaskAssessmentRuns", js.Array(value*))
  }
}
