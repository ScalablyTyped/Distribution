package typings
package angularDashLocalforageLib.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalForageService extends js.Object {
  def bind($scope: angularLib.angularMod.IScope, config: angularDashLocalforageLib.Anon_DefaultValue): angularLib.angularMod.IPromise[_] = js.native
  def bind($scope: angularLib.angularMod.IScope, key: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def clear(): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def createInstance(config: LocalForageConfig): ILocalForageService = js.native
  def driver(): localforageLib.LocalForageDriver = js.native
  def getItem(key: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def getItem(keys: js.Array[java.lang.String]): angularLib.angularMod.IPromise[js.Array[_]] = js.native
  def instance(name: java.lang.String): ILocalForageService = js.native
  def iterate[T](
    iteratorCallback: js.Function2[/* value */ java.lang.String | scala.Double, /* key */ java.lang.String, T]
  ): angularLib.angularMod.IPromise[T] = js.native
  def key(n: scala.Double): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def keys(): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def length(): angularLib.angularMod.IPromise[scala.Double] = js.native
  def pull(key: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def pull(keys: js.Array[java.lang.String]): angularLib.angularMod.IPromise[js.Array[_]] = js.native
  def removeItem(key: java.lang.String): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def removeItem(key: js.Array[java.lang.String]): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def setDriver(name: java.lang.String): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def setDriver(name: js.Array[java.lang.String]): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def setItem(key: java.lang.String, value: js.Any): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def setItem(keys: js.Array[java.lang.String], values: js.Array[_]): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def unbind($scope: angularLib.angularMod.IScope, key: java.lang.String): scala.Unit = js.native
  def unbind($scope: angularLib.angularMod.IScope, key: java.lang.String, scopeKey: java.lang.String): scala.Unit = js.native
}

