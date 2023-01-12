package typings.autoprefixerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Inline extends StObject {
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var prev: js.UndefOr[String | js.Object] = js.undefined
  }
  object Inline {
    
    inline def apply(): Inline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inline] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setPrev(value: String | js.Object): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
