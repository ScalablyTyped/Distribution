package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedWorkspaceLinks extends StObject {
  
  def apply(Index: Double): SharedWorkspaceLink = js.native
  
  def Add(URL: String): SharedWorkspaceLink = js.native
  def Add(URL: String, Description: js.UndefOr[scala.Nothing], Notes: String): SharedWorkspaceLink = js.native
  def Add(URL: String, Description: String): SharedWorkspaceLink = js.native
  def Add(URL: String, Description: String, Notes: String): SharedWorkspaceLink = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): SharedWorkspaceLink = js.native
  
  val ItemCountExceeded: Boolean = js.native
  
  val Parent: js.Any = js.native
}
