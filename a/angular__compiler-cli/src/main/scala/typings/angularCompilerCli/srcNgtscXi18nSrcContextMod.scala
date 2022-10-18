package typings.angularCompilerCli

import typings.angularCompiler.mod.InterpolationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscXi18nSrcContextMod {
  
  trait Xi18nContext extends StObject {
    
    /**
      * Capture i18n messages from the template.
      *
      * In `MessageBundle` itself, this returns any `ParseError`s from the template. In this interface,
      * the return type is declared as `void` for simplicity, since any parse errors would be reported
      * as diagnostics anyway.
      */
    def updateFromTemplate(html: String, url: String, interpolationConfig: InterpolationConfig): Unit
  }
  object Xi18nContext {
    
    inline def apply(updateFromTemplate: (String, String, InterpolationConfig) => Unit): Xi18nContext = {
      val __obj = js.Dynamic.literal(updateFromTemplate = js.Any.fromFunction3(updateFromTemplate))
      __obj.asInstanceOf[Xi18nContext]
    }
    
    extension [Self <: Xi18nContext](x: Self) {
      
      inline def setUpdateFromTemplate(value: (String, String, InterpolationConfig) => Unit): Self = StObject.set(x, "updateFromTemplate", js.Any.fromFunction3(value))
    }
  }
}
