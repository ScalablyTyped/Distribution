package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction request handler that lets the user handle requests via GUI dialogs.
  *
  * The interaction handler service has a number of [built-in handlers]{@link url="#built_in_handler"} , responsible for a lot of well known interactions.
  * Additionally, there's a configuration module which allows to [configure additional handlers]{@link url="#configuring_handlers"} , responsible for
  * arbitrary requests.
  *
  * **Built-in Handlers**
  *
  * The following well-known requests can be dealt with by the built-in handlers: {@link com.sun.star.ucb.AuthenticationRequest}{@link
  * com.sun.star.ucb.CertificateValidationRequest}{@link com.sun.star.ucb.InteractiveAugmentedIOException} *{@link
  * com.sun.star.ucb.InteractiveFileIOException} *{@link com.sun.star.ucb.InteractiveIOException} *{@link
  * com.sun.star.ucb.InteractiveNetworkConnectException} *{@link com.sun.star.ucb.InteractiveNetworkException} *{@link
  * com.sun.star.ucb.InteractiveNetworkGeneralException} *{@link com.sun.star.ucb.InteractiveNetworkOffLineException} *{@link
  * com.sun.star.ucb.InteractiveNetworkReadException} *{@link com.sun.star.ucb.InteractiveNetworkResolveNameException} *{@link
  * com.sun.star.ucb.InteractiveNetworkWriteException} *{@link com.sun.star.ucb.InteractiveWrongMediumException} *{@link
  * com.sun.star.task.PasswordRequest}{@link com.sun.star.java.WrongJavaVersionException} *{@link com.sun.star.task.DocumentMacroConfirmationRequest} The
  * requests marked with an asterisk are only handled if (a) their continuations match certain restrictions (see below), and (b) the necessary resource
  * strings are available (this can be exploited by applications that carry only a subset of all resource files with them).
  *
  * The continuation restrictions are as follows: Let **C** be the subset of the provided continuations that are of type {@link
  * com.sun.star.task.XInteractionApprove} , {@link com.sun.star.task.XInteractionDisapprove} , {@link com.sun.star.task.XInteractionRetry} , or {@link
  * com.sun.star.task.XInteractionAbort} (or of a derived type). All other continuations are ignored for these requests. The request is only handled if
  * the set **C** is any of the following: AbortRetry, AbortApproveApprove, AbortApprove, DisapproveApprove, Disapprove, Abort
  *
  * An {@link com.sun.star.ucb.InteractiveAugmentedIOException} carries with it a sequence of arguments, which should be {@link
  * com.sun.star.beans.PropertyValues} . The following details which properties are interpreted by the interaction handler, depending on the request's
  * {@link com.sun.star.ucb.IOErrorCode} : **"Uri"**: All error codes except com::sun::star::ucb::IOErrorCode::DIFFERENT_DEVICES. The URI of the involved
  * resource (a `string` ).;
  *
  * **"ResourceName"**: All error codes except com::sun::star::ucb::IOErrorCode::DIFFERENT_DEVICES. A name for the involved resource (a `string` ) that
  * might be more meaningful to the user than the URI. For example, a (platform-dependent) path notation for file system resources.;
  *
  * **"ResourceType"**: com::sun::star::ucb::IOErrorCode::DEVICE_NOT_READY and com::sun::star::ucb::IOErrorCode::NOT_EXISTING only. An identifier for the
  * type of resource involved (a `string` ). Currently understood values are `"volume"` (e.g., a file system volume) and `"folder"` (i.e., a resource that
  * contains other resources).;
  *
  * **"Removable"**: com::sun::star::ucb::IOErrorCode::NOT_EXISTING only. A flag indicating whether the resource resides on a storage medium that can be
  * removed by the user (a `boolean` ).;
  *
  * **"Folder"**: com::sun::star::ucb::IOErrorCode::CANT_CREATE only. The name of the folder in which a resource cannot be created (a `string` ).;
  *
  * **"Volume" and "OtherVolume"**: com::sun::star::ucb::IOErrorCode::DIFFERENT_DEVICES only. The names of the two volumes involved (two `string` s).
  *
  *
  *
  * **Configuring additional Handlers**
  *
  * It is possible to configure additional interaction handlers, to which certain requests can be delegated. The configuration node
  * `/org.openoffice.Interaction/InteractionHandlers` is evaluated and respected by the `InteractionHandler` implementation.
  *
  * A custom interaction handler can declare itself responsible for an arbitrary number of UNO types, specified by full-qualified type name. Also, for
  * each type, it can specify whether it is responsible for only this particular type, or all possibly existent derived types.
  *
  * Whenever the `InteractionHandler` encounters a request it cannot fulfill itself, it will examine the configuration, to find a handler implementation
  * for the request, and delegate it to the first matching handler.
  *
  * If multiple custom interaction handlers declare themselves responsible for the same request type, it is not defined which handler will actually be
  * invoked. Thus, when deploying a custom interaction handler, ensure that the types you specify are general enough to cover all requests you want to
  * handle, but also specific enough to not cover requests which other handlers might be interested in.
  */
@js.native
trait InteractionHandler extends XInteractionHandler2 {
  
  /**
    * Creates an instance.
    * @param parent denotes the parent window for any GUI dialogs the interaction handler pops up; may be null.
    */
  def createWithParent(parent: XWindow): Unit = js.native
  
  /**
    * Creates an instance with an additional context.
    * @param parent denotes the parent window for any GUI dialogs the interaction handler pops up; may be null.
    * @param context is a textual description of the current context (used, e.g., as a first line of text in error boxes).
    */
  def createWithParentAndContext(parent: XWindow, context: String): Unit = js.native
}
object InteractionHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithParent: XWindow => Unit,
    createWithParentAndContext: (XWindow, String) => Unit,
    handle: XInteractionRequest => Unit,
    handleInteractionRequest: XInteractionRequest => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): InteractionHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithParent = js.Any.fromFunction1(createWithParent), createWithParentAndContext = js.Any.fromFunction2(createWithParentAndContext), handle = js.Any.fromFunction1(handle), handleInteractionRequest = js.Any.fromFunction1(handleInteractionRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[InteractionHandler]
  }
  
  @scala.inline
  implicit class InteractionHandlerMutableBuilder[Self <: InteractionHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithParent(value: XWindow => Unit): Self = StObject.set(x, "createWithParent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithParentAndContext(value: (XWindow, String) => Unit): Self = StObject.set(x, "createWithParentAndContext", js.Any.fromFunction2(value))
  }
}
