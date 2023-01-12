package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSigningJobParameter extends StObject {
  
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.undefined
  
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.undefined
  
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined
}
object StartSigningJobParameter {
  
  inline def apply(): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSigningJobParameter] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSigningProfileName(value: SigningProfileName): Self = StObject.set(x, "signingProfileName", value.asInstanceOf[js.Any])
    
    inline def setSigningProfileNameUndefined: Self = StObject.set(x, "signingProfileName", js.undefined)
    
    inline def setSigningProfileParameter(value: SigningProfileParameter): Self = StObject.set(x, "signingProfileParameter", value.asInstanceOf[js.Any])
    
    inline def setSigningProfileParameterUndefined: Self = StObject.set(x, "signingProfileParameter", js.undefined)
  }
}
