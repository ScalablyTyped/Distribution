package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.clientsImportexportMod.ArtifactList] = js.undefined
  
  var Success: js.UndefOr[typings.awsSdk.clientsImportexportMod.Success] = js.undefined
  
  var WarningMessage: js.UndefOr[typings.awsSdk.clientsImportexportMod.WarningMessage] = js.undefined
}
object UpdateJobOutput {
  
  inline def apply(): UpdateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobOutput]
  }
  
  extension [Self <: UpdateJobOutput](x: Self) {
    
    inline def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    inline def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    inline def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value*))
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
    
    inline def setWarningMessage(value: WarningMessage): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
