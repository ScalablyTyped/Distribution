package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightSelector extends StObject {
  
  /**
    * The type of insights to log on a trail. ApiCallRateInsight and ApiErrorRateInsight are valid insight types.
    */
  var InsightType: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.InsightType] = js.undefined
}
object InsightSelector {
  
  inline def apply(): InsightSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightSelector] (val x: Self) extends AnyVal {
    
    inline def setInsightType(value: InsightType): Self = StObject.set(x, "InsightType", value.asInstanceOf[js.Any])
    
    inline def setInsightTypeUndefined: Self = StObject.set(x, "InsightType", js.undefined)
  }
}
