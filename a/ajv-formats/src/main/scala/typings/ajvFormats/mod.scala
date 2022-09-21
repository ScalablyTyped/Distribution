package typings.ajvFormats

import org.scalablytyped.runtime.Shortcut
import typings.ajv.coreMod.Plugin
import typings.ajv.distTypesMod.Format
import typings.ajvFormats.formatsMod.FormatMode
import typings.ajvFormats.formatsMod.FormatName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ajv-formats", JSImport.Default)
  @js.native
  val default: FormatsPlugin = js.native
  
  trait FormatOptions extends StObject {
    
    var formats: js.UndefOr[js.Array[FormatName]] = js.undefined
    
    var keywords: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[FormatMode] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    extension [Self <: FormatOptions](x: Self) {
      
      inline def setFormats(value: js.Array[FormatName]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: FormatName*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setKeywords(value: Boolean): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setMode(value: FormatMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait FormatsPlugin
    extends StObject
       with Plugin[FormatsPluginOptions] {
    
    def get(format: FormatName): Format = js.native
    def get(format: FormatName, mode: FormatMode): Format = js.native
  }
  
  type FormatsPluginOptions = js.Array[FormatName] | FormatOptions
  
  type _To = FormatsPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FormatsPlugin = default
}
