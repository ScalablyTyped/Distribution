package typings
package adoneLib.adoneNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.Subsystem")
@js.native
class Subsystem ()
  extends adoneLib.adoneNs.eventNs.AsyncEmitter {
  def this(options: adoneLib.Anon_NameString) = this()
  val isOwned: scala.Boolean = js.native
  val name: js.UndefOr[java.lang.String] = js.native
  val parent: js.UndefOr[Subsystem] = js.native
  val root: js.UndefOr[Subsystem] = js.native
  val state: scala.Double = js.native
  def addSubsystem(info: adoneLib.adoneNs.appNs.INs.AddSubsystemInfo with adoneLib.Anon_SubsystemString): adoneLib.adoneNs.appNs.INs.SysInfoWithPath = js.native
  @JSName("addSubsystem")
  def addSubsystem_SysInfoNoPath(info: adoneLib.adoneNs.appNs.INs.AddSubsystemInfo with adoneLib.Anon_Subsystem): adoneLib.adoneNs.appNs.INs.SysInfoNoPath = js.native
  def addSubsystemsFrom(path: java.lang.String): adoneLib.adoneNs.appNs.INs.SysInfoWithPath = js.native
  def addSubsystemsFrom(path: java.lang.String, options: adoneLib.adoneNs.appNs.INs.AddSubsystemsFromOptions): adoneLib.adoneNs.appNs.INs.SysInfoWithPath = js.native
  def configure(): scala.Unit = js.native
  def configureSubsystem(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def configureSubsystems(): js.Promise[scala.Unit] = js.native
  def deleteSubsystem(name: java.lang.String): scala.Unit = js.native
  def deleteSubsystem(name: java.lang.String, force: scala.Boolean): scala.Unit = js.native
  def getSubsystem(name: java.lang.String): Subsystem = js.native
  def getSubsystemInfo(name: java.lang.String): adoneLib.adoneNs.appNs.INs.SysInfo = js.native
  def getSubsystems(): js.Array[adoneLib.adoneNs.appNs.INs.SysInfo] = js.native
  def hasSubsystem(name: java.lang.String): scala.Boolean = js.native
  def hasSubsystems(): scala.Boolean = js.native
  def initialize(): scala.Unit = js.native
  def initializeSubsystem(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def instantiateSubsystem(subsystem: Subsystem): Subsystem = js.native
  def instantiateSubsystem(subsystem: Subsystem, options: adoneLib.Anon_Transpile): Subsystem = js.native
  def instantiateSubsystem(subsystem: java.lang.String): Subsystem = js.native
  def instantiateSubsystem(subsystem: java.lang.String, options: adoneLib.Anon_Transpile): Subsystem = js.native
  def loadSubsystem(subsystem: Subsystem): js.Promise[scala.Unit] = js.native
  def loadSubsystem(subsystem: Subsystem, options: adoneLib.adoneNs.appNs.INs.LoadSubsystemOptions): js.Promise[scala.Unit] = js.native
  def loadSubsystem(subsystem: java.lang.String): js.Promise[scala.Unit] = js.native
  def loadSubsystem(subsystem: java.lang.String, options: adoneLib.adoneNs.appNs.INs.LoadSubsystemOptions): js.Promise[scala.Unit] = js.native
  def reinitializeSubsystem(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def reinitializeSubsystems(): js.Promise[scala.Unit] = js.native
  def setRoot(root: Subsystem): scala.Unit = js.native
  def setState(state: scala.Double): scala.Unit = js.native
  def uninitialize(): scala.Unit = js.native
  def uninitializeSubsystem(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def uninitializeSubsystems(): js.Promise[scala.Unit] = js.native
  def unloadSubsystem(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitForState(expectedState: scala.Double): js.Promise[scala.Unit] = js.native
  def waitForState(expectedState: scala.Double, timeout: scala.Double): js.Promise[scala.Unit] = js.native
}

