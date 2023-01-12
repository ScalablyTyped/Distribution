package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelResponse extends StObject {
  
  /**
    * Contains the description of the model.
    */
  var ModelDescription: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ModelDescription] = js.undefined
}
object DescribeModelResponse {
  
  inline def apply(): DescribeModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelResponse] (val x: Self) extends AnyVal {
    
    inline def setModelDescription(value: ModelDescription): Self = StObject.set(x, "ModelDescription", value.asInstanceOf[js.Any])
    
    inline def setModelDescriptionUndefined: Self = StObject.set(x, "ModelDescription", js.undefined)
  }
}
