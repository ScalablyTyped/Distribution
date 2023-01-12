package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulerLevel2 extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var FirstMargin: Double
  
  var LeftMargin: Double
  
  /* private */ @JSName("Office.RulerLevel2_typekey")
  var OfficeDotRulerLevel2_typekey: RulerLevel2
  
  val Parent: Any
}
object RulerLevel2 {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    FirstMargin: Double,
    LeftMargin: Double,
    OfficeDotRulerLevel2_typekey: RulerLevel2,
    Parent: Any
  ): RulerLevel2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.RulerLevel2_typekey")(OfficeDotRulerLevel2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulerLevel2] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFirstMargin(value: Double): Self = StObject.set(x, "FirstMargin", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotRulerLevel2_typekey(value: RulerLevel2): Self = StObject.set(x, "Office.RulerLevel2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
