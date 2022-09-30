package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typings.activexLibreoffice.com_.sun.star.document.XScriptInvocationContext
import typings.activexLibreoffice.com_.sun.star.frame.XDesktop
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.script.browse.BrowseNode
import typings.activexLibreoffice.com_.sun.star.script.browse.XBrowseNode
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provider {
  
  /** This service provides a means of browsing and invoking scripts in a single language. */
  type LanguageScriptProvider = ScriptProvider
  
  /** This service acts as a wrapper around the various language specific ScriptProviders. */
  type MasterScriptProvider = ScriptProvider
  
  /**
    * This service is used to create MasterScriptProviders. Note: You shouldn't ever instantiate the {@link MasterScriptProvider} service directly, you
    * should always use this service.
    * @deprecated Deprecatedrather use the singleton service theMasterScriptProviderFactory
    */
  type MasterScriptProviderFactory = XScriptProviderFactory
  
  /** is a checked exception that represents an error encountered by a {@link LanguageScriptProvider} whilst executing a script */
  trait ScriptErrorRaisedException
    extends StObject
       with Exception {
    
    /** Scripting language of script that generated exception */
    var language: String
    
    /** line number where error occurred. */
    var lineNum: Double
    
    /** Name of script where error occurred */
    var scriptName: String
  }
  object ScriptErrorRaisedException {
    
    inline def apply(Context: XInterface, Message: String, language: String, lineNum: Double, scriptName: String): ScriptErrorRaisedException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptErrorRaisedException]
    }
    
    extension [Self <: ScriptErrorRaisedException](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLineNum(value: Double): Self = StObject.set(x, "lineNum", value.asInstanceOf[js.Any])
      
      inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
    }
  }
  
  /** is a checked exception that represents the detail of an exception thrown by a {@link LanguageScriptProvider} whilst executing a script */
  trait ScriptExceptionRaisedException
    extends StObject
       with ScriptErrorRaisedException {
    
    /** Name of script where error occurred */
    var exceptionType: String
  }
  object ScriptExceptionRaisedException {
    
    inline def apply(
      Context: XInterface,
      Message: String,
      exceptionType: String,
      language: String,
      lineNum: Double,
      scriptName: String
    ): ScriptExceptionRaisedException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], exceptionType = exceptionType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lineNum = lineNum.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptExceptionRaisedException]
    }
    
    extension [Self <: ScriptExceptionRaisedException](x: Self) {
      
      inline def setExceptionType(value: String): Self = StObject.set(x, "exceptionType", value.asInstanceOf[js.Any])
    }
  }
  
  /** is a checked exception that represents an error encountered by the Scripting Framework whilst executing a script */
  trait ScriptFrameworkErrorException
    extends StObject
       with Exception {
    
    /** error type {@link com.sun.star.script.provider.ScriptFrameworkErrorType} */
    var errorType: Double
    
    /** Scripting language of script that generated exception */
    var language: String
    
    /** Name of script where error occurred */
    var scriptName: String
  }
  object ScriptFrameworkErrorException {
    
    inline def apply(Context: XInterface, Message: String, errorType: Double, language: String, scriptName: String): ScriptFrameworkErrorException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptFrameworkErrorException]
    }
    
    extension [Self <: ScriptFrameworkErrorException](x: Self) {
      
      inline def setErrorType(value: Double): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
    }
  }
  
  object ScriptFrameworkErrorType {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeInts.`3`
      - typings.activexLibreoffice.activexLibreofficeInts.`2`
      - typings.activexLibreoffice.activexLibreofficeInts.`1`
      - typings.activexLibreoffice.activexLibreofficeInts.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def MALFORMED_URL: `3` = 3.asInstanceOf[`3`]
      
      inline def NOTSUPPORTED: `1` = 1.asInstanceOf[`1`]
      
      inline def NO_SUCH_SCRIPT: `2` = 2.asInstanceOf[`2`]
      
      inline def UNKNOWN: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /** This service providers a means to browse and execute scripts. */
  trait ScriptProvider
    extends StObject
       with BrowseNode
       with XScriptProvider
  object ScriptProvider {
    
    inline def apply(
      ChildNodes: SafeArray[XBrowseNode],
      Introspection: XIntrospectionAccess,
      Name: String,
      Type: Double,
      acquire: () => Unit,
      getChildNodes: () => SafeArray[XBrowseNode],
      getIntrospection: () => XIntrospectionAccess,
      getName: () => String,
      getScript: String => XScript,
      getType: () => Double,
      getValue: String => Any,
      hasChildNodes: () => Boolean,
      hasMethod: String => Boolean,
      hasProperty: String => Boolean,
      invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
      queryInterface: `type` => Any,
      release: () => Unit,
      setValue: (String, Any) => Unit
    ): ScriptProvider = {
      val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getChildNodes = js.Any.fromFunction0(getChildNodes), getIntrospection = js.Any.fromFunction0(getIntrospection), getName = js.Any.fromFunction0(getName), getScript = js.Any.fromFunction1(getScript), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction1(getValue), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValue = js.Any.fromFunction2(setValue))
      __obj.asInstanceOf[ScriptProvider]
    }
  }
  
  /** This service is a Basic-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBasic = LanguageScriptProvider
  
  /** This service is a BeanShell-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForBeanShell = LanguageScriptProvider
  
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJava = LanguageScriptProvider
  
  /** This service is a Java-specific {@link LanguageScriptProvider} . */
  type ScriptProviderForJavaScript = LanguageScriptProvider
  
  /** This service is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
  trait ScriptURIHelper
    extends StObject
       with XScriptURIHelper {
    
    /**
      * create a new {@link ScriptURIHelper}
      * @param language The name of the scripting language for which this {@link ScriptURIHelper} is being created. It should be the same as the language name u
      * @param location This location which was passed to the {@link LanguageScriptProvider} by the Scripting Framework on its creation
      * @throws com::sun::star::lang::IllegalArgumentException
      */
    def create(language: String, location: String): Unit
  }
  object ScriptURIHelper {
    
    inline def apply(
      RootStorageURI: String,
      acquire: () => Unit,
      create: (String, String) => Unit,
      getRootStorageURI: () => String,
      getScriptURI: String => String,
      getStorageURI: String => String,
      queryInterface: `type` => Any,
      release: () => Unit
    ): ScriptURIHelper = {
      val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[ScriptURIHelper]
    }
    
    extension [Self <: ScriptURIHelper](x: Self) {
      
      inline def setCreate(value: (String, String) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
  
  /** This interface represents an invokable script or UNO function. */
  trait XScript
    extends StObject
       with XInterface {
    
    /**
      * invoke the script or function represented by the implementing object
      * @param aParams all parameters; pure, out parameters are undefined in sequence, i.e., the value has to be ignored by the callee
      * @param aOutParamIndex out indices, indicating the position of the out or inout parameters in the list of arguments to the script
      * @param aOutParam out parameters For example, if the script had the signature ; `long foo( [inout] string a, [in] string b, [out] string c )`;  the call
      * @returns the value returned from the function being invoked
      * @throws com::sun::star::reflection::InvocationTargetException if and error occurs while attempting to invoke a script the information is captured. If the
      */
    def invoke(
      aParams: SeqEquiv[Any],
      aOutParamIndex: js.Array[SeqEquiv[Double]],
      aOutParam: js.Array[SeqEquiv[Any]]
    ): Any
  }
  object XScript {
    
    inline def apply(
      acquire: () => Unit,
      invoke: (SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScript = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), invoke = js.Any.fromFunction3(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScript]
    }
    
    extension [Self <: XScript](x: Self) {
      
      inline def setInvoke(value: (SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invoke", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * This interface is provided to scripts, and provides a means of access to the various interfaces which they might need to perform some action on a
    * document. It is required to be passed as the first argument for any Java scripts.
    */
  trait XScriptContext
    extends StObject
       with XInterface {
    
    /**
      * Obtain the component context which the script can use to create other uno components
      * @returns interface
      */
    val ComponentContext: XComponentContext
    
    /**
      * Obtain the desktop reference on which the script can operate
      * @returns interface
      */
    val Desktop: XDesktop
    
    /**
      * Obtain the document reference on which the script can operate
      * @returns interface
      */
    val Document: XModel
    
    /**
      * provides access to the context where the script was invoked
      *
      * In some cases, it is possible that scripts, embedded in a document, are executed from within a context which is **not** the document itself. In this
      * case, the `getInvocationContext` member allows to access this context.
      *
      * Note that the returned context is allowed to be `NULL` , in this case, the document as returned by `getDocument` is the invocation context.
      *
      * If the returned context is not `NULL` , its `ScriptContainer` attribute equals the document as returned by `XScriptContext::getDocument` .
      * @since OOo 3.0
      */
    val InvocationContext: XScriptInvocationContext
    
    /**
      * Obtain the component context which the script can use to create other uno components
      * @returns interface
      */
    def getComponentContext(): XComponentContext
    
    /**
      * Obtain the desktop reference on which the script can operate
      * @returns interface
      */
    def getDesktop(): XDesktop
    
    /**
      * Obtain the document reference on which the script can operate
      * @returns interface
      */
    def getDocument(): XModel
    
    /**
      * provides access to the context where the script was invoked
      *
      * In some cases, it is possible that scripts, embedded in a document, are executed from within a context which is **not** the document itself. In this
      * case, the `getInvocationContext` member allows to access this context.
      *
      * Note that the returned context is allowed to be `NULL` , in this case, the document as returned by `getDocument` is the invocation context.
      *
      * If the returned context is not `NULL` , its `ScriptContainer` attribute equals the document as returned by `XScriptContext::getDocument` .
      * @since OOo 3.0
      */
    def getInvocationContext(): XScriptInvocationContext
  }
  object XScriptContext {
    
    inline def apply(
      ComponentContext: XComponentContext,
      Desktop: XDesktop,
      Document: XModel,
      InvocationContext: XScriptInvocationContext,
      acquire: () => Unit,
      getComponentContext: () => XComponentContext,
      getDesktop: () => XDesktop,
      getDocument: () => XModel,
      getInvocationContext: () => XScriptInvocationContext,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScriptContext = {
      val __obj = js.Dynamic.literal(ComponentContext = ComponentContext.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], InvocationContext = InvocationContext.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponentContext = js.Any.fromFunction0(getComponentContext), getDesktop = js.Any.fromFunction0(getDesktop), getDocument = js.Any.fromFunction0(getDocument), getInvocationContext = js.Any.fromFunction0(getInvocationContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScriptContext]
    }
    
    extension [Self <: XScriptContext](x: Self) {
      
      inline def setComponentContext(value: XComponentContext): Self = StObject.set(x, "ComponentContext", value.asInstanceOf[js.Any])
      
      inline def setDesktop(value: XDesktop): Self = StObject.set(x, "Desktop", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: XModel): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setGetComponentContext(value: () => XComponentContext): Self = StObject.set(x, "getComponentContext", js.Any.fromFunction0(value))
      
      inline def setGetDesktop(value: () => XDesktop): Self = StObject.set(x, "getDesktop", js.Any.fromFunction0(value))
      
      inline def setGetDocument(value: () => XModel): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
      
      inline def setGetInvocationContext(value: () => XScriptInvocationContext): Self = StObject.set(x, "getInvocationContext", js.Any.fromFunction0(value))
      
      inline def setInvocationContext(value: XScriptInvocationContext): Self = StObject.set(x, "InvocationContext", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface provides a factory for obtaining objects implementing the {@link XScript} interface. */
  trait XScriptProvider
    extends StObject
       with XInterface {
    
    /**
      * a factory method for the creation of {@link XScript} implementations.
      * @param sScriptURI is the logical or language-dependent script URI
      * @returns an object implementing {@link com.sun.star.script.provider.XScript} representing the script
      * @throws com::sun::star::script::provider::ScriptFrameworkErrorException Framework error getting script for URI.
      */
    def getScript(sScriptURI: String): XScript
  }
  object XScriptProvider {
    
    inline def apply(
      acquire: () => Unit,
      getScript: String => XScript,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScriptProvider = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getScript = js.Any.fromFunction1(getScript), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScriptProvider]
    }
    
    extension [Self <: XScriptProvider](x: Self) {
      
      inline def setGetScript(value: String => XScript): Self = StObject.set(x, "getScript", js.Any.fromFunction1(value))
    }
  }
  
  /** This interface provides a factory for obtaining objects implementing the {@link XScriptProvider} interface. */
  trait XScriptProviderFactory
    extends StObject
       with XInterface {
    
    /**
      * a factory method for the creation of XScriptProviders implementations.
      * @param Context is context for which the {@link ScriptProvider} is to be created for
      * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider}
      * @throws com::sun::star::lang::IllegalArgumentException if illegal or unknown context is passed
      */
    def createScriptProvider(Context: Any): XScriptProvider
  }
  object XScriptProviderFactory {
    
    inline def apply(
      acquire: () => Unit,
      createScriptProvider: Any => XScriptProvider,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScriptProviderFactory = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createScriptProvider = js.Any.fromFunction1(createScriptProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScriptProviderFactory]
    }
    
    extension [Self <: XScriptProviderFactory](x: Self) {
      
      inline def setCreateScriptProvider(value: Any => XScriptProvider): Self = StObject.set(x, "createScriptProvider", js.Any.fromFunction1(value))
    }
  }
  
  /** This interface allows to get the scripting provider related to the object. */
  trait XScriptProviderSupplier
    extends StObject
       with XInterface {
    
    /**
      * returns scripting provider related to the object.
      * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
      */
    val ScriptProvider: XScriptProvider
    
    /**
      * returns scripting provider related to the object.
      * @returns an object implementing {@link com.sun.star.script.provider.XScriptProvider} representing the script provider
      */
    def getScriptProvider(): XScriptProvider
  }
  object XScriptProviderSupplier {
    
    inline def apply(
      ScriptProvider: XScriptProvider,
      acquire: () => Unit,
      getScriptProvider: () => XScriptProvider,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScriptProviderSupplier = {
      val __obj = js.Dynamic.literal(ScriptProvider = ScriptProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScriptProvider = js.Any.fromFunction0(getScriptProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScriptProviderSupplier]
    }
    
    extension [Self <: XScriptProviderSupplier](x: Self) {
      
      inline def setGetScriptProvider(value: () => XScriptProvider): Self = StObject.set(x, "getScriptProvider", js.Any.fromFunction0(value))
      
      inline def setScriptProvider(value: XScriptProvider): Self = StObject.set(x, "ScriptProvider", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface is used to help transform Scripting Framework storage locations to Scripting Framework script URIs and vice versa. */
  trait XScriptURIHelper
    extends StObject
       with XInterface {
    
    /**
      * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
      * Content Broker
      * @returns a URI to the storage as a `string`
      */
    val RootStorageURI: String
    
    /**
      * Obtain the root storage URI for this {@link ScriptURIHelper} . The resulting string can be used to access the storage for this using the Universal
      * Content Broker
      * @returns a URI to the storage as a `string`
      */
    def getRootStorageURI(): String
    
    /**
      * Obtain the Scripting Framework script URI for a specific UCB URI
      * @returns the URI as a `string`
      * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
      */
    def getScriptURI(storageURI: String): String
    
    /**
      * Obtain the storage URI for a specific Scripting Framework script URI.
      * @returns a URI to the storage as a `string`
      * @throws com::sun::star::lang::IllegalArgumentException if the storageURI is not a valid
      */
    def getStorageURI(scriptURI: String): String
  }
  object XScriptURIHelper {
    
    inline def apply(
      RootStorageURI: String,
      acquire: () => Unit,
      getRootStorageURI: () => String,
      getScriptURI: String => String,
      getStorageURI: String => String,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XScriptURIHelper = {
      val __obj = js.Dynamic.literal(RootStorageURI = RootStorageURI.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRootStorageURI = js.Any.fromFunction0(getRootStorageURI), getScriptURI = js.Any.fromFunction1(getScriptURI), getStorageURI = js.Any.fromFunction1(getStorageURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XScriptURIHelper]
    }
    
    extension [Self <: XScriptURIHelper](x: Self) {
      
      inline def setGetRootStorageURI(value: () => String): Self = StObject.set(x, "getRootStorageURI", js.Any.fromFunction0(value))
      
      inline def setGetScriptURI(value: String => String): Self = StObject.set(x, "getScriptURI", js.Any.fromFunction1(value))
      
      inline def setGetStorageURI(value: String => String): Self = StObject.set(x, "getStorageURI", js.Any.fromFunction1(value))
      
      inline def setRootStorageURI(value: String): Self = StObject.set(x, "RootStorageURI", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The one and only {@link MasterScriptProviderFactory}
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.provider.theMasterScriptProviderFactory`
    */
  type theMasterScriptProviderFactory = XScriptProviderFactory
}
