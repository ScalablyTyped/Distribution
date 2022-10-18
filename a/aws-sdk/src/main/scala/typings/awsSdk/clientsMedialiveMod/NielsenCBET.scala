package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NielsenCBET extends StObject {
  
  /**
    * Enter the CBET check digits to use in the watermark.
    */
  var CbetCheckDigitString: stringMin2Max2
  
  /**
    * Determines the method of CBET insertion mode when prior encoding is detected on the same layer.
    */
  var CbetStepaside: NielsenWatermarksCbetStepaside
  
  /**
    * Enter the CBET Source ID (CSID) to use in the watermark
    */
  var Csid: stringMin1Max7
}
object NielsenCBET {
  
  inline def apply(
    CbetCheckDigitString: stringMin2Max2,
    CbetStepaside: NielsenWatermarksCbetStepaside,
    Csid: stringMin1Max7
  ): NielsenCBET = {
    val __obj = js.Dynamic.literal(CbetCheckDigitString = CbetCheckDigitString.asInstanceOf[js.Any], CbetStepaside = CbetStepaside.asInstanceOf[js.Any], Csid = Csid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NielsenCBET]
  }
  
  extension [Self <: NielsenCBET](x: Self) {
    
    inline def setCbetCheckDigitString(value: stringMin2Max2): Self = StObject.set(x, "CbetCheckDigitString", value.asInstanceOf[js.Any])
    
    inline def setCbetStepaside(value: NielsenWatermarksCbetStepaside): Self = StObject.set(x, "CbetStepaside", value.asInstanceOf[js.Any])
    
    inline def setCsid(value: stringMin1Max7): Self = StObject.set(x, "Csid", value.asInstanceOf[js.Any])
  }
}
