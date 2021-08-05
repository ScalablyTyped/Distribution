package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoShapeType
import typings.activexPowerpoint.PowerPoint.PpPlaceholderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PlaceholderFormat")
@js.native
/* private */ class PlaceholderFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PlaceholderFormat {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val ContainedType: MsoShapeType = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.PlaceholderFormat_typekey")
  var PowerPointDotPlaceholderFormat_typekey: typings.activexPowerpoint.PowerPoint.PlaceholderFormat = js.native
  
  /* CompleteClass */
  override val Type: PpPlaceholderType = js.native
}
