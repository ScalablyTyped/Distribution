package typings.activeWin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object activeWinStrings {
  @js.native
  sealed trait linux extends js.Object
  
  @js.native
  sealed trait macos extends js.Object
  
  @js.native
  sealed trait windows extends js.Object
  
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def macos: macos = "macos".asInstanceOf[macos]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

