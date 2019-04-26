package typings
package architectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object architectLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait plugin extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait service extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def service: service = "service".asInstanceOf[service]
}

