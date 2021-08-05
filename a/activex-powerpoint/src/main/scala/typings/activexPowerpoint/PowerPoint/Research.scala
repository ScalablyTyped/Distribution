package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("PowerPoint.Research_typekey")
  var PowerPointDotResearch_typekey: Research = js.native
  
  /**
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String, QueryString: js.Any, QueryLanguage: js.Any): Unit = js.native
  def Query(ServiceID: String, QueryString: js.Any, QueryLanguage: js.Any, UseSelection: Boolean): Unit = js.native
  def Query(
    ServiceID: String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Unit = js.native
  def Query(
    ServiceID: String,
    QueryString: js.Any,
    QueryLanguage: js.Any,
    UseSelection: Unit,
    LaunchQuery: Boolean
  ): Unit = js.native
  
  def SetLanguagePair(Language1: js.Any, Language2: js.Any): Unit = js.native
}
