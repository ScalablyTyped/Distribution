package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VcenterClient extends StObject {
  
  /**
    * Arn of vCenter client.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Datacenter name of vCenter client.
    */
  var datacenterName: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Hostname of vCenter client .
    */
  var hostname: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * Last seen time of vCenter client.
    */
  var lastSeenDatetime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Tags for Source Server of vCenter client.
    */
  var sourceServerTags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * Tags for vCenter client.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * ID of vCenter client.
    */
  var vcenterClientID: js.UndefOr[VcenterClientID] = js.undefined
  
  /**
    * Vcenter UUID of vCenter client.
    */
  var vcenterUUID: js.UndefOr[BoundedString] = js.undefined
}
object VcenterClient {
  
  inline def apply(): VcenterClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcenterClient]
  }
  
  extension [Self <: VcenterClient](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDatacenterName(value: BoundedString): Self = StObject.set(x, "datacenterName", value.asInstanceOf[js.Any])
    
    inline def setDatacenterNameUndefined: Self = StObject.set(x, "datacenterName", js.undefined)
    
    inline def setHostname(value: BoundedString): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setLastSeenDatetime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastSeenDatetime", value.asInstanceOf[js.Any])
    
    inline def setLastSeenDatetimeUndefined: Self = StObject.set(x, "lastSeenDatetime", js.undefined)
    
    inline def setSourceServerTags(value: TagsMap): Self = StObject.set(x, "sourceServerTags", value.asInstanceOf[js.Any])
    
    inline def setSourceServerTagsUndefined: Self = StObject.set(x, "sourceServerTags", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setVcenterClientID(value: VcenterClientID): Self = StObject.set(x, "vcenterClientID", value.asInstanceOf[js.Any])
    
    inline def setVcenterClientIDUndefined: Self = StObject.set(x, "vcenterClientID", js.undefined)
    
    inline def setVcenterUUID(value: BoundedString): Self = StObject.set(x, "vcenterUUID", value.asInstanceOf[js.Any])
    
    inline def setVcenterUUIDUndefined: Self = StObject.set(x, "vcenterUUID", js.undefined)
  }
}
