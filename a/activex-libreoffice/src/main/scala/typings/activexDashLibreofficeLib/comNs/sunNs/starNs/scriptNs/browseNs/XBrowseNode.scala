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

