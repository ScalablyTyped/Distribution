package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginationIdentityMetadata extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * Describes if the origination identity can be used for text messages, voice calls or both.
    */
  var NumberCapabilities: NumberCapabilityList
  
  /**
    * The unique identifier of the origination identity.
    */
  var OriginationIdentity: String
  
  /**
    * The Amazon Resource Name (ARN) associated with the origination identity.
    */
  var OriginationIdentityArn: String
}
object OriginationIdentityMetadata {
  
  inline def apply(
    IsoCountryCode: IsoCountryCode,
    NumberCapabilities: NumberCapabilityList,
    OriginationIdentity: String,
    OriginationIdentityArn: String
  ): OriginationIdentityMetadata = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], NumberCapabilities = NumberCapabilities.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any], OriginationIdentityArn = OriginationIdentityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginationIdentityMetadata]
  }
  
  extension [Self <: OriginationIdentityMetadata](x: Self) {
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setOriginationIdentity(value: String): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArn(value: String): Self = StObject.set(x, "OriginationIdentityArn", value.asInstanceOf[js.Any])
  }
}
