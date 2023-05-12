package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerTypeSpecification extends StObject {
  
  /**
    * The image configuration for a worker type.
    */
  var imageConfiguration: js.UndefOr[ImageConfiguration] = js.undefined
}
object WorkerTypeSpecification {
  
  inline def apply(): WorkerTypeSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerTypeSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerTypeSpecification] (val x: Self) extends AnyVal {
    
    inline def setImageConfiguration(value: ImageConfiguration): Self = StObject.set(x, "imageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageConfigurationUndefined: Self = StObject.set(x, "imageConfiguration", js.undefined)
  }
}
