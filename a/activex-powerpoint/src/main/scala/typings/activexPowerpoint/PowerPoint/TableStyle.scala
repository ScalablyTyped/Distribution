package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStyle extends StObject {
  
  val Id: String
  
  val Name: String
  
  /* private */ @JSName("PowerPoint.TableStyle_typekey")
  var PowerPointDotTableStyle_typekey: TableStyle
}
object TableStyle {
  
  inline def apply(Id: String, Name: String, PowerPointDotTableStyle_typekey: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TableStyle_typekey")(PowerPointDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableStyle] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotTableStyle_typekey(value: TableStyle): Self = StObject.set(x, "PowerPoint.TableStyle_typekey", value.asInstanceOf[js.Any])
  }
}
