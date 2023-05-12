package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInsightsPath extends StObject {
  
  /**
    * The time stamp when the path was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the destination.
    */
  var Destination: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var DestinationArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The IP address of the destination.
    */
  var DestinationIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The destination port.
    */
  var DestinationPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * Scopes the analysis to network paths that match specific filters at the destination.
    */
  var FilterAtDestination: js.UndefOr[PathFilter] = js.undefined
  
  /**
    * Scopes the analysis to network paths that match specific filters at the source.
    */
  var FilterAtSource: js.UndefOr[PathFilter] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the path.
    */
  var NetworkInsightsPathArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the path.
    */
  var NetworkInsightsPathId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsPathId] = js.undefined
  
  /**
    * The protocol.
    */
  var Protocol: js.UndefOr[typings.awsSdk.clientsEc2Mod.Protocol] = js.undefined
  
  /**
    * The ID of the source.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The IP address of the source.
    */
  var SourceIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The tags associated with the path.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object NetworkInsightsPath {
  
  inline def apply(): NetworkInsightsPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInsightsPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInsightsPath] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: ResourceArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setDestinationIp(value: IpAddress): Self = StObject.set(x, "DestinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpUndefined: Self = StObject.set(x, "DestinationIp", js.undefined)
    
    inline def setDestinationPort(value: Integer): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "DestinationPort", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setFilterAtDestination(value: PathFilter): Self = StObject.set(x, "FilterAtDestination", value.asInstanceOf[js.Any])
    
    inline def setFilterAtDestinationUndefined: Self = StObject.set(x, "FilterAtDestination", js.undefined)
    
    inline def setFilterAtSource(value: PathFilter): Self = StObject.set(x, "FilterAtSource", value.asInstanceOf[js.Any])
    
    inline def setFilterAtSourceUndefined: Self = StObject.set(x, "FilterAtSource", js.undefined)
    
    inline def setNetworkInsightsPathArn(value: ResourceArn): Self = StObject.set(x, "NetworkInsightsPathArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathArnUndefined: Self = StObject.set(x, "NetworkInsightsPathArn", js.undefined)
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathIdUndefined: Self = StObject.set(x, "NetworkInsightsPathId", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: ResourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setSourceIp(value: IpAddress): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
