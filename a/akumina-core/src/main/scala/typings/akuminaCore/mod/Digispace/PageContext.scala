package typings.akuminaCore.mod.Digispace

import typings.akuminaCore.AnonEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.PageContext")
@js.native
class PageContext () extends js.Object

/* static members */
@JSImport("akumina-core", "Digispace.PageContext")
@js.native
object PageContext extends js.Object {
  var EditMode: Boolean = js.native
  var PageId: String = js.native
  var PageRouteInfo: AnonEmail = js.native
  def MapPageUrl(pageUrl: String): String = js.native
}

