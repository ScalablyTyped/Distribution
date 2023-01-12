package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCidrCollectionResponse extends StObject {
  
  /**
    * A complex type that contains information about the CIDR collection.
    */
  var Collection: js.UndefOr[CidrCollection] = js.undefined
  
  /**
    * A unique URL that represents the location for the CIDR collection.
    */
  var Location: js.UndefOr[ResourceURI] = js.undefined
}
object CreateCidrCollectionResponse {
  
  inline def apply(): CreateCidrCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCidrCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCidrCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: CidrCollection): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "Collection", js.undefined)
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
