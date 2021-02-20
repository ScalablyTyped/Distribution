package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xforms.XModel
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typings.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xpath {
  
  @js.native
  trait Libxml2ExtensionHandle extends StObject {
    
    var functionData: Double = js.native
    
    var functionLookupFunction: Double = js.native
    
    var variableData: Double = js.native
    
    var variableLookupFunction: Double = js.native
  }
  object Libxml2ExtensionHandle {
    
    @scala.inline
    def apply(
      functionData: Double,
      functionLookupFunction: Double,
      variableData: Double,
      variableLookupFunction: Double
    ): Libxml2ExtensionHandle = {
      val __obj = js.Dynamic.literal(functionData = functionData.asInstanceOf[js.Any], functionLookupFunction = functionLookupFunction.asInstanceOf[js.Any], variableData = variableData.asInstanceOf[js.Any], variableLookupFunction = variableLookupFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Libxml2ExtensionHandle]
    }
    
    @scala.inline
    implicit class Libxml2ExtensionHandleMutableBuilder[Self <: Libxml2ExtensionHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionData(value: Double): Self = StObject.set(x, "functionData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionLookupFunction(value: Double): Self = StObject.set(x, "functionLookupFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableData(value: Double): Self = StObject.set(x, "variableData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableLookupFunction(value: Double): Self = StObject.set(x, "variableLookupFunction", value.asInstanceOf[js.Any])
    }
  }
  
  type XPathAPI = XXPathAPI
  
  /**
    * Exception that may occur when evaluating an XPath expression.
    * @see XXPathAPI
    * @since OOo 3.0
    */
  type XPathException = Exception
  
  @js.native
  trait XPathExtension extends XXPathExtension {
    
    def createWithModel(Model: XModel, ContextNode: XNode): Unit = js.native
  }
  object XPathExtension {
    
    @scala.inline
    def apply(
      Libxml2ExtensionHandle: Libxml2ExtensionHandle,
      acquire: () => Unit,
      createWithModel: (XModel, XNode) => Unit,
      getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XPathExtension = {
      val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createWithModel = js.Any.fromFunction2(createWithModel), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XPathExtension]
    }
    
    @scala.inline
    implicit class XPathExtensionMutableBuilder[Self <: XPathExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateWithModel(value: (XModel, XNode) => Unit): Self = StObject.set(x, "createWithModel", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
  */
  trait XPathObjectType extends StObject
  object XPathObjectType {
    
    @scala.inline
    def XPATH_BOOLEAN: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def XPATH_LOCATIONSET: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def XPATH_NODESET: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def XPATH_NUMBER: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def XPATH_POINT: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def XPATH_RANGE: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def XPATH_STRING: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def XPATH_UNDEFINED: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def XPATH_USERS: `8` = 8.asInstanceOf[`8`]
    
    @scala.inline
    def XPATH_XSLT_TREE: `9` = 9.asInstanceOf[`9`]
  }
  
  @js.native
  trait XXPathAPI extends XInterface {
    
    /**
      * Evaluate XPath Expression.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns an object representing the result of the XPath evaluation
      * @see XXPathObject
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def eval(contextNode: XNode, expr: String): XXPathObject = js.native
    
    /**
      * Evaluate XPath Expression.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns an object representing the result of the XPath evaluation
      * @see XXPathObject
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def evalNS(contextNode: XNode, expr: String, namespaceNode: XNode): XXPathObject = js.native
    
    def registerExtension(serviceName: String): Unit = js.native
    
    def registerExtensionInstance(aExtension: XXPathExtension): Unit = js.native
    
    def registerNS(prefix: String, url: String): Unit = js.native
    
    /**
      * Evaluate an XPath expression to select a list of nodes.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns result of the XPath evaluation: a list of nodes
      * @see XNodeList
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectNodeList(contextNode: XNode, expr: String): XNodeList = js.native
    
    /**
      * Evaluate an XPath expression to select a list of nodes.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns result of the XPath evaluation: a list of nodes
      * @see XNodeList
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectNodeListNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNodeList = js.native
    
    /**
      * Evaluate an XPath expression to select a single node.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns result of the XPath evaluation: a single node
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectSingleNode(contextNode: XNode, expr: String): XNode = js.native
    
    /**
      * Evaluate an XPath expression to select a single node.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns result of the XPath evaluation: a single node
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectSingleNodeNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNode = js.native
    
    def unregisterNS(prefix: String, url: String): Unit = js.native
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
    
    @scala.inline
    implicit class XXPathAPIMutableBuilder[Self <: XXPathAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEval(value: (XNode, String) => XXPathObject): Self = StObject.set(x, "eval", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEvalNS(value: (XNode, String, XNode) => XXPathObject): Self = StObject.set(x, "evalNS", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRegisterExtension(value: String => Unit): Self = StObject.set(x, "registerExtension", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterExtensionInstance(value: XXPathExtension => Unit): Self = StObject.set(x, "registerExtensionInstance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterNS(value: (String, String) => Unit): Self = StObject.set(x, "registerNS", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectNodeList(value: (XNode, String) => XNodeList): Self = StObject.set(x, "selectNodeList", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectNodeListNS(value: (XNode, String, XNode) => XNodeList): Self = StObject.set(x, "selectNodeListNS", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectSingleNode(value: (XNode, String) => XNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelectSingleNodeNS(value: (XNode, String, XNode) => XNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnregisterNS(value: (String, String) => Unit): Self = StObject.set(x, "unregisterNS", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait XXPathExtension extends XInterface {
    
    val Libxml2ExtensionHandle: typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle = js.native
    
    def getLibxml2ExtensionHandle(): typings.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle = js.native
  }
  object XXPathExtension {
    
    @scala.inline
    def apply(
      Libxml2ExtensionHandle: Libxml2ExtensionHandle,
      acquire: () => Unit,
      getLibxml2ExtensionHandle: () => Libxml2ExtensionHandle,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XXPathExtension = {
      val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLibxml2ExtensionHandle = js.Any.fromFunction0(getLibxml2ExtensionHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XXPathExtension]
    }
    
    @scala.inline
    implicit class XXPathExtensionMutableBuilder[Self <: XXPathExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLibxml2ExtensionHandle(value: () => Libxml2ExtensionHandle): Self = StObject.set(x, "getLibxml2ExtensionHandle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLibxml2ExtensionHandle(value: Libxml2ExtensionHandle): Self = StObject.set(x, "Libxml2ExtensionHandle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XXPathObject extends XInterface {
    
    /** get value of a boolean object */
    val Boolean: scala.Boolean = js.native
    
    /** get number as byte */
    val Byte: scala.Double = js.native
    
    /** get number as double */
    val Double: scala.Double = js.native
    
    /** get number as float */
    val Float: scala.Double = js.native
    
    /** get number as hyper */
    val Hyper: scala.Double = js.native
    
    /** get number as long */
    val Long: scala.Double = js.native
    
    /** get the nodes from a node list type object */
    val NodeList: XNodeList = js.native
    
    /** get object type */
    val ObjectType: XPathObjectType = js.native
    
    /** get number as short */
    val Short: scala.Double = js.native
    
    /** get string value */
    val String: java.lang.String = js.native
    
    /** get value of a boolean object */
    def getBoolean(): scala.Boolean = js.native
    
    /** get number as byte */
    def getByte(): scala.Double = js.native
    
    /** get number as double */
    def getDouble(): scala.Double = js.native
    
    /** get number as float */
    def getFloat(): scala.Double = js.native
    
    /** get number as hyper */
    def getHyper(): scala.Double = js.native
    
    /** get number as long */
    def getLong(): scala.Double = js.native
    
    /** get the nodes from a node list type object */
    def getNodeList(): XNodeList = js.native
    
    /** get object type */
    def getObjectType(): XPathObjectType = js.native
    
    /** get number as short */
    def getShort(): scala.Double = js.native
    
    /** get string value */
    def getString(): java.lang.String = js.native
  }
  object XXPathObject {
    
    @scala.inline
    def apply(
      Boolean: Boolean,
      Byte: Double,
      Double: Double,
      Float: Double,
      Hyper: Double,
      Long: Double,
      NodeList: XNodeList,
      ObjectType: XPathObjectType,
      Short: Double,
      String: String,
      acquire: () => Unit,
      getBoolean: () => Boolean,
      getByte: () => Double,
      getDouble: () => Double,
      getFloat: () => Double,
      getHyper: () => Double,
      getLong: () => Double,
      getNodeList: () => XNodeList,
      getObjectType: () => XPathObjectType,
      getShort: () => Double,
      getString: () => String,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XXPathObject = {
      val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Hyper = Hyper.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], NodeList = NodeList.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBoolean = js.Any.fromFunction0(getBoolean), getByte = js.Any.fromFunction0(getByte), getDouble = js.Any.fromFunction0(getDouble), getFloat = js.Any.fromFunction0(getFloat), getHyper = js.Any.fromFunction0(getHyper), getLong = js.Any.fromFunction0(getLong), getNodeList = js.Any.fromFunction0(getNodeList), getObjectType = js.Any.fromFunction0(getObjectType), getShort = js.Any.fromFunction0(getShort), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XXPathObject]
    }
    
    @scala.inline
    implicit class XXPathObjectMutableBuilder[Self <: XXPathObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: Boolean): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByte(value: Double): Self = StObject.set(x, "Byte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDouble(value: Double): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat(value: Double): Self = StObject.set(x, "Float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBoolean(value: () => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetByte(value: () => Double): Self = StObject.set(x, "getByte", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDouble(value: () => Double): Self = StObject.set(x, "getDouble", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFloat(value: () => Double): Self = StObject.set(x, "getFloat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHyper(value: () => Double): Self = StObject.set(x, "getHyper", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLong(value: () => Double): Self = StObject.set(x, "getLong", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNodeList(value: () => XNodeList): Self = StObject.set(x, "getNodeList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetObjectType(value: () => XPathObjectType): Self = StObject.set(x, "getObjectType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetShort(value: () => Double): Self = StObject.set(x, "getShort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHyper(value: Double): Self = StObject.set(x, "Hyper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Double): Self = StObject.set(x, "Long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeList(value: XNodeList): Self = StObject.set(x, "NodeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectType(value: XPathObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: Double): Self = StObject.set(x, "Short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    }
  }
}
