package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterType extends StObject {
  
  /**
    * The virtual interface router platform.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Identifies the router by a combination of vendor, platform, and software version. For example, CiscoSystemsInc-2900SeriesRouters-IOS124.
    */
  var routerTypeIdentifier: js.UndefOr[RouterTypeIdentifier] = js.undefined
  
  /**
    * The router software. 
    */
  var software: js.UndefOr[Software] = js.undefined
  
  /**
    * The vendor for the virtual interface's router.
    */
  var vendor: js.UndefOr[Vendor] = js.undefined
  
  /**
    * The template for the virtual interface's router.
    */
  var xsltTemplateName: js.UndefOr[XsltTemplateName] = js.undefined
  
  /**
    * The MAC Security (MACsec) template for the virtual interface's router.
    */
  var xsltTemplateNameForMacSec: js.UndefOr[XsltTemplateNameForMacSec] = js.undefined
}
object RouterType {
  
  inline def apply(): RouterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterType]
  }
  
  extension [Self <: RouterType](x: Self) {
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setRouterTypeIdentifier(value: RouterTypeIdentifier): Self = StObject.set(x, "routerTypeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouterTypeIdentifierUndefined: Self = StObject.set(x, "routerTypeIdentifier", js.undefined)
    
    inline def setSoftware(value: Software): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setVendor(value: Vendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    inline def setXsltTemplateName(value: XsltTemplateName): Self = StObject.set(x, "xsltTemplateName", value.asInstanceOf[js.Any])
    
    inline def setXsltTemplateNameForMacSec(value: XsltTemplateNameForMacSec): Self = StObject.set(x, "xsltTemplateNameForMacSec", value.asInstanceOf[js.Any])
    
    inline def setXsltTemplateNameForMacSecUndefined: Self = StObject.set(x, "xsltTemplateNameForMacSec", js.undefined)
    
    inline def setXsltTemplateNameUndefined: Self = StObject.set(x, "xsltTemplateName", js.undefined)
  }
}
