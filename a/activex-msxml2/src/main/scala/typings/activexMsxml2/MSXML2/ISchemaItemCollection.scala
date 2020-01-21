package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item Collection */
// tslint:disable-next-line:interface-name
@js.native
trait ISchemaItemCollection extends js.Object {
  val length: Double = js.native
  def apply(index: Double): ISchemaItem = js.native
  def item(index: Double): ISchemaItem = js.native
  def itemByName(name: String): ISchemaItem = js.native
  def itemByQName(name: String, namespaceURI: String): ISchemaItem = js.native
}

