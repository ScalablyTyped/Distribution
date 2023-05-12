package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spacing extends StObject {
  
  /**
    * Define the bottom spacing.
    */
  var Bottom: js.UndefOr[Length] = js.undefined
  
  /**
    * Define the left spacing.
    */
  var Left: js.UndefOr[Length] = js.undefined
  
  /**
    * Define the right spacing.
    */
  var Right: js.UndefOr[Length] = js.undefined
  
  /**
    * Define the top spacing.
    */
  var Top: js.UndefOr[Length] = js.undefined
}
object Spacing {
  
  inline def apply(): Spacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spacing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Length): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "Bottom", js.undefined)
    
    inline def setLeft(value: Length): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "Left", js.undefined)
    
    inline def setRight(value: Length): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "Right", js.undefined)
    
    inline def setTop(value: Length): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "Top", js.undefined)
  }
}
