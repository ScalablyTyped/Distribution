package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFragmentsInput extends StObject {
  
  /**
    * Describes the timestamp range and timestamp origin for the range of fragments to return.
    */
  var FragmentSelector: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.FragmentSelector] = js.undefined
  
  /**
    * The total number of fragments to return. If the total number of fragments available is more than the value specified in max-results, then a ListFragmentsOutput$NextToken is provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[ListFragmentsMaxResults] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the ListFragmentsOutput$NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream from which to retrieve a fragment list. Specify either this parameter or the StreamName parameter.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream from which to retrieve a fragment list. Specify either this parameter or the StreamARN parameter.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.StreamName] = js.undefined
}
object ListFragmentsInput {
  
  inline def apply(): ListFragmentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFragmentsInput]
  }
  
  extension [Self <: ListFragmentsInput](x: Self) {
    
    inline def setFragmentSelector(value: FragmentSelector): Self = StObject.set(x, "FragmentSelector", value.asInstanceOf[js.Any])
    
    inline def setFragmentSelectorUndefined: Self = StObject.set(x, "FragmentSelector", js.undefined)
    
    inline def setMaxResults(value: ListFragmentsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
