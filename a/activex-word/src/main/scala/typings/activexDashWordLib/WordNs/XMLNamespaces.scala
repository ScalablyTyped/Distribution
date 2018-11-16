package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.XMLNamespaces")
@js.native
class XMLNamespaces protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.XMLNamespaces_typekey`: XMLNamespaces = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Path: java.lang.String, NamespaceURI: js.Any, Alias: js.Any): XMLNamespace = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def Add(Path: java.lang.String, NamespaceURI: js.Any, Alias: js.Any, InstallForAllUsers: scala.Boolean): XMLNamespace = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def InstallManifest(Path: java.lang.String): scala.Unit = js.native
  /** @param boolean [InstallForAllUsers=false] */
  def InstallManifest(Path: java.lang.String, InstallForAllUsers: scala.Boolean): scala.Unit = js.native
  def Item(Index: js.Any): XMLNamespace = js.native
}

