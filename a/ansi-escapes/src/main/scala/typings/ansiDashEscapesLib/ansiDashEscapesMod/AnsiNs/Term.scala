package typings
package ansiDashEscapesLib.ansiDashEscapesMod.AnsiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends js.Object {
  def setCwd(cwd: java.lang.String): java.lang.String
}

object Term {
  @scala.inline
  def apply(setCwd: js.Function1[java.lang.String, java.lang.String]): Term = {
    val __obj = js.Dynamic.literal(setCwd = setCwd)
  
    __obj.asInstanceOf[Term]
  }
}

