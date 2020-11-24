package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RCssStyleDeclaration extends js.Object {
  
  def removeProperty(propertyName: String): String = js.native
  
  def setProperty(propertyName: String): Unit = js.native
  def setProperty(propertyName: String, value: String): Unit = js.native
  def setProperty(propertyName: String, value: String, priority: String): Unit = js.native
  def setProperty(propertyName: String, value: Null, priority: String): Unit = js.native
}
