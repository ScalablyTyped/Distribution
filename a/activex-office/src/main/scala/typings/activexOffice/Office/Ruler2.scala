package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import typings.activexOffice.activexOfficeNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ruler2 extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Levels(Index: `1` | `2` | `3` | `4` | `5`): RulerLevel2
  @JSName("Levels")
  val Levels_Original: RulerLevels2
  
  /* private */ @JSName("Office.Ruler2_typekey")
  var OfficeDotRuler2_typekey: Ruler2
  
  val Parent: Any
  
  def TabStops(Index: Double): TabStop2
  @JSName("TabStops")
  val TabStops_Original: TabStops2
}
object Ruler2 {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Levels: RulerLevels2,
    OfficeDotRuler2_typekey: Ruler2,
    Parent: Any,
    TabStops: TabStops2
  ): Ruler2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TabStops = TabStops.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Ruler2_typekey")(OfficeDotRuler2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler2]
  }
  
  extension [Self <: Ruler2](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setLevels(value: RulerLevels2): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotRuler2_typekey(value: Ruler2): Self = StObject.set(x, "Office.Ruler2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setTabStops(value: TabStops2): Self = StObject.set(x, "TabStops", value.asInstanceOf[js.Any])
  }
}
