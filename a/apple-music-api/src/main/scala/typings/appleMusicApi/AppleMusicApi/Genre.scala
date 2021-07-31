package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Name
import typings.appleMusicApi.appleMusicApiStrings.genres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/genre
trait Genre
  extends StObject
     with Resource {
  
  var attributes: Name
  
  @JSName("type")
  var type_Genre: genres
}
object Genre {
  
  @scala.inline
  def apply(attributes: Name, id: String): Genre = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("genres")
    __obj.asInstanceOf[Genre]
  }
  
  @scala.inline
  implicit class GenreMutableBuilder[Self <: Genre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: genres): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
