package typings.aphrodite

import org.scalablytyped.runtime.TopLevel
import typings.aphrodite.anon.Content
import typings.aphrodite.aphroditeBooleans.`false`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @scala.inline
  def StyleSheetServer_=(x: StyleSheetServerStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheetServer")(x.asInstanceOf[js.Any])
  
  @JSImport("aphrodite", "StyleSheetTestUtils")
  @js.native
  def StyleSheetTestUtils: StyleSheetTestUtilsStatic = js.native
  @scala.inline
  def StyleSheetTestUtils_=(x: StyleSheetTestUtilsStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheetTestUtils")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def StyleSheet_=(x: StyleSheetStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
  
  @JSImport("aphrodite", "css")
  @js.native
  def css(styles: CSSInputTypes*): String = js.native
  
  @JSImport("aphrodite", "flushToStyleTag")
  @js.native
  def flushToStyleTag(): Unit = js.native
  
  @JSImport("aphrodite", "minify")
  @js.native
  def minify(shouldMinify: Boolean): Unit = js.native
  
  @JSImport("aphrodite", "reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("aphrodite", "resetInjectedStyle")
  @js.native
  def resetInjectedStyle(key: String): Unit = js.native
  
  type CSSInputTypes = StyleDeclarationValue | `false` | Null | Unit
  
  /**
    * Calling StyleSheet.extend() returns an object with each of the exported
    * properties on it.
    */
  @js.native
  trait Exports extends StObject {
    
    var StyleSheet: StyleSheetStatic = js.native
    
    var StyleSheetServer: StyleSheetServerStatic = js.native
    
    var StyleSheetTestUtils: StyleSheetTestUtilsStatic = js.native
    
    def css(styles: CSSInputTypes*): String = js.native
    
    def flushToStyleTag(): Unit = js.native
  }
  object Exports {
    
    @scala.inline
    def apply(
      StyleSheet: StyleSheetStatic,
      StyleSheetServer: StyleSheetServerStatic,
      StyleSheetTestUtils: StyleSheetTestUtilsStatic,
      css: /* repeated */ CSSInputTypes => String,
      flushToStyleTag: () => Unit
    ): Exports = {
      val __obj = js.Dynamic.literal(StyleSheet = StyleSheet.asInstanceOf[js.Any], StyleSheetServer = StyleSheetServer.asInstanceOf[js.Any], StyleSheetTestUtils = StyleSheetTestUtils.asInstanceOf[js.Any], css = js.Any.fromFunction1(css), flushToStyleTag = js.Any.fromFunction0(flushToStyleTag))
      __obj.asInstanceOf[Exports]
    }
    
    @scala.inline
    implicit class ExportsMutableBuilder[Self <: Exports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: /* repeated */ CSSInputTypes => String): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlushToStyleTag(value: () => Unit): Self = StObject.set(x, "flushToStyleTag", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStyleSheet(value: StyleSheetStatic): Self = StObject.set(x, "StyleSheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSheetServer(value: StyleSheetServerStatic): Self = StObject.set(x, "StyleSheetServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSheetTestUtils(value: StyleSheetTestUtilsStatic): Self = StObject.set(x, "StyleSheetTestUtils", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Extension extends StObject {
    
    var selectorHandler: js.UndefOr[SelectorHandler] = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectorHandler(
        value: (/* selector */ String, /* baseSelector */ String, /* callback */ js.Function1[/* selector */ String, String]) => String | Null
      ): Self = StObject.set(x, "selectorHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectorHandlerUndefined: Self = StObject.set(x, "selectorHandler", js.undefined)
    }
  }
  
  type SelectorHandler = js.Function3[
    /* selector */ String, 
    /* baseSelector */ String, 
    /* callback */ js.Function1[/* selector */ String, String], 
    String | Null
  ]
  
  @js.native
  trait StaticRendererResult extends StObject {
    
    var css: Content = js.native
    
    var html: String = js.native
  }
  object StaticRendererResult {
    
    @scala.inline
    def apply(css: Content, html: String): StaticRendererResult = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticRendererResult]
    }
    
    @scala.inline
    implicit class StaticRendererResultMutableBuilder[Self <: StaticRendererResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: Content): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleDeclaration[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aphrodite.aphrodite/typings/css-properties.CSSProperties | aphrodite.aphrodite.StyleDeclarationMap}
    */ typings.aphrodite.aphroditeStrings.StyleDeclaration with TopLevel[js.Any]
  
  type StyleDeclarationMap = Map[
    /* keyof aphrodite.aphrodite/typings/css-properties.CSSProperties */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 340 */ js.Any, 
    String | Double
  ]
  
  type StyleDeclarationValue = js.Object
  
  /**
    * Utilities for using Aphrodite server-side.
    */
  @js.native
  trait StyleSheetServerStatic extends StObject {
    
    def renderStatic(renderFunc: js.Function0[String]): StaticRendererResult = js.native
  }
  object StyleSheetServerStatic {
    
    @scala.inline
    def apply(renderStatic: js.Function0[String] => StaticRendererResult): StyleSheetServerStatic = {
      val __obj = js.Dynamic.literal(renderStatic = js.Any.fromFunction1(renderStatic))
      __obj.asInstanceOf[StyleSheetServerStatic]
    }
    
    @scala.inline
    implicit class StyleSheetServerStaticMutableBuilder[Self <: StyleSheetServerStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderStatic(value: js.Function0[String] => StaticRendererResult): Self = StObject.set(x, "renderStatic", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait StyleSheetStatic extends StObject {
    
    /**
      * Create style sheet
      */
    def create[T](styles: StyleDeclaration[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
      */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any] = js.native
    
    def extend(extensions: js.Array[Extension]): Exports = js.native
    
    /**
      * Rehydrate class names from server renderer
      */
    def rehydrate(renderedClassNames: js.Array[String]): Unit = js.native
  }
  object StyleSheetStatic {
    
    @scala.inline
    def apply(
      create: StyleDeclaration[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
      */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any],
      extend: js.Array[Extension] => Exports,
      rehydrate: js.Array[String] => Unit
    ): StyleSheetStatic = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), extend = js.Any.fromFunction1(extend), rehydrate = js.Any.fromFunction1(rehydrate))
      __obj.asInstanceOf[StyleSheetStatic]
    }
    
    @scala.inline
    implicit class StyleSheetStaticMutableBuilder[Self <: StyleSheetStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(
        value: StyleDeclaration[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
        */ typings.aphrodite.aphroditeStrings.StyleSheetStatic with TopLevel[js.Any]
      ): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtend(value: js.Array[Extension] => Exports): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRehydrate(value: js.Array[String] => Unit): Self = StObject.set(x, "rehydrate", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait StyleSheetTestUtilsStatic extends StObject {
    
    /**
      * Opposite method of preventStyleInject.
      */
    def clearBufferAndResumeStyleInjection(): Unit = js.native
    
    /**
      * Returns a string of buffered styles which have not been flushed
      *
      * @returns {string}  Buffer of styles which have not yet been flushed.
      */
    def getBufferedStyles(): js.Array[String] = js.native
    
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
    def suppressStyleInjection(): Unit = js.native
  }
  object StyleSheetTestUtilsStatic {
    
    @scala.inline
    def apply(
      clearBufferAndResumeStyleInjection: () => Unit,
      getBufferedStyles: () => js.Array[String],
      suppressStyleInjection: () => Unit
    ): StyleSheetTestUtilsStatic = {
      val __obj = js.Dynamic.literal(clearBufferAndResumeStyleInjection = js.Any.fromFunction0(clearBufferAndResumeStyleInjection), getBufferedStyles = js.Any.fromFunction0(getBufferedStyles), suppressStyleInjection = js.Any.fromFunction0(suppressStyleInjection))
      __obj.asInstanceOf[StyleSheetTestUtilsStatic]
    }
    
    @scala.inline
    implicit class StyleSheetTestUtilsStaticMutableBuilder[Self <: StyleSheetTestUtilsStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearBufferAndResumeStyleInjection(value: () => Unit): Self = StObject.set(x, "clearBufferAndResumeStyleInjection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBufferedStyles(value: () => js.Array[String]): Self = StObject.set(x, "getBufferedStyles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSuppressStyleInjection(value: () => Unit): Self = StObject.set(x, "suppressStyleInjection", js.Any.fromFunction0(value))
    }
  }
}
