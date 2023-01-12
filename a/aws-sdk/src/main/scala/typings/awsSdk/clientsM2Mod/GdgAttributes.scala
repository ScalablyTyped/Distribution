package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdgAttributes extends StObject {
  
  /**
    * The maximum number of generation data sets, up to 255, in a GDG.
    */
  var limit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The disposition of the data set in the catalog.
    */
  var rollDisposition: js.UndefOr[String] = js.undefined
}
object GdgAttributes {
  
  inline def apply(): GdgAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdgAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GdgAttributes] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setRollDisposition(value: String): Self = StObject.set(x, "rollDisposition", value.asInstanceOf[js.Any])
    
    inline def setRollDispositionUndefined: Self = StObject.set(x, "rollDisposition", js.undefined)
  }
}
