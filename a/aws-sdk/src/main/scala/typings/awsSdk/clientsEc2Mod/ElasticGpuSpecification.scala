package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuSpecification extends StObject {
  
  /**
    * The type of Elastic Graphics accelerator. For more information about the values to specify for Type, see Elastic Graphics Basics, specifically the Elastic Graphics accelerator column, in the Amazon Elastic Compute Cloud User Guide for Windows Instances.
    */
  var Type: String
}
object ElasticGpuSpecification {
  
  inline def apply(Type: String): ElasticGpuSpecification = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpuSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticGpuSpecification] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
