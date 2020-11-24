package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to control a scripting engine.
  * @deprecated Deprecated
  */
@js.native
trait XEngine extends XInterface {
  
  /** gets an interface to the object which is the scripting root. */
  var Root: XInterface = js.native
  
  /**
    * adds an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addEngineListener(Listener: XEngineListener): Unit = js.native
  
  /**
    * terminates the execution of the running script.
    *
    * The waiting queue is cleared too.
    */
  def cancel(): Unit = js.native
  
  /** compiles a script module in the scope of the root object. */
  def compile(ModuleName: String, Script: String, CreateDebugInfo: Boolean): Boolean = js.native
  
  /** gets an interface to the object which is the scripting root. */
  def getRoot(): XInterface = js.native
  
  /**
    * removes an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeEngineListener(Listener: XEngineListener): Unit = js.native
  
  /**
    * runs a script specified by a string.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The Script is executed synchronously.
    */
  def run(aScript: String, xThis: XInterface, aArgs: SeqEquiv[_]): js.Any = js.native
  
  /**
    * runs the script specified by a string and makes callbacks.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The script is executed asynchronously.
    */
  def runAsync(acript: String, xThis: XInterface, args: SeqEquiv[_], xCallback: XEngineListener): Unit = js.native
  
  /** sets an access object to get external functions. */
  def setLibraryAccess(Library: XLibraryAccess): Unit = js.native
  
  /**
    * sets an interface to an object as a scripting root.
    *
    * If the root object implements the {@link XInvocation} interface, then the engine uses this interface to set/get properties and call methods.
    */
  def setRoot(xRoot: XInterface): Unit = js.native
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
    run: (String, XInterface, SeqEquiv[_]) => js.Any,
    runAsync: (String, XInterface, SeqEquiv[_], XEngineListener) => Unit,
    setLibraryAccess: XLibraryAccess => Unit,
    setRoot: XInterface => Unit
  ): XEngine = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEngineListener = js.Any.fromFunction1(addEngineListener), cancel = js.Any.fromFunction0(cancel), compile = js.Any.fromFunction3(compile), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEngineListener = js.Any.fromFunction1(removeEngineListener), run = js.Any.fromFunction3(run), runAsync = js.Any.fromFunction4(runAsync), setLibraryAccess = js.Any.fromFunction1(setLibraryAccess), setRoot = js.Any.fromFunction1(setRoot))
    __obj.asInstanceOf[XEngine]
  }
  
  @scala.inline
  implicit class XEngineOps[Self <: XEngine] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: XInterface): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEngineListener(value: XEngineListener => Unit): Self = this.set("addEngineListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompile(value: (String, String, Boolean) => Boolean): Self = this.set("compile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRoot(value: () => XInterface): Self = this.set("getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEngineListener(value: XEngineListener => Unit): Self = this.set("removeEngineListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: (String, XInterface, SeqEquiv[_]) => js.Any): Self = this.set("run", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRunAsync(value: (String, XInterface, SeqEquiv[_], XEngineListener) => Unit): Self = this.set("runAsync", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetLibraryAccess(value: XLibraryAccess => Unit): Self = this.set("setLibraryAccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRoot(value: XInterface => Unit): Self = this.set("setRoot", js.Any.fromFunction1(value))
  }
}
