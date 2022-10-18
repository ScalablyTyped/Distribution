package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchBaselineIdentity extends StObject {
  
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineDescription] = js.undefined
  
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineId] = js.undefined
  
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineName] = js.undefined
  
  /**
    * Whether this is the default baseline. Amazon Web Services Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typings.awsSdk.clientsSsmMod.DefaultBaseline] = js.undefined
  
  /**
    * Defines the operating system the patch baseline applies to. The default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsSsmMod.OperatingSystem] = js.undefined
}
object PatchBaselineIdentity {
  
  inline def apply(): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
  
  extension [Self <: PatchBaselineIdentity](x: Self) {
    
    inline def setBaselineDescription(value: BaselineDescription): Self = StObject.set(x, "BaselineDescription", value.asInstanceOf[js.Any])
    
    inline def setBaselineDescriptionUndefined: Self = StObject.set(x, "BaselineDescription", js.undefined)
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    inline def setBaselineName(value: BaselineName): Self = StObject.set(x, "BaselineName", value.asInstanceOf[js.Any])
    
    inline def setBaselineNameUndefined: Self = StObject.set(x, "BaselineName", js.undefined)
    
    inline def setDefaultBaseline(value: DefaultBaseline): Self = StObject.set(x, "DefaultBaseline", value.asInstanceOf[js.Any])
    
    inline def setDefaultBaselineUndefined: Self = StObject.set(x, "DefaultBaseline", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
  }
}
