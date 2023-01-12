package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountCustomizationRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that you want to describe Amazon QuickSight customizations for.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The Amazon QuickSight namespace that you want to describe Amazon QuickSight customizations for.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
  
  /**
    * The Resolved flag works with the other parameters to determine which view of Amazon QuickSight customizations is returned. You can add this flag to your command to use the same view that Amazon QuickSight uses to identify which customizations to apply to the console. Omit this flag, or set it to no-resolved, to reveal customizations that are configured at different levels. 
    */
  var Resolved: js.UndefOr[scala.Boolean] = js.undefined
}
object DescribeAccountCustomizationRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DescribeAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountCustomizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountCustomizationRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setResolved(value: scala.Boolean): Self = StObject.set(x, "Resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "Resolved", js.undefined)
  }
}
