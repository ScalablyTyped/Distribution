package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline the patch group was registered with.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineId] = js.undefined
  
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.clientsSsmMod.PatchGroup] = js.undefined
}
object RegisterPatchBaselineForPatchGroupResult {
  
  inline def apply(): RegisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupResult]
  }
  
  extension [Self <: RegisterPatchBaselineForPatchGroupResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
