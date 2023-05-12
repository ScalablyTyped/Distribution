package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMappedResourceConfigurationOutput extends StObject {
  
  /**
    * A structure that encapsulates, or contains, the media storage configuration properties.
    */
  var MappedResourceConfigurationList: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.MappedResourceConfigurationList] = js.undefined
  
  /**
    * The token that was used in the NextTokenrequest to fetch the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.NextToken] = js.undefined
}
object DescribeMappedResourceConfigurationOutput {
  
  inline def apply(): DescribeMappedResourceConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMappedResourceConfigurationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMappedResourceConfigurationOutput] (val x: Self) extends AnyVal {
    
    inline def setMappedResourceConfigurationList(value: MappedResourceConfigurationList): Self = StObject.set(x, "MappedResourceConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setMappedResourceConfigurationListUndefined: Self = StObject.set(x, "MappedResourceConfigurationList", js.undefined)
    
    inline def setMappedResourceConfigurationListVarargs(value: MappedResourceConfigurationListItem*): Self = StObject.set(x, "MappedResourceConfigurationList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
