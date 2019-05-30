package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "Meta")
@js.native
class Meta protected () extends js.Object {
  def this(_doc: js.Any) = this()
  var _containsAttributes: js.Any = js.native
  var _doc: js.Any = js.native
  var _dom: js.Any = js.native
  var _getOrCreateElement: js.Any = js.native
  var _parseSelector: js.Any = js.native
  var _setMetaElementAttributes: js.Any = js.native
  def addTag(tag: MetaDefinition): stdLib.HTMLMetaElement | scala.Null = js.native
  def addTag(tag: MetaDefinition, forceCreation: scala.Boolean): stdLib.HTMLMetaElement | scala.Null = js.native
  def addTags(tags: js.Array[MetaDefinition]): js.Array[stdLib.HTMLMetaElement] = js.native
  def addTags(tags: js.Array[MetaDefinition], forceCreation: scala.Boolean): js.Array[stdLib.HTMLMetaElement] = js.native
  def getTag(attrSelector: java.lang.String): stdLib.HTMLMetaElement | scala.Null = js.native
  def getTags(attrSelector: java.lang.String): js.Array[stdLib.HTMLMetaElement] = js.native
  def removeTag(attrSelector: java.lang.String): scala.Unit = js.native
  def removeTagElement(meta: stdLib.HTMLMetaElement): scala.Unit = js.native
  def updateTag(tag: MetaDefinition): stdLib.HTMLMetaElement | scala.Null = js.native
  def updateTag(tag: MetaDefinition, selector: java.lang.String): stdLib.HTMLMetaElement | scala.Null = js.native
}

