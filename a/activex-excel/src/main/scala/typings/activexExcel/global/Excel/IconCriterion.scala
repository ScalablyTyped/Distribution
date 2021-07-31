package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlConditionValueTypes
import typings.activexExcel.Excel.XlIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.IconCriterion")
@js.native
class IconCriterion protected ()
  extends StObject
     with typings.activexExcel.Excel.IconCriterion {
  
  /* CompleteClass */
  @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: typings.activexExcel.Excel.IconCriterion = js.native
  
  /* CompleteClass */
  var Icon: XlIcon = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var Operator: Double = js.native
  
  /* CompleteClass */
  var Type: XlConditionValueTypes = js.native
  
  /* CompleteClass */
  var Value: Double | String = js.native
}
