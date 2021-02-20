package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair of values in map units that define the width and height of a
  * projected coordinate span.
  */
@js.native
trait MapSize extends StObject {
  
  /**
    * Returns a copy of a map size.
    */
  def copy(): MapSize = js.native
  
  /**
    * Indicates whether two map sizes are equal.
    *
    * @param anotherSize The map size to equate to.
    */
  def equals(anotherSize: MapSize): Boolean = js.native
  
  /**
    * The height value, in map point units.
    */
  var height: Double = js.native
  
  /**
    * The width value, in map point units.
    */
  var width: Double = js.native
}
object MapSize {
  
  @scala.inline
  def apply(copy: () => MapSize, equals_ : MapSize => Boolean, height: Double, width: Double): MapSize = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[MapSize]
  }
  
  @scala.inline
  implicit class MapSizeMutableBuilder[Self <: MapSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => MapSize): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEquals_(value: MapSize => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
