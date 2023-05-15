package typings.antDesignCssinjs

import typings.antDesignCssinjs.antDesignCssinjsStrings.client
import typings.antDesignCssinjs.antDesignCssinjsStrings.server
import typings.antDesignCssinjs.esLintersInterfaceMod.Linter
import typings.antDesignCssinjs.esTransformersInterfaceMod.Transformer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStyleContextMod {
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", JSImport.Default)
  @js.native
  val default: Context[StyleContextProps] = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_DEV_CACHE_PATH")
  @js.native
  val ATTR_DEV_CACHE_PATH: /* "data-dev-cache-path" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_MARK")
  @js.native
  val ATTR_MARK: /* "data-css-hash" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_TOKEN")
  @js.native
  val ATTR_TOKEN: /* "data-token-hash" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "CSS_IN_JS_INSTANCE")
  @js.native
  val CSS_IN_JS_INSTANCE: /* "__cssinjs_instance__" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "StyleProvider")
  @js.native
  val StyleProvider: FC[StyleProviderProps] = js.native
  
  inline def createCache(): typings.antDesignCssinjs.esCacheMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")().asInstanceOf[typings.antDesignCssinjs.esCacheMod.default]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignCssinjs.antDesignCssinjsStrings.low
    - typings.antDesignCssinjs.antDesignCssinjsStrings.high
  */
  trait HashPriority extends StObject
  object HashPriority {
    
    inline def high: typings.antDesignCssinjs.antDesignCssinjsStrings.high = "high".asInstanceOf[typings.antDesignCssinjs.antDesignCssinjsStrings.high]
    
    inline def low: typings.antDesignCssinjs.antDesignCssinjsStrings.low = "low".asInstanceOf[typings.antDesignCssinjs.antDesignCssinjsStrings.low]
  }
  
  trait StyleContextProps extends StObject {
    
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set when you need ssr to extract style on you own.
      * If not provided, it will auto create <style /> on the end of Provider in server side.
      */
    var cache: typings.antDesignCssinjs.esCacheMod.default
    
    /** Tell cssinjs where to inject style in */
    var container: js.UndefOr[Element | ShadowRoot] = js.undefined
    
    /** Tell children that this context is default generated context */
    var defaultCache: Boolean
    
    /** Use `:where` selector to reduce hashId css selector priority */
    var hashPriority: js.UndefOr[HashPriority] = js.undefined
    
    /**
      * Linters to lint css before inject in document.
      * Styles will be linted after transforming.
      * Please note that `linters` do not support dynamic update.
      */
    var linters: js.UndefOr[js.Array[Linter]] = js.undefined
    
    /** @private Test only. Not work in production. */
    var mock: js.UndefOr[server | client] = js.undefined
    
    /** Component wil render inline  `<style />` for fallback in SSR. Not recommend. */
    var ssrInline: js.UndefOr[Boolean] = js.undefined
    
    /** Transform css before inject in document. Please note that `transformers` do not support dynamic update */
    var transformers: js.UndefOr[js.Array[Transformer]] = js.undefined
  }
  object StyleContextProps {
    
    inline def apply(cache: typings.antDesignCssinjs.esCacheMod.default, defaultCache: Boolean): StyleContextProps = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defaultCache = defaultCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleContextProps] (val x: Self) extends AnyVal {
      
      inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
      
      inline def setCache(value: typings.antDesignCssinjs.esCacheMod.default): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: Element | ShadowRoot): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultCache(value: Boolean): Self = StObject.set(x, "defaultCache", value.asInstanceOf[js.Any])
      
      inline def setHashPriority(value: HashPriority): Self = StObject.set(x, "hashPriority", value.asInstanceOf[js.Any])
      
      inline def setHashPriorityUndefined: Self = StObject.set(x, "hashPriority", js.undefined)
      
      inline def setLinters(value: js.Array[Linter]): Self = StObject.set(x, "linters", value.asInstanceOf[js.Any])
      
      inline def setLintersUndefined: Self = StObject.set(x, "linters", js.undefined)
      
      inline def setLintersVarargs(value: Linter*): Self = StObject.set(x, "linters", js.Array(value*))
      
      inline def setMock(value: server | client): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      inline def setSsrInline(value: Boolean): Self = StObject.set(x, "ssrInline", value.asInstanceOf[js.Any])
      
      inline def setSsrInlineUndefined: Self = StObject.set(x, "ssrInline", js.undefined)
      
      inline def setTransformers(value: js.Array[Transformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: Transformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@ant-design/cssinjs.@ant-design/cssinjs/es/StyleContext.StyleContextProps> & {  children :react.react.ReactNode | undefined} */
  trait StyleProviderProps extends StObject {
    
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[typings.antDesignCssinjs.esCacheMod.default] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var container: js.UndefOr[Element | ShadowRoot] = js.undefined
    
    var defaultCache: js.UndefOr[Boolean] = js.undefined
    
    var hashPriority: js.UndefOr[HashPriority] = js.undefined
    
    var linters: js.UndefOr[js.Array[Linter]] = js.undefined
    
    var mock: js.UndefOr[server | client] = js.undefined
    
    var ssrInline: js.UndefOr[Boolean] = js.undefined
    
    var transformers: js.UndefOr[js.Array[Transformer]] = js.undefined
  }
  object StyleProviderProps {
    
    inline def apply(): StyleProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleProviderProps] (val x: Self) extends AnyVal {
      
      inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
      
      inline def setCache(value: typings.antDesignCssinjs.esCacheMod.default): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: Element | ShadowRoot): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDefaultCache(value: Boolean): Self = StObject.set(x, "defaultCache", value.asInstanceOf[js.Any])
      
      inline def setDefaultCacheUndefined: Self = StObject.set(x, "defaultCache", js.undefined)
      
      inline def setHashPriority(value: HashPriority): Self = StObject.set(x, "hashPriority", value.asInstanceOf[js.Any])
      
      inline def setHashPriorityUndefined: Self = StObject.set(x, "hashPriority", js.undefined)
      
      inline def setLinters(value: js.Array[Linter]): Self = StObject.set(x, "linters", value.asInstanceOf[js.Any])
      
      inline def setLintersUndefined: Self = StObject.set(x, "linters", js.undefined)
      
      inline def setLintersVarargs(value: Linter*): Self = StObject.set(x, "linters", js.Array(value*))
      
      inline def setMock(value: server | client): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
      
      inline def setSsrInline(value: Boolean): Self = StObject.set(x, "ssrInline", value.asInstanceOf[js.Any])
      
      inline def setSsrInlineUndefined: Self = StObject.set(x, "ssrInline", js.undefined)
      
      inline def setTransformers(value: js.Array[Transformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: Transformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
}
