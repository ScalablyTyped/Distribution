package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide several helper methods for the UI
  *
  * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
  */
trait XFormsUIHelper1 extends js.Object {
  def cloneBindingAsGhost(binding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def createAttribute(xParent: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, sName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def createElement(xParent: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, sName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def getBindingForNode(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, bCreate: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def getBindingName(
    xBinding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    bDetail: scala.Boolean
  ): java.lang.String
  def getDefaultBindingExpressionForNode(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode): java.lang.String
  def getDefaultServiceNameForNode(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode): java.lang.String
  def getNodeDisplayName(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, bDetail: scala.Boolean): java.lang.String
  def getNodeName(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode): java.lang.String
  def getResultForExpression(
    xBinding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    bIsBindingExpression: scala.Boolean,
    sExpression: java.lang.String
  ): java.lang.String
  def getSubmissionName(xSubm: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, bDetail: scala.Boolean): java.lang.String
  def isValidPrefixName(sName: java.lang.String): scala.Boolean
  def isValidXMLName(sName: java.lang.String): scala.Boolean
  def newInstance(sName: java.lang.String, sURL: java.lang.String, bURLOnce: scala.Boolean): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
  def newModel(xModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, sName: java.lang.String): XModel
  def removeBindingForNode(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode): scala.Unit
  def removeBindingIfUseless(xBinding: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  def removeInstance(sName: java.lang.String): scala.Unit
  def removeModel(xModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, sName: java.lang.String): scala.Unit
  def renameInstance(sFrom: java.lang.String, sTo: java.lang.String, sURL: java.lang.String, bURLOnce: scala.Boolean): scala.Unit
  def renameModel(
    xModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    sFrom: java.lang.String,
    sTo: java.lang.String
  ): scala.Unit
  def renameNode(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, sName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def setNodeValue(xNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, sValue: java.lang.String): scala.Unit
}

object XFormsUIHelper1 {
  @scala.inline
  def apply(
    cloneBindingAsGhost: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    createAttribute: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    createElement: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    getBindingForNode: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getBindingName: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Boolean) => java.lang.String,
    getDefaultBindingExpressionForNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode => java.lang.String,
    getDefaultServiceNameForNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode => java.lang.String,
    getNodeDisplayName: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, scala.Boolean) => java.lang.String,
    getNodeName: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode => java.lang.String,
    getResultForExpression: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Boolean, java.lang.String) => java.lang.String,
    getSubmissionName: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Boolean) => java.lang.String,
    isValidPrefixName: java.lang.String => scala.Boolean,
    isValidXMLName: java.lang.String => scala.Boolean,
    newInstance: (java.lang.String, java.lang.String, scala.Boolean) => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument,
    newModel: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, java.lang.String) => XModel,
    removeBindingForNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode => scala.Unit,
    removeBindingIfUseless: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => scala.Unit,
    removeInstance: java.lang.String => scala.Unit,
    removeModel: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, java.lang.String) => scala.Unit,
    renameInstance: (java.lang.String, java.lang.String, java.lang.String, scala.Boolean) => scala.Unit,
    renameModel: (activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, java.lang.String, java.lang.String) => scala.Unit,
    renameNode: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    setNodeValue: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String) => scala.Unit
  ): XFormsUIHelper1 = {
    val __obj = js.Dynamic.literal(cloneBindingAsGhost = js.Any.fromFunction1(cloneBindingAsGhost), createAttribute = js.Any.fromFunction2(createAttribute), createElement = js.Any.fromFunction2(createElement), getBindingForNode = js.Any.fromFunction2(getBindingForNode), getBindingName = js.Any.fromFunction2(getBindingName), getDefaultBindingExpressionForNode = js.Any.fromFunction1(getDefaultBindingExpressionForNode), getDefaultServiceNameForNode = js.Any.fromFunction1(getDefaultServiceNameForNode), getNodeDisplayName = js.Any.fromFunction2(getNodeDisplayName), getNodeName = js.Any.fromFunction1(getNodeName), getResultForExpression = js.Any.fromFunction3(getResultForExpression), getSubmissionName = js.Any.fromFunction2(getSubmissionName), isValidPrefixName = js.Any.fromFunction1(isValidPrefixName), isValidXMLName = js.Any.fromFunction1(isValidXMLName), newInstance = js.Any.fromFunction3(newInstance), newModel = js.Any.fromFunction2(newModel), removeBindingForNode = js.Any.fromFunction1(removeBindingForNode), removeBindingIfUseless = js.Any.fromFunction1(removeBindingIfUseless), removeInstance = js.Any.fromFunction1(removeInstance), removeModel = js.Any.fromFunction2(removeModel), renameInstance = js.Any.fromFunction4(renameInstance), renameModel = js.Any.fromFunction3(renameModel), renameNode = js.Any.fromFunction2(renameNode), setNodeValue = js.Any.fromFunction2(setNodeValue))
  
    __obj.asInstanceOf[XFormsUIHelper1]
  }
}

