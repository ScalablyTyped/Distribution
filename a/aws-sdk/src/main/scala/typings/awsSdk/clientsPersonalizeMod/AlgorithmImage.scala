package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmImage extends StObject {
  
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var dockerURI: DockerURI
  
  /**
    * The name of the algorithm image.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object AlgorithmImage {
  
  inline def apply(dockerURI: DockerURI): AlgorithmImage = {
    val __obj = js.Dynamic.literal(dockerURI = dockerURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmImage]
  }
  
  extension [Self <: AlgorithmImage](x: Self) {
    
    inline def setDockerURI(value: DockerURI): Self = StObject.set(x, "dockerURI", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
