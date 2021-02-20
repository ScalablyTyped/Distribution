package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceRefresh extends StObject {
  
  var forceRefresh: js.UndefOr[Boolean] = js.native
  
  var newData: js.UndefOr[Boolean] = js.native
  
  var suppressFlash: js.UndefOr[Boolean] = js.native
}
object ForceRefresh {
  
  @scala.inline
  def apply(): ForceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceRefresh]
  }
  
  @scala.inline
  implicit class ForceRefreshMutableBuilder[Self <: ForceRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    
    @scala.inline
    def setNewData(value: Boolean): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDataUndefined: Self = StObject.set(x, "newData", js.undefined)
    
    @scala.inline
    def setSuppressFlash(value: Boolean): Self = StObject.set(x, "suppressFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressFlashUndefined: Self = StObject.set(x, "suppressFlash", js.undefined)
  }
}
