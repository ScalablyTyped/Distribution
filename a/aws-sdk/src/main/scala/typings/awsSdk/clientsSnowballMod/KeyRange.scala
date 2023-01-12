package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRange extends StObject {
  
  /**
    * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var BeginMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var EndMarker: js.UndefOr[String] = js.undefined
}
object KeyRange {
  
  inline def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyRange] (val x: Self) extends AnyVal {
    
    inline def setBeginMarker(value: String): Self = StObject.set(x, "BeginMarker", value.asInstanceOf[js.Any])
    
    inline def setBeginMarkerUndefined: Self = StObject.set(x, "BeginMarker", js.undefined)
    
    inline def setEndMarker(value: String): Self = StObject.set(x, "EndMarker", value.asInstanceOf[js.Any])
    
    inline def setEndMarkerUndefined: Self = StObject.set(x, "EndMarker", js.undefined)
  }
}
