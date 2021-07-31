package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var FavoriteService: String = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  /**
    * @param string [QueryString='']
    * @param Word.WdLanguageID [QueryLanguage=0]
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: Unit, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Unit,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: Unit,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: WdLanguageID,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: Unit, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: Unit,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: Unit,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: WdLanguageID): js.Any = js.native
  def Query(ServiceID: String, QueryString: Unit, QueryLanguage: WdLanguageID, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: Unit,
    QueryLanguage: WdLanguageID,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): js.Any = js.native
  
  def SetLanguagePair(LanguageFrom: WdLanguageID, LanguageTo: WdLanguageID): js.Any = js.native
  
  @JSName("Word.Research_typekey")
  var WordDotResearch_typekey: Research = js.native
}
