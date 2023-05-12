package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueDetectionConfiguration extends StObject {
  
  /**
    * The name of the issue detection rule.
    */
  var RuleName: typings.awsSdk.clientsChimesdkmediapipelinesMod.RuleName
}
object IssueDetectionConfiguration {
  
  inline def apply(RuleName: RuleName): IssueDetectionConfiguration = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueDetectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssueDetectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
  }
}
