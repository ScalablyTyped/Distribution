package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size300[BaseToken] extends StObject {
  
  var size: `300`[BaseToken]
}
object Size300 {
  
  inline def apply[BaseToken](size: `300`[BaseToken]): Size300[BaseToken] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size300[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size300[?], BaseToken] (val x: Self & Size300[BaseToken]) extends AnyVal {
    
    inline def setSize(value: `300`[BaseToken]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
