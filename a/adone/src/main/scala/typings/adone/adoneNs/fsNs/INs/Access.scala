package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Access extends js.Object {
  var execute: Boolean
  var read: Boolean
  var write: Boolean
}

object Access {
  @scala.inline
  def apply(execute: Boolean, read: Boolean, write: Boolean): Access = {
    val __obj = js.Dynamic.literal(execute = execute, read = read, write = write)
  
    __obj.asInstanceOf[Access]
  }
}

