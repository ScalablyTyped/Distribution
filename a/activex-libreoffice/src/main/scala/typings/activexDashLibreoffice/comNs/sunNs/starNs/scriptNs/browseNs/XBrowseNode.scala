package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.browseNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a node in the hierarchy used to browse available scripts. Objects implementing this interface are expected to also implement
  * {@link com.sun.star.beans.XPropertySet} and, optionally, {@link com.sun.star.script.XInvocation} (see the Developer's Guide for more details).
  */
trait XBrowseNode extends XInterface {
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  val ChildNodes: SafeArray[XBrowseNode]
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  val Name: String
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  val Type: Double
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  def getChildNodes(): SafeArray[XBrowseNode]
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  def getName(): String
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  def getType(): Double
  /**
    * Indicates if this node contains any children
    * @returns `boolean` true if there are child nodes.
    */
  def hasChildNodes(): Boolean
}

object XBrowseNode {
  @scala.inline
  def apply(
    ChildNodes: SafeArray[XBrowseNode],
    Name: String,
    Type: Double,
    acquire: () => Unit,
    getChildNodes: () => SafeArray[XBrowseNode],
    getName: () => String,
    getType: () => Double,
    hasChildNodes: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBrowseNode = {
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes, Name = Name, Type = Type, acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), hasChildNodes = js.Any.fromFunction0(hasChildNodes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBrowseNode]
  }
}

