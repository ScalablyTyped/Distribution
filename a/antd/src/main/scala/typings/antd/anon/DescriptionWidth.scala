package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionWidth extends StObject {
  
  var descriptionWidth: Double
}
object DescriptionWidth {
  
  inline def apply(descriptionWidth: Double): DescriptionWidth = {
    val __obj = js.Dynamic.literal(descriptionWidth = descriptionWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionWidth] (val x: Self) extends AnyVal {
    
    inline def setDescriptionWidth(value: Double): Self = StObject.set(x, "descriptionWidth", value.asInstanceOf[js.Any])
  }
}
