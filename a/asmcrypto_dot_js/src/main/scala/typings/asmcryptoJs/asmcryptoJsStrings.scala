package typings.asmcryptoJs

import typings.asmcryptoJs.aesAsmMod.AESMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asmcryptoJsStrings {
  
  @js.native
  sealed trait CBC
    extends StObject
       with AESMode
  @scala.inline
  def CBC: CBC = "CBC".asInstanceOf[CBC]
  
  @js.native
  sealed trait CCM
    extends StObject
       with AESMode
  @scala.inline
  def CCM: CCM = "CCM".asInstanceOf[CCM]
  
  @js.native
  sealed trait CFB
    extends StObject
       with AESMode
  @scala.inline
  def CFB: CFB = "CFB".asInstanceOf[CFB]
  
  @js.native
  sealed trait CTR
    extends StObject
       with AESMode
  @scala.inline
  def CTR: CTR = "CTR".asInstanceOf[CTR]
  
  @js.native
  sealed trait ECB
    extends StObject
       with AESMode
  @scala.inline
  def ECB: ECB = "ECB".asInstanceOf[ECB]
  
  @js.native
  sealed trait OFB
    extends StObject
       with AESMode
  @scala.inline
  def OFB: OFB = "OFB".asInstanceOf[OFB]
}
