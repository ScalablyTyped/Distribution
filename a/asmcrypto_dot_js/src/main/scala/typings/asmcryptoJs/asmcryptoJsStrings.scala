package typings.asmcryptoJs

import typings.asmcryptoJs.aesAsmMod.AESMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object asmcryptoJsStrings {
  @js.native
  sealed trait CBC extends AESMode
  
  @js.native
  sealed trait CCM extends AESMode
  
  @js.native
  sealed trait CFB extends AESMode
  
  @js.native
  sealed trait CTR extends AESMode
  
  @js.native
  sealed trait ECB extends AESMode
  
  @js.native
  sealed trait OFB extends AESMode
  
  @scala.inline
  def CBC: CBC = "CBC".asInstanceOf[CBC]
  @scala.inline
  def CCM: CCM = "CCM".asInstanceOf[CCM]
  @scala.inline
  def CFB: CFB = "CFB".asInstanceOf[CFB]
  @scala.inline
  def CTR: CTR = "CTR".asInstanceOf[CTR]
  @scala.inline
  def ECB: ECB = "ECB".asInstanceOf[ECB]
  @scala.inline
  def OFB: OFB = "OFB".asInstanceOf[OFB]
}

