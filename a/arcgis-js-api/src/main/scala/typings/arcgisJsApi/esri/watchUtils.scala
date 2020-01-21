package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait watchUtils extends js.Object {
  /**
    * Watches a property for changes and calls the callback with the initial value of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#init)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call with the initial value of the property when the property changes.
    *
    */
  def init(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def init(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for changes and automatically attaches and detaches an event handler for a given event to the property value as needed.  The attachedHandler and detachedHandler are optional and if provided will be called whenever the event handler is attached and detached respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#on)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param eventName The name of the event to attach the event handler for.
    * @param eventHandler The event handler callback function.
    * @param attachedHandler Callback called each time the event handler is attached.
    * @param detachedHandler Callback called each time the event handler is detached.
    *
    */
  def on(obj: Accessor, propertyName: String, eventName: String, eventHandler: js.Function): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: String,
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: String,
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: EventAttachedCallback,
    detachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
  def on(obj: Accessor, propertyName: js.Array[String], eventName: String, eventHandler: js.Function): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: js.Array[String],
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: js.Array[String],
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: EventAttachedCallback,
    detachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
  /**
    * Watches a property for changes once. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming truthy. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#once)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def once(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for changes. The returned handle can be paused (and resumed) to temporarily prevent the callback from being called on property changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#pausable)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def pausable(obj: Accessor, propertyName: String): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: String, callback: WatchCallback): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: js.Array[String]): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PausableWatchHandle = js.native
  /**
    * Watches a property for changes. This is an alias for [Accessor.watch()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#watch), provided for completeness.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#watch)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def watch(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def watch(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming truthy. As with module:esri/core/watchUtils#init, the callback is called initially if the property is initially truthy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#when)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def when(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def when(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming `defined`. As with init(), the callback is called if the property is initially defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenDefined)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenDefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenDefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming `defined` once. As with init(), the callback is called if the property is initially `defined`. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming defined. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenDefinedOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenDefinedOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming equal with a given `value`. The `callback` will fire after the given property has a value equal to the provided value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqual)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param value The value to test with the value of the given property.
    * @param callback The function to call when the property is equal to the given value.
    *
    */
  def whenEqual(obj: Accessor, propertyName: String, value: js.Any, callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming equal with a given `value`. The `callback` will fire after the given property is equal to the provided value for the first time. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming false. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqualOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param value The value to test with the value of the given property.
    * @param callback The function to call when the property is equal to the given value.
    *
    */
  def whenEqualOnce(obj: Accessor, propertyName: String, value: js.Any): PromisedWatchHandle = js.native
  def whenEqualOnce(obj: Accessor, propertyName: String, value: js.Any, callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming `false`. As with init(), the callback is called if the property is initially `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenFalse)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenFalse(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenFalse(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming `false` once. As with init(), the callback is called if the property is initially `false`. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming false. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenFalseOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenFalseOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming falsy. As with module:esri/core/watchUtils#init, the callback is called initially if the property is initially falsy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenNot)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenNot(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenNot(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming falsy once. As with init(), the callback is called if the property is initially falsy. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming falsy. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenNotOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenNotOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming truthy once. As with init(), the callback is called if the property is initially truthy. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming truthy. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming `true`. As with init(), the callback is called if the property is initially `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenTrue)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenTrue(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenTrue(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming `true` once. As with init(), the callback is called if the property is initially `true`. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming true. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenTrueOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenTrueOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  /**
    * Watches a property for becoming `undefined`. As with init(), the callback is called if the property is initially `undefined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefined)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenUndefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenUndefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  /**
    * Watches a property for becoming `undefined` once. As with init(), the callback is called if the property is initially `undefined`. The returned watch handle is removed after the first time the callback has been invoked.  The returned handle additionally implements the Promise interface and can be used to create a promise chain to asynchronously handle a property value becoming undefined. The promise result is an object containing a `value`, `oldValue`, `propertyName` and `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefinedOnce)
    *
    * @param obj The object containing the property to watch.
    * @param propertyName The name of the property to watch.
    * @param callback The function to call when the property changes.
    *
    */
  def whenUndefinedOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
}

@JSGlobal("__esri.watchUtils")
@js.native
object watchUtils extends TopLevel[watchUtils]

