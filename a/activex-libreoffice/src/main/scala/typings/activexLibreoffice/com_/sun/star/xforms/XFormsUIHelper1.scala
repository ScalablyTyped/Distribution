package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provide several helper methods for the UI
  *
  * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
  */
@js.native
trait XFormsUIHelper1 extends js.Object {
  
  def cloneBindingAsGhost(binding: XPropertySet): XPropertySet = js.native
  
  def createAttribute(xParent: XNode, sName: String): XNode = js.native
  
  def createElement(xParent: XNode, sName: String): XNode = js.native
  
  def getBindingForNode(xNode: XNode, bCreate: Boolean): XPropertySet = js.native
  
  def getBindingName(xBinding: XPropertySet, bDetail: Boolean): String = js.native
  
  def getDefaultBindingExpressionForNode(xNode: XNode): String = js.native
  
  def getDefaultServiceNameForNode(xNode: XNode): String = js.native
  
  def getNodeDisplayName(xNode: XNode, bDetail: Boolean): String = js.native
  
  def getNodeName(xNode: XNode): String = js.native
  
  def getResultForExpression(xBinding: XPropertySet, bIsBindingExpression: Boolean, sExpression: String): String = js.native
  
  def getSubmissionName(xSubm: XPropertySet, bDetail: Boolean): String = js.native
  
  def isValidPrefixName(sName: String): Boolean = js.native
  
  def isValidXMLName(sName: String): Boolean = js.native
  
  def newInstance(sName: String, sURL: String, bURLOnce: Boolean): XDocument = js.native
  
  def newModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): XModel = js.native
  
  def removeBindingForNode(xNode: XNode): Unit = js.native
  
  def removeBindingIfUseless(xBinding: XPropertySet): Unit = js.native
  
  def removeInstance(sName: String): Unit = js.native
  
  def removeModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): Unit = js.native
  
  def renameInstance(sFrom: String, sTo: String, sURL: String, bURLOnce: Boolean): Unit = js.native
  
  def renameModel(xModel: typings.activexLibreoffice.com_.sun.star.frame.XModel, sFrom: String, sTo: String): Unit = js.native
  
  def renameNode(xNode: XNode, sName: String): XNode = js.native
  
  def setNodeValue(xNode: XNode, sValue: String): Unit = js.native
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
  
  @scala.inline
  implicit class XFormsUIHelper1Ops[Self <: XFormsUIHelper1] (val x: Self) extends AnyVal {
    
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
    def setCloneBindingAsGhost(value: XPropertySet => XPropertySet): Self = this.set("cloneBindingAsGhost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAttribute(value: (XNode, String) => XNode): Self = this.set("createAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateElement(value: (XNode, String) => XNode): Self = this.set("createElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBindingForNode(value: (XNode, Boolean) => XPropertySet): Self = this.set("getBindingForNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBindingName(value: (XPropertySet, Boolean) => String): Self = this.set("getBindingName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDefaultBindingExpressionForNode(value: XNode => String): Self = this.set("getDefaultBindingExpressionForNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultServiceNameForNode(value: XNode => String): Self = this.set("getDefaultServiceNameForNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeDisplayName(value: (XNode, Boolean) => String): Self = this.set("getNodeDisplayName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNodeName(value: XNode => String): Self = this.set("getNodeName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResultForExpression(value: (XPropertySet, Boolean, String) => String): Self = this.set("getResultForExpression", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSubmissionName(value: (XPropertySet, Boolean) => String): Self = this.set("getSubmissionName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsValidPrefixName(value: String => Boolean): Self = this.set("isValidPrefixName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidXMLName(value: String => Boolean): Self = this.set("isValidXMLName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewInstance(value: (String, String, Boolean) => XDocument): Self = this.set("newInstance", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNewModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel): Self = this.set("newModel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveBindingForNode(value: XNode => Unit): Self = this.set("removeBindingForNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveBindingIfUseless(value: XPropertySet => Unit): Self = this.set("removeBindingIfUseless", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInstance(value: String => Unit): Self = this.set("removeInstance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String) => Unit): Self = this.set("removeModel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameInstance(value: (String, String, String, Boolean) => Unit): Self = this.set("renameInstance", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRenameModel(value: (typings.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Unit): Self = this.set("renameModel", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenameNode(value: (XNode, String) => XNode): Self = this.set("renameNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNodeValue(value: (XNode, String) => Unit): Self = this.set("setNodeValue", js.Any.fromFunction2(value))
  }
}
