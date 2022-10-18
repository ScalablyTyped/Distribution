package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticKeyProvider extends StObject {
  
  /**
    * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS string. May be omitted to indicate an implicit value of 'identity'.
    */
  var KeyFormat: js.UndefOr[stringPatternIdentityAZaZ26AZaZ09163] = js.undefined
  
  /**
    * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of version values (1/2/3).
    */
  var KeyFormatVersions: js.UndefOr[stringPatternDD] = js.undefined
  
  /**
    * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
    */
  var StaticKeyValue: js.UndefOr[stringPatternAZaZ0932] = js.undefined
  
  /**
    * Relates to DRM implementation. The location of the license server used for protecting content.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object StaticKeyProvider {
  
  inline def apply(): StaticKeyProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticKeyProvider]
  }
  
  extension [Self <: StaticKeyProvider](x: Self) {
    
    inline def setKeyFormat(value: stringPatternIdentityAZaZ26AZaZ09163): Self = StObject.set(x, "KeyFormat", value.asInstanceOf[js.Any])
    
    inline def setKeyFormatUndefined: Self = StObject.set(x, "KeyFormat", js.undefined)
    
    inline def setKeyFormatVersions(value: stringPatternDD): Self = StObject.set(x, "KeyFormatVersions", value.asInstanceOf[js.Any])
    
    inline def setKeyFormatVersionsUndefined: Self = StObject.set(x, "KeyFormatVersions", js.undefined)
    
    inline def setStaticKeyValue(value: stringPatternAZaZ0932): Self = StObject.set(x, "StaticKeyValue", value.asInstanceOf[js.Any])
    
    inline def setStaticKeyValueUndefined: Self = StObject.set(x, "StaticKeyValue", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
