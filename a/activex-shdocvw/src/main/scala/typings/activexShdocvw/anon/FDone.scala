package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FDone extends StObject {
  
  val fDone: Any
  
  val nPage: Any
  
  val pDisp: Any
}
object FDone {
  
  inline def apply(fDone: Any, nPage: Any, pDisp: Any): FDone = {
    val __obj = js.Dynamic.literal(fDone = fDone.asInstanceOf[js.Any], nPage = nPage.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FDone]
  }
  
  extension [Self <: FDone](x: Self) {
    
    inline def setFDone(value: Any): Self = StObject.set(x, "fDone", value.asInstanceOf[js.Any])
    
    inline def setNPage(value: Any): Self = StObject.set(x, "nPage", value.asInstanceOf[js.Any])
    
    inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
  }
}
