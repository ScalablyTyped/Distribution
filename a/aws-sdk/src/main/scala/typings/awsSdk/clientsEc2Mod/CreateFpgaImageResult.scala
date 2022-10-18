package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFpgaImageResult extends StObject {
  
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.undefined
  
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
}
object CreateFpgaImageResult {
  
  inline def apply(): CreateFpgaImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFpgaImageResult]
  }
  
  extension [Self <: CreateFpgaImageResult](x: Self) {
    
    inline def setFpgaImageGlobalId(value: String): Self = StObject.set(x, "FpgaImageGlobalId", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageGlobalIdUndefined: Self = StObject.set(x, "FpgaImageGlobalId", js.undefined)
    
    inline def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
  }
}
