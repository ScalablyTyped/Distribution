package typings.ansicolors

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ansicolors", JSImport.Default)
  @js.native
  val default: Colors = js.native
  
  @js.native
  trait Colors
    extends StObject
       with /* key */ StringDictionary[Colors] {
    
    def apply(value: String): String = js.native
    
    var bgBlack: this.type = js.native
    
    var bgBlue: this.type = js.native
    
    var bgBrightBlack: this.type = js.native
    
    var bgBrightBlue: this.type = js.native
    
    var bgBrightCyan: this.type = js.native
    
    var bgBrightGreen: this.type = js.native
    
    var bgBrightMagenta: this.type = js.native
    
    var bgBrightRed: this.type = js.native
    
    var bgBrightWhite: this.type = js.native
    
    var bgBrightYellow: this.type = js.native
    
    var bgCyan: this.type = js.native
    
    var bgGreen: this.type = js.native
    
    var bgMagenta: this.type = js.native
    
    var bgRed: this.type = js.native
    
    var bgWhite: this.type = js.native
    
    var bgYellow: this.type = js.native
    
    var black: this.type = js.native
    
    var blue: this.type = js.native
    
    var brightBlack: this.type = js.native
    
    var brightBlue: this.type = js.native
    
    var brightCyan: this.type = js.native
    
    var brightGreen: this.type = js.native
    
    var brightMagenta: this.type = js.native
    
    var brightRed: this.type = js.native
    
    var brightWhite: this.type = js.native
    
    var brightYellow: this.type = js.native
    
    var close: this.type = js.native
    
    var colors: this.type = js.native
    
    var cyan: this.type = js.native
    
    var green: this.type = js.native
    
    var magenta: this.type = js.native
    
    var open: this.type = js.native
    
    var red: this.type = js.native
    
    var white: this.type = js.native
    
    var yellow: this.type = js.native
  }
  
  type _To = Colors
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Colors = default
}
