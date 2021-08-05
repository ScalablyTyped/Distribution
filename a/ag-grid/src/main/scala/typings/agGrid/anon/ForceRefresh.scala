package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceRefresh extends StObject {
  
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
  
  var newData: js.UndefOr[Boolean] = js.undefined
  
  var suppressFlash: js.UndefOr[Boolean] = js.undefined
}
object ForceRefresh {
  
  inline def apply(): ForceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceRefresh]
  }
  
  extension [Self <: ForceRefresh](x: Self) {
    
    inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
    
    inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    
    inline def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    inline def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    inline def setSuppressFlash(value: Boolean): Self = StObject.set(x, "suppressFlash", value.asInstanceOf[js.Any])
    
    inline def setSuppressFlashUndefined: Self = StObject.set(x, "suppressFlash", js.undefined)
  }
}
