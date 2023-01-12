package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxRows extends StObject {
  
  var maxRows: js.UndefOr[Double] = js.undefined
  
  var minRows: js.UndefOr[Double] = js.undefined
}
object MaxRows {
  
  inline def apply(): MaxRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxRows] (val x: Self) extends AnyVal {
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
    
    inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
  }
}
