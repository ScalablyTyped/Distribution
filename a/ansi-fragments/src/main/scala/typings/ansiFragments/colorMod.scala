package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("ansi-fragments/build/fragments/Color", "Color")
  @js.native
  class Color_ protected () extends IFragment {
    def this(ansiColor: AnsiColor, children: js.Array[String | IFragment]) = this()
    
    val children: js.Any = js.native
    
    val color: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Color", "color")
  @js.native
  def color(ansiColor: AnsiColor, children: (String | IFragment)*): Color_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiFragments.ansiFragmentsStrings.black
    - typings.ansiFragments.ansiFragmentsStrings.red
    - typings.ansiFragments.ansiFragmentsStrings.green
    - typings.ansiFragments.ansiFragmentsStrings.yellow
    - typings.ansiFragments.ansiFragmentsStrings.blue
    - typings.ansiFragments.ansiFragmentsStrings.magenta
    - typings.ansiFragments.ansiFragmentsStrings.cyan
    - typings.ansiFragments.ansiFragmentsStrings.white
    - typings.ansiFragments.ansiFragmentsStrings.brightBlack
    - typings.ansiFragments.ansiFragmentsStrings.brightRed
    - typings.ansiFragments.ansiFragmentsStrings.brightGreen
    - typings.ansiFragments.ansiFragmentsStrings.brightYellow
    - typings.ansiFragments.ansiFragmentsStrings.brightBlue
    - typings.ansiFragments.ansiFragmentsStrings.brightMagenta
    - typings.ansiFragments.ansiFragmentsStrings.brightCyan
    - typings.ansiFragments.ansiFragmentsStrings.brightWhite
    - typings.ansiFragments.ansiFragmentsStrings.gray
    - typings.ansiFragments.ansiFragmentsStrings.bgBlack
    - typings.ansiFragments.ansiFragmentsStrings.bgRed
    - typings.ansiFragments.ansiFragmentsStrings.bgGreen
    - typings.ansiFragments.ansiFragmentsStrings.bgYellow
    - typings.ansiFragments.ansiFragmentsStrings.bgBlue
    - typings.ansiFragments.ansiFragmentsStrings.bgMagenta
    - typings.ansiFragments.ansiFragmentsStrings.bgCyan
    - typings.ansiFragments.ansiFragmentsStrings.bgWhite
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightBlack
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightRed
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightGreen
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightYellow
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightBlue
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightMagenta
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightCyan
    - typings.ansiFragments.ansiFragmentsStrings.bgBrightWhite
    - typings.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiColor extends StObject
  object AnsiColor {
    
    @scala.inline
    def bgBlack: typings.ansiFragments.ansiFragmentsStrings.bgBlack = "bgBlack".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBlack]
    
    @scala.inline
    def bgBlue: typings.ansiFragments.ansiFragmentsStrings.bgBlue = "bgBlue".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBlue]
    
    @scala.inline
    def bgBrightBlack: typings.ansiFragments.ansiFragmentsStrings.bgBrightBlack = "bgBrightBlack".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightBlack]
    
    @scala.inline
    def bgBrightBlue: typings.ansiFragments.ansiFragmentsStrings.bgBrightBlue = "bgBrightBlue".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightBlue]
    
    @scala.inline
    def bgBrightCyan: typings.ansiFragments.ansiFragmentsStrings.bgBrightCyan = "bgBrightCyan".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightCyan]
    
    @scala.inline
    def bgBrightGreen: typings.ansiFragments.ansiFragmentsStrings.bgBrightGreen = "bgBrightGreen".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightGreen]
    
    @scala.inline
    def bgBrightMagenta: typings.ansiFragments.ansiFragmentsStrings.bgBrightMagenta = "bgBrightMagenta".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightMagenta]
    
    @scala.inline
    def bgBrightRed: typings.ansiFragments.ansiFragmentsStrings.bgBrightRed = "bgBrightRed".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightRed]
    
    @scala.inline
    def bgBrightWhite: typings.ansiFragments.ansiFragmentsStrings.bgBrightWhite = "bgBrightWhite".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightWhite]
    
    @scala.inline
    def bgBrightYellow: typings.ansiFragments.ansiFragmentsStrings.bgBrightYellow = "bgBrightYellow".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgBrightYellow]
    
    @scala.inline
    def bgCyan: typings.ansiFragments.ansiFragmentsStrings.bgCyan = "bgCyan".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgCyan]
    
    @scala.inline
    def bgGreen: typings.ansiFragments.ansiFragmentsStrings.bgGreen = "bgGreen".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgGreen]
    
    @scala.inline
    def bgMagenta: typings.ansiFragments.ansiFragmentsStrings.bgMagenta = "bgMagenta".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgMagenta]
    
    @scala.inline
    def bgRed: typings.ansiFragments.ansiFragmentsStrings.bgRed = "bgRed".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgRed]
    
    @scala.inline
    def bgWhite: typings.ansiFragments.ansiFragmentsStrings.bgWhite = "bgWhite".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgWhite]
    
    @scala.inline
    def bgYellow: typings.ansiFragments.ansiFragmentsStrings.bgYellow = "bgYellow".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bgYellow]
    
    @scala.inline
    def black: typings.ansiFragments.ansiFragmentsStrings.black = "black".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.black]
    
    @scala.inline
    def blue: typings.ansiFragments.ansiFragmentsStrings.blue = "blue".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.blue]
    
    @scala.inline
    def brightBlack: typings.ansiFragments.ansiFragmentsStrings.brightBlack = "brightBlack".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightBlack]
    
    @scala.inline
    def brightBlue: typings.ansiFragments.ansiFragmentsStrings.brightBlue = "brightBlue".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightBlue]
    
    @scala.inline
    def brightCyan: typings.ansiFragments.ansiFragmentsStrings.brightCyan = "brightCyan".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightCyan]
    
    @scala.inline
    def brightGreen: typings.ansiFragments.ansiFragmentsStrings.brightGreen = "brightGreen".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightGreen]
    
    @scala.inline
    def brightMagenta: typings.ansiFragments.ansiFragmentsStrings.brightMagenta = "brightMagenta".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightMagenta]
    
    @scala.inline
    def brightRed: typings.ansiFragments.ansiFragmentsStrings.brightRed = "brightRed".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightRed]
    
    @scala.inline
    def brightWhite: typings.ansiFragments.ansiFragmentsStrings.brightWhite = "brightWhite".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightWhite]
    
    @scala.inline
    def brightYellow: typings.ansiFragments.ansiFragmentsStrings.brightYellow = "brightYellow".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.brightYellow]
    
    @scala.inline
    def cyan: typings.ansiFragments.ansiFragmentsStrings.cyan = "cyan".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.cyan]
    
    @scala.inline
    def gray: typings.ansiFragments.ansiFragmentsStrings.gray = "gray".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.gray]
    
    @scala.inline
    def green: typings.ansiFragments.ansiFragmentsStrings.green = "green".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.green]
    
    @scala.inline
    def magenta: typings.ansiFragments.ansiFragmentsStrings.magenta = "magenta".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.magenta]
    
    @scala.inline
    def none: typings.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.none]
    
    @scala.inline
    def red: typings.ansiFragments.ansiFragmentsStrings.red = "red".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.red]
    
    @scala.inline
    def white: typings.ansiFragments.ansiFragmentsStrings.white = "white".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.white]
    
    @scala.inline
    def yellow: typings.ansiFragments.ansiFragmentsStrings.yellow = "yellow".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.yellow]
  }
}
