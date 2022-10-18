package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyProjectVersionResponse extends StObject {
  
  /**
    * The ARN of the copied model version in the destination project. 
    */
  var ProjectVersionArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectVersionArn] = js.undefined
}
object CopyProjectVersionResponse {
  
  inline def apply(): CopyProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyProjectVersionResponse]
  }
  
  extension [Self <: CopyProjectVersionResponse](x: Self) {
    
    inline def setProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "ProjectVersionArn", value.asInstanceOf[js.Any])
    
    inline def setProjectVersionArnUndefined: Self = StObject.set(x, "ProjectVersionArn", js.undefined)
  }
}
