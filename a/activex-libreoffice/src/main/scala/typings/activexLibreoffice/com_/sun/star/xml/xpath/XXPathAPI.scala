package typings.activexLibreoffice.com_.sun.star.xml.xpath

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathAPI extends XInterface {
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def eval(contextNode: XNode, expr: String): XXPathObject
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def evalNS(contextNode: XNode, expr: String, namespaceNode: XNode): XXPathObject
  def registerExtension(serviceName: String): Unit
  def registerExtensionInstance(aExtension: XXPathExtension): Unit
  def registerNS(prefix: String, url: String): Unit
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeList(contextNode: XNode, expr: String): XNodeList
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeListNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNodeList
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNode(contextNode: XNode, expr: String): XNode
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNodeNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNode
  def unregisterNS(prefix: String, url: String): Unit
}

object XXPathAPI {
  @scala.inline
  def apply(
    acquire: () => Unit,
    eval: (XNode, String) => XXPathObject,
    evalNS: (XNode, String, XNode) => XXPathObject,
    queryInterface: `type` => js.Any,
    registerExtension: String => Unit,
    registerExtensionInstance: XXPathExtension => Unit,
    registerNS: (String, String) => Unit,
    release: () => Unit,
    selectNodeList: (XNode, String) => XNodeList,
    selectNodeListNS: (XNode, String, XNode) => XNodeList,
    selectSingleNode: (XNode, String) => XNode,
    selectSingleNodeNS: (XNode, String, XNode) => XNode,
    unregisterNS: (String, String) => Unit
  ): XXPathAPI = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), eval = js.Any.fromFunction2(eval), evalNS = js.Any.fromFunction3(evalNS), queryInterface = js.Any.fromFunction1(queryInterface), registerExtension = js.Any.fromFunction1(registerExtension), registerExtensionInstance = js.Any.fromFunction1(registerExtensionInstance), registerNS = js.Any.fromFunction2(registerNS), release = js.Any.fromFunction0(release), selectNodeList = js.Any.fromFunction2(selectNodeList), selectNodeListNS = js.Any.fromFunction3(selectNodeListNS), selectSingleNode = js.Any.fromFunction2(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction3(selectSingleNodeNS), unregisterNS = js.Any.fromFunction2(unregisterNS))
    __obj.asInstanceOf[XXPathAPI]
  }
}

