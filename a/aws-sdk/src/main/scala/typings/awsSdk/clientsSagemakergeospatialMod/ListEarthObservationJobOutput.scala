package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEarthObservationJobOutput extends StObject {
  
  /**
    * Contains summary information about the Earth Observation jobs.
    */
  var EarthObservationJobSummaries: EarthObservationJobList
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
}
object ListEarthObservationJobOutput {
  
  inline def apply(EarthObservationJobSummaries: EarthObservationJobList): ListEarthObservationJobOutput = {
    val __obj = js.Dynamic.literal(EarthObservationJobSummaries = EarthObservationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEarthObservationJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEarthObservationJobOutput] (val x: Self) extends AnyVal {
    
    inline def setEarthObservationJobSummaries(value: EarthObservationJobList): Self = StObject.set(x, "EarthObservationJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setEarthObservationJobSummariesVarargs(value: ListEarthObservationJobOutputConfig*): Self = StObject.set(x, "EarthObservationJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
