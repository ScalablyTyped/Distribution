package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenTipText extends StObject {
  
  val ScreenTipText: Any
  
  val SourceObject: Any
}
object ScreenTipText {
  
  inline def apply(ScreenTipText: Any, SourceObject: Any): ScreenTipText = {
    val __obj = js.Dynamic.literal(ScreenTipText = ScreenTipText.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenTipText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenTipText] (val x: Self) extends AnyVal {
    
    inline def setScreenTipText(value: Any): Self = StObject.set(x, "ScreenTipText", value.asInstanceOf[js.Any])
    
    inline def setSourceObject(value: Any): Self = StObject.set(x, "SourceObject", value.asInstanceOf[js.Any])
  }
}
