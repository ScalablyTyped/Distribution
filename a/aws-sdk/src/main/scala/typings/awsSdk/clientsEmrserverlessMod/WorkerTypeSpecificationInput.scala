package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerTypeSpecificationInput extends StObject {
  
  /**
    * The image configuration for a worker type.
    */
  var imageConfiguration: js.UndefOr[ImageConfigurationInput] = js.undefined
}
object WorkerTypeSpecificationInput {
  
  inline def apply(): WorkerTypeSpecificationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerTypeSpecificationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerTypeSpecificationInput] (val x: Self) extends AnyVal {
    
    inline def setImageConfiguration(value: ImageConfigurationInput): Self = StObject.set(x, "imageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageConfigurationUndefined: Self = StObject.set(x, "imageConfiguration", js.undefined)
  }
}
