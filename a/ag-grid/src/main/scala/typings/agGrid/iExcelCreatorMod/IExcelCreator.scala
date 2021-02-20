package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExcelCreator extends StObject {
  
  def exportDataAsExcel(): Unit = js.native
  def exportDataAsExcel(params: ExcelExportParams): Unit = js.native
  
  def getDataAsExcelXml(): String = js.native
  def getDataAsExcelXml(params: ExcelExportParams): String = js.native
}
