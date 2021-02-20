package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FRemovedFromReceiveFolder extends StObject {
  
  val bstrMessageId: String = js.native
  
  val fRemovedFromReceiveFolder: Boolean = js.native
  
  val pFaxAccount: FaxAccount = js.native
}
object FRemovedFromReceiveFolder {
  
  @scala.inline
  def apply(bstrMessageId: String, fRemovedFromReceiveFolder: Boolean, pFaxAccount: FaxAccount): FRemovedFromReceiveFolder = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fRemovedFromReceiveFolder = fRemovedFromReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FRemovedFromReceiveFolder]
  }
  
  @scala.inline
  implicit class FRemovedFromReceiveFolderMutableBuilder[Self <: FRemovedFromReceiveFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRemovedFromReceiveFolder(value: Boolean): Self = StObject.set(x, "fRemovedFromReceiveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
