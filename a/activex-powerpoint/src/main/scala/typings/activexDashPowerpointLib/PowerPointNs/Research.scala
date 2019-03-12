package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Research")
@js.native
class Research protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Research_typekey`: Research = js.native
  def IsResearchService(ServiceID: java.lang.String): scala.Boolean = js.native
  /**
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: java.lang.String, QueryString: js.Any, QueryLanguage: js.Any): scala.Unit = js.native
  def Query(
    ServiceID: java.lang.String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: scala.Boolean
  ): scala.Unit = js.native
  def Query(
    ServiceID: java.lang.String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: scala.Boolean,
    LaunchQuery: scala.Boolean
  ): scala.Unit = js.native
  def SetLanguagePair(Language1: js.Any, Language2: js.Any): scala.Unit = js.native
}

