package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLProject extends StObject {
  
  val Application: Any = js.native
  
  val Creator: Double = js.native
  
  def HTMLProjectItems(Index: Any): HTMLProjectItem = js.native
  @JSName("HTMLProjectItems")
  val HTMLProjectItems_Original: HTMLProjectItems = js.native
  
  /* private */ @JSName("Office.HTMLProject_typekey")
  var OfficeDotHTMLProject_typekey: HTMLProject = js.native
  
  /** @param OpenKind [OpenKind=0] */
  def Open(): Unit = js.native
  def Open(OpenKind: MsoHTMLProjectOpen): Unit = js.native
  
  val Parent: Any = js.native
  
  /** @param Refresh [Refresh=true] */
  def RefreshDocument(): Unit = js.native
  def RefreshDocument(Refresh: Boolean): Unit = js.native
  
  /** @param Refresh [Refresh=true] */
  def RefreshProject(): Unit = js.native
  def RefreshProject(Refresh: Boolean): Unit = js.native
  
  val State: MsoHTMLProjectState = js.native
}
