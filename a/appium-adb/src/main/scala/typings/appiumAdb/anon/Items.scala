package typings.appiumAdb.anon

import typings.appiumAdb.libToolsSettingsClientCommandsMod.SmsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var items: js.Array[SmsItem]
  
  var total: Double
}
object Items {
  
  inline def apply(items: js.Array[SmsItem], total: Double): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setItems(value: js.Array[SmsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: SmsItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
