package typings.angularLocalforage.mod.localForage

import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angularLocalforage.anon.DefaultValue
import typings.localforage.LocalForageDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalForageService extends js.Object {
  def bind($scope: IScope, config: DefaultValue): IPromise[_] = js.native
  def bind($scope: IScope, key: String): IPromise[_] = js.native
  def clear(): IPromise[Unit] = js.native
  def createInstance(config: LocalForageConfig): ILocalForageService = js.native
  def driver(): LocalForageDriver = js.native
  def getItem(key: String): IPromise[_] = js.native
  def getItem(keys: js.Array[String]): IPromise[js.Array[_]] = js.native
  def instance(name: String): ILocalForageService = js.native
  def iterate[T](iteratorCallback: js.Function2[/* value */ String | Double, /* key */ String, T]): IPromise[T] = js.native
  def key(n: Double): IPromise[String] = js.native
  def keys(): IPromise[String] = js.native
  def length(): IPromise[Double] = js.native
  def pull(key: String): IPromise[_] = js.native
  def pull(keys: js.Array[String]): IPromise[js.Array[_]] = js.native
  def removeItem(key: String): IPromise[Unit] = js.native
  def removeItem(key: js.Array[String]): IPromise[Unit] = js.native
  def setDriver(name: String): IPromise[Unit] = js.native
  def setDriver(name: js.Array[String]): IPromise[Unit] = js.native
  def setItem(key: String, value: js.Any): IPromise[Unit] = js.native
  def setItem(keys: js.Array[String], values: js.Array[_]): IPromise[Unit] = js.native
  def unbind($scope: IScope, key: String): Unit = js.native
  def unbind($scope: IScope, key: String, scopeKey: String): Unit = js.native
}

