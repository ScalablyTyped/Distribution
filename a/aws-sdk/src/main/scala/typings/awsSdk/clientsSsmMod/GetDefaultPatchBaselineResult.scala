package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDefaultPatchBaselineResult extends StObject {
  
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineId] = js.undefined
  
  /**
    * The operating system for the returned patch baseline. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsSsmMod.OperatingSystem] = js.undefined
}
object GetDefaultPatchBaselineResult {
  
  inline def apply(): GetDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultPatchBaselineResult]
  }
  
  extension [Self <: GetDefaultPatchBaselineResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
