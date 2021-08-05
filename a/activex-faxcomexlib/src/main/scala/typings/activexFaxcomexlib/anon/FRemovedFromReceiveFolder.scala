package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FRemovedFromReceiveFolder extends StObject {
  
  val bstrMessageId: String
  
  val fRemovedFromReceiveFolder: Boolean
  
  val pFaxAccount: FaxAccount
}
object FRemovedFromReceiveFolder {
  
  inline def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): FRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FRemovedFromReceiveFolder]
  }
  
  extension [Self <: FRemovedFromReceiveFolder](x: Self) {
    
    inline def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    inline def setFRemovedFromReceiveFolder(value: Boolean): Self = StObject.set(x, "fRemovedFromReceiveFolder", value.asInstanceOf[js.Any])
    
    inline def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
