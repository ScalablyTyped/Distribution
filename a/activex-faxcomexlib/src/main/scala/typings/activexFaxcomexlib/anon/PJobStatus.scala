package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PJobStatus extends StObject {
  
  val bstrJobId: String
  
  val pFaxServer: FaxServer
  
  val pJobStatus: FaxJobStatus
}
object PJobStatus {
  
  inline def apply(bstrJobId: String, pFaxServer: FaxServer, pJobStatus: FaxJobStatus): PJobStatus = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PJobStatus]
  }
  
  extension [Self <: PJobStatus](x: Self) {
    
    inline def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
    
    inline def setPJobStatus(value: FaxJobStatus): Self = StObject.set(x, "pJobStatus", value.asInstanceOf[js.Any])
  }
}
