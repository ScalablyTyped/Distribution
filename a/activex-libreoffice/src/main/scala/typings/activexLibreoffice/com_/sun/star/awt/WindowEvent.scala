package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a window event. */
trait WindowEvent
  extends StObject
     with EventObject {
  
  /**
    * specifies the inset from the bottom.
    *
    * The inset is the distance between the outer and the inner window, that means the bottom inset is the height of the bottom border.
    */
  var BottomInset: Double
  
  /** specifies the outer (total) height of the window. */
  var Height: Double
  
  /**
    * specifies the inset from the left.
    *
    * The inset is the distance between the outer and the inner window, that means the left inset is the width of the left border.
    */
  var LeftInset: Double
  
  /**
    * specifies the inset from the right.
    *
    * The inset is the distance between the outer and the inner window, that means the right inset is the width of the right border.
    */
  var RightInset: Double
  
  /**
    * specifies the inset from the top.
    *
    * The inset is the distance between the outer and the inner window, that means the top inset is the height of the top border.
    */
  var TopInset: Double
  
  /** specifies the outer (total) width of the window. */
  var Width: Double
  
  /** specifies the outer x position of the window. */
  var X: Double
  
  /** specifies the outer y position of the window. */
  var Y: Double
}
object WindowEvent {
  
  inline def apply(
    BottomInset: Double,
    Height: Double,
    LeftInset: Double,
    RightInset: Double,
    Source: XInterface,
    TopInset: Double,
    Width: Double,
    X: Double,
    Y: Double
  ): WindowEvent = {
    val __obj = js.Dynamic.literal(BottomInset = BottomInset.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], LeftInset = LeftInset.asInstanceOf[js.Any], RightInset = RightInset.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], TopInset = TopInset.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEvent]
  }
  
  extension [Self <: WindowEvent](x: Self) {
    
    inline def setBottomInset(value: Double): Self = StObject.set(x, "BottomInset", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeftInset(value: Double): Self = StObject.set(x, "LeftInset", value.asInstanceOf[js.Any])
    
    inline def setRightInset(value: Double): Self = StObject.set(x, "RightInset", value.asInstanceOf[js.Any])
    
    inline def setTopInset(value: Double): Self = StObject.set(x, "TopInset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
