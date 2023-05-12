package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingImageConfig extends StObject {
  
  /**
    * The method that your training job will use to gain access to the images in your private Docker registry. For access to an image in a private Docker registry, set to Vpc.
    */
  var TrainingRepositoryAccessMode: typings.awsSdk.clientsSagemakerMod.TrainingRepositoryAccessMode
  
  /**
    * An object containing authentication information for a private Docker registry containing your training images.
    */
  var TrainingRepositoryAuthConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingRepositoryAuthConfig] = js.undefined
}
object TrainingImageConfig {
  
  inline def apply(TrainingRepositoryAccessMode: TrainingRepositoryAccessMode): TrainingImageConfig = {
    val __obj = js.Dynamic.literal(TrainingRepositoryAccessMode = TrainingRepositoryAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingImageConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingImageConfig] (val x: Self) extends AnyVal {
    
    inline def setTrainingRepositoryAccessMode(value: TrainingRepositoryAccessMode): Self = StObject.set(x, "TrainingRepositoryAccessMode", value.asInstanceOf[js.Any])
    
    inline def setTrainingRepositoryAuthConfig(value: TrainingRepositoryAuthConfig): Self = StObject.set(x, "TrainingRepositoryAuthConfig", value.asInstanceOf[js.Any])
    
    inline def setTrainingRepositoryAuthConfigUndefined: Self = StObject.set(x, "TrainingRepositoryAuthConfig", js.undefined)
  }
}
