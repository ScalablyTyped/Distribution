package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to control a scripting engine.
  * @deprecated Deprecated
  */
trait XEngine
  extends StObject
     with XInterface {
  
  /** gets an interface to the object which is the scripting root. */
  var Root: XInterface
  
  /**
    * adds an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addEngineListener(Listener: XEngineListener): Unit
  
  /**
    * terminates the execution of the running script.
    *
    * The waiting queue is cleared too.
    */
  def cancel(): Unit
  
  /** compiles a script module in the scope of the root object. */
  def compile(ModuleName: String, Script: String, CreateDebugInfo: Boolean): Boolean
  
  /** gets an interface to the object which is the scripting root. */
  def getRoot(): XInterface
  
  /**
    * removes an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeEngineListener(Listener: XEngineListener): Unit
  
  /**
    * runs a script specified by a string.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The Script is executed synchronously.
    */
  def run(aScript: String, xThis: XInterface, aArgs: SeqEquiv[js.Any]): js.Any
  
  /**
    * runs the script specified by a string and makes callbacks.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The script is executed asynchronously.
    */
  def runAsync(acript: String, xThis: XInterface, args: SeqEquiv[js.Any], xCallback: XEngineListener): Unit
  
  /** sets an access object to get external functions. */
  def setLibraryAccess(Library: XLibraryAccess): Unit
  
  /**
    * sets an interface to an object as a scripting root.
    *
    * If the root object implements the {@link XInvocation} interface, then the engine uses this interface to set/get properties and call methods.
    */
  def setRoot(xRoot: XInterface): Unit
}
object XEngine {
  
  @scala.inline
  def apply(
    Root: XInterface,
    acquire: () => Unit,
    addEngineListener: XEngineListener => Unit,
    cancel: () => Unit,
    compile: (String, String, Boolean) => Boolean,
    getRoot: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEngineListener: XEngineListener => Unit,
    run: (String, XInterface, SeqEquiv[js.Any]) => js.Any,
    runAsync: (String, XInterface, SeqEquiv[js.Any], XEngineListener) => Unit,
    setLibraryAccess: XLibraryAccess => Unit,
    setRoot: XInterface => Unit
  ): XEngine = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEngineListener = js.Any.fromFunction1(addEngineListener), cancel = js.Any.fromFunction0(cancel), compile = js.Any.fromFunction3(compile), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEngineListener = js.Any.fromFunction1(removeEngineListener), run = js.Any.fromFunction3(run), runAsync = js.Any.fromFunction4(runAsync), setLibraryAccess = js.Any.fromFunction1(setLibraryAccess), setRoot = js.Any.fromFunction1(setRoot))
    __obj.asInstanceOf[XEngine]
  }
  
  @scala.inline
  implicit class XEngineMutableBuilder[Self <: XEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEngineListener(value: XEngineListener => Unit): Self = StObject.set(x, "addEngineListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompile(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRoot(value: () => XInterface): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEngineListener(value: XEngineListener => Unit): Self = StObject.set(x, "removeEngineListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRoot(value: XInterface): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: (String, XInterface, SeqEquiv[js.Any]) => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRunAsync(value: (String, XInterface, SeqEquiv[js.Any], XEngineListener) => Unit): Self = StObject.set(x, "runAsync", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetLibraryAccess(value: XLibraryAccess => Unit): Self = StObject.set(x, "setLibraryAccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRoot(value: XInterface => Unit): Self = StObject.set(x, "setRoot", js.Any.fromFunction1(value))
  }
}
