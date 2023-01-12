package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiRegionAccessPointInput extends StObject {
  
  /**
    * The name of the Multi-Region Access Point associated with this request.
    */
  var Name: MultiRegionAccessPointName
}
object DeleteMultiRegionAccessPointInput {
  
  inline def apply(Name: MultiRegionAccessPointName): DeleteMultiRegionAccessPointInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiRegionAccessPointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMultiRegionAccessPointInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: MultiRegionAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
