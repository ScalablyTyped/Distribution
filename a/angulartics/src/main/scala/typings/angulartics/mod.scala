package typings.angulartics

import org.scalablytyped.runtime.Shortcut
import typings.angular.mod.ILocationService
import typings.angular.mod.IServiceProvider
import typings.angulartics.anon.BufferFlushDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angulartics", JSImport.Namespace)
  @js.native
  val ^ : IAngularticsStatic = js.native
  
  @js.native
  trait IAnalyticsService extends StObject {
    
    var clearCookies: Any = js.native
    
    def eventTrack(eventName: String): Any = js.native
    def eventTrack(eventName: String, properties: Any): Any = js.native
    
    def exceptionTrack(error: Any, cause: String): Any = js.native
    
    def getOptOut(): Boolean = js.native
    
    def incrementProperty(property: String): Any = js.native
    def incrementProperty(property: String, value: Any): Any = js.native
    
    def pageTrack(path: String): Any = js.native
    def pageTrack(path: String, location: ILocationService): Any = js.native
    
    def setAlias(alias: String): Any = js.native
    
    def setOptOut(value: Boolean): Unit = js.native
    
    def setSuperProperties(superProperties: Any): Any = js.native
    
    def setSuperPropertiesOnce(superProperties: Any): Any = js.native
    
    def setUserProperties(userProperties: Any): Any = js.native
    
    def setUserPropertiesOnce(userProperties: Any): Any = js.native
    
    def setUsername(username: String): Any = js.native
    
    var transactionTrack: Any = js.native
    
    def userTimings(properties: Any): Any = js.native
  }
  
  trait IAnalyticsServiceProvider
    extends StObject
       with IServiceProvider {
    
    def developerMode(value: Boolean): Unit
    
    def excludeRoutes(value: js.Array[String]): Unit
    
    def firstPageview(value: Boolean): Unit
    
    def queryKeysBlacklist(keys: js.Array[String]): Unit
    
    def queryKeysWhitelist(keys: js.Array[String]): Unit
    
    def registerClearCookies(callback: Any): Unit
    
    def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any]): Unit
    
    def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any]): Unit
    
    def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any]): Unit
    
    def registerSetAlias(callback: js.Function1[/* alias */ String, Any]): Unit
    
    def registerSetSuperProperties(callback: js.Function1[/* superProperties */ Any, Any]): Unit
    
    def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ Any, Any]): Unit
    
    def registerSetUserProperties(callback: js.Function1[/* userProperties */ Any, Any]): Unit
    
    def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ Any, Any]): Unit
    
    def registerSetUsername(callback: js.Function1[/* username */ String, Any]): Unit
    
    def registerTransactionTrack(callback: Any): Unit
    
    def registerUserTimings(callback: js.Function1[/* properties */ Any, Any]): Unit
    
    var settings: BufferFlushDelay
    
    def trackExceptions(value: Boolean): Unit
    
    def trackRoutes(value: Boolean): Unit
    
    def trackStates(value: Boolean): Unit
    
    def virtualPageviews(value: Boolean): Unit
    
    def withAutoBase(value: Boolean): Unit
    
    def withBase(value: Boolean): Unit
  }
  object IAnalyticsServiceProvider {
    
    inline def apply(
      $get: Any,
      developerMode: Boolean => Unit,
      excludeRoutes: js.Array[String] => Unit,
      firstPageview: Boolean => Unit,
      queryKeysBlacklist: js.Array[String] => Unit,
      queryKeysWhitelist: js.Array[String] => Unit,
      registerClearCookies: Any => Unit,
      registerEventTrack: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any] => Unit,
      registerIncrementProperty: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any] => Unit,
      registerPageTrack: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any] => Unit,
      registerSetAlias: js.Function1[/* alias */ String, Any] => Unit,
      registerSetSuperProperties: js.Function1[/* superProperties */ Any, Any] => Unit,
      registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ Any, Any] => Unit,
      registerSetUserProperties: js.Function1[/* userProperties */ Any, Any] => Unit,
      registerSetUserPropertiesOnce: js.Function1[/* userProperties */ Any, Any] => Unit,
      registerSetUsername: js.Function1[/* username */ String, Any] => Unit,
      registerTransactionTrack: Any => Unit,
      registerUserTimings: js.Function1[/* properties */ Any, Any] => Unit,
      settings: BufferFlushDelay,
      trackExceptions: Boolean => Unit,
      trackRoutes: Boolean => Unit,
      trackStates: Boolean => Unit,
      virtualPageviews: Boolean => Unit,
      withAutoBase: Boolean => Unit,
      withBase: Boolean => Unit
    ): IAnalyticsServiceProvider = {
      val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], developerMode = js.Any.fromFunction1(developerMode), excludeRoutes = js.Any.fromFunction1(excludeRoutes), firstPageview = js.Any.fromFunction1(firstPageview), queryKeysBlacklist = js.Any.fromFunction1(queryKeysBlacklist), queryKeysWhitelist = js.Any.fromFunction1(queryKeysWhitelist), registerClearCookies = js.Any.fromFunction1(registerClearCookies), registerEventTrack = js.Any.fromFunction1(registerEventTrack), registerIncrementProperty = js.Any.fromFunction1(registerIncrementProperty), registerPageTrack = js.Any.fromFunction1(registerPageTrack), registerSetAlias = js.Any.fromFunction1(registerSetAlias), registerSetSuperProperties = js.Any.fromFunction1(registerSetSuperProperties), registerSetSuperPropertiesOnce = js.Any.fromFunction1(registerSetSuperPropertiesOnce), registerSetUserProperties = js.Any.fromFunction1(registerSetUserProperties), registerSetUserPropertiesOnce = js.Any.fromFunction1(registerSetUserPropertiesOnce), registerSetUsername = js.Any.fromFunction1(registerSetUsername), registerTransactionTrack = js.Any.fromFunction1(registerTransactionTrack), registerUserTimings = js.Any.fromFunction1(registerUserTimings), settings = settings.asInstanceOf[js.Any], trackExceptions = js.Any.fromFunction1(trackExceptions), trackRoutes = js.Any.fromFunction1(trackRoutes), trackStates = js.Any.fromFunction1(trackStates), virtualPageviews = js.Any.fromFunction1(virtualPageviews), withAutoBase = js.Any.fromFunction1(withAutoBase), withBase = js.Any.fromFunction1(withBase))
      __obj.asInstanceOf[IAnalyticsServiceProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAnalyticsServiceProvider] (val x: Self) extends AnyVal {
      
      inline def setDeveloperMode(value: Boolean => Unit): Self = StObject.set(x, "developerMode", js.Any.fromFunction1(value))
      
      inline def setExcludeRoutes(value: js.Array[String] => Unit): Self = StObject.set(x, "excludeRoutes", js.Any.fromFunction1(value))
      
      inline def setFirstPageview(value: Boolean => Unit): Self = StObject.set(x, "firstPageview", js.Any.fromFunction1(value))
      
      inline def setQueryKeysBlacklist(value: js.Array[String] => Unit): Self = StObject.set(x, "queryKeysBlacklist", js.Any.fromFunction1(value))
      
      inline def setQueryKeysWhitelist(value: js.Array[String] => Unit): Self = StObject.set(x, "queryKeysWhitelist", js.Any.fromFunction1(value))
      
      inline def setRegisterClearCookies(value: Any => Unit): Self = StObject.set(x, "registerClearCookies", js.Any.fromFunction1(value))
      
      inline def setRegisterEventTrack(value: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[Any], Any] => Unit): Self = StObject.set(x, "registerEventTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterIncrementProperty(value: js.Function2[/* property */ String, /* value */ js.UndefOr[Any], Any] => Unit): Self = StObject.set(x, "registerIncrementProperty", js.Any.fromFunction1(value))
      
      inline def setRegisterPageTrack(value: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], Any] => Unit): Self = StObject.set(x, "registerPageTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterSetAlias(value: js.Function1[/* alias */ String, Any] => Unit): Self = StObject.set(x, "registerSetAlias", js.Any.fromFunction1(value))
      
      inline def setRegisterSetSuperProperties(value: js.Function1[/* superProperties */ Any, Any] => Unit): Self = StObject.set(x, "registerSetSuperProperties", js.Any.fromFunction1(value))
      
      inline def setRegisterSetSuperPropertiesOnce(value: js.Function1[/* superProperties */ Any, Any] => Unit): Self = StObject.set(x, "registerSetSuperPropertiesOnce", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUserProperties(value: js.Function1[/* userProperties */ Any, Any] => Unit): Self = StObject.set(x, "registerSetUserProperties", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUserPropertiesOnce(value: js.Function1[/* userProperties */ Any, Any] => Unit): Self = StObject.set(x, "registerSetUserPropertiesOnce", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUsername(value: js.Function1[/* username */ String, Any] => Unit): Self = StObject.set(x, "registerSetUsername", js.Any.fromFunction1(value))
      
      inline def setRegisterTransactionTrack(value: Any => Unit): Self = StObject.set(x, "registerTransactionTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterUserTimings(value: js.Function1[/* properties */ Any, Any] => Unit): Self = StObject.set(x, "registerUserTimings", js.Any.fromFunction1(value))
      
      inline def setSettings(value: BufferFlushDelay): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setTrackExceptions(value: Boolean => Unit): Self = StObject.set(x, "trackExceptions", js.Any.fromFunction1(value))
      
      inline def setTrackRoutes(value: Boolean => Unit): Self = StObject.set(x, "trackRoutes", js.Any.fromFunction1(value))
      
      inline def setTrackStates(value: Boolean => Unit): Self = StObject.set(x, "trackStates", js.Any.fromFunction1(value))
      
      inline def setVirtualPageviews(value: Boolean => Unit): Self = StObject.set(x, "virtualPageviews", js.Any.fromFunction1(value))
      
      inline def setWithAutoBase(value: Boolean => Unit): Self = StObject.set(x, "withAutoBase", js.Any.fromFunction1(value))
      
      inline def setWithBase(value: Boolean => Unit): Self = StObject.set(x, "withBase", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IAngularticsStatic extends StObject {
    
    def waitForVendorApi(objectName: String, delay: Double): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Any, registerFn: Unit, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Unit, onTimeout: Boolean): Unit = js.native
  }
  
  type _To = IAngularticsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IAngularticsStatic = ^
}
