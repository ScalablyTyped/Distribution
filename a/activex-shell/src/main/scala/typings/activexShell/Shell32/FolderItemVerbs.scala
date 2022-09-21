package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Definition of interface FolderItemVerbs */
@js.native
trait FolderItemVerbs extends StObject {
  
  /** Get count of open folder windows */
  val Count: Double = js.native
  
  /** Return the specified verb */
  def Item(): FolderItemVerb = js.native
  def Item(index: Any): FolderItemVerb = js.native
  
  /* private */ @JSName("Shell32.FolderItemVerbs_typekey")
  var Shell32DotFolderItemVerbs_typekey: FolderItemVerbs = js.native
}
