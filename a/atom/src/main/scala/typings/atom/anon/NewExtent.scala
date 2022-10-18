package typings.atom.anon

import typings.atom.dependenciesTextBufferSrcTextBufferMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewExtent extends StObject {
  
  /** A Point representing the replacement extent. */
  var newExtent: Point
  
  /** A String representing the replacement text. */
  var newText: String
  
  /** A Point representing the replaced extent. */
  var oldExtent: Point
  
  /** A Point representing where the change started. */
  var start: Point
}
object NewExtent {
  
  inline def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExtent]
  }
  
  extension [Self <: NewExtent](x: Self) {
    
    inline def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    inline def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
