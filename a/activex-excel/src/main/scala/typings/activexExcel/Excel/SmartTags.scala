package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTags extends js.Object {
  
  def apply(Index: js.Any): SmartTag = js.native
  
  def Add(SmartTagType: String): SmartTag = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): SmartTag = js.native
}
