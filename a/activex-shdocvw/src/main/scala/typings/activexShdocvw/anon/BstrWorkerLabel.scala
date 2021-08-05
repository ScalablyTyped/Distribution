package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrWorkerLabel extends StObject {
  
  val bstrWorkerLabel: String
  
  val dwUniqueID: Double
}
object BstrWorkerLabel {
  
  inline def apply(bstrWorkerLabel: String, dwUniqueID: Double): BstrWorkerLabel = {
    val __obj = js.Dynamic.literal(bstrWorkerLabel = bstrWorkerLabel.asInstanceOf[js.Any], dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrWorkerLabel]
  }
  
  extension [Self <: BstrWorkerLabel](x: Self) {
    
    inline def setBstrWorkerLabel(value: String): Self = StObject.set(x, "bstrWorkerLabel", value.asInstanceOf[js.Any])
    
    inline def setDwUniqueID(value: Double): Self = StObject.set(x, "dwUniqueID", value.asInstanceOf[js.Any])
  }
}
