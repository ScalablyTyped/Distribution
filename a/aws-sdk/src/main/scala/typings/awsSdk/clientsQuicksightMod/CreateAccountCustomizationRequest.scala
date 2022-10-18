package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccountCustomizationRequest extends StObject {
  
  /**
    * The Amazon QuickSight customizations you're adding in the current Amazon Web Services Region. You can add these to an Amazon Web Services account and a QuickSight namespace.  For example, you can add a default theme by setting AccountCustomization to the midnight theme: "AccountCustomization": { "DefaultTheme": "arn:aws:quicksight::aws:theme/MIDNIGHT" }. Or, you can add a custom theme by specifying "AccountCustomization": { "DefaultTheme": "arn:aws:quicksight:us-west-2:111122223333:theme/bdb844d0-0fe9-4d9d-b520-0fe602d93639" }. 
    */
  var AccountCustomization: typings.awsSdk.clientsQuicksightMod.AccountCustomization
  
  /**
    * The ID for the Amazon Web Services account that you want to customize Amazon QuickSight for.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The Amazon QuickSight namespace that you want to add customizations to.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
  
  /**
    * A list of the tags that you want to attach to this resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAccountCustomizationRequest {
  
  inline def apply(AccountCustomization: AccountCustomization, AwsAccountId: AwsAccountId): CreateAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AccountCustomization = AccountCustomization.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountCustomizationRequest]
  }
  
  extension [Self <: CreateAccountCustomizationRequest](x: Self) {
    
    inline def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
