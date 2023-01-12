package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstalledComponentsResponse extends StObject {
  
  /**
    * A list that summarizes each component on the core device.  Greengrass nucleus v2.7.0 or later is required to get an accurate lastStatusChangeTimestamp response. This response can be inaccurate in earlier Greengrass nucleus versions.   Greengrass nucleus v2.8.0 or later is required to get an accurate lastInstallationSource and lastReportedTimestamp response. This response can be inaccurate or null in earlier Greengrass nucleus versions. 
    */
  var installedComponents: js.UndefOr[InstalledComponentList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
}
object ListInstalledComponentsResponse {
  
  inline def apply(): ListInstalledComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstalledComponentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstalledComponentsResponse] (val x: Self) extends AnyVal {
    
    inline def setInstalledComponents(value: InstalledComponentList): Self = StObject.set(x, "installedComponents", value.asInstanceOf[js.Any])
    
    inline def setInstalledComponentsUndefined: Self = StObject.set(x, "installedComponents", js.undefined)
    
    inline def setInstalledComponentsVarargs(value: InstalledComponent*): Self = StObject.set(x, "installedComponents", js.Array(value*))
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
