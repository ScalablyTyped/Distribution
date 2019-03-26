package typings
package agDashGridLib.distLibXmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/xmlFactory", "XmlFactory")
@js.native
class XmlFactory () extends js.Object {
  def createXml(xmlElement: XmlElement): java.lang.String = js.native
  def createXml(
    xmlElement: XmlElement,
    booleanTransformer: js.Function1[/* currentValue */ scala.Boolean, java.lang.String]
  ): java.lang.String = js.native
  /* private */ def returnAttributeIfPopulated(key: js.Any, value: js.Any): js.Any = js.native
  /* private */ def returnAttributeIfPopulated(key: js.Any, value: js.Any, booleanTransformer: js.Any): js.Any = js.native
}

