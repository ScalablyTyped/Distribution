package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to control a scripting engine.
  * @deprecated Deprecated
  */
trait XEngine
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** gets an interface to the object which is the scripting root. */
  var Root: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * adds an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addEngineListener(Listener: XEngineListener): scala.Unit
  /**
    * terminates the execution of the running script.
    *
    * The waiting queue is cleared too.
    */
  def cancel(): scala.Unit
  /** compiles a script module in the scope of the root object. */
  def compile(ModuleName: java.lang.String, Script: java.lang.String, CreateDebugInfo: scala.Boolean): scala.Boolean
  /** gets an interface to the object which is the scripting root. */
  def getRoot(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * removes an engine listener.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeEngineListener(Listener: XEngineListener): scala.Unit
  /**
    * runs a script specified by a string.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The Script is executed synchronously.
    */
  def run(
    aScript: java.lang.String,
    xThis: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    aArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): js.Any
  /**
    * runs the script specified by a string and makes callbacks.
    *
    * The arguments given in **aArgs** can be ignored by the engine. The script is executed asynchronously.
    */
  def runAsync(
    acript: java.lang.String,
    xThis: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    args: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_],
    xCallback: XEngineListener
  ): scala.Unit
  /** sets an access object to get external functions. */
  def setLibraryAccess(Library: XLibraryAccess): scala.Unit
  /**
    * sets an interface to an object as a scripting root.
    *
    * If the root object implements the {@link XInvocation} interface, then the engine uses this interface to set/get properties and call methods.
    */
  def setRoot(xRoot: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
}

object XEngine {
  @scala.inline
  def apply(
    Root: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: () => scala.Unit,
    addEngineListener: XEngineListener => scala.Unit,
    cancel: () => scala.Unit,
    compile: (java.lang.String, java.lang.String, scala.Boolean) => scala.Boolean,
    getRoot: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEngineListener: XEngineListener => scala.Unit,
    run: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => js.Any,
    runAsync: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], XEngineListener) => scala.Unit,
    setLibraryAccess: XLibraryAccess => scala.Unit,
    setRoot: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): XEngine = {
    val __obj = js.Dynamic.literal(Root = Root, acquire = js.Any.fromFunction0(acquire), addEngineListener = js.Any.fromFunction1(addEngineListener), cancel = js.Any.fromFunction0(cancel), compile = js.Any.fromFunction3(compile), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEngineListener = js.Any.fromFunction1(removeEngineListener), run = js.Any.fromFunction3(run), runAsync = js.Any.fromFunction4(runAsync), setLibraryAccess = js.Any.fromFunction1(setLibraryAccess), setRoot = js.Any.fromFunction1(setRoot))
  
    __obj.asInstanceOf[XEngine]
  }
}

