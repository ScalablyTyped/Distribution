package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulerLevel2 extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var FirstMargin: Double = js.native
  
  var LeftMargin: Double = js.native
  
  @JSName("Office.RulerLevel2_typekey")
  var OfficeDotRulerLevel2_typekey: RulerLevel2 = js.native
  
  val Parent: js.Any = js.native
}
object RulerLevel2 {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FirstMargin: Double,
    LeftMargin: Double,
    OfficeDotRulerLevel2_typekey: RulerLevel2,
    Parent: js.Any
  ): RulerLevel2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FirstMargin = FirstMargin.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.RulerLevel2_typekey")(OfficeDotRulerLevel2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulerLevel2]
  }
  
  @scala.inline
  implicit class RulerLevel2MutableBuilder[Self <: RulerLevel2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMargin(value: Double): Self = StObject.set(x, "FirstMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotRulerLevel2_typekey(value: RulerLevel2): Self = StObject.set(x, "Office.RulerLevel2_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
