package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingDistributionsResult extends StObject {
  
  /**
    * The StreamingDistributionList type. 
    */
  var StreamingDistributionList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.StreamingDistributionList] = js.undefined
}
object ListStreamingDistributionsResult {
  
  inline def apply(): ListStreamingDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamingDistributionsResult] (val x: Self) extends AnyVal {
    
    inline def setStreamingDistributionList(value: StreamingDistributionList): Self = StObject.set(x, "StreamingDistributionList", value.asInstanceOf[js.Any])
    
    inline def setStreamingDistributionListUndefined: Self = StObject.set(x, "StreamingDistributionList", js.undefined)
  }
}
