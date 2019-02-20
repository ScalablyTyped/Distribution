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

