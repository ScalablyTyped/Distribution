package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.document.XScriptInvocationContext
import typings.activexLibreoffice.com_.sun.star.frame.XDesktop
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is provided to scripts, and provides a means of access to the various interfaces which they might need to perform some action on a
  * document. It is required to be passed as the first argument for any Java scripts.
  */
@js.native
trait XScriptContext extends XInterface {
  
  /**
    * Obtain the component context which the script can use to create other uno components
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  val ComponentContext: XComponentContext = js.native
  
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  val Desktop: XDesktop = js.native
  
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
    */
  val Document: XModel = js.native
  
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
  val InvocationContext: XScriptInvocationContext = js.native
  
  /**
    * Obtain the component context which the script can use to create other uno components
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  def getComponentContext(): XComponentContext = js.native
  
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  def getDesktop(): XDesktop = js.native
  
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
    */
  def getDocument(): XModel = js.native
  
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
  def getInvocationContext(): XScriptInvocationContext = js.native
}
object XScriptContext {
  
  @scala.inline
  def apply(
    ComponentContext: XComponentContext,
    Desktop: XDesktop,
    Document: XModel,
    InvocationContext: XScriptInvocationContext,
    acquire: () => Unit,
    getComponentContext: () => XComponentContext,
    getDesktop: () => XDesktop,
    getDocument: () => XModel,
    getInvocationContext: () => XScriptInvocationContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptContext = {
    val __obj = js.Dynamic.literal(ComponentContext = ComponentContext.asInstanceOf[js.Any], Desktop = Desktop.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], InvocationContext = InvocationContext.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponentContext = js.Any.fromFunction0(getComponentContext), getDesktop = js.Any.fromFunction0(getDesktop), getDocument = js.Any.fromFunction0(getDocument), getInvocationContext = js.Any.fromFunction0(getInvocationContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptContext]
  }
  
  @scala.inline
  implicit class XScriptContextOps[Self <: XScriptContext] (val x: Self) extends AnyVal {
    
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
    def setComponentContext(value: XComponentContext): Self = this.set("ComponentContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktop(value: XDesktop): Self = this.set("Desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: XModel): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationContext(value: XScriptInvocationContext): Self = this.set("InvocationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetComponentContext(value: () => XComponentContext): Self = this.set("getComponentContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDesktop(value: () => XDesktop): Self = this.set("getDesktop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDocument(value: () => XModel): Self = this.set("getDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInvocationContext(value: () => XScriptInvocationContext): Self = this.set("getInvocationContext", js.Any.fromFunction0(value))
  }
}
