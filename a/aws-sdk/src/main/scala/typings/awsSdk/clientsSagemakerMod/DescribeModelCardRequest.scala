package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelCardRequest extends StObject {
  
  /**
    * The name of the model card to describe.
    */
  var ModelCardName: EntityName
  
  /**
    * The version of the model card to describe. If a version is not provided, then the latest version of the model card is described.
    */
  var ModelCardVersion: js.UndefOr[Integer] = js.undefined
}
object DescribeModelCardRequest {
  
  inline def apply(ModelCardName: EntityName): DescribeModelCardRequest = {
    val __obj = js.Dynamic.literal(ModelCardName = ModelCardName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelCardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelCardRequest] (val x: Self) extends AnyVal {
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersionUndefined: Self = StObject.set(x, "ModelCardVersion", js.undefined)
  }
}
