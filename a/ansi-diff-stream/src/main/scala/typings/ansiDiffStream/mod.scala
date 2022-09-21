package typings.ansiDiffStream

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new diff stream. You should pipe it to a ansi capable stream.
    *
    * @example
    * import differ = require('ansi-diff-stream')
    * const diff = differ()
    *
    * setInterval(() => {
    *   diff.write(`\
    * This is a demo
    * The time is: ${new Date()}
    * That is all`);
    * }, 500)
    *
    * diff.pipe(process.stdout)
    * // =>
    * // This is a demo
    * // The time is: Thu Jul 14 2016 19:46:56 GMT+0200 (CEST)
    * // That is all
    */
  inline def apply(): AnsiDiffStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[AnsiDiffStream]
  
  @JSImport("ansi-diff-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait AnsiDiffStream extends Transform {
    
    /**
      * Clear the last printed output from the screen. Similar to doing stream.write('').
      */
    def clear(): Unit = js.native
    
    /**
      * Will reset the diff. Useful you print something manually in between updates.
      */
    def reset(): Unit = js.native
  }
}
