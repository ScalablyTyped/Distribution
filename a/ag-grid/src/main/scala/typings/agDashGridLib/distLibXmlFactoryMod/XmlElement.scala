package typings
package agDashGridLib.distLibXmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlElement extends js.Object {
  var children: js.UndefOr[js.Array[XmlElement]] = js.undefined
  var name: java.lang.String
  var properties: js.UndefOr[XmlAttributes] = js.undefined
  var textNode: js.UndefOr[java.lang.String] = js.undefined
}

object XmlElement {
  @scala.inline
  def apply(
    name: java.lang.String,
    children: js.Array[XmlElement] = null,
    properties: XmlAttributes = null,
    textNode: java.lang.String = null
  ): XmlElement = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(children)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (textNode != null) __obj.updateDynamic("textNode")(textNode)
    __obj.asInstanceOf[XmlElement]
  }
}

