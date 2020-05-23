package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.document.XScriptInvocationContext
import typings.activexLibreoffice.com_.sun.star.frame.XDesktop
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.uno.XComponentContext
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is provided to scripts, and provides a means of access to the various interfaces which they might need to perform some action on a
  * document. It is required to be passed as the first argument for any Java scripts.
  */
trait XScriptContext extends XInterface {
  /**
    * Obtain the component context which the script can use to create other uno components
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  val ComponentContext: XComponentContext
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  val Desktop: XDesktop
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
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
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  def getComponentContext(): XComponentContext
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  def getDesktop(): XDesktop
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
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
}

