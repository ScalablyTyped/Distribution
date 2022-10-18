package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageOriginRestrictions extends StObject {
  
  /**
    * The package origin configuration that determines if new versions of the package can be published directly to the repository.
    */
  var publish: AllowPublish
  
  /**
    * The package origin configuration that determines if new versions of the package can be added to the repository from an external connection or upstream source.
    */
  var upstream: AllowUpstream
}
object PackageOriginRestrictions {
  
  inline def apply(publish: AllowPublish, upstream: AllowUpstream): PackageOriginRestrictions = {
    val __obj = js.Dynamic.literal(publish = publish.asInstanceOf[js.Any], upstream = upstream.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageOriginRestrictions]
  }
  
  extension [Self <: PackageOriginRestrictions](x: Self) {
    
    inline def setPublish(value: AllowPublish): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setUpstream(value: AllowUpstream): Self = StObject.set(x, "upstream", value.asInstanceOf[js.Any])
  }
}
