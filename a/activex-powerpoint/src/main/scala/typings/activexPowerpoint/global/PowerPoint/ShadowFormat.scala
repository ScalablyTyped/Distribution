package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ShadowFormat")
@js.native
/* private */ class ShadowFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ShadowFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var Blur: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ForeColor: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  var Obscured: MsoTriState = js.native
  
  /* CompleteClass */
  var OffsetX: Double = js.native
  
  /* CompleteClass */
  var OffsetY: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ShadowFormat_typekey")
  var PowerPointDotShadowFormat_typekey: typings.activexPowerpoint.PowerPoint.ShadowFormat = js.native
  
  /* CompleteClass */
  var RotateWithShape: MsoTriState = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
  
  /* CompleteClass */
  var Style: MsoShadowStyle = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  var Type: MsoShadowType = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
