package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Number format code information returned by various {@link XNumberFormatCode} methods. */
trait NumberFormatCode extends StObject {
  
  var Code: String
  
  var Default: Boolean
  
  var DefaultName: String
  
  var Index: Double
  
  var NameID: String
  
  var Type: Double
  
  var Usage: Double
}
object NumberFormatCode {
  
  inline def apply(
    Code: String,
    Default: Boolean,
    DefaultName: String,
    Index: Double,
    NameID: String,
    Type: Double,
    Usage: Double
  ): NumberFormatCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], DefaultName = DefaultName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], NameID = NameID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Usage = Usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatCode] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "Default", value.asInstanceOf[js.Any])
    
    inline def setDefaultName(value: String): Self = StObject.set(x, "DefaultName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setNameID(value: String): Self = StObject.set(x, "NameID", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: Double): Self = StObject.set(x, "Usage", value.asInstanceOf[js.Any])
  }
}
