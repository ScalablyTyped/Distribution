package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accessor extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accessor. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var Arn: js.UndefOr[ArnString] = js.undefined
  
  /**
    * The billing token is a property of the accessor. Use this token to make Ethereum API calls to your Ethereum node. The billing token is used to track your accessor object for billing Ethereum API requests made to your Ethereum nodes.
    */
  var BillingToken: js.UndefOr[AccessorBillingTokenString] = js.undefined
  
  /**
    * The creation date and time of the accessor.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the accessor.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The current status of the accessor.
    */
  var Status: js.UndefOr[AccessorStatus] = js.undefined
  
  /**
    * The tags assigned to the Accessor. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  var Tags: js.UndefOr[OutputTagMap] = js.undefined
  
  /**
    * The type of the accessor.  Currently, accessor type is restricted to BILLING_TOKEN. 
    */
  var Type: js.UndefOr[AccessorType] = js.undefined
}
object Accessor {
  
  inline def apply(): Accessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Accessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accessor] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ArnString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBillingToken(value: AccessorBillingTokenString): Self = StObject.set(x, "BillingToken", value.asInstanceOf[js.Any])
    
    inline def setBillingTokenUndefined: Self = StObject.set(x, "BillingToken", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStatus(value: AccessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: OutputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: AccessorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
