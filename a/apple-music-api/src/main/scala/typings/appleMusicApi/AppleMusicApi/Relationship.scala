package typings.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/relationship
trait Relationship[ResourceType] extends StObject {
  
  var data: js.Array[ResourceType]
  
  var href: String
  
  var meta: js.UndefOr[js.Any] = js.undefined
  
  var next: js.UndefOr[String] = js.undefined
}
object Relationship {
  
  inline def apply[ResourceType](data: js.Array[ResourceType], href: String): Relationship[ResourceType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship[ResourceType]]
  }
  
  extension [Self <: Relationship[?], ResourceType](x: Self & Relationship[ResourceType]) {
    
    inline def setData(value: js.Array[ResourceType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ResourceType*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
