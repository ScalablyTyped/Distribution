package typings.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("allure-js-commons", "Suite")
@js.native
class Suite protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, timestamp: Double) = this()
  
  def addTest(test: Test): Boolean = js.native
  
  def end(): Unit = js.native
  def end(timestamp: Double): Unit = js.native
  
  def hasTests(): Boolean = js.native
  
  var name: String = js.native
  
  def toXML(): String = js.native
}
