package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFastLaunchImagesResult extends StObject {
  
  /**
    * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
    */
  var FastLaunchImages: js.UndefOr[DescribeFastLaunchImagesSuccessSet] = js.undefined
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeFastLaunchImagesResult {
  
  inline def apply(): DescribeFastLaunchImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFastLaunchImagesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFastLaunchImagesResult] (val x: Self) extends AnyVal {
    
    inline def setFastLaunchImages(value: DescribeFastLaunchImagesSuccessSet): Self = StObject.set(x, "FastLaunchImages", value.asInstanceOf[js.Any])
    
    inline def setFastLaunchImagesUndefined: Self = StObject.set(x, "FastLaunchImages", js.undefined)
    
    inline def setFastLaunchImagesVarargs(value: DescribeFastLaunchImagesSuccessItem*): Self = StObject.set(x, "FastLaunchImages", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
