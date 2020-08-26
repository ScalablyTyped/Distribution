package typings.antlr4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/InputStream", JSImport.Namespace)
@js.native
object inputStreamMod extends js.Object {
  @js.native
  class InputStream protected () extends js.Object {
    def this(data: String) = this()
    def this(data: String, decodeToUnicodeCodePoints: Boolean) = this()
    val index: Double = js.native
    val size: Double = js.native
    def LA(offset: Double): Double = js.native
    def LT(offset: Double): Double = js.native
    def consume(): Unit = js.native
    def getText(start: Double, stop: Double): String = js.native
    def mark(): Double = js.native
    def release(marker: js.Any): Double = js.native
    def reset(): Unit = js.native
    def seek(index: Double): Unit = js.native
  }
  
}

