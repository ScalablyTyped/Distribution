package typings.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Definition of interface FolderItems3 */
@js.native
trait FolderItems3 extends StObject {
  
  /** Get Application object */
  val Application: Any = js.native
  
  /** Get count of items in the folder */
  val Count: Double = js.native
  
  /** Set a wildcard filter to apply to the items returned */
  def Filter(grfFlags: ShellFolderEnumerationFlags, bstrFileSpec: String): Unit = js.native
  
  /**
    * Executes a verb on a collection of `FolderItem` objects
    * @param vVerb String that corresponds to the command to be executed. If no verb is specified, the default verb is executed.
    * @param vArgs String with one or more arguments to the command specified by vVerb. The format of this string depends on the particular verb.
    */
  def InvokeVerbEx(): Unit = js.native
  def InvokeVerbEx(vVerb: String): Unit = js.native
  def InvokeVerbEx(vVerb: String, vArgs: String): Unit = js.native
  def InvokeVerbEx(vVerb: Unit, vArgs: String): Unit = js.native
  
  /** Return the figure for the given index */
  def Item(): ShellFolderItem = js.native
  def Item(index: Any): ShellFolderItem = js.native
  
  /* private */ @JSName("Shell32.FolderItems3_typekey")
  var Shell32DotFolderItems3_typekey: FolderItems3 = js.native
  
  /** Get the list of verbs common to all the items */
  val Verbs: FolderItemVerbs = js.native
}
