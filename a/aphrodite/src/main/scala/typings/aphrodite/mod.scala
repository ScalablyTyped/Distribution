package typings.aphrodite

import typings.aphrodite.anon.Content
import typings.aphrodite.aphroditeBooleans.`false`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aphrodite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aphrodite", "StyleSheet")
  @js.native
  def StyleSheet: StyleSheetStatic = js.native
  
  @JSImport("aphrodite", "StyleSheetServer")
  @js.native
  def StyleSheetServer: StyleSheetServerStatic = js.native
  inline def StyleSheetServer_=(x: StyleSheetServerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheetServer")(x.asInstanceOf[js.Any])
  
  @JSImport("aphrodite", "StyleSheetTestUtils")
  @js.native
  def StyleSheetTestUtils: StyleSheetTestUtilsStatic = js.native
  inline def StyleSheetTestUtils_=(x: StyleSheetTestUtilsStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheetTestUtils")(x.asInstanceOf[js.Any])
  
  inline def StyleSheet_=(x: StyleSheetStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
  
  inline def css(styles: CSSInputTypes*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(styles.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def flushToStyleTag(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushToStyleTag")().asInstanceOf[Unit]
  
  inline def minify(shouldMinify: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(shouldMinify.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def resetInjectedStyle(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetInjectedStyle")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CSSInputTypes = StyleDeclarationValue | `false` | Null | Unit
  
  /**
    * Calling StyleSheet.extend() returns an object with each of the exported
    * properties on it.
    */
  trait Exports extends StObject {
    
    var StyleSheet: StyleSheetStatic
    
    var StyleSheetServer: StyleSheetServerStatic
    
    var StyleSheetTestUtils: StyleSheetTestUtilsStatic
    
    def css(styles: CSSInputTypes*): String
    
    def flushToStyleTag(): Unit
  }
  object Exports {
    
    inline def apply(
      StyleSheet: StyleSheetStatic,
      StyleSheetServer: StyleSheetServerStatic,
      StyleSheetTestUtils: StyleSheetTestUtilsStatic,
      css: /* repeated */ CSSInputTypes => String,
      flushToStyleTag: () => Unit
    ): Exports = {
      val __obj = js.Dynamic.literal(StyleSheet = StyleSheet.asInstanceOf[js.Any], StyleSheetServer = StyleSheetServer.asInstanceOf[js.Any], StyleSheetTestUtils = StyleSheetTestUtils.asInstanceOf[js.Any], css = js.Any.fromFunction1(css), flushToStyleTag = js.Any.fromFunction0(flushToStyleTag))
      __obj.asInstanceOf[Exports]
    }
    
    extension [Self <: Exports](x: Self) {
      
      inline def setCss(value: /* repeated */ CSSInputTypes => String): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      inline def setFlushToStyleTag(value: () => Unit): Self = StObject.set(x, "flushToStyleTag", js.Any.fromFunction0(value))
      
      inline def setStyleSheet(value: StyleSheetStatic): Self = StObject.set(x, "StyleSheet", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetServer(value: StyleSheetServerStatic): Self = StObject.set(x, "StyleSheetServer", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetTestUtils(value: StyleSheetTestUtilsStatic): Self = StObject.set(x, "StyleSheetTestUtils", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extension extends StObject {
    
    var selectorHandler: js.UndefOr[SelectorHandler] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setSelectorHandler(
        value: (/* selector */ String, /* baseSelector */ String, /* callback */ js.Function1[/* selector */ String, String]) => String | Null
      ): Self = StObject.set(x, "selectorHandler", js.Any.fromFunction3(value))
      
      inline def setSelectorHandlerUndefined: Self = StObject.set(x, "selectorHandler", js.undefined)
    }
  }
  
  type SelectorHandler = js.Function3[
    /* selector */ String, 
    /* baseSelector */ String, 
    /* callback */ js.Function1[/* selector */ String, String], 
    String | Null
  ]
  
  trait StaticRendererResult extends StObject {
    
    var css: Content
    
    var html: String
  }
  object StaticRendererResult {
    
    inline def apply(css: Content, html: String): StaticRendererResult = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRendererResult]
    }
    
    extension [Self <: StaticRendererResult](x: Self) {
      
      inline def setCss(value: Content): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: aphrodite.aphrodite/typings/css-properties.CSSProperties | aphrodite.aphrodite.StyleDeclarationMap}
    }}}
    */
  @js.native
  trait StyleDeclaration[T] extends StObject
  
  type StyleDeclarationMap = Map[
    /* keyof aphrodite.aphrodite/typings/css-properties.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 340, starting with typings.aphrodite.aphroditeStrings.alignContent, typings.aphrodite.aphroditeStrings.alignItems, typings.aphrodite.aphroditeStrings.alignSelf */ Any, 
    String | Double
  ]
  
  type StyleDeclarationValue = js.Object
  
  /**
    * Utilities for using Aphrodite server-side.
    */
  trait StyleSheetServerStatic extends StObject {
    
    def renderStatic(renderFunc: js.Function0[String]): StaticRendererResult
  }
  object StyleSheetServerStatic {
    
    inline def apply(renderStatic: js.Function0[String] => StaticRendererResult): StyleSheetServerStatic = {
      val __obj = js.Dynamic.literal(renderStatic = js.Any.fromFunction1(renderStatic))
      __obj.asInstanceOf[StyleSheetServerStatic]
    }
    
    extension [Self <: StyleSheetServerStatic](x: Self) {
      
      inline def setRenderStatic(value: js.Function0[String] => StaticRendererResult): Self = StObject.set(x, "renderStatic", js.Any.fromFunction1(value))
    }
  }
  
  trait StyleSheetStatic extends StObject {
    
    /**
      * Create style sheet
      */
    def create[T](styles: StyleDeclaration[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue} */ js.Any
    
    def extend(extensions: js.Array[Extension]): Exports
    
    /**
      * Rehydrate class names from server renderer
      */
    def rehydrate(renderedClassNames: js.Array[String]): Unit
  }
  object StyleSheetStatic {
    
    inline def apply(
      create: StyleDeclaration[Any] => /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue} */ js.Any,
      extend: js.Array[Extension] => Exports,
      rehydrate: js.Array[String] => Unit
    ): StyleSheetStatic = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), rehydrate = js.Any.fromFunction1(rehydrate))
      __obj.asInstanceOf[StyleSheetStatic]
    }
    
    extension [Self <: StyleSheetStatic](x: Self) {
      
      inline def setCreate(
        value: StyleDeclaration[Any] => /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue} */ js.Any
      ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setExtend(value: js.Array[Extension] => Exports): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      inline def setRehydrate(value: js.Array[String] => Unit): Self = StObject.set(x, "rehydrate", js.Any.fromFunction1(value))
    }
  }
  
  trait StyleSheetTestUtilsStatic extends StObject {
    
    /**
      * Opposite method of preventStyleInject.
      */
    def clearBufferAndResumeStyleInjection(): Unit
    
    /**
      * Returns a string of buffered styles which have not been flushed
      *
      * @returns {string}  Buffer of styles which have not yet been flushed.
      */
    def getBufferedStyles(): js.Array[String]
    
    /**
      * Prevent styles from being injected into the DOM.
      *
      * This is useful in situations where you'd like to test rendering UI
      * components which use Aphrodite without any of the side-effects of
      * Aphrodite happening. Particularly useful for testing the output of
      * components when you have no DOM, e.g. testing in Node without a fake DOM.
      *
      * Should be paired with a subsequent call to
      * clearBufferAndResumeStyleInjection.
      */
    def suppressStyleInjection(): Unit
  }
  object StyleSheetTestUtilsStatic {
    
    inline def apply(
      clearBufferAndResumeStyleInjection: () => Unit,
      getBufferedStyles: () => js.Array[String],
      suppressStyleInjection: () => Unit
    ): StyleSheetTestUtilsStatic = {
      val __obj = js.Dynamic.literal(clearBufferAndResumeStyleInjection = js.Any.fromFunction0(clearBufferAndResumeStyleInjection), getBufferedStyles = js.Any.fromFunction0(getBufferedStyles), suppressStyleInjection = js.Any.fromFunction0(suppressStyleInjection))
      __obj.asInstanceOf[StyleSheetTestUtilsStatic]
    }
    
    extension [Self <: StyleSheetTestUtilsStatic](x: Self) {
      
      inline def setClearBufferAndResumeStyleInjection(value: () => Unit): Self = StObject.set(x, "clearBufferAndResumeStyleInjection", js.Any.fromFunction0(value))
      
      inline def setGetBufferedStyles(value: () => js.Array[String]): Self = StObject.set(x, "getBufferedStyles", js.Any.fromFunction0(value))
      
      inline def setSuppressStyleInjection(value: () => Unit): Self = StObject.set(x, "suppressStyleInjection", js.Any.fromFunction0(value))
    }
  }
}
