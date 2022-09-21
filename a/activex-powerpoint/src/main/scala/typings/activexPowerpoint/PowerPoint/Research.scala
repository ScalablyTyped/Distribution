package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Research extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def IsResearchService(ServiceID: String): Boolean = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Research_typekey")
  var PowerPointDotResearch_typekey: Research = js.native
  
  /**
    * @param boolean [UseSelection=false]
    * @param boolean [LaunchQuery=true]
    */
  def Query(ServiceID: String, QueryString: Any, QueryLanguage: Any): Unit = js.native
  def Query(ServiceID: String, QueryString: Any, QueryLanguage: Any, UseSelection: Boolean): Unit = js.native
  def Query(
    ServiceID: String,
    QueryString: Any,
    QueryLanguage: Any,
    UseSelection: Boolean,
    LaunchQuery: Boolean
  ): Unit = js.native
  def Query(ServiceID: String, QueryString: Any, QueryLanguage: Any, UseSelection: Unit, LaunchQuery: Boolean): Unit = js.native
  
  def SetLanguagePair(Language1: Any, Language2: Any): Unit = js.native
}
