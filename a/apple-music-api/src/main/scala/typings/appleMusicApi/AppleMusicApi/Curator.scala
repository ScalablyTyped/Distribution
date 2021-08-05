package typings.appleMusicApi.AppleMusicApi

import typings.appleMusicApi.anon.Playlists
import typings.appleMusicApi.anon.Url
import typings.appleMusicApi.appleMusicApiStrings.curators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/curator
trait Curator
  extends StObject
     with Resource {
  
  var attributes: js.UndefOr[Url] = js.undefined
  
  var relationships: js.UndefOr[Playlists] = js.undefined
  
  @JSName("type")
  var type_Curator: curators
}
object Curator {
  
  inline def apply(id: String): Curator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("curators")
    __obj.asInstanceOf[Curator]
  }
  
  extension [Self <: Curator](x: Self) {
    
    inline def setAttributes(value: Url): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: Playlists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: curators): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
