package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIPSetResponse extends StObject {
  
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat
  
  /**
    * The URI of the file that contains the IPSet.
    */
  var Location: typings.awsSdk.clientsGuarddutyMod.Location
  
  /**
    * The user-friendly name for the IPSet.
    */
  var Name: typings.awsSdk.clientsGuarddutyMod.Name
  
  /**
    * The status of IPSet file that was uploaded.
    */
  var Status: IpSetStatus
  
  /**
    * The tags of the IPSet resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object GetIPSetResponse {
  
  inline def apply(Format: IpSetFormat, Location: Location, Name: Name, Status: IpSetStatus): GetIPSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
  
  extension [Self <: GetIPSetResponse](x: Self) {
    
    inline def setFormat(value: IpSetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: IpSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
