package typings.algoliaCacheCommon.mod

import typings.algoliaCacheCommon.anon.ReadonlyPromisevoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  /**
    * Clears the cache.
    */
  def clear(): ReadonlyPromisevoid = js.native
  def delete(key: String): ReadonlyPromisevoid = js.native
  /**
    * Deletes the given `key`.
    */
  def delete(key: js.Object): ReadonlyPromisevoid = js.native
  def get[TValue](key: String, defaultValue: js.Function0[js.Promise[TValue]]): js.Promise[TValue] = js.native
  def get[TValue](key: String, defaultValue: js.Function0[js.Promise[TValue]], events: CacheEvents[TValue]): js.Promise[TValue] = js.native
  /**
    * Gets the value of the given `key`.
    */
  def get[TValue](key: js.Object, defaultValue: js.Function0[js.Promise[TValue]]): js.Promise[TValue] = js.native
  def get[TValue](key: js.Object, defaultValue: js.Function0[js.Promise[TValue]], events: CacheEvents[TValue]): js.Promise[TValue] = js.native
  def set[TValue](key: String, value: TValue): js.Promise[TValue] = js.native
  /**
    * Sets the given value with the given `key`.
    */
  def set[TValue](key: js.Object, value: TValue): js.Promise[TValue] = js.native
}

