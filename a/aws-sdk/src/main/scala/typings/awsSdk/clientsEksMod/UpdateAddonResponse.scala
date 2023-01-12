package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAddonResponse extends StObject {
  
  var update: js.UndefOr[Update] = js.undefined
}
object UpdateAddonResponse {
  
  inline def apply(): UpdateAddonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAddonResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAddonResponse] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
