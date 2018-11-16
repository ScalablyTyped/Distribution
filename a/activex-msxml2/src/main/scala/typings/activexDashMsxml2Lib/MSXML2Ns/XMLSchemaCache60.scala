package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Cache 6.0 */
@js.native
trait XMLSchemaCache60 extends js.Object {
  /** number of schemas in collection */
  val length: scala.Double = js.native
  var validateOnLoad: scala.Boolean = js.native
  /** Get namespaceURI for schema by index */
  def apply(index: scala.Double): java.lang.String = js.native
  /** add a new schema */
  def add(namespaceURI: java.lang.String, var_1: js.Any): scala.Unit = js.native
  /** copy & merge other collection into this one */
  def addCollection(otherCollection: IXMLDOMSchemaCollection): scala.Unit = js.native
  /** lookup schema by namespaceURI */
  def get(namespaceURI: java.lang.String): IXMLDOMNode = js.native
  def getDeclaration(node: IXMLDOMNode): ISchemaItem = js.native
  def getSchema(namespaceURI: java.lang.String): ISchema = js.native
  /** Get namespaceURI for schema by index */
  def namespaceURI(index: scala.Double): java.lang.String = js.native
  /** remove schema by namespaceURI */
  def remove(namespaceURI: java.lang.String): scala.Unit = js.native
  def validate(): scala.Unit = js.native
}

