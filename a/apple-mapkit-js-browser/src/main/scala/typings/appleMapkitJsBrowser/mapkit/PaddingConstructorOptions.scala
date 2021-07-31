package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaddingConstructorOptions extends StObject {
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the bottom edge.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the left edge.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the right edge.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of padding, in CSS pixels, to inset the map from the top edge.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object PaddingConstructorOptions {
  
  @scala.inline
  def apply(): PaddingConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingConstructorOptions]
  }
  
  @scala.inline
  implicit class PaddingConstructorOptionsMutableBuilder[Self <: PaddingConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
