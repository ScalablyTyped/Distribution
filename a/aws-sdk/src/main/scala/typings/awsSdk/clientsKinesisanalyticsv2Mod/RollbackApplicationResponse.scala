package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackApplicationResponse extends StObject {
  
  var ApplicationDetail: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationDetail
}
object RollbackApplicationResponse {
  
  inline def apply(ApplicationDetail: ApplicationDetail): RollbackApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollbackApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationDetail(value: ApplicationDetail): Self = StObject.set(x, "ApplicationDetail", value.asInstanceOf[js.Any])
  }
}
