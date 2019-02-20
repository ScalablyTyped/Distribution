package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frameNs {
  /** @since LibreOffice 4.2 */
  type AppDispatchProvider = XAppDispatchProvider
  /**
    * A legacy (single-instance) service-variant of {@link theAutoRecovery} singleton.
    * @deprecated DeprecatedUse theAutoRecovery singleton instead.
    * @since LibreOffice 4.0
    */
  type AutoRecovery = XDispatch
  /** @since LibreOffice 4.1 */
  type Bibliography = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * specifies a collection of components
    *
    * One important instance of this service is available from the {@link Desktop} object via the {@link XDesktop} interface.
    * @see com.sun.star.lang.XComponent
    * @see XDesktop
    */
  type Components = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * special dispatcher for non visible contents, e.g. sounds
    *
    * This handler doesn't need any frame as target for loading components. Content handler are registered for content types. (See type/filter configuration
    * of {@link com.sun.star.document.TypeDetection} for further information) If generic load mechanism found such documents which can be handled by a
    * {@link ContentHandler} it will create and use it.
    * @see com.sun.star.document.TypeDetection
    */
  type ContentHandler = XNotifyingDispatch
  /**
    * factory to create content loader
    *
    * With this factory it's possible to have access on configuration of set of registered content handler objectscreate a content handler by his internal
    * namequery for a content handler by using special query or property description.
    */
  type ContentHandlerFactory = XLoaderFactory
  /**
    * A legacy (single-instance) service-variant of {@link theDesktop} singleton.
    * @deprecated DeprecatedUse theDesktop singleton instead.
    */
  type Desktop = XDesktop2
  /** @deprecated Deprecated */
  type DesktopTasks = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * provides an easy way to dispatch an URL using one call instead of multiple ones.
    *
    * Normally a complete dispatch is split into different parts: converting and parsing the URLsearching for a valid dispatch object available on a
    * dispatch providerdispatching of the URL and its parameters
    * @see DispatchProvider
    * @see XDispatchProvider
    * @see XDispatch
    * @since OOo 1.1.2
    */
  type DispatchHelper = XDispatchHelper
  /**
    * provides functionality to record {@link XDispatch.dispatch()} requests
    *
    * It records all necessary parameters of a call {@link XDispatch.dispatch()} and generate code which can be executed at later time to run same
    * operations again. Which code will be generated depends from real implementation. So it's possible to generate e.g. Java/Basic or may Perl code. By
    * using of a {@link DispatchRecorderSupplier} , which is available on a property of a {@link Frame.DispatchRecorderSupplier} , it's possible to change
    * such code generation for further requests or disable it in general by setting this property to `NULL` .
    * @see DispatchRecorderSupplier
    * @see Frame.RecorderSupplier
    * @since OOo 1.1.2
    */
  type DispatchRecorder = XDispatchRecorder
  /**
    * provides a {@link DispatchRecorder}
    *
    * This supplier regulate macro recording of {@link XDispatch.dispatch()} calls. For that it encapsulates a reference to a {@link DispatchRecorder} .
    * Such recorder is used internally and can be used externally too. A supplier will be available on a {@link Frame} if recording was enabled, otherwise
    * not. A frame supports a special property for that. This modular concept of recorder, supplier and frame makes it possible to implement local recording
    * on one frame; global recording by using all currently opened frames or only some of them; and so on.
    * @see DispatchRecorder
    * @see Frame
    * @since OOo 1.1.2
    */
  type DispatchRecorderSupplier = XDispatchRecorderSupplier
  /**
    * is a service for accessing the document templates of the office and manipulate them ( add or rename or remove templates )
    *
    * It implements a high level interface on top of an ucb content provider which is used for template configuration.
    */
  type DocumentTemplates = XDocumentTemplates
  /**
    * This exception can be thrown in case an object is initialized second time.
    * @since OOo 1.1.2
    */
  type DoubleInitializationException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * represents the environment for a desktop component
    *
    * Frames are the anchors for the office components and they are the component's link to the outside world. They create a skeleton for the whole office
    * API infrastructure by building frame hierarchies. These hierarchies contains all currently loaded documents and make it possible to walk during these
    * trees. A special service {@link Desktop} can(!) combine different of such trees to a global one which life time will be controlled by it.
    * @see Desktop
    */
  type Frame = XFrame2
  /**
    * factory to create frame loader
    *
    * With this factory it's possible to have access on configuration of set of registered frame loader objectscreate a frame loader by his internal
    * namequery for a frame loader by using special query or property description.
    */
  type FrameLoaderFactory = XLoaderFactory
  /**
    * this is a special container which can contain frames
    *
    * All elements in this container support the service frame. Implementations of this service are available by interface {@link XFramesSupplier} .
    * @see XFramesSupplier
    */
  type FramesContainer = XFrames
  /**
    * A legacy (single-instance) service-variant of {@link theGlobalEventBroadcaster} singleton.
    * @deprecated DeprecatedUse theGlobalEventBroadcaster singleton instead.
    */
  type GlobalEventBroadcaster = XGlobalEventBroadcaster
  /**
    * This exception can be thrown in case arguments are wrong.
    * @since OOo 1.1.2
    */
  type IllegalArgumentIOException = activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.IOException
  /**
    * controls the layout of user interface elements which are part of a frame.
    *
    * Layout management is the process of determining the size and position of user interface elements. By default, each {@link Frame} has a layout manager
    * -  it performs layout management for the user interface elements within the frame. User interface elements can provide size and alignment hints to
    * layout managers, but layout managers have the final decision on the size and position of those user interface elements.
    * @since OOo 2.0
    */
  type LayoutManager = XLayoutManager2
  /**
    * provides for mapping a given sequence of content identifier strings to a sequence of respective media (mime) types
    *
    * Order of given and their returned corresponding strings is important. Don't pack or optimize it. Every item of [in] list must match to an item of
    * [out] list.
    */
  type MediaTypeDetectionHelper = activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XStringMapping
  /**
    * can be used to identify office modules.
    *
    * Further it provides read access to the configuration of office modules.
    * @since OOo 2.0
    */
  type ModuleManager = XModuleManager2
  /** @since LibreOffice 4.2 */
  type OfficeFrameLoader = XSynchronousFrameLoader
  /**
    * A legacy (single-instance) service-variant of {@link thePopupMenuControllerFactory} singleton.
    * @deprecated DeprecatedUse thePopupMenuControllerFactory singleton instead.
    * @since OOo 2.0
    */
  type PopupMenuControllerFactory = XUIControllerFactory
  /**
    * The {@link SessionManager} service provides an interface to the session manager of the desktop. A session manager keeps track of applications that are
    * running when the desktop shuts down and starts them again in the same state they were left when the desktop starts up the next time. To be able to do
    * this the session manager needs cooperation from applications; applications have to provide sufficient information to be started again as well as
    * restore the state they were left in. The normal flow of operation looks like this:
    *
    *  1. The user starts the desktop shutdown. 2. The session manager informs all its connected applications about the pending shutdown. 3. Each
    * application saves its current state; while doing this it may The application may request to interact with the user (e.g. to ask where to save
    * documents). This request is necessary because at any one time only one application can interact with the user. The session manager coordinates these
    * requests and grants every application in need of user interaction a timeslot in which it may interact with the usertry to cancel the whole shutdown;
    * the session manager may or may not honor that request. 4. After saving is done the session manager signals all applications to exit. 5. Applications
    * answer the exit message by disconnecting from the session manager. 6. After all applications have exited or a reasonable timeout the session manager
    * kills all remaining applications and finally lets the desktop shut down.
    */
  type SessionManager = XSessionManagerClient
  /** @deprecated Deprecated */
  type Settings = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * is an abstract service for a component which offers a more complex user interface to users within a status bar.
    *
    * A generic status bar function is represented as a text field which provides status information to the user. A status bar controller can be added to a
    * status bar and provides information or functions with a more sophisticated user interface. ;  A typical example for a status bar controller is the
    * zoom level chooser within the statusbar. It provides an option to change the zoom level of an application.
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XStatusbarController
    * @since OOo 2.0
    */
  type StatusbarController = XStatusbarController
  /**
    * A legacy (single-instance) service-variant of {@link theStatusbarControllerFactory} singleton.
    * @deprecated DeprecatedUse theStatusbarControllerFactory singleton instead.
    * @since OOo 2.0
    */
  type StatusbarControllerFactory = XUIControllerFactory
  /** @since LibreOffice 4.1 */
  type TaskCreator = activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleServiceFactory
  /**
    * can be thrown by a {@link XTerminateListener} to prevent the environment (e.g., desktop) from terminating
    *
    * If a {@link XTerminateListener} use this exception for a veto against the termination of the office, he will be the new "owner" of it. After his own
    * operation will be finished, he MUST try to terminate the office again. Any other veto listener can intercept that again or office will die really.
    *
    * Since LibreOffice 5.3: Throwing this exception will only prevent **termination** . Exiting LibreOffice will close all the windows, but the process
    * will keep running.
    * @see XDesktop.terminate()
    * @see XTerminateListener
    */
  type TerminationVetoException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * A legacy (single-instance) service-variant of {@link theToolbarControllerFactory} singleton.
    * @deprecated DeprecatedUse theToolbarControllerFactory singleton instead.
    * @since OOo 2.0
    */
  type ToolbarControllerFactory = XUIControllerFactory
  /**
    * specifies a factory for com::sun::star::ucb::TransientDocumentsDocumentContents.
    * @since OOo 2.0
    */
  type TransientDocumentsDocumentContentFactory = XTransientDocumentsDocumentContentFactory
  /**
    * A legacy (single-instance) service-variant of {@link theUICommandDescription} singleton.
    * @deprecated DeprecatedUse theUICommandDescription singleton instead.
    * @since OOo 2.0
    */
  type UICommandDescription = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * This exception can be thrown in case an office module could not be classified or does not have a valid configuration.
    * @since OOo 2.0
    */
  type UnknownModuleException = activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception
  /**
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link AutoRecovery} service.
    * @since LibreOffice 4.3
    */
  type theAutoRecovery = XDispatch
  /**
    * is the environment for components which can instantiate within frames
    *
    * A desktop environment contains tasks with one or more frames in which components can be loaded. The term "task" or naming a frame as a "task frame" is
    * not in any way related to any additional implemented interfaces, it's just because these frames use task windows.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link Desktop} service.
    * @since LibreOffice 4.3
    */
  type theDesktop = XDesktop2
  /**
    * This singleton offers the document event functionality that can be found at any {@link com.sun.star.document.OfficeDocument} , but it does it for all
    * existing documents.
    *
    * So it is a single place where a listener can be registered for all events in all documents.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link GlobalEventBroadcaster} service.
    * @since LibreOffice 4.3
    */
  type theGlobalEventBroadcaster = XGlobalEventBroadcaster
  /**
    * specifies a factory that creates instances of registered popup menu controller.
    *
    * A pop-up menu controller can be registered for a command URL and a model service name. A menu bar or context menu will automatically create a pop-up
    * menu controller if it contains a registered command URL.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link PopupMenuControllerFactory} service.
    * @since LibreOffice 4.3
    */
  type thePopupMenuControllerFactory = XUIControllerFactory
  /**
    * specifies a factory that creates instances of registered status bar controller.
    *
    * A status bar controller can be registered for a command URL and a model service name. A status bar will automatically create a status bar controller
    * if it contains a registered command URL.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link StatusbarControllerFactory} service.
    * @since LibreOffice 4.3
    */
  type theStatusbarControllerFactory = XUIControllerFactory
  /**
    * specifies a factory that creates instances of registered toolbar controller.
    *
    * A toolbar controller can be registered for a command URL and a model service name.
    *
    * Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link ToolbarControllerFactory} service.
    * @since LibreOffice 4.3
    */
  type theToolbarControllerFactory = XUIControllerFactory
  /**
    * a singleton which provides information about user interface commands of modules.
    *
    * OpenOffice.org has an amount of commands that can be used by user interface elements. This singleton provides access to the user interface commands
    * that are part of OpenOffice.org modules, like Writer or Calc.
    *
    * Provides access to user interface commands of the installed modules.
    *
    * To access the user interface command description of a module, a unique module specifier must be provided to {@link
    * com.sun.star.container.XNameAccess.getByName()} function. The module specifier can be retrieved from the {@link com.sun.star.frame.ModuleManager}
    * service. The interface provides references to com::sun:star:: {@link ui.ModuleUICommandDescription} .
    * @see com.sun.star.frame.ModuleManager Prior to LibreOffice 4.3, this singleton was only available as a (single-instance) {@link UICommandDescription}
    * @since LibreOffice 4.3
    */
  type theUICommandDescription = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}
