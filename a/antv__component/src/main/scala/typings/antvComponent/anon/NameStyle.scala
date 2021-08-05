package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStyle extends StObject {
  
  var nameStyle: OpacityNumber
}
object NameStyle {
  
  inline def apply(nameStyle: OpacityNumber): NameStyle = {
    val __obj = js.Dynamic.literal(nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStyle]
  }
  
  extension [Self <: NameStyle](x: Self) {
    
    inline def setNameStyle(value: OpacityNumber): Self = StObject.set(x, "nameStyle", value.asInstanceOf[js.Any])
  }
}
