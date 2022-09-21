package typings.activexOffice.global.Office

import typings.activexOffice.Office.RulerLevels2
import typings.activexOffice.Office.TabStops2
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import typings.activexOffice.activexOfficeNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Ruler2")
@js.native
/* private */ open class Ruler2 ()
  extends StObject
     with typings.activexOffice.Office.Ruler2 {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Levels(Index: `1` | `2` | `3` | `4` | `5`): typings.activexOffice.Office.RulerLevel2 = js.native
  /* CompleteClass */
  @JSName("Levels")
  override val Levels_Original: RulerLevels2 = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Ruler2_typekey")
  var OfficeDotRuler2_typekey: typings.activexOffice.Office.Ruler2 = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def TabStops(Index: Double): typings.activexOffice.Office.TabStop2 = js.native
  /* CompleteClass */
  @JSName("TabStops")
  override val TabStops_Original: TabStops2 = js.native
}
