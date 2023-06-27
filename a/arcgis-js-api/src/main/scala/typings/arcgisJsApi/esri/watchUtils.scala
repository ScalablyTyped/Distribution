package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Various utilities and convenience functions for watching [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html) properties.
	 *
	 * @deprecated since version 4.24. Use {@link module:esri/core/reactiveUtils} instead.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html)
	 */
@js.native
trait watchUtils extends StObject {
  
  /**
  		 * Watches a property for changes and calls the callback with the initial value of the property.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#watch reactiveUtils.watch()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#init)
  		 */
  def init(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def init(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for changes and automatically attaches and detaches an event handler for a given event to the property value as needed.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#on reactiveUtils.on()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#on)
  		 */
  def on(obj: Accessor, propertyName: String, eventName: String, eventHandler: js.Function): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: String,
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: scala.Unit,
    detachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
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
    attachedHandler: scala.Unit,
    detachedHandler: EventAttachedCallback
  ): WatchHandle = js.native
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
  		 * Watches a property for changes once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#once reactiveUtils.once()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#once)
  		 */
  def once(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for changes.
  		 *
  		 * @deprecated Since 4.24.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#pausable)
  		 */
  def pausable(obj: Accessor, propertyName: String): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: String, callback: WatchCallback): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: js.Array[String]): PausableWatchHandle = js.native
  def pausable(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PausableWatchHandle = js.native
  
  /**
  		 * Watches a property for changes.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#watch reactiveUtils.watch()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#watch)
  		 */
  def watch(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def watch(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming truthy.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#when)
  		 */
  def when(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def when(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `defined`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenDefined)
  		 */
  def whenDefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenDefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `defined` once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenDefinedOnce)
  		 */
  def whenDefinedOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenDefinedOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming equal with a given `value`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqual)
  		 */
  def whenEqual(obj: Accessor, propertyName: String, value: Any, callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming equal with a given `value`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqualOnce)
  		 */
  def whenEqualOnce(obj: Accessor, propertyName: String, value: Any): PromisedWatchHandle = js.native
  def whenEqualOnce(obj: Accessor, propertyName: String, value: Any, callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `false`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenFalse)
  		 */
  def whenFalse(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenFalse(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `false` once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenFalseOnce)
  		 */
  def whenFalseOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenFalseOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming falsy.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenNot)
  		 */
  def whenNot(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenNot(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming falsy once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenNotOnce)
  		 */
  def whenNotOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenNotOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming truthy once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenOnce)
  		 */
  def whenOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `true`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenTrue)
  		 */
  def whenTrue(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenTrue(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `true` once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenTrueOnce)
  		 */
  def whenTrueOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenTrueOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `undefined`.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#when reactiveUtils.when()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefined)
  		 */
  def whenUndefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenUndefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
  		 * Watches a property for becoming `undefined` once.
  		 *
  		 * @deprecated since 4.24. Use {@link module:esri/core/reactiveUtils#whenOnce reactiveUtils.whenOnce()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefinedOnce)
  		 */
  def whenUndefinedOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
}
