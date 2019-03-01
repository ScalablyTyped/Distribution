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
    acquire: js.Function0[scala.Unit],
    addEngineListener: js.Function1[XEngineListener, scala.Unit],
    cancel: js.Function0[scala.Unit],
    compile: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Boolean],
    getRoot: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEngineListener: js.Function1[XEngineListener, scala.Unit],
    run: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      js.Any
    ],
    runAsync: js.Function4[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      XEngineListener, 
      scala.Unit
    ],
    setLibraryAccess: js.Function1[XLibraryAccess, scala.Unit],
    setRoot: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XEngine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Root")(Root)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEngineListener")(addEngineListener)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("compile")(compile)
    __obj.updateDynamic("getRoot")(getRoot)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEngineListener")(removeEngineListener)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("runAsync")(runAsync)
    __obj.updateDynamic("setLibraryAccess")(setLibraryAccess)
    __obj.updateDynamic("setRoot")(setRoot)
    __obj.asInstanceOf[XEngine]
  }
}

