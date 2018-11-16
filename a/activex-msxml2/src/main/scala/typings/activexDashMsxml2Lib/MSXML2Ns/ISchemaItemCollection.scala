package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Item Collection */
// tslint:disable-next-line:interface-name
@js.native
trait ISchemaItemCollection extends js.Object {
  val length: scala.Double = js.native
  def apply(index: scala.Double): ISchemaItem = js.native
  def item(index: scala.Double): ISchemaItem = js.native
  def itemByName(name: java.lang.String): ISchemaItem = js.native
  def itemByQName(name: java.lang.String, namespaceURI: java.lang.String): ISchemaItem = js.native
}

