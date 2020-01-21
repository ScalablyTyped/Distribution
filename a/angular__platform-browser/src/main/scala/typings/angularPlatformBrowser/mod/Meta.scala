package typings.angularPlatformBrowser.mod

import typings.std.HTMLMetaElement
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
  def addTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
  def addTag(tag: MetaDefinition, forceCreation: Boolean): HTMLMetaElement | Null = js.native
  def addTags(tags: js.Array[MetaDefinition]): js.Array[HTMLMetaElement] = js.native
  def addTags(tags: js.Array[MetaDefinition], forceCreation: Boolean): js.Array[HTMLMetaElement] = js.native
  def getTag(attrSelector: String): HTMLMetaElement | Null = js.native
  def getTags(attrSelector: String): js.Array[HTMLMetaElement] = js.native
  def removeTag(attrSelector: String): Unit = js.native
  def removeTagElement(meta: HTMLMetaElement): Unit = js.native
  def updateTag(tag: MetaDefinition): HTMLMetaElement | Null = js.native
  def updateTag(tag: MetaDefinition, selector: String): HTMLMetaElement | Null = js.native
}

