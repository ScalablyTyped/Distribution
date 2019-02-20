package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.xpathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XXPathAPI
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def eval(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String
  ): XXPathObject
  /**
    * Evaluate XPath Expression.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns an object representing the result of the XPath evaluation
    * @see XXPathObject
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def evalNS(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String,
    namespaceNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  ): XXPathObject
  def registerExtension(serviceName: java.lang.String): scala.Unit
  def registerExtensionInstance(aExtension: XXPathExtension): scala.Unit
  def registerNS(prefix: java.lang.String, url: java.lang.String): scala.Unit
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeList(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList
  /**
    * Evaluate an XPath expression to select a list of nodes.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a list of nodes
    * @see XNodeList
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectNodeListNS(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String,
    namespaceNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNodeList
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNode(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  /**
    * Evaluate an XPath expression to select a single node.
    * @param contextNode the context node (expression is relative to this node)
    * @param expr the XPath expression
    * @param namespaceNode all namespaces declared on this node will be registered
    * @returns result of the XPath evaluation: a single node
    * @throws XPathException if the expression is malformed, or evaluation fails
    */
  def selectSingleNodeNS(
    contextNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    expr: java.lang.String,
    namespaceNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def unregisterNS(prefix: java.lang.String, url: java.lang.String): scala.Unit
}

