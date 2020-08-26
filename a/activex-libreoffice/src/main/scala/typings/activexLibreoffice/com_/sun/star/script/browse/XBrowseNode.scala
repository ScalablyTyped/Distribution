package typings.activexLibreoffice.com_.sun.star.script.browse

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a node in the hierarchy used to browse available scripts. Objects implementing this interface are expected to also implement
  * {@link com.sun.star.beans.XPropertySet} and, optionally, {@link com.sun.star.script.XInvocation} (see the Developer's Guide for more details).
  */
@js.native
trait XBrowseNode extends XInterface {
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  val ChildNodes: SafeArray[XBrowseNode] = js.native
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  val Name: String = js.native
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  val Type: Double = js.native
  /**
    * Get the children of this node
    * @returns {@link com.sun.star.script.browse.XBrowseNode} sequence of child nodes
    */
  def getChildNodes(): SafeArray[XBrowseNode] = js.native
  /**
    * Get the name of the node
    * @returns The `string` name of this node
    */
  def getName(): String = js.native
  /**
    * the type of the node.
    * @returns A `short` representing the type of this node.
    */
  def getType(): Double = js.native
  /**
    * Indicates if this node contains any children
    * @returns `boolean` true if there are child nodes.
    */
  def hasChildNodes(): Boolean = js.native
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
    val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), hasChildNodes = js.Any.fromFunction0(hasChildNodes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBrowseNode]
  }
  @scala.inline
  implicit class XBrowseNodeOps[Self <: XBrowseNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildNodes(value: SafeArray[XBrowseNode]): Self = this.set("ChildNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetChildNodes(value: () => SafeArray[XBrowseNode]): Self = this.set("getChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
  }
  
}

