package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioHlsRenditionSelection extends StObject {
  
  /**
    * Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
    */
  var GroupId: stringMin1
  
  /**
    * Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
    */
  var Name: stringMin1
}
object AudioHlsRenditionSelection {
  
  inline def apply(GroupId: stringMin1, Name: stringMin1): AudioHlsRenditionSelection = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioHlsRenditionSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioHlsRenditionSelection] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: stringMin1): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setName(value: stringMin1): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
