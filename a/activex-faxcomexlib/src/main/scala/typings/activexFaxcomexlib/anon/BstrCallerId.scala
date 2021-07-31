package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrCallerId extends StObject {
  
  val bstrCallerId: String
  
  val lCallId: Double
  
  val lDeviceId: Double
  
  val pFaxServer: FaxServer
}
object BstrCallerId {
  
  @scala.inline
  def apply(bstrCallerId: String, lCallId: Double, lDeviceId: Double, pFaxServer: FaxServer): BstrCallerId = {
    val __obj = js.Dynamic.literal(bstrCallerId = bstrCallerId.asInstanceOf[js.Any], lCallId = lCallId.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrCallerId]
  }
  
  @scala.inline
  implicit class BstrCallerIdMutableBuilder[Self <: BstrCallerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrCallerId(value: String): Self = StObject.set(x, "bstrCallerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLCallId(value: Double): Self = StObject.set(x, "lCallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDeviceId(value: Double): Self = StObject.set(x, "lDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
