package typings.activexShell.Shell32

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Shell Folder Item */
@js.native
trait ShellFolderItem extends StObject {
  
  /** Get Application object */
  val Application: Any = js.native
  
  /** Access an extended property */
  def ExtendedProperty(bstrPropName: String): Any = js.native
  
  /** If item is a folder return folder object */
  val GetFolder: Folder3 | Null = js.native
  
  /** If item is link return link object */
  val GetLink: ShellLinkObject | Null = js.native
  
  /**
    * Execute a command on the item.
    * Must be one of the values returned by the item's `FolderItemVerb.Name` property.
    * If no verb is specified, the default verb will be invoked.
    */
  def InvokeVerb(): Unit = js.native
  def InvokeVerb(vVerb: String): Unit = js.native
  
  /**
    * Extended version of InvokeVerb
    * @param vVerb String that corresponds to the command to be executed. If no verb is specified, the default verb is executed.
    * @param vArgs String with one or more arguments to the command specified by vVerb. The format of this string depends on the particular verb.
    */
  def InvokeVerbEx(): Unit = js.native
  def InvokeVerbEx(vVerb: String): Unit = js.native
  def InvokeVerbEx(vVerb: String, vArgs: String): Unit = js.native
  def InvokeVerbEx(vVerb: Unit, vArgs: String): Unit = js.native
  
  /** Indicates if the item can be hosted inside a browser or Windows Explorer frame. */
  val IsBrowsable: Boolean = js.native
  
  /** Is the item a file system object? */
  val IsFileSystem: Boolean = js.native
  
  /** Is the item a Folder? */
  val IsFolder: Boolean = js.native
  
  /** Is the item a link? */
  val IsLink: Boolean = js.native
  
  /** Modification Date? */
  var ModifyDate: VarDate = js.native
  
  /** Get display name for item */
  var Name: String = js.native
  
  /** Get Parent object */
  val Parent: Any = js.native
  
  /** Get the pathname to the item */
  val Path: String = js.native
  
  /* private */ @JSName("Shell32.ShellFolderItem_typekey")
  var Shell32DotShellFolderItem_typekey: ShellFolderItem = js.native
  
  /** Size */
  val Size: Double = js.native
  
  /** Contains a string representation of the item's type */
  val Type: String = js.native
  
  /** Get the list of verbs for the object */
  def Verbs(): FolderItemVerbs = js.native
}
