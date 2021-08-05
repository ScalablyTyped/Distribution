package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The values that define content padding within the map view frame.
  */
trait Padding extends StObject {
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  var bottom: Double
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  var left: Double
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  var right: Double
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  var top: Double
}
object Padding {
  
  inline def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
