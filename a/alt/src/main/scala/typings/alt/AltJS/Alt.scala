package typings.alt.AltJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alt extends js.Object {
  
  var actions: Actions = js.native
  
  //Actions methods
  def addActions(actionsName: String, ActionsClass: ActionsClassConstructor): Unit = js.native
  
  //Stores methods
  def addStore(name: String, store: StoreModel[_]): Unit = js.native
  def addStore(name: String, store: StoreModel[_], saveStore: Boolean): Unit = js.native
  
  def bootstrap(jsonData: String): Unit = js.native
  
  def createActions[T](ActionsClass: ActionsClassConstructor): T = js.native
  def createActions[T](
    ActionsClass: ActionsClassConstructor,
    exportObj: js.UndefOr[scala.Nothing],
    constructorArgs: js.Any*
  ): T = js.native
  def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object): T = js.native
  def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object, constructorArgs: js.Any*): T = js.native
  
  def createStore[S](store: StoreModel[S]): AltStore[S] = js.native
  def createStore[S](store: StoreModel[S], name: String): AltStore[S] = js.native
  
  def dispatch(): Unit = js.native
  def dispatch(action: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
  def dispatch(action: js.UndefOr[scala.Nothing], data: js.Object): Unit = js.native
  def dispatch(action: js.UndefOr[scala.Nothing], data: js.Object, details: js.Any): Unit = js.native
  def dispatch(action: String): Unit = js.native
  def dispatch(action: String, data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
  def dispatch(action: String, data: js.Object): Unit = js.native
  def dispatch(action: String, data: js.Object, details: js.Any): Unit = js.native
  def dispatch(action: Action[_]): Unit = js.native
  def dispatch(action: Action[_], data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
  def dispatch(action: Action[_], data: js.Object): Unit = js.native
  def dispatch(action: Action[_], data: js.Object, details: js.Any): Unit = js.native
  
  def flush(): js.Object = js.native
  
  def generateActions[T](actions: String*): T = js.native
  
  def getActions(actionsName: String): Actions = js.native
  
  def getStore(name: String): AltStore[_] = js.native
  
  def recycle(stores: AltStore[_]*): Unit = js.native
  
  def rollback(): Unit = js.native
  
  def takeSnapshot(storeNames: String*): String = js.native
}
