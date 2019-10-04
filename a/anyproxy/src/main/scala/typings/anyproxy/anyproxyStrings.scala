package typings.anyproxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object anyproxyStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
}

