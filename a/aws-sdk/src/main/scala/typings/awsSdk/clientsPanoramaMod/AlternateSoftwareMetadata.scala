package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlternateSoftwareMetadata extends StObject {
  
  /**
    * The appliance software version.
    */
  var Version: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Version] = js.undefined
}
object AlternateSoftwareMetadata {
  
  inline def apply(): AlternateSoftwareMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateSoftwareMetadata]
  }
  
  extension [Self <: AlternateSoftwareMetadata](x: Self) {
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
