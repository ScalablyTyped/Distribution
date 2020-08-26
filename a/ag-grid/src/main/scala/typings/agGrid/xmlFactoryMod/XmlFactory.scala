package typings.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/xmlFactory", "XmlFactory")
@js.native
class XmlFactory () extends js.Object {
  def createXml(xmlElement: XmlElement): String = js.native
  def createXml(xmlElement: XmlElement, booleanTransformer: js.Function1[/* currentValue */ Boolean, String]): String = js.native
  /* private */ def returnAttributeIfPopulated(key: js.Any, value: js.Any, booleanTransformer: js.Any): js.Any = js.native
}

