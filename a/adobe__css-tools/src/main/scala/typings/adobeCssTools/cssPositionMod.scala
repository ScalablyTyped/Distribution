package typings.adobeCssTools

import typings.adobeCssTools.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssPositionMod {
  
  @JSImport("@adobe/css-tools/dist/cjs/CssPosition", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Position {
    def this(start: Column, end: Column, source: String) = this()
    
    /* CompleteClass */
    var end: Column = js.native
    
    /* CompleteClass */
    var start: Column = js.native
  }
  
  trait Position extends StObject {
    
    var end: Column
    
    var source: js.UndefOr[String] = js.undefined
    
    var start: Column
  }
  object Position {
    
    inline def apply(end: Column, start: Column): Position = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
