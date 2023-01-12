package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object RuleGroupMetadata {
  
  inline def apply(): RuleGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
