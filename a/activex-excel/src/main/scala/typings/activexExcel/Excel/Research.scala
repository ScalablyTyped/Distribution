package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.Research_typekey")
  var ExcelDotResearch_typekey: Research = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def Query(ServiceID: String): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: js.UndefOr[scala.Nothing], QueryLanguage: js.Any): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.Any,
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.Any,
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: js.UndefOr[scala.Nothing],
    QueryLanguage: js.Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.UndefOr[scala.Nothing],
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: js.Any): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.Any,
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: js.Any, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: js.Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  
  def SetLanguagePair(LanguageFrom: Double, LanguageTo: Double): js.Any = js.native
}
