package typings.apigeeAccess

import typings.apigeeAccess.apigeeAccessStrings.apigee
import typings.apigeeAccess.apigeeAccessStrings.application
import typings.apigeeAccess.apigeeAccessStrings.day
import typings.apigeeAccess.apigeeAccessStrings.environment
import typings.apigeeAccess.apigeeAccessStrings.exclusive
import typings.apigeeAccess.apigeeAccessStrings.global
import typings.apigeeAccess.apigeeAccessStrings.hour
import typings.apigeeAccess.apigeeAccessStrings.minute
import typings.apigeeAccess.apigeeAccessStrings.month
import typings.apigeeAccess.apigeeAccessStrings.organization
import typings.apigeeAccess.apigeeAccessStrings.standalone
import typings.apigeeAccess.apigeeAccessStrings.week
import typings.apigeeAccess.mod.ApigeeAccess.CacheOptions
import typings.apigeeAccess.mod.ApigeeAccess.QuotaService
import typings.apigeeAccess.mod.ApigeeAccess.SecureVault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("apigee-access", "default.deleteVariable")
    @js.native
    def deleteVariable(request: js.Any, name: String): Unit = js.native
    
    @JSImport("apigee-access", "default.getCache")
    @js.native
    def getCache(name: String): js.Any = js.native
    @JSImport("apigee-access", "default.getCache")
    @js.native
    def getCache(name: String, options: CacheOptions): js.Any = js.native
    
    @JSImport("apigee-access", "default.getMode")
    @js.native
    def getMode(): apigee | standalone = js.native
    
    @JSImport("apigee-access", "default.getQuota")
    @js.native
    def getQuota(): QuotaService = js.native
    @JSImport("apigee-access", "default.getQuota")
    @js.native
    def getQuota(options: js.Any): QuotaService = js.native
    
    @JSImport("apigee-access", "default.getVariable")
    @js.native
    def getVariable(request: js.Any, name: String): String | Double | Boolean = js.native
    
    @JSImport("apigee-access", "default.getVault")
    @js.native
    def getVault(name: String): SecureVault = js.native
    @JSImport("apigee-access", "default.getVault")
    @js.native
    def getVault_environment(name: String, scope: environment): SecureVault = js.native
    @JSImport("apigee-access", "default.getVault")
    @js.native
    def getVault_organization(name: String, scope: organization): SecureVault = js.native
    
    @JSImport("apigee-access", "default.setIntVariable")
    @js.native
    def setIntVariable(request: js.Any, name: String, value: String): Unit = js.native
    @JSImport("apigee-access", "default.setIntVariable")
    @js.native
    def setIntVariable(request: js.Any, name: String, value: Double): Unit = js.native
    
    @JSImport("apigee-access", "default.setVariable")
    @js.native
    def setVariable(request: js.Any, name: String, value: String): Unit = js.native
    @JSImport("apigee-access", "default.setVariable")
    @js.native
    def setVariable(request: js.Any, name: String, value: Boolean): Unit = js.native
    @JSImport("apigee-access", "default.setVariable")
    @js.native
    def setVariable(request: js.Any, name: String, value: Double): Unit = js.native
  }
  
  object ApigeeAccess {
    
    @js.native
    trait Cache extends StObject {
      
      def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
      
      def put(key: String, data: js.Any): Unit = js.native
      def put(
        key: String,
        data: js.Any,
        ttl: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* err */ js.Any, Unit]
      ): Unit = js.native
      def put(key: String, data: js.Any, ttl: Double): Unit = js.native
      def put(key: String, data: js.Any, ttl: Double, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
      
      def remove(key: String): Unit = js.native
      def remove(key: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    }
    
    @js.native
    trait CacheOptions extends StObject {
      
      var defaultTtl: js.UndefOr[Double] = js.native
      
      var resource: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[global | application | exclusive] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
    }
    object CacheOptions {
      
      @scala.inline
      def apply(): CacheOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CacheOptions]
      }
      
      @scala.inline
      implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultTtl(value: Double): Self = StObject.set(x, "defaultTtl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultTtlUndefined: Self = StObject.set(x, "defaultTtl", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        @scala.inline
        def setScope(value: global | application | exclusive): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait QuotaService extends StObject {
      
      @JSName("apply")
      def apply(): Unit = js.native
      @JSName("apply")
      def apply(
        options: js.UndefOr[scala.Nothing],
        callback: js.Function2[/* err */ js.Any, /* data */ QuotaServiceApplyCallbackData, Unit]
      ): Unit = js.native
      @JSName("apply")
      def apply(options: QuotaServiceApplyOptions): Unit = js.native
      @JSName("apply")
      def apply(
        options: QuotaServiceApplyOptions,
        callback: js.Function2[/* err */ js.Any, /* data */ QuotaServiceApplyCallbackData, Unit]
      ): Unit = js.native
    }
    
    @js.native
    trait QuotaServiceApplyCallbackData extends StObject {
      
      var allowed: Double = js.native
      
      var expiryTime: Double = js.native
      
      var isAllowed: Boolean = js.native
      
      var timestamp: Double = js.native
      
      var used: Double = js.native
    }
    object QuotaServiceApplyCallbackData {
      
      @scala.inline
      def apply(allowed: Double, expiryTime: Double, isAllowed: Boolean, timestamp: Double, used: Double): QuotaServiceApplyCallbackData = {
        val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], expiryTime = expiryTime.asInstanceOf[js.Any], isAllowed = isAllowed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
        __obj.asInstanceOf[QuotaServiceApplyCallbackData]
      }
      
      @scala.inline
      implicit class QuotaServiceApplyCallbackDataMutableBuilder[Self <: QuotaServiceApplyCallbackData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowed(value: Double): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiryTime(value: Double): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsAllowed(value: Boolean): Self = StObject.set(x, "isAllowed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait QuotaServiceApplyOptions extends StObject {
      
      var allow: Double = js.native
      
      var identifier: String = js.native
      
      var interval: js.UndefOr[Double] = js.native
      
      var timeUnit: minute | hour | day | week | month = js.native
      
      var weight: js.UndefOr[Double] = js.native
    }
    object QuotaServiceApplyOptions {
      
      @scala.inline
      def apply(allow: Double, identifier: String, timeUnit: minute | hour | day | week | month): QuotaServiceApplyOptions = {
        val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
        __obj.asInstanceOf[QuotaServiceApplyOptions]
      }
      
      @scala.inline
      implicit class QuotaServiceApplyOptionsMutableBuilder[Self <: QuotaServiceApplyOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllow(value: Double): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        @scala.inline
        def setTimeUnit(value: minute | hour | day | week | month): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait SecureVault extends StObject {
      
      def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
      
      def getKeys(callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
    }
    object SecureVault {
      
      @scala.inline
      def apply(
        get: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Unit,
        getKeys: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Unit
      ): SecureVault = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), getKeys = js.Any.fromFunction1(getKeys))
        __obj.asInstanceOf[SecureVault]
      }
      
      @scala.inline
      implicit class SecureVaultMutableBuilder[Self <: SecureVault] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: (String, js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetKeys(value: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "getKeys", js.Any.fromFunction1(value))
      }
    }
  }
}
