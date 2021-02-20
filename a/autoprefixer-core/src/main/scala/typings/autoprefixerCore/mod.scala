package typings.autoprefixerCore

import org.scalablytyped.runtime.Shortcut
import typings.autoprefixerCore.anon.Inline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("autoprefixer-core", JSImport.Namespace)
  @js.native
  val ^ : Exports = js.native
  
  @js.native
  trait Config extends StObject {
    
    var browsers: js.UndefOr[js.Array[String]] = js.native
    
    var cascade: js.UndefOr[Boolean] = js.native
    
    var remove: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      @scala.inline
      def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value :_*))
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  @js.native
  trait Exports extends StObject {
    
    def apply(config: Config): Processor = js.native
    
    def info(): String = js.native
    
    var postcss: js.Any = js.native
    
    def process(css: String): Result = js.native
    def process(css: String, opts: Options): Result = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var map: js.UndefOr[Inline] = js.native
    
    var safe: js.UndefOr[Boolean] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setMap(value: Inline): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait Processor extends StObject {
    
    def info(): String = js.native
    
    var postcss: js.Any = js.native
    
    def process(css: String): Result = js.native
    def process(css: String, opts: Options): Result = js.native
  }
  
  @js.native
  trait Result extends StObject {
    
    var css: String = js.native
    
    var map: String = js.native
    
    var opts: Options = js.native
  }
  object Result {
    
    @scala.inline
    def apply(css: String, map: String, opts: Options): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Exports
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Exports = ^
}
