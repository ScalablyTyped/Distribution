package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingSourceDetail extends StObject {
  
  /**
    * The ARN of the access point that generated the finding.
    */
  var accessPointArn: js.UndefOr[String] = js.undefined
}
object FindingSourceDetail {
  
  inline def apply(): FindingSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingSourceDetail]
  }
  
  extension [Self <: FindingSourceDetail](x: Self) {
    
    inline def setAccessPointArn(value: String): Self = StObject.set(x, "accessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "accessPointArn", js.undefined)
  }
}
