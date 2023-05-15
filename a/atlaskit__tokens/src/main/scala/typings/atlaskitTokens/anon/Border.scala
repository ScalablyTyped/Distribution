package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Border extends StObject {
  
  var border: Bold
}
object Border {
  
  inline def apply(border: Bold): Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Bold): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
