package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataRepositoryAssociationResponse extends StObject {
  
  /**
    * The response object returned after the data repository association is created.
    */
  var Association: js.UndefOr[DataRepositoryAssociation] = js.undefined
}
object CreateDataRepositoryAssociationResponse {
  
  inline def apply(): CreateDataRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataRepositoryAssociationResponse]
  }
  
  extension [Self <: CreateDataRepositoryAssociationResponse](x: Self) {
    
    inline def setAssociation(value: DataRepositoryAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
