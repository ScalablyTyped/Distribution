package typings.antDesignColors

import typings.antDesignColors.antDesignColorsStrings.dark
import typings.antDesignColors.antDesignColorsStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateMod {
  
  @JSImport("@ant-design/colors/dist/src/generate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(color: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def default(color: String, opts: Opts): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Opts extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[dark | default] = js.undefined
  }
  object Opts {
    
    @scala.inline
    def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | default): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
