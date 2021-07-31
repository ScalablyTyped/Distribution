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
  
  @scala.inline
  def apply[ResourceType](data: js.Array[ResourceType], href: String): Relationship[ResourceType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship[ResourceType]]
  }
  
  @scala.inline
  implicit class RelationshipMutableBuilder[Self <: Relationship[?], ResourceType] (val x: Self & Relationship[ResourceType]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ResourceType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: ResourceType*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
