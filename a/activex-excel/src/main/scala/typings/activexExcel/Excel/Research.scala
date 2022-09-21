package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.Research_typekey")
  var ExcelDotResearch_typekey: Research = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: Any = js.native
  
  def Query(ServiceID: String): Any = js.native
  def Query(ServiceID: String, QueryString: String): Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: Any): Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: Any, UseSelection: Boolean): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Any,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: Unit, UseSelection: Boolean): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Unit,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Unit,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: Any): Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: Any, UseSelection: Boolean): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: Any, UseSelection: Unit, LaunchQuery: Boolean): Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: Unit, UseSelection: Boolean): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: Unit,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: Unit,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): Any = js.native
  
  def SetLanguagePair(LanguageFrom: Double, LanguageTo: Double): Any = js.native
}
