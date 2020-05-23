package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide several helper methods for the UI
  *
  * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
  */
trait XFormsUIHelper1 extends js.Object {
  def cloneBindingAsGhost(binding: XPropertySet): XPropertySet
  def createAttribute(xParent: XNode, sName: String): XNode
  def createElement(xParent: XNode, sName: String): XNode
  def getBindingForNode(xNode: XNode, bCreate: Boolean): XPropertySet
  def getBindingName(xBinding: XPropertySet, bDetail: Boolean): String
  def getDefaultBindingExpressionForNode(xNode: XNode): String
  def getDefaultServiceNameForNode(xNode: XNode): String
  def getNodeDisplayName(xNode: XNode, bDetail: Boolean): String
  def getNodeName(xNode: XNode): String
  def getResultForExpression(xBinding: XPropertySet, bIsBindingExpression: Boolean, sExpression: String): String
  def getSubmissionName(xSubm: XPropertySet, bDetail: Boolean): String
  def isValidPrefixName(sName: String): Boolean
  def isValidXMLName(sName: String): Boolean
  def newInstance(sName: String, sURL: String, bURLOnce: Boolean): XDocument
  def newModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): XModel
  def removeBindingForNode(xNode: XNode): Unit
  def removeBindingIfUseless(xBinding: XPropertySet): Unit
  def removeInstance(sName: String): Unit
  def removeModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): Unit
  def renameInstance(sFrom: String, sTo: String, sURL: String, bURLOnce: Boolean): Unit
  def renameModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sFrom: String, sTo: String): Unit
  def renameNode(xNode: XNode, sName: String): XNode
  def setNodeValue(xNode: XNode, sValue: String): Unit
}

object XFormsUIHelper1 {
  @scala.inline
  def apply(
    cloneBindingAsGhost: XPropertySet => XPropertySet,
    createAttribute: (XNode, String) => XNode,
    createElement: (XNode, String) => XNode,
    getBindingForNode: (XNode, Boolean) => XPropertySet,
    getBindingName: (XPropertySet, Boolean) => String,
    getDefaultBindingExpressionForNode: XNode => String,
    getDefaultServiceNameForNode: XNode => String,
    getNodeDisplayName: (XNode, Boolean) => String,
    getNodeName: XNode => String,
    getResultForExpression: (XPropertySet, Boolean, String) => String,
    getSubmissionName: (XPropertySet, Boolean) => String,
    isValidPrefixName: String => Boolean,
    isValidXMLName: String => Boolean,
    newInstance: (String, String, Boolean) => XDocument,
    newModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel,
    removeBindingForNode: XNode => Unit,
    removeBindingIfUseless: XPropertySet => Unit,
    removeInstance: String => Unit,
    removeModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit,
    renameInstance: (String, String, String, Boolean) => Unit,
    renameModel: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit,
    renameNode: (XNode, String) => XNode,
    setNodeValue: (XNode, String) => Unit
  ): XFormsUIHelper1 = {
    val __obj = js.Dynamic.literal(cloneBindingAsGhost = js.Any.fromFunction1(cloneBindingAsGhost), createAttribute = js.Any.fromFunction2(createAttribute), createElement = js.Any.fromFunction2(createElement), getBindingForNode = js.Any.fromFunction2(getBindingForNode), getBindingName = js.Any.fromFunction2(getBindingName), getDefaultBindingExpressionForNode = js.Any.fromFunction1(getDefaultBindingExpressionForNode), getDefaultServiceNameForNode = js.Any.fromFunction1(getDefaultServiceNameForNode), getNodeDisplayName = js.Any.fromFunction2(getNodeDisplayName), getNodeName = js.Any.fromFunction1(getNodeName), getResultForExpression = js.Any.fromFunction3(getResultForExpression), getSubmissionName = js.Any.fromFunction2(getSubmissionName), isValidPrefixName = js.Any.fromFunction1(isValidPrefixName), isValidXMLName = js.Any.fromFunction1(isValidXMLName), newInstance = js.Any.fromFunction3(newInstance), newModel = js.Any.fromFunction2(newModel), removeBindingForNode = js.Any.fromFunction1(removeBindingForNode), removeBindingIfUseless = js.Any.fromFunction1(removeBindingIfUseless), removeInstance = js.Any.fromFunction1(removeInstance), removeModel = js.Any.fromFunction2(removeModel), renameInstance = js.Any.fromFunction4(renameInstance), renameModel = js.Any.fromFunction3(renameModel), renameNode = js.Any.fromFunction2(renameNode), setNodeValue = js.Any.fromFunction2(setNodeValue))
    __obj.asInstanceOf[XFormsUIHelper1]
  }
}

