package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrMessageId extends StObject {
  
  val bstrMessageId: String
  
  val fAddedToReceiveFolder: Boolean
  
  val pFaxAccount: FaxAccount
}
object BstrMessageId {
  
  inline def apply(bstrMessageId: String, fAddedToReceiveFolder: Boolean, pFaxAccount: FaxAccount): BstrMessageId = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fAddedToReceiveFolder = fAddedToReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageId]
  }
  
  extension [Self <: BstrMessageId](x: Self) {
    
    inline def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    inline def setFAddedToReceiveFolder(value: Boolean): Self = StObject.set(x, "fAddedToReceiveFolder", value.asInstanceOf[js.Any])
    
    inline def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
