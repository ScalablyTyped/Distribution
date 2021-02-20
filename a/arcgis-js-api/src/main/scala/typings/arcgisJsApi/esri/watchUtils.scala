package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait watchUtils extends StObject {
  
  /**
    * Watches a property for changes and calls the callback with the initial value of the property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#init)
    */
  def init(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def init(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for changes and automatically attaches and detaches an event handler for a given event to the property value as needed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#on)
    */
  def on(obj: Accessor, propertyName: String, eventName: String, eventHandler: js.Function): WatchHandle = js.native
  def on(
    obj: Accessor,
    propertyName: String,
    eventName: String,
    eventHandler: js.Function,
    attachedHandler: js.UndefOr[scala.Nothing],
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
    attachedHandler: js.UndefOr[scala.Nothing],
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#once)
    */
  def once(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def once(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
    * Watches a property for changes.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#watch)
    */
  def watch(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def watch(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming truthy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#when)
    */
  def when(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def when(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming `defined`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenDefined)
    */
  def whenDefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenDefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming `defined` once.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqual)
    */
  def whenEqual(obj: Accessor, propertyName: String, value: js.Any, callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming equal with a given `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenEqualOnce)
    */
  def whenEqualOnce(obj: Accessor, propertyName: String, value: js.Any): PromisedWatchHandle = js.native
  def whenEqualOnce(obj: Accessor, propertyName: String, value: js.Any, callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
    * Watches a property for becoming `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenFalse)
    */
  def whenFalse(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenFalse(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming `false` once.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenNot)
    */
  def whenNot(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenNot(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming falsy once.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenOnce)
    */
  def whenOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
  
  /**
    * Watches a property for becoming `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenTrue)
    */
  def whenTrue(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenTrue(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming `true` once.
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefined)
    */
  def whenUndefined(obj: Accessor, propertyName: String, callback: WatchCallback): WatchHandle = js.native
  def whenUndefined(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): WatchHandle = js.native
  
  /**
    * Watches a property for becoming `undefined` once.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#whenUndefinedOnce)
    */
  def whenUndefinedOnce(obj: Accessor, propertyName: String): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: String, callback: WatchCallback): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String]): PromisedWatchHandle = js.native
  def whenUndefinedOnce(obj: Accessor, propertyName: js.Array[String], callback: WatchCallback): PromisedWatchHandle = js.native
}
