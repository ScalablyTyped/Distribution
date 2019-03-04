package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.providerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is provided to scripts, and provides a means of access to the various interfaces which they might need to perform some action on a
  * document. It is required to be passed as the first argument for any Java scripts.
  */
trait XScriptContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Obtain the component context which the script can use to create other uno components
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  val ComponentContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  val Desktop: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDesktop
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
    */
  val Document: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
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
  val InvocationContext: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XScriptInvocationContext
  /**
    * Obtain the component context which the script can use to create other uno components
    * @returns {@link com.sun.star.uno.XComponentContext} interface
    */
  def getComponentContext(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext
  /**
    * Obtain the desktop reference on which the script can operate
    * @returns {@link com.sun.star.frame.XDesktop} interface
    */
  def getDesktop(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDesktop
  /**
    * Obtain the document reference on which the script can operate
    * @returns {@link com.sun.star.frame.XModel} interface
    */
  def getDocument(): activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
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
  def getInvocationContext(): activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XScriptInvocationContext
}

object XScriptContext {
  @scala.inline
  def apply(
    ComponentContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext,
    Desktop: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDesktop,
    Document: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    InvocationContext: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XScriptInvocationContext,
    acquire: js.Function0[scala.Unit],
    getComponentContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XComponentContext],
    getDesktop: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDesktop],
    getDocument: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getInvocationContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XScriptInvocationContext],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptContext = {
    val __obj = js.Dynamic.literal(ComponentContext = ComponentContext, Desktop = Desktop, Document = Document, InvocationContext = InvocationContext, acquire = acquire, getComponentContext = getComponentContext, getDesktop = getDesktop, getDocument = getDocument, getInvocationContext = getInvocationContext, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScriptContext]
  }
}

