package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsupportedTimestamps extends StObject {
  
  /**
    *  Indicates the total number of unsupported timestamps across the ingested data. 
    */
  var TotalNumberOfUnsupportedTimestamps: Integer
}
object UnsupportedTimestamps {
  
  inline def apply(TotalNumberOfUnsupportedTimestamps: Integer): UnsupportedTimestamps = {
    val __obj = js.Dynamic.literal(TotalNumberOfUnsupportedTimestamps = TotalNumberOfUnsupportedTimestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedTimestamps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsupportedTimestamps] (val x: Self) extends AnyVal {
    
    inline def setTotalNumberOfUnsupportedTimestamps(value: Integer): Self = StObject.set(x, "TotalNumberOfUnsupportedTimestamps", value.asInstanceOf[js.Any])
  }
}
