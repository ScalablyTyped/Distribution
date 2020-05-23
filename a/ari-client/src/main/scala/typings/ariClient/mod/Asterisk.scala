package typings.ariClient.mod

import typings.ariClient.anon.ConfigClass
import typings.ariClient.anon.Configuration
import typings.ariClient.anon.Fields
import typings.ariClient.anon.LogChannelName
import typings.ariClient.anon.ModuleName
import typings.ariClient.anon.Only
import typings.ariClient.anon.Value
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asterisk extends js.Object {
  def addLog(params: Configuration): js.Promise[Unit] = js.native
  def addLog(params: Configuration, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteLog(params: LogChannelName): js.Promise[Unit] = js.native
  def deleteLog(params: LogChannelName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def deleteObject(params: ConfigClass): js.Promise[Unit] = js.native
  def deleteObject(params: ConfigClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def getGlobalVar(params: typings.ariClient.anon.Variable): js.Promise[Variable] = js.native
  def getGlobalVar(
    params: typings.ariClient.anon.Variable,
    callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  def getInfo(): js.Promise[AsteriskInfo] = js.native
  def getInfo(callback: js.Function2[/* err */ Error, /* asteriskinfo */ AsteriskInfo, Unit]): Unit = js.native
  def getInfo(params: Only): js.Promise[AsteriskInfo] = js.native
  def getInfo(params: Only, callback: js.Function2[/* err */ Error, /* asteriskinfo */ AsteriskInfo, Unit]): Unit = js.native
  def getModule(params: ModuleName): js.Promise[Module] = js.native
  def getModule(params: ModuleName, callback: js.Function2[/* err */ Error, /* module */ Module, Unit]): Unit = js.native
  def getObject(params: ConfigClass): js.Promise[js.Array[ConfigTuple]] = js.native
  /* Methods */
  def getObject(
    params: ConfigClass,
    callback: js.Function2[/* err */ Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
  def listLogChannels(): js.Promise[js.Array[LogChannel]] = js.native
  def listLogChannels(callback: js.Function2[/* err */ Error, /* logchannels */ js.Array[LogChannel], Unit]): Unit = js.native
  def listModules(): js.Promise[js.Array[Module]] = js.native
  def listModules(callback: js.Function2[/* err */ Error, /* modules */ js.Array[Module], Unit]): Unit = js.native
  def loadModule(params: ModuleName): js.Promise[Unit] = js.native
  def loadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def ping(): js.Promise[AsteriskPing] = js.native
  def ping(callback: js.Function2[/* err */ Error, /* asteriskping */ AsteriskPing, Unit]): Unit = js.native
  def reloadModule(params: ModuleName): js.Promise[Unit] = js.native
  def reloadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def rotateLog(params: LogChannelName): js.Promise[Unit] = js.native
  def rotateLog(params: LogChannelName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def setGlobalVar(params: Value): js.Promise[Unit] = js.native
  def setGlobalVar(params: Value, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def unloadModule(params: ModuleName): js.Promise[Unit] = js.native
  def unloadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def updateObject(params: Fields): js.Promise[js.Array[ConfigTuple]] = js.native
  def updateObject(
    params: Fields,
    callback: js.Function2[/* err */ Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
}

