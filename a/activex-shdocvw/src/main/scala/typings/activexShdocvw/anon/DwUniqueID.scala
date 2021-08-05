package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DwUniqueID extends StObject {
  
  val dwUniqueID: Double
}
object DwUniqueID {
  
  inline def apply(dwUniqueID: Double): DwUniqueID = {
    val __obj = js.Dynamic.literal(dwUniqueID = dwUniqueID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DwUniqueID]
  }
  
  extension [Self <: DwUniqueID](x: Self) {
    
    inline def setDwUniqueID(value: Double): Self = StObject.set(x, "dwUniqueID", value.asInstanceOf[js.Any])
  }
}
