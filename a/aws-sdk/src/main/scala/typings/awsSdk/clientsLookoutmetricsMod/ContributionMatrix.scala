package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionMatrix extends StObject {
  
  /**
    * A list of contributing dimensions.
    */
  var DimensionContributionList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionContributionList] = js.undefined
}
object ContributionMatrix {
  
  inline def apply(): ContributionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributionMatrix]
  }
  
  extension [Self <: ContributionMatrix](x: Self) {
    
    inline def setDimensionContributionList(value: DimensionContributionList): Self = StObject.set(x, "DimensionContributionList", value.asInstanceOf[js.Any])
    
    inline def setDimensionContributionListUndefined: Self = StObject.set(x, "DimensionContributionList", js.undefined)
    
    inline def setDimensionContributionListVarargs(value: DimensionContribution*): Self = StObject.set(x, "DimensionContributionList", js.Array(value*))
  }
}
