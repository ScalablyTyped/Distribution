package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDefault extends StObject {
  
  var `[default]`: Default
  
  var bold: Default
}
object DefaultDefault {
  
  inline def apply(`[default]`: Default, bold: Default): DefaultDefault = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultDefault] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Default): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: Default): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
