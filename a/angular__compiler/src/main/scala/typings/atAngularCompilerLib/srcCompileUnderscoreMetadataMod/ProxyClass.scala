package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyClass extends js.Object {
  def setDelegate(delegate: js.Any): scala.Unit
}

object ProxyClass {
  @scala.inline
  def apply(setDelegate: js.Function1[js.Any, scala.Unit]): ProxyClass = {
    val __obj = js.Dynamic.literal(setDelegate = setDelegate)
  
    __obj.asInstanceOf[ProxyClass]
  }
}

