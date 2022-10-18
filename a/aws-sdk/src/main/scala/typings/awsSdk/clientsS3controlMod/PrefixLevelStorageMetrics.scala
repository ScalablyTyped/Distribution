package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixLevelStorageMetrics extends StObject {
  
  /**
    * A container for whether prefix-level storage metrics are enabled.
    */
  var IsEnabled: js.UndefOr[typings.awsSdk.clientsS3controlMod.IsEnabled] = js.undefined
  
  var SelectionCriteria: js.UndefOr[typings.awsSdk.clientsS3controlMod.SelectionCriteria] = js.undefined
}
object PrefixLevelStorageMetrics {
  
  inline def apply(): PrefixLevelStorageMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixLevelStorageMetrics]
  }
  
  extension [Self <: PrefixLevelStorageMetrics](x: Self) {
    
    inline def setIsEnabled(value: IsEnabled): Self = StObject.set(x, "IsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "IsEnabled", js.undefined)
    
    inline def setSelectionCriteria(value: SelectionCriteria): Self = StObject.set(x, "SelectionCriteria", value.asInstanceOf[js.Any])
    
    inline def setSelectionCriteriaUndefined: Self = StObject.set(x, "SelectionCriteria", js.undefined)
  }
}
