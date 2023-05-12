package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight extends StObject {
  
  var lineHeight: `200`
}
object LineHeight {
  
  inline def apply(lineHeight: `200`): LineHeight = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeight] (val x: Self) extends AnyVal {
    
    inline def setLineHeight(value: `200`): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
