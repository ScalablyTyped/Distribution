package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInfo extends StObject {
  
  /**
    * The index of the default network card, starting at 0.
    */
  var DefaultNetworkCardIndex: js.UndefOr[typings.awsSdk.clientsEc2Mod.DefaultNetworkCardIndex] = js.undefined
  
  /**
    * Describes the Elastic Fabric Adapters for the instance type.
    */
  var EfaInfo: js.UndefOr[typings.awsSdk.clientsEc2Mod.EfaInfo] = js.undefined
  
  /**
    * Indicates whether Elastic Fabric Adapter (EFA) is supported.
    */
  var EfaSupported: js.UndefOr[EfaSupportedFlag] = js.undefined
  
  /**
    * Indicates whether Elastic Network Adapter (ENA) is supported.
    */
  var EnaSupport: js.UndefOr[typings.awsSdk.clientsEc2Mod.EnaSupport] = js.undefined
  
  /**
    * Indicates whether the instance type automatically encrypts in-transit traffic between instances.
    */
  var EncryptionInTransitSupported: js.UndefOr[typings.awsSdk.clientsEc2Mod.EncryptionInTransitSupported] = js.undefined
  
  /**
    * The maximum number of IPv4 addresses per network interface.
    */
  var Ipv4AddressesPerInterface: js.UndefOr[MaxIpv4AddrPerInterface] = js.undefined
  
  /**
    * The maximum number of IPv6 addresses per network interface.
    */
  var Ipv6AddressesPerInterface: js.UndefOr[MaxIpv6AddrPerInterface] = js.undefined
  
  /**
    * Indicates whether IPv6 is supported.
    */
  var Ipv6Supported: js.UndefOr[Ipv6Flag] = js.undefined
  
  /**
    * The maximum number of physical network cards that can be allocated to the instance.
    */
  var MaximumNetworkCards: js.UndefOr[typings.awsSdk.clientsEc2Mod.MaximumNetworkCards] = js.undefined
  
  /**
    * The maximum number of network interfaces for the instance type.
    */
  var MaximumNetworkInterfaces: js.UndefOr[MaxNetworkInterfaces] = js.undefined
  
  /**
    * Describes the network cards for the instance type.
    */
  var NetworkCards: js.UndefOr[NetworkCardInfoList] = js.undefined
  
  /**
    * The network performance.
    */
  var NetworkPerformance: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkPerformance] = js.undefined
}
object NetworkInfo {
  
  inline def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
    inline def setDefaultNetworkCardIndex(value: DefaultNetworkCardIndex): Self = StObject.set(x, "DefaultNetworkCardIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultNetworkCardIndexUndefined: Self = StObject.set(x, "DefaultNetworkCardIndex", js.undefined)
    
    inline def setEfaInfo(value: EfaInfo): Self = StObject.set(x, "EfaInfo", value.asInstanceOf[js.Any])
    
    inline def setEfaInfoUndefined: Self = StObject.set(x, "EfaInfo", js.undefined)
    
    inline def setEfaSupported(value: EfaSupportedFlag): Self = StObject.set(x, "EfaSupported", value.asInstanceOf[js.Any])
    
    inline def setEfaSupportedUndefined: Self = StObject.set(x, "EfaSupported", js.undefined)
    
    inline def setEnaSupport(value: EnaSupport): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setEncryptionInTransitSupported(value: EncryptionInTransitSupported): Self = StObject.set(x, "EncryptionInTransitSupported", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInTransitSupportedUndefined: Self = StObject.set(x, "EncryptionInTransitSupported", js.undefined)
    
    inline def setIpv4AddressesPerInterface(value: MaxIpv4AddrPerInterface): Self = StObject.set(x, "Ipv4AddressesPerInterface", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressesPerInterfaceUndefined: Self = StObject.set(x, "Ipv4AddressesPerInterface", js.undefined)
    
    inline def setIpv6AddressesPerInterface(value: MaxIpv6AddrPerInterface): Self = StObject.set(x, "Ipv6AddressesPerInterface", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesPerInterfaceUndefined: Self = StObject.set(x, "Ipv6AddressesPerInterface", js.undefined)
    
    inline def setIpv6Supported(value: Ipv6Flag): Self = StObject.set(x, "Ipv6Supported", value.asInstanceOf[js.Any])
    
    inline def setIpv6SupportedUndefined: Self = StObject.set(x, "Ipv6Supported", js.undefined)
    
    inline def setMaximumNetworkCards(value: MaximumNetworkCards): Self = StObject.set(x, "MaximumNetworkCards", value.asInstanceOf[js.Any])
    
    inline def setMaximumNetworkCardsUndefined: Self = StObject.set(x, "MaximumNetworkCards", js.undefined)
    
    inline def setMaximumNetworkInterfaces(value: MaxNetworkInterfaces): Self = StObject.set(x, "MaximumNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setMaximumNetworkInterfacesUndefined: Self = StObject.set(x, "MaximumNetworkInterfaces", js.undefined)
    
    inline def setNetworkCards(value: NetworkCardInfoList): Self = StObject.set(x, "NetworkCards", value.asInstanceOf[js.Any])
    
    inline def setNetworkCardsUndefined: Self = StObject.set(x, "NetworkCards", js.undefined)
    
    inline def setNetworkCardsVarargs(value: NetworkCardInfo*): Self = StObject.set(x, "NetworkCards", js.Array(value*))
    
    inline def setNetworkPerformance(value: NetworkPerformance): Self = StObject.set(x, "NetworkPerformance", value.asInstanceOf[js.Any])
    
    inline def setNetworkPerformanceUndefined: Self = StObject.set(x, "NetworkPerformance", js.undefined)
  }
}
