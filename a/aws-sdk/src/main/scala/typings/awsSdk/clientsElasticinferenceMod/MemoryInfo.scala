package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
  /**
    *  The size in mebibytes of the Elastic Inference Accelerator type. 
    */
  var sizeInMiB: js.UndefOr[Integer] = js.undefined
}
object MemoryInfo {
  
  inline def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  extension [Self <: MemoryInfo](x: Self) {
    
    inline def setSizeInMiB(value: Integer): Self = StObject.set(x, "sizeInMiB", value.asInstanceOf[js.Any])
    
    inline def setSizeInMiBUndefined: Self = StObject.set(x, "sizeInMiB", js.undefined)
  }
}
