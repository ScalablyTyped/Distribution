package typings.antvComponent.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * 唯一值，用于动画或者查找
    * @type {string}
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * 图形标记
    * @type {object|string}
    */
  var marker: js.UndefOr[js.Object | String] = js.undefined
  
  /**
    * 名称
    * @type {string}
    */
  var name: String
  
  /**
    * 值
    * @type {any}
    */
  var value: Any
}
object ListItem {
  
  inline def apply(name: String, value: Any): ListItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  
  extension [Self <: ListItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMarker(value: js.Object | String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
