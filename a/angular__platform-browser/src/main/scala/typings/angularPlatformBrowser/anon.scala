package typings.angularPlatformBrowser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.angularCommon.mod.CommonModule
import typings.angularCore.mod.ApplicationModule
import typings.angularCore.mod.ApplicationRef
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.angularPlatformBrowserBooleans.`true`
import typings.angularPlatformBrowser.mod.BrowserModule
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var optional: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppId extends StObject {
    
    var appId: String
  }
  object AppId {
    
    inline def apply(appId: String): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CssProps extends StObject {
    
    var cssProps: js.UndefOr[Any] = js.undefined
    
    var domEvents: js.UndefOr[Boolean] = js.undefined
    
    var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ Any, Boolean])] = js.undefined
    
    var inputClass: js.UndefOr[Any] = js.undefined
    
    var inputTarget: js.UndefOr[EventTarget] = js.undefined
    
    var preset: js.UndefOr[js.Array[Any]] = js.undefined
    
    var recognizers: js.UndefOr[js.Array[Any]] = js.undefined
    
    var touchAction: js.UndefOr[String] = js.undefined
  }
  object CssProps {
    
    inline def apply(): CssProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssProps] (val x: Self) extends AnyVal {
      
      inline def setCssProps(value: Any): Self = StObject.set(x, "cssProps", value.asInstanceOf[js.Any])
      
      inline def setCssPropsUndefined: Self = StObject.set(x, "cssProps", js.undefined)
      
      inline def setDomEvents(value: Boolean): Self = StObject.set(x, "domEvents", value.asInstanceOf[js.Any])
      
      inline def setDomEventsUndefined: Self = StObject.set(x, "domEvents", js.undefined)
      
      inline def setEnable(value: Boolean | (js.Function1[/* manager */ Any, Boolean])): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableFunction1(value: /* manager */ Any => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setInputClass(value: Any): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      inline def setInputTarget(value: EventTarget): Self = StObject.set(x, "inputTarget", value.asInstanceOf[js.Any])
      
      inline def setInputTargetUndefined: Self = StObject.set(x, "inputTarget", js.undefined)
      
      inline def setPreset(value: js.Array[Any]): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPresetVarargs(value: Any*): Self = StObject.set(x, "preset", js.Array(value*))
      
      inline def setRecognizers(value: js.Array[Any]): Self = StObject.set(x, "recognizers", value.asInstanceOf[js.Any])
      
      inline def setRecognizersUndefined: Self = StObject.set(x, "recognizers", js.undefined)
      
      inline def setRecognizersVarargs(value: Any*): Self = StObject.set(x, "recognizers", js.Array(value*))
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
    }
  }
  
  trait DomEventName extends StObject {
    
    var domEventName: String
    
    var fullKey: String
  }
  object DomEventName {
    
    inline def apply(domEventName: String, fullKey: String): DomEventName = {
      val __obj = js.Dynamic.literal(domEventName = domEventName.asInstanceOf[js.Any], fullKey = fullKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEventName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomEventName] (val x: Self) extends AnyVal {
      
      inline def setDomEventName(value: String): Self = StObject.set(x, "domEventName", value.asInstanceOf[js.Any])
      
      inline def setFullKey(value: String): Self = StObject.set(x, "fullKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Optional extends StObject {
    
    var optional: `true`
    
    var skipSelf: `true`
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal(optional = true, skipSelf = true)
      __obj.asInstanceOf[Optional]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optional] (val x: Self) extends AnyVal {
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setSkipSelf(value: `true`): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofApplicationModule
    extends StObject
       with Instantiable1[/* appRef */ ApplicationRef, ApplicationModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[ApplicationModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[ApplicationModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[ApplicationModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
  }
  
  @js.native
  trait TypeofBrowserModule
    extends StObject
       with Instantiable0[BrowserModule]
       with Instantiable1[/* providersAlreadyPresent */ Boolean, BrowserModule] {
    
    /**
      * Configures a browser-based app to transition from a server-rendered app, if
      * one is present on the page.
      *
      * @param params An object containing an identifier for the app to transition.
      * The ID must match between the client and server versions of the app.
      * @returns The reconfigured `BrowserModule` to import into the app's root `AppModule`.
      */
    def withServerTransition(params: AppId): ModuleWithProviders[BrowserModule] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[BrowserModule, js.Array[Optional]] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[BrowserModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[
        BrowserModule, 
        scala.Nothing, 
        scala.Nothing, 
        js.Tuple2[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i1.CommonModule */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof i0.ApplicationModule */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait TypeofCommonModule
    extends StObject
       with Instantiable0[CommonModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[CommonModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[CommonModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[CommonModule, scala.Nothing, js.Array[Any], js.Array[Any]] = js.native
  }
}
