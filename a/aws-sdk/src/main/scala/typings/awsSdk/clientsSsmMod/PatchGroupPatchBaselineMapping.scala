package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchGroupPatchBaselineMapping extends StObject {
  
  /**
    * The patch baseline the patch group is registered with.
    */
  var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined
  
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.clientsSsmMod.PatchGroup] = js.undefined
}
object PatchGroupPatchBaselineMapping {
  
  inline def apply(): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
  
  extension [Self <: PatchGroupPatchBaselineMapping](x: Self) {
    
    inline def setBaselineIdentity(value: PatchBaselineIdentity): Self = StObject.set(x, "BaselineIdentity", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdentityUndefined: Self = StObject.set(x, "BaselineIdentity", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
