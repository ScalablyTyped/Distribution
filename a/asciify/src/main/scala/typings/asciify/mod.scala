package typings.asciify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asciify", JSImport.Namespace)
  @js.native
  def apply(text: String, callback: AsciifyCallback): Unit = js.native
  @JSImport("asciify", JSImport.Namespace)
  @js.native
  def apply(text: String, options: String, callback: AsciifyCallback): Unit = js.native
  @JSImport("asciify", JSImport.Namespace)
  @js.native
  def apply(text: String, options: AsciifyOptions, callback: AsciifyCallback): Unit = js.native
  
  @JSImport("asciify", "getFonts")
  @js.native
  def getFonts(callback: js.Function2[/* err */ Error, /* fonts */ js.Array[String], Unit]): Unit = js.native
}
