package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apostrophe", "modalSupport")
@js.native
object modalSupport extends js.Object {
  
  var all: js.Array[_] = js.native
  
  def cancelTopModal(): Unit = js.native
  
  def closeTopModal(): Unit = js.native
  
  var depth: Double = js.native
  
  def getLatestModal(): Null | String = js.native
  
  def getTopModalOrBody(): String = js.native
  
  var initialized: Boolean = js.native
  
  var stack: js.Array[_] = js.native
}
