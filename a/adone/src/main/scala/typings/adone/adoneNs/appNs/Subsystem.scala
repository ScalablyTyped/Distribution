package typings.adone.adoneNs.appNs

import typings.adone.Anon_Name
import typings.adone.Anon_Subsystem
import typings.adone.Anon_SubsystemString
import typings.adone.Anon_Transpile
import typings.adone.adoneNs.appNs.INs.AddSubsystemInfo
import typings.adone.adoneNs.appNs.INs.AddSubsystemsFromOptions
import typings.adone.adoneNs.appNs.INs.LoadSubsystemOptions
import typings.adone.adoneNs.appNs.INs.SysInfo
import typings.adone.adoneNs.appNs.INs.SysInfoNoPath
import typings.adone.adoneNs.appNs.INs.SysInfoWithPath
import typings.adone.adoneNs.eventNs.AsyncEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.Subsystem")
@js.native
class Subsystem () extends AsyncEmitter {
  def this(options: Anon_Name) = this()
  val isOwned: Boolean = js.native
  val name: js.UndefOr[String] = js.native
  val parent: js.UndefOr[Subsystem] = js.native
  val root: js.UndefOr[Subsystem] = js.native
  val state: Double = js.native
  def addSubsystem(info: AddSubsystemInfo with Anon_SubsystemString): SysInfoWithPath = js.native
  @JSName("addSubsystem")
  def addSubsystem_SysInfoNoPath(info: AddSubsystemInfo with Anon_Subsystem): SysInfoNoPath = js.native
  def addSubsystemsFrom(path: String): SysInfoWithPath = js.native
  def addSubsystemsFrom(path: String, options: AddSubsystemsFromOptions): SysInfoWithPath = js.native
  def configure(): Unit = js.native
  def configureSubsystem(name: String): js.Promise[Unit] = js.native
  def configureSubsystems(): js.Promise[Unit] = js.native
  def deleteSubsystem(name: String): Unit = js.native
  def deleteSubsystem(name: String, force: Boolean): Unit = js.native
  def getSubsystem(name: String): Subsystem = js.native
  def getSubsystemInfo(name: String): SysInfo = js.native
  def getSubsystems(): js.Array[SysInfo] = js.native
  def hasSubsystem(name: String): Boolean = js.native
  def hasSubsystems(): Boolean = js.native
  def initialize(): Unit = js.native
  def initializeSubsystem(name: String): js.Promise[Unit] = js.native
  def instantiateSubsystem(subsystem: String): Subsystem = js.native
  def instantiateSubsystem(subsystem: String, options: Anon_Transpile): Subsystem = js.native
  def instantiateSubsystem(subsystem: Subsystem): Subsystem = js.native
  def instantiateSubsystem(subsystem: Subsystem, options: Anon_Transpile): Subsystem = js.native
  def loadSubsystem(subsystem: String): js.Promise[Unit] = js.native
  def loadSubsystem(subsystem: String, options: LoadSubsystemOptions): js.Promise[Unit] = js.native
  def loadSubsystem(subsystem: Subsystem): js.Promise[Unit] = js.native
  def loadSubsystem(subsystem: Subsystem, options: LoadSubsystemOptions): js.Promise[Unit] = js.native
  def reinitializeSubsystem(name: String): js.Promise[Unit] = js.native
  def reinitializeSubsystems(): js.Promise[Unit] = js.native
  def setRoot(root: Subsystem): Unit = js.native
  def setState(state: Double): Unit = js.native
  def uninitialize(): Unit = js.native
  def uninitializeSubsystem(name: String): js.Promise[Unit] = js.native
  def uninitializeSubsystems(): js.Promise[Unit] = js.native
  def unloadSubsystem(name: String): js.Promise[Unit] = js.native
  def waitForState(expectedState: Double): js.Promise[Unit] = js.native
  def waitForState(expectedState: Double, timeout: Double): js.Promise[Unit] = js.native
}

