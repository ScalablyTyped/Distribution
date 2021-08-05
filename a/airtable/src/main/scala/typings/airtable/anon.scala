package typings.airtable

import typings.airtable.mod.global.Airtable.Thumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Full extends StObject {
    
    var full: Thumbnail
    
    var large: Thumbnail
    
    var small: Thumbnail
  }
  object Full {
    
    inline def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    extension [Self <: Full](x: Self) {
      
      inline def setFull(value: Thumbnail): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setLarge(value: Thumbnail): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: Thumbnail): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typecast extends StObject {
    
    var typecast: Boolean
  }
  object Typecast {
    
    inline def apply(typecast: Boolean): Typecast = {
      val __obj = js.Dynamic.literal(typecast = typecast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typecast]
    }
    
    extension [Self <: Typecast](x: Self) {
      
      inline def setTypecast(value: Boolean): Self = StObject.set(x, "typecast", value.asInstanceOf[js.Any])
    }
  }
}
