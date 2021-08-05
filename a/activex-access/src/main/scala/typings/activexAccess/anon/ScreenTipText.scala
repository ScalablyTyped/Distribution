package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenTipText extends StObject {
  
  val ScreenTipText: js.Any
  
  val SourceObject: js.Any
}
object ScreenTipText {
  
  inline def apply(ScreenTipText: js.Any, SourceObject: js.Any): ScreenTipText = {
    val __obj = js.Dynamic.literal(ScreenTipText = ScreenTipText.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenTipText]
  }
  
  extension [Self <: ScreenTipText](x: Self) {
    
    inline def setScreenTipText(value: js.Any): Self = StObject.set(x, "ScreenTipText", value.asInstanceOf[js.Any])
    
    inline def setSourceObject(value: js.Any): Self = StObject.set(x, "SourceObject", value.asInstanceOf[js.Any])
  }
}
