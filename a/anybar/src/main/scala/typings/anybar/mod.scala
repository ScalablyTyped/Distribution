package typings.anybar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(status: AnybarStatus): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(status.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(status: AnybarStatus, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
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
    - typings.anybar.anybarStrings.filled
    - typings.anybar.anybarStrings.hollow
  */
  trait AnybarStatus extends StObject
  object AnybarStatus {
    
    inline def black: typings.anybar.anybarStrings.black = "black".asInstanceOf[typings.anybar.anybarStrings.black]
    
    inline def blue: typings.anybar.anybarStrings.blue = "blue".asInstanceOf[typings.anybar.anybarStrings.blue]
    
    inline def cyan: typings.anybar.anybarStrings.cyan = "cyan".asInstanceOf[typings.anybar.anybarStrings.cyan]
    
    inline def exclamation: typings.anybar.anybarStrings.exclamation = "exclamation".asInstanceOf[typings.anybar.anybarStrings.exclamation]
    
    inline def filled: typings.anybar.anybarStrings.filled = "filled".asInstanceOf[typings.anybar.anybarStrings.filled]
    
    inline def green: typings.anybar.anybarStrings.green = "green".asInstanceOf[typings.anybar.anybarStrings.green]
    
    inline def hollow: typings.anybar.anybarStrings.hollow = "hollow".asInstanceOf[typings.anybar.anybarStrings.hollow]
    
    inline def orange: typings.anybar.anybarStrings.orange = "orange".asInstanceOf[typings.anybar.anybarStrings.orange]
    
    inline def purple: typings.anybar.anybarStrings.purple = "purple".asInstanceOf[typings.anybar.anybarStrings.purple]
    
    inline def question: typings.anybar.anybarStrings.question = "question".asInstanceOf[typings.anybar.anybarStrings.question]
    
    inline def quit: typings.anybar.anybarStrings.quit = "quit".asInstanceOf[typings.anybar.anybarStrings.quit]
    
    inline def red: typings.anybar.anybarStrings.red = "red".asInstanceOf[typings.anybar.anybarStrings.red]
    
    inline def white: typings.anybar.anybarStrings.white = "white".asInstanceOf[typings.anybar.anybarStrings.white]
    
    inline def yellow: typings.anybar.anybarStrings.yellow = "yellow".asInstanceOf[typings.anybar.anybarStrings.yellow]
  }
  
  trait Options extends StObject {
    
    /**
    	The port to communicate with the AnyBar app.
    	@default 1738
    	*/
    val port: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
