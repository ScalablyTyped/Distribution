package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMappedResourceConfigurationInput extends StObject {
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[MappedResourceConfigurationListLimit] = js.undefined
  
  /**
    * The token to provide in your next request, to get another batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
}
object DescribeMappedResourceConfigurationInput {
  
  inline def apply(): DescribeMappedResourceConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMappedResourceConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMappedResourceConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MappedResourceConfigurationListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
