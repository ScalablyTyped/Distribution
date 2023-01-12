package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSigning extends StObject {
  
  /**
    * The ID of the AWSSignerJob which was created to sign the file.
    */
  var awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined
  
  /**
    * A custom method for code signing a file.
    */
  var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined
  
  /**
    * Describes the code-signing job.
    */
  var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined
}
object CodeSigning {
  
  inline def apply(): CodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeSigning] (val x: Self) extends AnyVal {
    
    inline def setAwsSignerJobId(value: SigningJobId): Self = StObject.set(x, "awsSignerJobId", value.asInstanceOf[js.Any])
    
    inline def setAwsSignerJobIdUndefined: Self = StObject.set(x, "awsSignerJobId", js.undefined)
    
    inline def setCustomCodeSigning(value: CustomCodeSigning): Self = StObject.set(x, "customCodeSigning", value.asInstanceOf[js.Any])
    
    inline def setCustomCodeSigningUndefined: Self = StObject.set(x, "customCodeSigning", js.undefined)
    
    inline def setStartSigningJobParameter(value: StartSigningJobParameter): Self = StObject.set(x, "startSigningJobParameter", value.asInstanceOf[js.Any])
    
    inline def setStartSigningJobParameterUndefined: Self = StObject.set(x, "startSigningJobParameter", js.undefined)
  }
}
