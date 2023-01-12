package typings.angularDevkitCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsApiMod {
  
  @js.native
  trait Analytics extends StObject {
    
    def event(category: String, action: String): Unit = js.native
    def event(category: String, action: String, options: EventOptions): Unit = js.native
    
    def flush(): js.Promise[Unit] = js.native
    
    def pageview(path: String): Unit = js.native
    def pageview(path: String, options: PageviewOptions): Unit = js.native
    
    def screenview(screenName: String, appName: String): Unit = js.native
    def screenview(screenName: String, appName: String, options: ScreenviewOptions): Unit = js.native
    
    def timing(category: String, variable: String, time: String): Unit = js.native
    def timing(category: String, variable: String, time: String, options: TimingOptions): Unit = js.native
    def timing(category: String, variable: String, time: Double): Unit = js.native
    def timing(category: String, variable: String, time: Double, options: TimingOptions): Unit = js.native
  }
  
  trait CustomDimensionsAndMetricsOptions extends StObject {
    
    var dimensions: js.UndefOr[js.Array[Boolean | Double | String]] = js.undefined
    
    var metrics: js.UndefOr[js.Array[Boolean | Double | String]] = js.undefined
  }
  object CustomDimensionsAndMetricsOptions {
    
    inline def apply(): CustomDimensionsAndMetricsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomDimensionsAndMetricsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomDimensionsAndMetricsOptions] (val x: Self) extends AnyVal {
      
      inline def setDimensions(value: js.Array[Boolean | Double | String]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      inline def setDimensionsVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "dimensions", js.Array(value*))
      
      inline def setMetrics(value: js.Array[Boolean | Double | String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setMetricsVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "metrics", js.Array(value*))
    }
  }
  
  trait EventOptions
    extends StObject
       with CustomDimensionsAndMetricsOptions {
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait PageviewOptions
    extends StObject
       with CustomDimensionsAndMetricsOptions {
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PageviewOptions {
    
    inline def apply(): PageviewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageviewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageviewOptions] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ScreenviewOptions
    extends StObject
       with CustomDimensionsAndMetricsOptions {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var appInstallerId: js.UndefOr[String] = js.undefined
    
    var appVersion: js.UndefOr[String] = js.undefined
  }
  object ScreenviewOptions {
    
    inline def apply(): ScreenviewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenviewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScreenviewOptions] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setAppInstallerId(value: String): Self = StObject.set(x, "appInstallerId", value.asInstanceOf[js.Any])
      
      inline def setAppInstallerIdUndefined: Self = StObject.set(x, "appInstallerId", js.undefined)
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    }
  }
  
  trait TimingOptions
    extends StObject
       with CustomDimensionsAndMetricsOptions {
    
    var label: js.UndefOr[String] = js.undefined
  }
  object TimingOptions {
    
    inline def apply(): TimingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimingOptions] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
