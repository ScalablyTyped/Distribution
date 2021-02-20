package typings.airtable

import typings.airtable.mod.global.Airtable.Thumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Full extends StObject {
    
    var full: Thumbnail = js.native
    
    var large: Thumbnail = js.native
    
    var small: Thumbnail = js.native
  }
  object Full {
    
    @scala.inline
    def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Thumbnail): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: Thumbnail): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: Thumbnail): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typecast extends StObject {
    
    var typecast: Boolean = js.native
  }
  object Typecast {
    
    @scala.inline
    def apply(typecast: Boolean): Typecast = {
      val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typecast]
    }
    
    @scala.inline
    implicit class TypecastMutableBuilder[Self <: Typecast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypecast(value: Boolean): Self = StObject.set(x, "typecast", value.asInstanceOf[js.Any])
    }
  }
}
