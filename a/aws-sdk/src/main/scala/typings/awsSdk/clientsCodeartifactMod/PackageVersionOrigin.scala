package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionOrigin extends StObject {
  
  /**
    * A DomainEntryPoint object that contains information about from which repository or external connection the package version was added to the domain.
    */
  var domainEntryPoint: js.UndefOr[DomainEntryPoint] = js.undefined
  
  /**
    * Describes how the package version was originally added to the domain. An INTERNAL origin type means the package version was published directly to a repository in the domain. An EXTERNAL origin type means the package version was ingested from an external connection.
    */
  var originType: js.UndefOr[PackageVersionOriginType] = js.undefined
}
object PackageVersionOrigin {
  
  inline def apply(): PackageVersionOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionOrigin]
  }
  
  extension [Self <: PackageVersionOrigin](x: Self) {
    
    inline def setDomainEntryPoint(value: DomainEntryPoint): Self = StObject.set(x, "domainEntryPoint", value.asInstanceOf[js.Any])
    
    inline def setDomainEntryPointUndefined: Self = StObject.set(x, "domainEntryPoint", js.undefined)
    
    inline def setOriginType(value: PackageVersionOriginType): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    inline def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
  }
}
