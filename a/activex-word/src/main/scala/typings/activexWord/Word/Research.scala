package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Research")
@js.native
class Research protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var FavoriteService: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Research_typekey")
  var WordDotResearch_typekey: Research = js.native
  def IsResearchService(ServiceID: String): Boolean = js.native
  /**
    * @param string [QueryString='']
    * @param Word.WdLanguageID [QueryLanguage=0]
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID): js.Any = js.native
  def Query(ServiceID: String, QueryString: String, QueryLanguage: WdLanguageID, UseSelection: Boolean): js.Any = js.native
  def Query(
    ServiceID: String,
    QueryString: String,
    QueryLanguage: WdLanguageID,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): js.Any = js.native
  def SetLanguagePair(LanguageFrom: WdLanguageID, LanguageTo: WdLanguageID): js.Any = js.native
}

