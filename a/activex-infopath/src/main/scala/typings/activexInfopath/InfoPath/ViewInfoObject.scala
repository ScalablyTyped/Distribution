package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewInfoObject extends StObject {
  
  /* private */ @JSName("InfoPath.ViewInfoObject_typekey")
  var InfoPathDotViewInfoObject_typekey: ViewInfoObject
  
  var IsDefault: Boolean
  
  val Name: String
}
object ViewInfoObject {
  
  inline def apply(InfoPathDotViewInfoObject_typekey: ViewInfoObject, IsDefault: Boolean, Name: String): ViewInfoObject = {
    val __obj = js.Dynamic.literal(IsDefault = IsDefault.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ViewInfoObject_typekey")(InfoPathDotViewInfoObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfoObject]
  }
  
  extension [Self <: ViewInfoObject](x: Self) {
    
    inline def setInfoPathDotViewInfoObject_typekey(value: ViewInfoObject): Self = StObject.set(x, "InfoPath.ViewInfoObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
