package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NielsenNaesIiNw extends StObject {
  
  /**
    * Enter the check digit string for the watermark
    */
  var CheckDigitString: stringMin2Max2
  
  /**
    * Enter the Nielsen Source ID (SID) to include in the watermark
    */
  var Sid: doubleMin1Max65535
}
object NielsenNaesIiNw {
  
  inline def apply(CheckDigitString: stringMin2Max2, Sid: doubleMin1Max65535): NielsenNaesIiNw = {
    val __obj = js.Dynamic.literal(CheckDigitString = CheckDigitString.asInstanceOf[js.Any], Sid = Sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NielsenNaesIiNw]
  }
  
  extension [Self <: NielsenNaesIiNw](x: Self) {
    
    inline def setCheckDigitString(value: stringMin2Max2): Self = StObject.set(x, "CheckDigitString", value.asInstanceOf[js.Any])
    
    inline def setSid(value: doubleMin1Max65535): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
  }
}
