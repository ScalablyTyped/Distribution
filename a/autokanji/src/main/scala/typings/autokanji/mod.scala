package typings.autokanji

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autokanji", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def find(input: String): js.Array[String] = js.native
  
  def setLenience(level: Double): Unit = js.native
}
