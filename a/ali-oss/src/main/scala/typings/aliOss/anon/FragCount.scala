package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragCount extends StObject {
  
  var FragCount: Double = js.native
  
  var FragDuration: Double = js.native
  
  var PlaylistName: String = js.native
  
  var Type: String = js.native
}
object FragCount {
  
  @scala.inline
  def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount.asInstanceOf[js.Any], FragDuration = FragDuration.asInstanceOf[js.Any], PlaylistName = PlaylistName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragCount]
  }
  
  @scala.inline
  implicit class FragCountMutableBuilder[Self <: FragCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragCount(value: Double): Self = StObject.set(x, "FragCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragDuration(value: Double): Self = StObject.set(x, "FragDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistName(value: String): Self = StObject.set(x, "PlaylistName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
