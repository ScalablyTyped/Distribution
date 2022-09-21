package typings.autobahn.mod

import typings.when.When.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConnectionOptions extends StObject {
  
  var authextra: js.UndefOr[js.Object] = js.undefined
  
  var authid: js.UndefOr[String] = js.undefined
  
  var authmethods: js.UndefOr[js.Array[String]] = js.undefined
  
  // Below options only work when the transport is websocket and the underlying platform is NodeJS/Electron.
  var autoping_interval: js.UndefOr[Double] = js.undefined
  
  var autoping_size: js.UndefOr[Double] = js.undefined
  
  var autoping_timeout: js.UndefOr[Double] = js.undefined
  
  var initial_retry_delay: js.UndefOr[Double] = js.undefined
  
  var max_retries: js.UndefOr[Double] = js.undefined
  
  var max_retry_delay: js.UndefOr[Double] = js.undefined
  
  var on_internal_error: js.UndefOr[OnInternalErrorHandler] = js.undefined
  
  var on_user_error: js.UndefOr[OnUserErrorHandler] = js.undefined
  
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.undefined
  
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  
  var realm: String
  
  var retry_delay_growth: js.UndefOr[Double] = js.undefined
  
  var retry_delay_jitter: js.UndefOr[Double] = js.undefined
  
  var retry_if_unreachable: js.UndefOr[Boolean] = js.undefined
  
  var tlsConfiguration: js.UndefOr[ITlsConfiguration] = js.undefined
  
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.undefined
  
  var use_es6_promises: js.UndefOr[Boolean] = js.undefined
}
object IConnectionOptions {
  
  inline def apply(realm: String): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionOptions]
  }
  
  extension [Self <: IConnectionOptions](x: Self) {
    
    inline def setAuthextra(value: js.Object): Self = StObject.set(x, "authextra", value.asInstanceOf[js.Any])
    
    inline def setAuthextraUndefined: Self = StObject.set(x, "authextra", js.undefined)
    
    inline def setAuthid(value: String): Self = StObject.set(x, "authid", value.asInstanceOf[js.Any])
    
    inline def setAuthidUndefined: Self = StObject.set(x, "authid", js.undefined)
    
    inline def setAuthmethods(value: js.Array[String]): Self = StObject.set(x, "authmethods", value.asInstanceOf[js.Any])
    
    inline def setAuthmethodsUndefined: Self = StObject.set(x, "authmethods", js.undefined)
    
    inline def setAuthmethodsVarargs(value: String*): Self = StObject.set(x, "authmethods", js.Array(value*))
    
    inline def setAutoping_interval(value: Double): Self = StObject.set(x, "autoping_interval", value.asInstanceOf[js.Any])
    
    inline def setAutoping_intervalUndefined: Self = StObject.set(x, "autoping_interval", js.undefined)
    
    inline def setAutoping_size(value: Double): Self = StObject.set(x, "autoping_size", value.asInstanceOf[js.Any])
    
    inline def setAutoping_sizeUndefined: Self = StObject.set(x, "autoping_size", js.undefined)
    
    inline def setAutoping_timeout(value: Double): Self = StObject.set(x, "autoping_timeout", value.asInstanceOf[js.Any])
    
    inline def setAutoping_timeoutUndefined: Self = StObject.set(x, "autoping_timeout", js.undefined)
    
    inline def setInitial_retry_delay(value: Double): Self = StObject.set(x, "initial_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setInitial_retry_delayUndefined: Self = StObject.set(x, "initial_retry_delay", js.undefined)
    
    inline def setMax_retries(value: Double): Self = StObject.set(x, "max_retries", value.asInstanceOf[js.Any])
    
    inline def setMax_retriesUndefined: Self = StObject.set(x, "max_retries", js.undefined)
    
    inline def setMax_retry_delay(value: Double): Self = StObject.set(x, "max_retry_delay", value.asInstanceOf[js.Any])
    
    inline def setMax_retry_delayUndefined: Self = StObject.set(x, "max_retry_delay", js.undefined)
    
    inline def setOn_internal_error(value: (/* error */ js.Object | Error, /* error_message */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "on_internal_error", js.Any.fromFunction2(value))
    
    inline def setOn_internal_errorUndefined: Self = StObject.set(x, "on_internal_error", js.undefined)
    
    inline def setOn_user_error(value: (/* error */ js.Object | Error, /* error_message */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "on_user_error", js.Any.fromFunction2(value))
    
    inline def setOn_user_errorUndefined: Self = StObject.set(x, "on_user_error", js.undefined)
    
    inline def setOnchallenge(
      value: (/* session */ Session, /* method */ String, /* extra */ Any) => String | (js.Tuple2[String, Any]) | (Promise[String | (js.Tuple2[String, Any])])
    ): Self = StObject.set(x, "onchallenge", js.Any.fromFunction3(value))
    
    inline def setOnchallengeUndefined: Self = StObject.set(x, "onchallenge", js.undefined)
    
    inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRetry_delay_growth(value: Double): Self = StObject.set(x, "retry_delay_growth", value.asInstanceOf[js.Any])
    
    inline def setRetry_delay_growthUndefined: Self = StObject.set(x, "retry_delay_growth", js.undefined)
    
    inline def setRetry_delay_jitter(value: Double): Self = StObject.set(x, "retry_delay_jitter", value.asInstanceOf[js.Any])
    
    inline def setRetry_delay_jitterUndefined: Self = StObject.set(x, "retry_delay_jitter", js.undefined)
    
    inline def setRetry_if_unreachable(value: Boolean): Self = StObject.set(x, "retry_if_unreachable", value.asInstanceOf[js.Any])
    
    inline def setRetry_if_unreachableUndefined: Self = StObject.set(x, "retry_if_unreachable", js.undefined)
    
    inline def setTlsConfiguration(value: ITlsConfiguration): Self = StObject.set(x, "tlsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTlsConfigurationUndefined: Self = StObject.set(x, "tlsConfiguration", js.undefined)
    
    inline def setTransports(value: js.Array[ITransportDefinition]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: ITransportDefinition*): Self = StObject.set(x, "transports", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUse_deferred(value: () => Promise[Any]): Self = StObject.set(x, "use_deferred", js.Any.fromFunction0(value))
    
    inline def setUse_deferredUndefined: Self = StObject.set(x, "use_deferred", js.undefined)
    
    inline def setUse_es6_promises(value: Boolean): Self = StObject.set(x, "use_es6_promises", value.asInstanceOf[js.Any])
    
    inline def setUse_es6_promisesUndefined: Self = StObject.set(x, "use_es6_promises", js.undefined)
  }
}
