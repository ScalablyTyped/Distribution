package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendAPIConflictResolution extends StObject {
  
  /**
    * The strategy for conflict resolution.
    */
  var ResolutionStrategy: js.UndefOr[typings.awsSdk.clientsAmplifybackendMod.ResolutionStrategy] = js.undefined
}
object BackendAPIConflictResolution {
  
  inline def apply(): BackendAPIConflictResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendAPIConflictResolution]
  }
  
  extension [Self <: BackendAPIConflictResolution](x: Self) {
    
    inline def setResolutionStrategy(value: ResolutionStrategy): Self = StObject.set(x, "ResolutionStrategy", value.asInstanceOf[js.Any])
    
    inline def setResolutionStrategyUndefined: Self = StObject.set(x, "ResolutionStrategy", js.undefined)
  }
}
