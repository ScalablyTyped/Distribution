package typings.architect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object architectStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait plugin extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait service extends js.Object
}
