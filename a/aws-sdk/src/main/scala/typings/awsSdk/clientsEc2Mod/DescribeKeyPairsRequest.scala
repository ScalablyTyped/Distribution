package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyPairsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.    key-pair-id - The ID of the key pair.    fingerprint - The fingerprint of the key pair.    key-name - The name of the key pair.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * If true, the public key material is included in the response. Default: false 
    */
  var IncludePublicKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key pair names. Default: Describes all of your key pairs.
    */
  var KeyNames: js.UndefOr[KeyNameStringList] = js.undefined
  
  /**
    * The IDs of the key pairs.
    */
  var KeyPairIds: js.UndefOr[KeyPairIdStringList] = js.undefined
}
object DescribeKeyPairsRequest {
  
  inline def apply(): DescribeKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyPairsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeyPairsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIncludePublicKey(value: Boolean): Self = StObject.set(x, "IncludePublicKey", value.asInstanceOf[js.Any])
    
    inline def setIncludePublicKeyUndefined: Self = StObject.set(x, "IncludePublicKey", js.undefined)
    
    inline def setKeyNames(value: KeyNameStringList): Self = StObject.set(x, "KeyNames", value.asInstanceOf[js.Any])
    
    inline def setKeyNamesUndefined: Self = StObject.set(x, "KeyNames", js.undefined)
    
    inline def setKeyNamesVarargs(value: KeyPairName*): Self = StObject.set(x, "KeyNames", js.Array(value*))
    
    inline def setKeyPairIds(value: KeyPairIdStringList): Self = StObject.set(x, "KeyPairIds", value.asInstanceOf[js.Any])
    
    inline def setKeyPairIdsUndefined: Self = StObject.set(x, "KeyPairIds", js.undefined)
    
    inline def setKeyPairIdsVarargs(value: KeyPairId*): Self = StObject.set(x, "KeyPairIds", js.Array(value*))
  }
}
