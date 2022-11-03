package typings.antlr4

import typings.antlr4.antlr4Ints.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStreamMod {
  
  @JSImport("antlr4/InputStream", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with InputStream {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
  }
  
  @js.native
  trait InputStream extends StObject {
    
    def LA(offset: Double): Double = js.native
    
    def LT(offset: Double): Double = js.native
    
    def consume(): Unit = js.native
    
    def getText(start: Double, stop: Double): String = js.native
    
    def index: Double = js.native
    
    /**
      * noop: we have entire buffer
      */
    def mark(): `-1` = js.native
    
    /**
      * noop: we have entire buffer
      */
    def release(marker: Double): Unit = js.native
    
    /**
      * Reset the stream so that it's in the same state it was
      * when the object was created *except* the data array is not
      * touched.
      */
    def reset(): Unit = js.native
    
    def seek(_index: Double): Unit = js.native
    
    def size: Double = js.native
  }
}
