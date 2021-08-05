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
    
    var clearCookies: js.Any = js.native
    
    def eventTrack(eventName: String): js.Any = js.native
    def eventTrack(eventName: String, properties: js.Any): js.Any = js.native
    
    def exceptionTrack(error: js.Any, cause: String): js.Any = js.native
    
    def getOptOut(): Boolean = js.native
    
    def incrementProperty(property: String): js.Any = js.native
    def incrementProperty(property: String, value: js.Any): js.Any = js.native
    
    def pageTrack(path: String): js.Any = js.native
    def pageTrack(path: String, location: ILocationService): js.Any = js.native
    
    def setAlias(alias: String): js.Any = js.native
    
    def setOptOut(value: Boolean): Unit = js.native
    
    def setSuperProperties(superProperties: js.Any): js.Any = js.native
    
    def setSuperPropertiesOnce(superProperties: js.Any): js.Any = js.native
    
    def setUserProperties(userProperties: js.Any): js.Any = js.native
    
    def setUserPropertiesOnce(userProperties: js.Any): js.Any = js.native
    
    def setUsername(username: String): js.Any = js.native
    
    var transactionTrack: js.Any = js.native
    
    def userTimings(properties: js.Any): js.Any = js.native
  }
  
  trait IAnalyticsServiceProvider
    extends StObject
       with IServiceProvider {
    
    def developerMode(value: Boolean): Unit
    
    def excludeRoutes(value: js.Array[String]): Unit
    
    def firstPageview(value: Boolean): Unit
    
    def queryKeysBlacklist(keys: js.Array[String]): Unit
    
    def queryKeysWhitelist(keys: js.Array[String]): Unit
    
    def registerClearCookies(callback: js.Any): Unit
    
    def registerEventTrack(callback: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], js.Any]): Unit
    
    def registerIncrementProperty(callback: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], js.Any]): Unit
    
    def registerPageTrack(callback: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], js.Any]): Unit
    
    def registerSetAlias(callback: js.Function1[/* alias */ String, js.Any]): Unit
    
    def registerSetSuperProperties(callback: js.Function1[/* superProperties */ js.Any, js.Any]): Unit
    
    def registerSetSuperPropertiesOnce(callback: js.Function1[/* superProperties */ js.Any, js.Any]): Unit
    
    def registerSetUserProperties(callback: js.Function1[/* userProperties */ js.Any, js.Any]): Unit
    
    def registerSetUserPropertiesOnce(callback: js.Function1[/* userProperties */ js.Any, js.Any]): Unit
    
    def registerSetUsername(callback: js.Function1[/* username */ String, js.Any]): Unit
    
    def registerTransactionTrack(callback: js.Any): Unit
    
    def registerUserTimings(callback: js.Function1[/* properties */ js.Any, js.Any]): Unit
    
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
      $get: js.Any,
      developerMode: Boolean => Unit,
      excludeRoutes: js.Array[String] => Unit,
      firstPageview: Boolean => Unit,
      queryKeysBlacklist: js.Array[String] => Unit,
      queryKeysWhitelist: js.Array[String] => Unit,
      registerClearCookies: js.Any => Unit,
      registerEventTrack: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], js.Any] => Unit,
      registerIncrementProperty: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], js.Any] => Unit,
      registerPageTrack: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], js.Any] => Unit,
      registerSetAlias: js.Function1[/* alias */ String, js.Any] => Unit,
      registerSetSuperProperties: js.Function1[/* superProperties */ js.Any, js.Any] => Unit,
      registerSetSuperPropertiesOnce: js.Function1[/* superProperties */ js.Any, js.Any] => Unit,
      registerSetUserProperties: js.Function1[/* userProperties */ js.Any, js.Any] => Unit,
      registerSetUserPropertiesOnce: js.Function1[/* userProperties */ js.Any, js.Any] => Unit,
      registerSetUsername: js.Function1[/* username */ String, js.Any] => Unit,
      registerTransactionTrack: js.Any => Unit,
      registerUserTimings: js.Function1[/* properties */ js.Any, js.Any] => Unit,
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
    
    extension [Self <: IAnalyticsServiceProvider](x: Self) {
      
      inline def setDeveloperMode(value: Boolean => Unit): Self = StObject.set(x, "developerMode", js.Any.fromFunction1(value))
      
      inline def setExcludeRoutes(value: js.Array[String] => Unit): Self = StObject.set(x, "excludeRoutes", js.Any.fromFunction1(value))
      
      inline def setFirstPageview(value: Boolean => Unit): Self = StObject.set(x, "firstPageview", js.Any.fromFunction1(value))
      
      inline def setQueryKeysBlacklist(value: js.Array[String] => Unit): Self = StObject.set(x, "queryKeysBlacklist", js.Any.fromFunction1(value))
      
      inline def setQueryKeysWhitelist(value: js.Array[String] => Unit): Self = StObject.set(x, "queryKeysWhitelist", js.Any.fromFunction1(value))
      
      inline def setRegisterClearCookies(value: js.Any => Unit): Self = StObject.set(x, "registerClearCookies", js.Any.fromFunction1(value))
      
      inline def setRegisterEventTrack(value: js.Function2[/* eventName */ String, /* properties */ js.UndefOr[js.Any], js.Any] => Unit): Self = StObject.set(x, "registerEventTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterIncrementProperty(value: js.Function2[/* property */ String, /* value */ js.UndefOr[js.Any], js.Any] => Unit): Self = StObject.set(x, "registerIncrementProperty", js.Any.fromFunction1(value))
      
      inline def setRegisterPageTrack(
        value: js.Function2[/* path */ String, /* location */ js.UndefOr[ILocationService], js.Any] => Unit
      ): Self = StObject.set(x, "registerPageTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterSetAlias(value: js.Function1[/* alias */ String, js.Any] => Unit): Self = StObject.set(x, "registerSetAlias", js.Any.fromFunction1(value))
      
      inline def setRegisterSetSuperProperties(value: js.Function1[/* superProperties */ js.Any, js.Any] => Unit): Self = StObject.set(x, "registerSetSuperProperties", js.Any.fromFunction1(value))
      
      inline def setRegisterSetSuperPropertiesOnce(value: js.Function1[/* superProperties */ js.Any, js.Any] => Unit): Self = StObject.set(x, "registerSetSuperPropertiesOnce", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUserProperties(value: js.Function1[/* userProperties */ js.Any, js.Any] => Unit): Self = StObject.set(x, "registerSetUserProperties", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUserPropertiesOnce(value: js.Function1[/* userProperties */ js.Any, js.Any] => Unit): Self = StObject.set(x, "registerSetUserPropertiesOnce", js.Any.fromFunction1(value))
      
      inline def setRegisterSetUsername(value: js.Function1[/* username */ String, js.Any] => Unit): Self = StObject.set(x, "registerSetUsername", js.Any.fromFunction1(value))
      
      inline def setRegisterTransactionTrack(value: js.Any => Unit): Self = StObject.set(x, "registerTransactionTrack", js.Any.fromFunction1(value))
      
      inline def setRegisterUserTimings(value: js.Function1[/* properties */ js.Any, js.Any] => Unit): Self = StObject.set(x, "registerUserTimings", js.Any.fromFunction1(value))
      
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
    def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any, registerFn: js.Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any, registerFn: js.Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any, registerFn: Unit, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: js.Any): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: js.Any, onTimeout: Boolean): Unit = js.native
    def waitForVendorApi(objectName: String, delay: Double, containsField: Unit, registerFn: Unit, onTimeout: Boolean): Unit = js.native
  }
  
  type _To = IAngularticsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IAngularticsStatic = ^
}
