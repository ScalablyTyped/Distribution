package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelInput extends StObject {
  
  /**
    * The name of the model.
    */
  var ModelName: typings.awsSdk.clientsSagemakerMod.ModelName
}
object DescribeModelInput {
  
  inline def apply(ModelName: ModelName): DescribeModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelInput] (val x: Self) extends AnyVal {
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
