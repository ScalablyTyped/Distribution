package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaInfo extends StObject {
  
  /**
    * Describes the FPGAs for the instance type.
    */
  var Fpgas: js.UndefOr[FpgaDeviceInfoList] = js.undefined
  
  /**
    * The total memory of all FPGA accelerators for the instance type.
    */
  var TotalFpgaMemoryInMiB: js.UndefOr[totalFpgaMemory] = js.undefined
}
object FpgaInfo {
  
  inline def apply(): FpgaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FpgaInfo] (val x: Self) extends AnyVal {
    
    inline def setFpgas(value: FpgaDeviceInfoList): Self = StObject.set(x, "Fpgas", value.asInstanceOf[js.Any])
    
    inline def setFpgasUndefined: Self = StObject.set(x, "Fpgas", js.undefined)
    
    inline def setFpgasVarargs(value: FpgaDeviceInfo*): Self = StObject.set(x, "Fpgas", js.Array(value*))
    
    inline def setTotalFpgaMemoryInMiB(value: totalFpgaMemory): Self = StObject.set(x, "TotalFpgaMemoryInMiB", value.asInstanceOf[js.Any])
    
    inline def setTotalFpgaMemoryInMiBUndefined: Self = StObject.set(x, "TotalFpgaMemoryInMiB", js.undefined)
  }
}
