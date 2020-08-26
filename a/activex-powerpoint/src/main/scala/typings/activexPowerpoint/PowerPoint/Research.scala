package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Research extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Research_typekey")
  var PowerPointDotResearch_typekey: Research = js.native
  def IsResearchService(ServiceID: String): Boolean = js.native
  /**
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String, QueryString: js.Any, QueryLanguage: js.Any): Unit = js.native
  def Query(
    ServiceID: String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: js.UndefOr[scala.Nothing],
    LaunchQuery: Boolean
  ): Unit = js.native
  def Query(ServiceID: String, QueryString: js.Any, QueryLanguage: js.Any, UseSelection: Boolean): Unit = js.native
  def Query(
    ServiceID: String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Unit = js.native
  def SetLanguagePair(Language1: js.Any, Language2: js.Any): Unit = js.native
}

