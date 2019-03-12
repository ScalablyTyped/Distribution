package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** get value of a boolean object */
  val Boolean: scala.Boolean
  /** get number as byte */
  val Byte: scala.Double
  /** get number as double */
  val Double: scala.Double
  /** get number as float */
  val Float: scala.Double
  /** get number as hyper */
  val Hyper: scala.Double
  /** get number as long */
  val Long: scala.Double
  /** get the nodes from a node list type object */
  val NodeList: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList
  /** get object type */
  val ObjectType: XPathObjectType
  /** get number as short */
  val Short: scala.Double
  /** get string value */
  val String: java.lang.String
  /** get value of a boolean object */
  def getBoolean(): scala.Boolean
  /** get number as byte */
  def getByte(): scala.Double
  /** get number as double */
  def getDouble(): scala.Double
  /** get number as float */
  def getFloat(): scala.Double
  /** get number as hyper */
  def getHyper(): scala.Double
  /** get number as long */
  def getLong(): scala.Double
  /** get the nodes from a node list type object */
  def getNodeList(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList
  /** get object type */
  def getObjectType(): XPathObjectType
  /** get number as short */
  def getShort(): scala.Double
  /** get string value */
  def getString(): java.lang.String
}

object XXPathObject {
  @scala.inline
  def apply(
    Boolean: scala.Boolean,
    Byte: scala.Double,
    Double: scala.Double,
    Float: scala.Double,
    Hyper: scala.Double,
    Long: scala.Double,
    NodeList: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList,
    ObjectType: XPathObjectType,
    Short: scala.Double,
    String: java.lang.String,
    acquire: () => scala.Unit,
    getBoolean: () => scala.Boolean,
    getByte: () => scala.Double,
    getDouble: () => scala.Double,
    getFloat: () => scala.Double,
    getHyper: () => scala.Double,
    getLong: () => scala.Double,
    getNodeList: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList,
    getObjectType: () => XPathObjectType,
    getShort: () => scala.Double,
    getString: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XXPathObject = {
    val __obj = js.Dynamic.literal(Boolean = Boolean, Byte = Byte, Double = Double, Float = Float, Hyper = Hyper, Long = Long, NodeList = NodeList, ObjectType = ObjectType, Short = Short, String = String, acquire = js.Any.fromFunction0(acquire), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getHyper = js.Any.fromFunction0(getHyper), getLong = js.Any.fromFunction0(getLong), getNodeList = js.Any.fromFunction0(getNodeList), getObjectType = js.Any.fromFunction0(getObjectType), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XXPathObject]
  }
}

