package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoEditingType
import typings.activexOffice.Office.MsoSegmentType
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ShapeNode")
@js.native
/* private */ open class ShapeNode ()
  extends StObject
     with typings.activexExcel.Excel.ShapeNode {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val EditingType: MsoEditingType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ShapeNode_typekey")
  var ExcelDotShapeNode_typekey: typings.activexExcel.Excel.ShapeNode = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Points: SafeArray[Double] = js.native
  
  /* CompleteClass */
  override val SegmentType: MsoSegmentType = js.native
}
