package typings.amplifier

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("amplifier", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait AjaxSettings
    extends typings.jquery.JQuery.AjaxSettings[js.Any] {
    
    var dataMap: js.UndefOr[js.Object | (js.Function1[/* data */ js.Any, js.Object])] = js.native
    
    var decoder: js.UndefOr[js.Any] = js.native
  }
  object AjaxSettings {
    
    @scala.inline
    def apply(): AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSettings]
    }
    
    @scala.inline
    implicit class AjaxSettingsMutableBuilder[Self <: AjaxSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataMap(value: js.Object | (js.Function1[/* data */ js.Any, js.Object])): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMapFunction1(value: /* data */ js.Any => js.Object): Self = StObject.set(x, "dataMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataMapUndefined: Self = StObject.set(x, "dataMap", js.undefined)
      
      @scala.inline
      def setDecoder(value: js.Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
    }
  }
  
  type Decoder = js.Function5[
    /* data */ js.UndefOr[js.Any], 
    /* status */ js.UndefOr[String], 
    /* xhr */ js.UndefOr[JQueryXHR], 
    /* success */ js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]], 
    /* error */ js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]], 
    Unit
  ]
  
  @js.native
  trait Decoders extends /* decoderName */ StringDictionary[Decoder] {
    
    def jsSend(): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.UndefOr[scala.Nothing], status: js.UndefOr[scala.Nothing], xhr: JQueryXHR): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.UndefOr[scala.Nothing], status: String): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.UndefOr[scala.Nothing], status: String, xhr: JQueryXHR): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: JQueryXHR,
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.UndefOr[scala.Nothing],
      status: String,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.Any): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.Any, status: js.UndefOr[scala.Nothing], xhr: JQueryXHR): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: js.UndefOr[scala.Nothing],
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.Any, status: String): Unit = js.native
    def jsSend(
      data: js.Any,
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(
      data: js.Any,
      status: String,
      xhr: js.UndefOr[scala.Nothing],
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.Any, status: String, xhr: JQueryXHR): Unit = js.native
    def jsSend(
      data: js.Any,
      status: String,
      xhr: JQueryXHR,
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    def jsSend(data: js.Any, status: String, xhr: JQueryXHR, success: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def jsSend(
      data: js.Any,
      status: String,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ js.Any, Unit],
      error: js.Function1[/* repeated */ js.Any, Unit]
    ): Unit = js.native
    @JSName("jsSend")
    var jsSend_Original: Decoder = js.native
  }
  
  @js.native
  trait Request extends StObject {
    
    /***
      * Request a resource.
      * resourceId: Identifier string for the resource.
      * data: A set of key/value pairs of data to be sent to the resource.
      * callback: A function to invoke if the resource is retrieved successfully.
      */
    def apply(resourceId: String): Unit = js.native
    def apply(
      resourceId: String,
      hash: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* repeated */ js.Any, _]
    ): Unit = js.native
    def apply(resourceId: String, hash: js.Any): Unit = js.native
    def apply(resourceId: String, hash: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    /***
      * Request a resource.
      * settings: A set of key/value pairs of settings for the request.
      *   resourceId: Identifier string for the resource.
      *   data (optional): Data associated with the request.
      *   success (optional): Function to invoke on success.
      *   error (optional): Function to invoke on error.
      */
    def apply(settings: RequestSettings): js.Any = js.native
    
    var cache: js.Any = js.native
    
    var decoders: Decoders = js.native
    
    /***
      * Define a resource.
      * resourceId: Identifier string for the resource.
      * requestType: The type of data retrieval method from the server. See the request types sections for more information.
      * settings: A set of key/value pairs that relate to the server communication technology. The following settings are available:
      *   Any settings found in jQuery.ajax().
      *   cache: See the cache section for more details.
      *   decoder: See the decoder section for more details.
      */
    def define(resourceId: String, requestType: String): Unit = js.native
    def define(resourceId: String, requestType: String, settings: AjaxSettings): Unit = js.native
    /***
      * Define a custom request.
      * resourceId: Identifier string for the resource.
      * resource: Function to handle requests. Receives a hash with the following properties:
      *   resourceId: Identifier string for the resource.
      *   data: Data provided by the user.
      *   success: Callback to invoke on success.
      *   error: Callback to invoke on error.
      */
    def define(resourceId: String, resource: js.Function1[/* settings */ RequestSettings, Unit]): Unit = js.native
  }
  
  @js.native
  trait RequestSettings extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var resourceId: String = js.native
    
    var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  }
  object RequestSettings {
    
    @scala.inline
    def apply(resourceId: String): RequestSettings = {
      val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestSettings]
    }
    
    @scala.inline
    implicit class RequestSettingsMutableBuilder[Self <: RequestSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    /***
      * Publish a message.
      * topic: The name of the message to publish.
      * Any additional parameters will be passed to the subscriptions.
      * amplifier.publish returns a boolean indicating whether any subscriptions returned false.
      * The return value is true if none of the subscriptions returned false, and false otherwise.
      * Note that only one subscription can return false because doing so will prevent additional subscriptions from being invoked.
      */
    def publish(topic: String, args: js.Any*): Boolean = js.native
    
    /***
      * Request a resource.
      * resourceId: Identifier string for the resource.
      * data: A set of key/value pairs of data to be sent to the resource.
      * callback: A function to invoke if the resource is retrieved successfully.
      */
    def request(resourceId: String): Unit = js.native
    def request(
      resourceId: String,
      hash: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* repeated */ js.Any, _]
    ): Unit = js.native
    def request(resourceId: String, hash: js.Any): Unit = js.native
    def request(resourceId: String, hash: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    /***
      * Request a resource.
      * settings: A set of key/value pairs of settings for the request.
      *   resourceId: Identifier string for the resource.
      *   data (optional): Data associated with the request.
      *   success (optional): Function to invoke on success.
      *   error (optional): Function to invoke on error.
      */
    def request(settings: RequestSettings): js.Any = js.native
    @JSName("request")
    var request_Original: Request = js.native
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    def store(): js.Any = js.native
    def store(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    def store(key: String, value: js.Any): Unit = js.native
    def store(key: String, value: js.Any, options: js.Any): Unit = js.native
    @JSName("store")
    var store_Original: Store = js.native
    
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def subscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * context: What this will be when the callback is invoked.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def subscribe(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def subscribe(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
    @JSName("subscribe")
    var subscribe_Original: Subscribe = js.native
    
    /***
      * Remove a subscription.
      * topic: The topic being unsubscribed from.
      * callback: The callback that was originally subscribed.
      */
    def unsubscribe(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  }
  
  @js.native
  trait StorageTypeStore extends StObject {
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    def apply(): js.Any = js.native
    def apply(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    def apply(key: String, value: js.Any): Unit = js.native
    def apply(key: String, value: js.Any, options: js.Any): Unit = js.native
  }
  
  @js.native
  trait Store extends StorageTypeStore {
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    /***
      * Firefox 2+
      */
    def globalStorage(): js.Any = js.native
    def globalStorage(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * Firefox 2+
      */
    def globalStorage(key: String, value: js.Any): Unit = js.native
    def globalStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
    /***
      * Firefox 2+
      */
    @JSName("globalStorage")
    var globalStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def localStorage(): js.Any = js.native
    def localStorage(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def localStorage(key: String, value: js.Any): Unit = js.native
    def localStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    @JSName("localStorage")
    var localStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    def memory(): js.Any = js.native
    def memory(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    def memory(key: String, value: js.Any): Unit = js.native
    def memory(key: String, value: js.Any, options: js.Any): Unit = js.native
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    @JSName("memory")
    var memory_Original: StorageTypeStore = js.native
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def sessionStorage(): js.Any = js.native
    def sessionStorage(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def sessionStorage(key: String, value: js.Any): Unit = js.native
    def sessionStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    @JSName("sessionStorage")
    var sessionStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a stored value based on the key of a hash of all stored values.
      */
    /***
      * IE 5 - 7
      */
    def userData(): js.Any = js.native
    def userData(key: String): js.Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 5 - 7
      */
    def userData(key: String, value: js.Any): Unit = js.native
    def userData(key: String, value: js.Any, options: js.Any): Unit = js.native
    /***
      * IE 5 - 7
      */
    @JSName("userData")
    var userData_Original: StorageTypeStore = js.native
  }
  
  @js.native
  trait Subscribe extends StObject {
    
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def apply(topic: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def apply(topic: String, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * context: What this will be when the callback is invoked.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def apply(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def apply(topic: String, context: js.Any, callback: js.Function1[/* repeated */ js.Any, _], priority: Double): Unit = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
