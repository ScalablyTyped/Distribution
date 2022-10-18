package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFacetResponse extends StObject {
  
  /**
    * The Facet structure that is associated with the facet.
    */
  var Facet: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.Facet] = js.undefined
}
object GetFacetResponse {
  
  inline def apply(): GetFacetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFacetResponse]
  }
  
  extension [Self <: GetFacetResponse](x: Self) {
    
    inline def setFacet(value: Facet): Self = StObject.set(x, "Facet", value.asInstanceOf[js.Any])
    
    inline def setFacetUndefined: Self = StObject.set(x, "Facet", js.undefined)
  }
}
