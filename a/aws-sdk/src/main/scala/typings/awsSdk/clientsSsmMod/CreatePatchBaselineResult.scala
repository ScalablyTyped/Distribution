package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePatchBaselineResult extends StObject {
  
  /**
    * The ID of the created patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineId] = js.undefined
}
object CreatePatchBaselineResult {
  
  inline def apply(): CreatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePatchBaselineResult]
  }
  
  extension [Self <: CreatePatchBaselineResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
  }
}
