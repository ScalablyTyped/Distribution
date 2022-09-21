package typings.atvlegacycontentkit.atv

import typings.atvlegacycontentkit.ATVAnimation
import typings.atvlegacycontentkit.ATVColor
import typings.atvlegacycontentkit.ATVFrame
import typings.atvlegacycontentkit.AttributedString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A view that shows a piece of text.
  */
trait TextView
  extends StObject
     with View {
  
  /**
    * The string to display, including formatting.
    */
  var attributedString: AttributedString
}
object TextView {
  
  inline def apply(
    addAnimation: (ATVAnimation, String) => Unit,
    attributedString: AttributedString,
    backgroundColor: ATVColor,
    frame: ATVFrame,
    removeAllAnimations: () => Unit,
    removeAnimation: String => Unit,
    subviews: js.Array[View]
  ): TextView = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction2(addAnimation), attributedString = attributedString.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], removeAllAnimations = js.Any.fromFunction0(removeAllAnimations), removeAnimation = js.Any.fromFunction1(removeAnimation), subviews = subviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextView]
  }
  
  extension [Self <: TextView](x: Self) {
    
    inline def setAttributedString(value: AttributedString): Self = StObject.set(x, "attributedString", value.asInstanceOf[js.Any])
  }
}
