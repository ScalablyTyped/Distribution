package typings.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyClass extends js.Object {
  def setDelegate(delegate: js.Any): Unit
}

object ProxyClass {
  @scala.inline
  def apply(setDelegate: js.Any => Unit): ProxyClass = {
    val __obj = js.Dynamic.literal(setDelegate = js.Any.fromFunction1(setDelegate))
  
    __obj.asInstanceOf[ProxyClass]
  }
}

