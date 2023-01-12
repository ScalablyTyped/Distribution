package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByWebACLIdResult extends StObject {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsByWebACLIdResult {
  
  inline def apply(): ListDistributionsByWebACLIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionsByWebACLIdResult] (val x: Self) extends AnyVal {
    
    inline def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    inline def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}
