package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCalculatedMemberType
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.CalculatedMember")
@js.native
class CalculatedMember protected ()
  extends StObject
     with typings.activexExcel.Excel.CalculatedMember {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DisplayFolder: String = js.native
  
  /* CompleteClass */
  override val Dynamic: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Excel.CalculatedMember_typekey")
  var ExcelDotCalculatedMember_typekey: typings.activexExcel.Excel.CalculatedMember = js.native
  
  /* CompleteClass */
  var FlattenHierarchies: Boolean = js.native
  
  /* CompleteClass */
  override val Formula: String = js.native
  
  /* CompleteClass */
  var HierarchizeDistinct: Boolean = js.native
  
  /* CompleteClass */
  override val IsValid: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val SolveOrder: Double = js.native
  
  /* CompleteClass */
  override val SourceName: String = js.native
  
  /* CompleteClass */
  override val Type: XlCalculatedMemberType = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
