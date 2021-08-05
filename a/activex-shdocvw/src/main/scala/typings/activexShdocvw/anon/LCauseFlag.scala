package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCauseFlag extends StObject {
  
  var Cancel: Boolean
  
  val lCauseFlag: Double
  
  val pWB2: js.Any
}
object LCauseFlag {
  
  inline def apply(Cancel: Boolean, lCauseFlag: Double, pWB2: js.Any): LCauseFlag = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], lCauseFlag = lCauseFlag.asInstanceOf[js.Any], pWB2 = pWB2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCauseFlag]
  }
  
  extension [Self <: LCauseFlag](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setLCauseFlag(value: Double): Self = StObject.set(x, "lCauseFlag", value.asInstanceOf[js.Any])
    
    inline def setPWB2(value: js.Any): Self = StObject.set(x, "pWB2", value.asInstanceOf[js.Any])
  }
}
