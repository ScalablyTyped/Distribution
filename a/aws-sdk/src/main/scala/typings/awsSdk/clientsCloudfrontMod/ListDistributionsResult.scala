package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsResult extends StObject {
  
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsResult {
  
  inline def apply(): ListDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionsResult] (val x: Self) extends AnyVal {
    
    inline def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    inline def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}
