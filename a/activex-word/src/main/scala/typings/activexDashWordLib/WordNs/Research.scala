package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Research")
@js.native
class Research protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  var FavoriteService: java.lang.String = js.native
  val Parent: js.Any = js.native
  var `Word.Research_typekey`: Research = js.native
  def IsResearchService(ServiceID: java.lang.String): scala.Boolean = js.native
  /**
           * @param string [QueryString='']
           * @param Word.WdLanguageID [QueryLanguage=0]
           * @param boolean [UseSelection=false]
           * @param boolean [LaunchQuery=true]
           */
  def Query(ServiceID: java.lang.String): js.Any = js.native
  /**
           * @param string [QueryString='']
           * @param Word.WdLanguageID [QueryLanguage=0]
           * @param boolean [UseSelection=false]
           * @param boolean [LaunchQuery=true]
           */
  def Query(ServiceID: java.lang.String, QueryString: java.lang.String): js.Any = js.native
  /**
           * @param string [QueryString='']
           * @param Word.WdLanguageID [QueryLanguage=0]
           * @param boolean [UseSelection=false]
           * @param boolean [LaunchQuery=true]
           */
  def Query(ServiceID: java.lang.String, QueryString: java.lang.String, QueryLanguage: WdLanguageID): js.Any = js.native
  /**
           * @param string [QueryString='']
           * @param Word.WdLanguageID [QueryLanguage=0]
           * @param boolean [UseSelection=false]
           * @param boolean [LaunchQuery=true]
           */
  def Query(
    ServiceID: java.lang.String,
    QueryString: java.lang.String,
    QueryLanguage: WdLanguageID,
    UseSelection: scala.Boolean
  ): js.Any = js.native
  /**
           * @param string [QueryString='']
           * @param Word.WdLanguageID [QueryLanguage=0]
           * @param boolean [UseSelection=false]
           * @param boolean [LaunchQuery=true]
           */
  def Query(
    ServiceID: java.lang.String,
    QueryString: java.lang.String,
    QueryLanguage: WdLanguageID,
    UseSelection: scala.Boolean,
    LaunchQuery: scala.Boolean
  ): js.Any = js.native
  def SetLanguagePair(LanguageFrom: WdLanguageID, LanguageTo: WdLanguageID): js.Any = js.native
}

