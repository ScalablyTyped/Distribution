package typings.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlElement extends js.Object {
  var children: js.UndefOr[js.Array[XmlElement]] = js.undefined
  var name: String
  var properties: js.UndefOr[XmlAttributes] = js.undefined
  var textNode: js.UndefOr[String] = js.undefined
}

object XmlElement {
  @scala.inline
  def apply(
    name: String,
    children: js.Array[XmlElement] = null,
    properties: XmlAttributes = null,
    textNode: String = null
  ): XmlElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (textNode != null) __obj.updateDynamic("textNode")(textNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlElement]
  }
}

