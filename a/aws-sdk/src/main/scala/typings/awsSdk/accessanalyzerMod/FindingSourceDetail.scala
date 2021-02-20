package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingSourceDetail extends StObject {
  
  /**
    * The ARN of the access point that generated the finding.
    */
  var accessPointArn: js.UndefOr[String] = js.native
}
object FindingSourceDetail {
  
  @scala.inline
  def apply(): FindingSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingSourceDetail]
  }
  
  @scala.inline
  implicit class FindingSourceDetailMutableBuilder[Self <: FindingSourceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointArn(value: String): Self = StObject.set(x, "accessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointArnUndefined: Self = StObject.set(x, "accessPointArn", js.undefined)
  }
}
