package typings.antlr4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4/InputStream", JSImport.Namespace)
@js.native
object inputStreamMod extends js.Object {
  
  @js.native
  class InputStream protected () extends js.Object {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
    
    def LA(offset: Double): Double = js.native
    
    def LT(offset: Double): Double = js.native
    
    def consume(): Unit = js.native
    
    def getText(start: Double, stop: Double): String = js.native
    
    val index: Double = js.native
    
    def mark(): Double = js.native
    
    def release(marker: js.Any): Double = js.native
    
    def reset(): Unit = js.native
    
    def seek(index: Double): Unit = js.native
    
    val size: Double = js.native
  }
}
