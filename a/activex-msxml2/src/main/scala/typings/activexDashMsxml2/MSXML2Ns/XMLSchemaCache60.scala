package typings.activexDashMsxml2.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XML Schema Cache 6.0 */
@js.native
trait XMLSchemaCache60 extends js.Object {
  /** number of schemas in collection */
  val length: Double = js.native
  var validateOnLoad: Boolean = js.native
  /** Get namespaceURI for schema by index */
  def apply(index: Double): String = js.native
  /** add a new schema */
  def add(namespaceURI: String, var_1: js.Any): Unit = js.native
  /** copy & merge other collection into this one */
  def addCollection(otherCollection: IXMLDOMSchemaCollection): Unit = js.native
  /** lookup schema by namespaceURI */
  def get(namespaceURI: String): IXMLDOMNode = js.native
  def getDeclaration(node: IXMLDOMNode): ISchemaItem = js.native
  def getSchema(namespaceURI: String): ISchema = js.native
  /** Get namespaceURI for schema by index */
  def namespaceURI(index: Double): String = js.native
  /** remove schema by namespaceURI */
  def remove(namespaceURI: String): Unit = js.native
  def validate(): Unit = js.native
}

