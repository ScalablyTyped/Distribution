package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Research")
@js.native
class Research protected () extends js.Object {
  val Application: Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.Research_typekey`: Research = js.native
  val Parent: js.Any = js.native
  def IsResearchService(ServiceID: java.lang.String): scala.Boolean = js.native
  def Query(ServiceID: java.lang.String): js.Any = js.native
  def Query(ServiceID: java.lang.String, QueryString: java.lang.String): js.Any = js.native
  def Query(ServiceID: java.lang.String, QueryString: java.lang.String, QueryLanguage: js.Any): js.Any = js.native
  def Query(
    ServiceID: java.lang.String,
    QueryString: java.lang.String,
    QueryLanguage: js.Any,
    UseSelection: scala.Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: java.lang.String,
    QueryString: java.lang.String,
    QueryLanguage: js.Any,
    UseSelection: scala.Boolean,
    LaunchQuery: scala.Boolean
  ): js.Any = js.native
  def SetLanguagePair(LanguageFrom: scala.Double, LanguageTo: scala.Double): js.Any = js.native
}

