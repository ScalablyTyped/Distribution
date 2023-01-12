package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingSourceDetail extends StObject {
  
  /**
    * The ARN of the access point that generated the finding. The ARN format depends on whether the ARN represents an access point or a multi-region access point.
    */
  var accessPointArn: js.UndefOr[String] = js.undefined
}
object FindingSourceDetail {
  
  inline def apply(): FindingSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingSourceDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingSourceDetail] (val x: Self) extends AnyVal {
    
    inline def setAccessPointArn(value: String): Self = StObject.set(x, "accessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "accessPointArn", js.undefined)
  }
}
