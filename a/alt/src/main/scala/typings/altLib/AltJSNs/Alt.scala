package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AltJS.Alt")
@js.native
class Alt () extends js.Object {
  def this(config: AltConfig) = this()
  var actions: Actions = js.native
  //Actions methods
  def addActions(actionsName: java.lang.String, ActionsClass: ActionsClassConstructor): scala.Unit = js.native
  //Stores methods
  def addStore(name: java.lang.String, store: StoreModel[_]): scala.Unit = js.native
  def addStore(name: java.lang.String, store: StoreModel[_], saveStore: scala.Boolean): scala.Unit = js.native
  def bootstrap(jsonData: java.lang.String): scala.Unit = js.native
  def createActions[T](ActionsClass: ActionsClassConstructor): T = js.native
  def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object): T = js.native
  def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object, constructorArgs: js.Any*): T = js.native
  def createStore[S](store: StoreModel[S]): AltStore[S] = js.native
  def createStore[S](store: StoreModel[S], name: java.lang.String): AltStore[S] = js.native
  def dispatch(): scala.Unit = js.native
  def dispatch(action: Action[_]): scala.Unit = js.native
  def dispatch(action: Action[_], data: js.Object): scala.Unit = js.native
  def dispatch(action: Action[_], data: js.Object, details: js.Any): scala.Unit = js.native
  def dispatch(action: java.lang.String): scala.Unit = js.native
  def dispatch(action: java.lang.String, data: js.Object): scala.Unit = js.native
  def dispatch(action: java.lang.String, data: js.Object, details: js.Any): scala.Unit = js.native
  def flush(): js.Object = js.native
  def generateActions[T](actions: java.lang.String*): T = js.native
  def getActions(actionsName: java.lang.String): Actions = js.native
  def getStore(name: java.lang.String): AltStore[_] = js.native
  def recycle(stores: AltStore[_]*): scala.Unit = js.native
  def rollback(): scala.Unit = js.native
  def takeSnapshot(storeNames: java.lang.String*): java.lang.String = js.native
}

