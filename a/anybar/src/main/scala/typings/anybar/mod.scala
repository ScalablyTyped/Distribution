package typings.anybar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Control the [AnyBar app](https://github.com/tonsky/AnyBar).
  @param status - [Name](https://github.com/tonsky/AnyBar#usage) of the color dot you want AnyBar.app to display.
  @returns Returns a promise, but AnyBar.app doesn't send back a reply, so really the only point of waiting for the promise to resolve is in case of an obscure DNS error.
  @example
  ```
  import anybar = require('anybar');
  anybar('purple');
  // The Anybar.app menubar icon turned purple
  ```
  */
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  def apply(status: AnybarStatus): js.Promise[Unit] = js.native
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  def apply(status: AnybarStatus, options: Options): js.Promise[Unit] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.anybar.anybarStrings.white
    - typings.anybar.anybarStrings.red
    - typings.anybar.anybarStrings.orange
    - typings.anybar.anybarStrings.yellow
    - typings.anybar.anybarStrings.green
    - typings.anybar.anybarStrings.cyan
    - typings.anybar.anybarStrings.blue
    - typings.anybar.anybarStrings.purple
    - typings.anybar.anybarStrings.black
    - typings.anybar.anybarStrings.question
    - typings.anybar.anybarStrings.exclamation
    - typings.anybar.anybarStrings.quit
  */
  trait AnybarStatus extends StObject
  object AnybarStatus {
    
    @scala.inline
    def black: typings.anybar.anybarStrings.black = "black".asInstanceOf[typings.anybar.anybarStrings.black]
    
    @scala.inline
    def blue: typings.anybar.anybarStrings.blue = "blue".asInstanceOf[typings.anybar.anybarStrings.blue]
    
    @scala.inline
    def cyan: typings.anybar.anybarStrings.cyan = "cyan".asInstanceOf[typings.anybar.anybarStrings.cyan]
    
    @scala.inline
    def exclamation: typings.anybar.anybarStrings.exclamation = "exclamation".asInstanceOf[typings.anybar.anybarStrings.exclamation]
    
    @scala.inline
    def green: typings.anybar.anybarStrings.green = "green".asInstanceOf[typings.anybar.anybarStrings.green]
    
    @scala.inline
    def orange: typings.anybar.anybarStrings.orange = "orange".asInstanceOf[typings.anybar.anybarStrings.orange]
    
    @scala.inline
    def purple: typings.anybar.anybarStrings.purple = "purple".asInstanceOf[typings.anybar.anybarStrings.purple]
    
    @scala.inline
    def question: typings.anybar.anybarStrings.question = "question".asInstanceOf[typings.anybar.anybarStrings.question]
    
    @scala.inline
    def quit: typings.anybar.anybarStrings.quit = "quit".asInstanceOf[typings.anybar.anybarStrings.quit]
    
    @scala.inline
    def red: typings.anybar.anybarStrings.red = "red".asInstanceOf[typings.anybar.anybarStrings.red]
    
    @scala.inline
    def white: typings.anybar.anybarStrings.white = "white".asInstanceOf[typings.anybar.anybarStrings.white]
    
    @scala.inline
    def yellow: typings.anybar.anybarStrings.yellow = "yellow".asInstanceOf[typings.anybar.anybarStrings.yellow]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Port to communicate with the AnyBar.app.
    		@default 1738
    		*/
    var port: js.UndefOr[Double] = js.native
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
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
