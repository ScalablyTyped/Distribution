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
    acquire: js.Function0[scala.Unit],
    getBoolean: js.Function0[scala.Boolean],
    getByte: js.Function0[scala.Double],
    getDouble: js.Function0[scala.Double],
    getFloat: js.Function0[scala.Double],
    getHyper: js.Function0[scala.Double],
    getLong: js.Function0[scala.Double],
    getNodeList: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList],
    getObjectType: js.Function0[XPathObjectType],
    getShort: js.Function0[scala.Double],
    getString: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XXPathObject = {
    val __obj = js.Dynamic.literal(Boolean = Boolean, Byte = Byte, Double = Double, Float = Float, Hyper = Hyper, Long = Long, NodeList = NodeList, ObjectType = ObjectType, Short = Short, String = String, acquire = acquire, getBoolean = getBoolean, getByte = getByte, getDouble = getDouble, getFloat = getFloat, getHyper = getHyper, getLong = getLong, getNodeList = getNodeList, getObjectType = getObjectType, getShort = getShort, getString = getString, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XXPathObject]
  }
}

