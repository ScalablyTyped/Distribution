package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var position: LngLat
}
object Name {
  
  inline def apply(name: String, position: LngLat): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
