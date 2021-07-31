package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpBulletType
import typings.activexPowerpoint.PowerPoint.PpNumberedBulletStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.BulletFormat")
@js.native
class BulletFormat protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.BulletFormat {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Character: Double = js.native
  
  /* CompleteClass */
  override val Font: typings.activexPowerpoint.PowerPoint.Font = js.native
  
  /* CompleteClass */
  override val Number: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Picture(Picture: String): Unit = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.BulletFormat_typekey")
  var PowerPointDotBulletFormat_typekey: typings.activexPowerpoint.PowerPoint.BulletFormat = js.native
  
  /* CompleteClass */
  var RelativeSize: Double = js.native
  
  /* CompleteClass */
  var StartValue: Double = js.native
  
  /* CompleteClass */
  var Style: PpNumberedBulletStyle = js.native
  
  /* CompleteClass */
  var Type: PpBulletType = js.native
  
  /* CompleteClass */
  var UseTextColor: MsoTriState = js.native
  
  /* CompleteClass */
  var UseTextFont: MsoTriState = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
