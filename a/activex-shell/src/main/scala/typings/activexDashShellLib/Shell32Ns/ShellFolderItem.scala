package typings
package activexDashShellLib.Shell32Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Shell Folder Item */
@JSGlobal("Shell32.ShellFolderItem")
@js.native
class ShellFolderItem protected () extends js.Object {
  /** Get Application object */
  val Application: js.Any = js.native
  /** If item is a folder return folder object */
  val GetFolder: Folder3 | scala.Null = js.native
  /** If item is link return link object */
  val GetLink: ShellLinkObject | scala.Null = js.native
  /** Indicates if the item can be hosted inside a browser or Windows Explorer frame. */
  val IsBrowsable: scala.Boolean = js.native
  /** Is the item a file system object? */
  val IsFileSystem: scala.Boolean = js.native
  /** Is the item a Folder? */
  val IsFolder: scala.Boolean = js.native
  /** Is the item a link? */
  val IsLink: scala.Boolean = js.native
  /** Modification Date? */
  var ModifyDate: stdLib.VarDate = js.native
  /** Get display name for item */
  var Name: java.lang.String = js.native
  /** Get Parent object */
  val Parent: js.Any = js.native
  /** Get the pathname to the item */
  val Path: java.lang.String = js.native
  var `Shell32.ShellFolderItem_typekey`: ShellFolderItem = js.native
  /** Size */
  val Size: scala.Double = js.native
  /** Contains a string representation of the item's type */
  val Type: java.lang.String = js.native
  /** Access an extended property */
  def ExtendedProperty(bstrPropName: java.lang.String): js.Any = js.native
  /**
    * Execute a command on the item.
    * Must be one of the values returned by the item's `FolderItemVerb.Name` property.
    * If no verb is specified, the default verb will be invoked.
    */
  def InvokeVerb(): scala.Unit = js.native
  def InvokeVerb(vVerb: java.lang.String): scala.Unit = js.native
  /**
    * Extended version of InvokeVerb
    * @param vVerb String that corresponds to the command to be executed. If no verb is specified, the default verb is executed.
    * @param vArgs String with one or more arguments to the command specified by vVerb. The format of this string depends on the particular verb.
    */
  def InvokeVerbEx(): scala.Unit = js.native
  def InvokeVerbEx(vVerb: java.lang.String): scala.Unit = js.native
  def InvokeVerbEx(vVerb: java.lang.String, vArgs: java.lang.String): scala.Unit = js.native
  /** Get the list of verbs for the object */
  def Verbs(): FolderItemVerbs = js.native
}

