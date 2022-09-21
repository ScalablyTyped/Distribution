package typings.activexLibreoffice.com_.sun.star.datatransfer

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboard {
  
  /**
    * A clipboard uses this object to notify its listeners of content changes.
    * @see com.sun.star.datatransfer.clipboard.XClipboardListener
    */
  trait ClipboardEvent
    extends StObject
       with EventObject {
    
    /** The current content of the clipboard. */
    var Contents: XTransferable
  }
  object ClipboardEvent {
    
    inline def apply(Contents: XTransferable, Source: XInterface): ClipboardEvent = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardEvent]
    }
    
    extension [Self <: ClipboardEvent](x: Self) {
      
      inline def setContents(value: XTransferable): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The clipboard manager is a one-instance service that holds a list of all known clipboard instances.
    * @see XClipboardManager
    */
  trait ClipboardManager
    extends StObject
       with XClipboardManager
       with XComponent
  object ClipboardManager {
    
    inline def apply(
      acquire: () => Unit,
      addClipboard: XClipboard => Unit,
      addEventListener: XEventListener => Unit,
      dispose: () => Unit,
      getClipboard: String => XClipboard,
      listClipboardNames: () => SafeArray[String],
      queryInterface: `type` => Any,
      release: () => Unit,
      removeClipboard: String => Unit,
      removeEventListener: XEventListener => Unit
    ): ClipboardManager = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard), removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[ClipboardManager]
    }
  }
  
  /** A generic clipboard service is a simple container for transferable objects. */
  trait GenericClipboard
    extends StObject
       with XClipboardEx
       with XClipboardNotifier
       with XInitialization
       with XComponent
  object GenericClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: () => Unit,
      addClipboardListener: XClipboardListener => Unit,
      addEventListener: XEventListener => Unit,
      dispose: () => Unit,
      getContents: () => XTransferable,
      getName: () => String,
      getRenderingCapabilities: () => Double,
      initialize: SeqEquiv[Any] => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeClipboardListener: XClipboardListener => Unit,
      removeEventListener: XEventListener => Unit,
      setContents: (XTransferable, XClipboardOwner) => Unit
    ): GenericClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setContents = js.Any.fromFunction2(setContents))
      __obj.asInstanceOf[GenericClipboard]
    }
  }
  
  object RenderingCapabilities {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def Delayed: `1` = 1.asInstanceOf[`1`]
      
      inline def Persistant: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /** The system clipboard service builds a bridge to the OS specific clipboard interfaces. */
  type SystemClipboard = XSystemClipboard
  
  trait XClipboard
    extends StObject
       with XInterface {
    
    /**
      * To get the current content of the clipboard.
      * @returns The transferable object representing the current content of this clipboard.
      * @see com.sun.star.datatransfer.XTransferable
      */
    val Contents: XTransferable
    
    /**
      * To get the name of the clipboard instance.
      * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
      */
    val Name: String
    
    /**
      * To get the current content of the clipboard.
      * @returns The transferable object representing the current content of this clipboard.
      * @see com.sun.star.datatransfer.XTransferable
      */
    def getContents(): XTransferable
    
    /**
      * To get the name of the clipboard instance.
      * @returns The name of this clipboard object. If the returned string is empty the clipboard instance is the system clipboard.
      */
    def getName(): String
    
    /**
      * Sets the current contents of the clipboard to the specified transferable object and registers the specified clipboard owner as the owner of the new
      * contents.
      * @param xTrans The transferable object to set as new content. If the given {@link com.sun.star.datatransfer.XTransferable} has no {@link com.sun.star.dat
      * @param xClipboardOwner The new owner of the clipboard. NULL is an acceptable value and means that the caller is not interested in lost ownership notific
      * @see com.sun.star.datatransfer.XTransferable
      * @see com.sun.star.datatransfer.clipboard.XClipboardOwner
      */
    def setContents(xTrans: XTransferable, xClipboardOwner: XClipboardOwner): Unit
  }
  object XClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      acquire: () => Unit,
      getContents: () => XTransferable,
      getName: () => String,
      queryInterface: `type` => Any,
      release: () => Unit,
      setContents: (XTransferable, XClipboardOwner) => Unit
    ): XClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContents = js.Any.fromFunction2(setContents))
      __obj.asInstanceOf[XClipboard]
    }
    
    extension [Self <: XClipboard](x: Self) {
      
      inline def setContents(value: XTransferable): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setGetContents(value: () => XTransferable): Self = StObject.set(x, "getContents", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setSetContents(value: (XTransferable, XClipboardOwner) => Unit): Self = StObject.set(x, "setContents", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * The extended clipboard interface.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardEx
    extends StObject
       with XClipboard {
    
    /**
      * To determine the supported rendering capabilities of the clipboard instance.
      * @returns A set of flags describing the rendering capabilities of the clipboard instance.
      * @see RenderingCapabilities
      */
    val RenderingCapabilities: Double
    
    /**
      * To determine the supported rendering capabilities of the clipboard instance.
      * @returns A set of flags describing the rendering capabilities of the clipboard instance.
      * @see RenderingCapabilities
      */
    def getRenderingCapabilities(): Double
  }
  object XClipboardEx {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: () => Unit,
      getContents: () => XTransferable,
      getName: () => String,
      getRenderingCapabilities: () => Double,
      queryInterface: `type` => Any,
      release: () => Unit,
      setContents: (XTransferable, XClipboardOwner) => Unit
    ): XClipboardEx = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContents = js.Any.fromFunction2(setContents))
      __obj.asInstanceOf[XClipboardEx]
    }
    
    extension [Self <: XClipboardEx](x: Self) {
      
      inline def setGetRenderingCapabilities(value: () => Double): Self = StObject.set(x, "getRenderingCapabilities", js.Any.fromFunction0(value))
      
      inline def setRenderingCapabilities(value: Double): Self = StObject.set(x, "RenderingCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Should be implemented by a clipboard factory that simplifies the creation of multiple clipboard instances.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardFactory
    extends StObject
       with XInterface {
    
    /**
      * Creates a new named clipboard instance.
      * @param aName The name the clipboard should have.
      * @returns A newly created instance of a {@link GenericClipboard} implementation.
      * @throws com::sun::star::lang::IllegalArgumentException If an empty string is passed as clipboard name.
      */
    def createClipboard(aName: String): XClipboard
  }
  object XClipboardFactory {
    
    inline def apply(
      acquire: () => Unit,
      createClipboard: String => XClipboard,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XClipboardFactory = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClipboard = js.Any.fromFunction1(createClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XClipboardFactory]
    }
    
    extension [Self <: XClipboardFactory](x: Self) {
      
      inline def setCreateClipboard(value: String => XClipboard): Self = StObject.set(x, "createClipboard", js.Any.fromFunction1(value))
    }
  }
  
  /** Interface to be implemented to receive notifications on clipboard content changes. */
  trait XClipboardListener
    extends StObject
       with XEventListener {
    
    /**
      * The content of the clipboard has changed.
      * @param event The event object containing the new clipboard content.
      * @see com.sun.star.datatransfer.clipboard.ClipboardEvent
      */
    def changedContents(event: ClipboardEvent): Unit
  }
  object XClipboardListener {
    
    inline def apply(
      acquire: () => Unit,
      changedContents: ClipboardEvent => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XClipboardListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changedContents = js.Any.fromFunction1(changedContents), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XClipboardListener]
    }
    
    extension [Self <: XClipboardListener](x: Self) {
      
      inline def setChangedContents(value: ClipboardEvent => Unit): Self = StObject.set(x, "changedContents", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * This interface is used to retrieve, add, or remove clipboard instances.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardManager
    extends StObject
       with XInterface {
    
    /**
      * Add a clipboard instance to the manager's list.
      * @param xClipboard The clipboard to add.
      * @throws com::sun::star::IllegalArgumentException if xClipboard is not a valid clipboard.
      * @throws com::sun::star::container::ElementExistsException if a clipboard with the name of xClipboard already exists.
      */
    def addClipboard(xClipboard: XClipboard): Unit
    
    /**
      * Get a clipboard instance by name.
      * @param aName The name of clipboard to return. To retrieve the default (system) clipboard, pass an empty string.
      * @returns The clipboard object with the specified name.
      * @throws com::sun::star::container::NoSuchElementException if no clipboard with the specified name exists.
      */
    def getClipboard(aName: String): XClipboard
    
    /**
      * Get a list of a managed clipboards.
      * @returns A sequence of the names of all available clipboards.
      */
    def listClipboardNames(): SafeArray[String]
    
    /**
      * Removes the clipboard with the specified name from the list.
      * @param aName The name of the clipboard to remove.
      */
    def removeClipboard(aName: String): Unit
  }
  object XClipboardManager {
    
    inline def apply(
      acquire: () => Unit,
      addClipboard: XClipboard => Unit,
      getClipboard: String => XClipboard,
      listClipboardNames: () => SafeArray[String],
      queryInterface: `type` => Any,
      release: () => Unit,
      removeClipboard: String => Unit
    ): XClipboardManager = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard))
      __obj.asInstanceOf[XClipboardManager]
    }
    
    extension [Self <: XClipboardManager](x: Self) {
      
      inline def setAddClipboard(value: XClipboard => Unit): Self = StObject.set(x, "addClipboard", js.Any.fromFunction1(value))
      
      inline def setGetClipboard(value: String => XClipboard): Self = StObject.set(x, "getClipboard", js.Any.fromFunction1(value))
      
      inline def setListClipboardNames(value: () => SafeArray[String]): Self = StObject.set(x, "listClipboardNames", js.Any.fromFunction0(value))
      
      inline def setRemoveClipboard(value: String => Unit): Self = StObject.set(x, "removeClipboard", js.Any.fromFunction1(value))
    }
  }
  
  trait XClipboardNotifier
    extends StObject
       with XInterface {
    
    /**
      * Requests notifications on clipboard content changes.
      * @param listener The object receiving the notifications.
      */
    def addClipboardListener(listener: XClipboardListener): Unit
    
    /**
      * Removes listener from notification list.
      * @param listener The object to remove from notification list.
      */
    def removeClipboardListener(listener: XClipboardListener): Unit
  }
  object XClipboardNotifier {
    
    inline def apply(
      acquire: () => Unit,
      addClipboardListener: XClipboardListener => Unit,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeClipboardListener: XClipboardListener => Unit
    ): XClipboardNotifier = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener))
      __obj.asInstanceOf[XClipboardNotifier]
    }
    
    extension [Self <: XClipboardNotifier](x: Self) {
      
      inline def setAddClipboardListener(value: XClipboardListener => Unit): Self = StObject.set(x, "addClipboardListener", js.Any.fromFunction1(value))
      
      inline def setRemoveClipboardListener(value: XClipboardListener => Unit): Self = StObject.set(x, "removeClipboardListener", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The owner of a transferable object may pass this interface to the clipboard instance.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    */
  trait XClipboardOwner
    extends StObject
       with XInterface {
    
    /**
      * Notifies the transferable object source that it is no longer the owner of the clipboard.
      * @param xClipboard The clipboard for which the ownership was lost.
      * @param xTrans The transferable object that has been the contents of the clipboard.
      * @see com.sun.star.datatransfer.clipboard.XClipboard
      * @see com.sun.star.datatransfer.XTransferable
      */
    def lostOwnership(xClipboard: XClipboard, xTrans: XTransferable): Unit
  }
  object XClipboardOwner {
    
    inline def apply(
      acquire: () => Unit,
      lostOwnership: (XClipboard, XTransferable) => Unit,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XClipboardOwner = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), lostOwnership = js.Any.fromFunction2(lostOwnership), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XClipboardOwner]
    }
    
    extension [Self <: XClipboardOwner](x: Self) {
      
      inline def setLostOwnership(value: (XClipboard, XTransferable) => Unit): Self = StObject.set(x, "lostOwnership", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * An interface for flushable clipboards may optionally be implemented by a system clipboard service.
    * @see com.sun.star.datatransfer.clipboard.SystemClipboard
    */
  trait XFlushableClipboard
    extends StObject
       with XInterface {
    
    /** Renders the current content of the clipboard to the system so that it is available even if the source application no longer exist. */
    def flushClipboard(): Unit
  }
  object XFlushableClipboard {
    
    inline def apply(
      acquire: () => Unit,
      flushClipboard: () => Unit,
      queryInterface: `type` => Any,
      release: () => Unit
    ): XFlushableClipboard = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), flushClipboard = js.Any.fromFunction0(flushClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XFlushableClipboard]
    }
    
    extension [Self <: XFlushableClipboard](x: Self) {
      
      inline def setFlushClipboard(value: () => Unit): Self = StObject.set(x, "flushClipboard", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Provides a unified interface for new-style service {@link SystemClipboard} .
    * @since LibreOffice 4.2
    */
  trait XSystemClipboard
    extends StObject
       with XClipboardEx
       with XClipboardNotifier
       with XFlushableClipboard
       with XComponent
  object XSystemClipboard {
    
    inline def apply(
      Contents: XTransferable,
      Name: String,
      RenderingCapabilities: Double,
      acquire: () => Unit,
      addClipboardListener: XClipboardListener => Unit,
      addEventListener: XEventListener => Unit,
      dispose: () => Unit,
      flushClipboard: () => Unit,
      getContents: () => XTransferable,
      getName: () => String,
      getRenderingCapabilities: () => Double,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeClipboardListener: XClipboardListener => Unit,
      removeEventListener: XEventListener => Unit,
      setContents: (XTransferable, XClipboardOwner) => Unit
    ): XSystemClipboard = {
      val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flushClipboard = js.Any.fromFunction0(flushClipboard), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setContents = js.Any.fromFunction2(setContents))
      __obj.asInstanceOf[XSystemClipboard]
    }
  }
}
