package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragCount extends StObject {
  
  var FragCount: Double
  
  var FragDuration: Double
  
  var PlaylistName: String
  
  var Type: String
}
object FragCount {
  
  inline def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount.asInstanceOf[js.Any], FragDuration = FragDuration.asInstanceOf[js.Any], PlaylistName = PlaylistName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragCount]
  }
  
  extension [Self <: FragCount](x: Self) {
    
    inline def setFragCount(value: Double): Self = StObject.set(x, "FragCount", value.asInstanceOf[js.Any])
    
    inline def setFragDuration(value: Double): Self = StObject.set(x, "FragDuration", value.asInstanceOf[js.Any])
    
    inline def setPlaylistName(value: String): Self = StObject.set(x, "PlaylistName", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
