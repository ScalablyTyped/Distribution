package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataRepositoryAssociationResponse extends StObject {
  
  /**
    * The response object returned after the data repository association is updated.
    */
  var Association: js.UndefOr[DataRepositoryAssociation] = js.undefined
}
object UpdateDataRepositoryAssociationResponse {
  
  inline def apply(): UpdateDataRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDataRepositoryAssociationResponse]
  }
  
  extension [Self <: UpdateDataRepositoryAssociationResponse](x: Self) {
    
    inline def setAssociation(value: DataRepositoryAssociation): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
