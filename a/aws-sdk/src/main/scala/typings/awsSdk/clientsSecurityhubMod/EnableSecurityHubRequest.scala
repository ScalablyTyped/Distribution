package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSecurityHubRequest extends StObject {
  
  /**
    * This field, used when enabling Security Hub, specifies whether the calling account has consolidated control findings turned on. If the value for this field is set to SECURITY_CONTROL, Security Hub generates a single finding for a control check even when the check applies to multiple enabled standards. If the value for this field is set to STANDARD_CONTROL, Security Hub generates separate findings for a control check when the check applies to multiple enabled standards. The value for this field in a member account matches the value in the administrator account. For accounts that aren't part of an organization, the default value of this field is SECURITY_CONTROL if you enabled Security Hub on or after February 23, 2023.
    */
  var ControlFindingGenerator: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.ControlFindingGenerator] = js.undefined
  
  /**
    * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for EnableDefaultStandards, it is set to true. To not enable the automatically enabled standards, set EnableDefaultStandards to false.
    */
  var EnableDefaultStandards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags to add to the hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object EnableSecurityHubRequest {
  
  inline def apply(): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableSecurityHubRequest] (val x: Self) extends AnyVal {
    
    inline def setControlFindingGenerator(value: ControlFindingGenerator): Self = StObject.set(x, "ControlFindingGenerator", value.asInstanceOf[js.Any])
    
    inline def setControlFindingGeneratorUndefined: Self = StObject.set(x, "ControlFindingGenerator", js.undefined)
    
    inline def setEnableDefaultStandards(value: Boolean): Self = StObject.set(x, "EnableDefaultStandards", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultStandardsUndefined: Self = StObject.set(x, "EnableDefaultStandards", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
