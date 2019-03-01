package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.browseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a node in the hierarchy used to browse available scripts. Objects implementing this interface are expected to also implement
  * {@link com.sun.star.beans.XPropertySet} and, optionally, {@link com.sun.star.script.XInvocation} (see the Developer's Guide for more details).
  */
trait XBrowseNode
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  val ChildNodes: activexDashInteropLib.SafeArray[XBrowseNode]
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  val Name: java.lang.String
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  val Type: scala.Double
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  def getChildNodes(): activexDashInteropLib.SafeArray[XBrowseNode]
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  def getName(): java.lang.String
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  def getType(): scala.Double
  /**
    * Indicates if this node contains any children
    * @returns `boolean` true if there are child nodes.
    */
  def hasChildNodes(): scala.Boolean
}

object XBrowseNode {
  @scala.inline
  def apply(
    ChildNodes: activexDashInteropLib.SafeArray[XBrowseNode],
    Name: java.lang.String,
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getChildNodes: js.Function0[activexDashInteropLib.SafeArray[XBrowseNode]],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    hasChildNodes: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBrowseNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChildNodes")(ChildNodes)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getChildNodes")(getChildNodes)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XBrowseNode]
  }
}

