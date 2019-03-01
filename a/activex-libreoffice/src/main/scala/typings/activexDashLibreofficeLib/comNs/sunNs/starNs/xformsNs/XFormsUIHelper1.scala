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
    cloneBindingAsGhost: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    createAttribute: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
    ],
    createElement: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
    ],
    getBindingForNode: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getBindingName: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      java.lang.String
    ],
    getDefaultBindingExpressionForNode: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String],
    getDefaultServiceNameForNode: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String],
    getNodeDisplayName: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      scala.Boolean, 
      java.lang.String
    ],
    getNodeName: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String],
    getResultForExpression: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      java.lang.String, 
      java.lang.String
    ],
    getSubmissionName: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Boolean, 
      java.lang.String
    ],
    isValidPrefixName: js.Function1[java.lang.String, scala.Boolean],
    isValidXMLName: js.Function1[java.lang.String, scala.Boolean],
    newInstance: js.Function3[
      java.lang.String, 
      java.lang.String, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XDocument
    ],
    newModel: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, 
      java.lang.String, 
      XModel
    ],
    removeBindingForNode: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, scala.Unit],
    removeBindingIfUseless: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    removeInstance: js.Function1[java.lang.String, scala.Unit],
    removeModel: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, 
      java.lang.String, 
      scala.Unit
    ],
    renameInstance: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    renameModel: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    renameNode: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
    ],
    setNodeValue: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      java.lang.String, 
      scala.Unit
    ]
  ): XFormsUIHelper1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneBindingAsGhost")(cloneBindingAsGhost)
    __obj.updateDynamic("createAttribute")(createAttribute)
    __obj.updateDynamic("createElement")(createElement)
    __obj.updateDynamic("getBindingForNode")(getBindingForNode)
    __obj.updateDynamic("getBindingName")(getBindingName)
    __obj.updateDynamic("getDefaultBindingExpressionForNode")(getDefaultBindingExpressionForNode)
    __obj.updateDynamic("getDefaultServiceNameForNode")(getDefaultServiceNameForNode)
    __obj.updateDynamic("getNodeDisplayName")(getNodeDisplayName)
    __obj.updateDynamic("getNodeName")(getNodeName)
    __obj.updateDynamic("getResultForExpression")(getResultForExpression)
    __obj.updateDynamic("getSubmissionName")(getSubmissionName)
    __obj.updateDynamic("isValidPrefixName")(isValidPrefixName)
    __obj.updateDynamic("isValidXMLName")(isValidXMLName)
    __obj.updateDynamic("newInstance")(newInstance)
    __obj.updateDynamic("newModel")(newModel)
    __obj.updateDynamic("removeBindingForNode")(removeBindingForNode)
    __obj.updateDynamic("removeBindingIfUseless")(removeBindingIfUseless)
    __obj.updateDynamic("removeInstance")(removeInstance)
    __obj.updateDynamic("removeModel")(removeModel)
    __obj.updateDynamic("renameInstance")(renameInstance)
    __obj.updateDynamic("renameModel")(renameModel)
    __obj.updateDynamic("renameNode")(renameNode)
    __obj.updateDynamic("setNodeValue")(setNodeValue)
    __obj.asInstanceOf[XFormsUIHelper1]
  }
}

