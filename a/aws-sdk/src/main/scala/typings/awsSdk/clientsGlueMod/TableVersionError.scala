package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableVersionError extends StObject {
  
  /**
    * The details about the error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.clientsGlueMod.ErrorDetail] = js.undefined
  
  /**
    * The name of the table in question.
    */
  var TableName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The ID value of the version in question. A VersionID is a string representation of an integer. Each version is incremented by 1.
    */
  var VersionId: js.UndefOr[VersionString] = js.undefined
}
object TableVersionError {
  
  inline def apply(): TableVersionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableVersionError]
  }
  
  extension [Self <: TableVersionError](x: Self) {
    
    inline def setErrorDetail(value: ErrorDetail): Self = StObject.set(x, "ErrorDetail", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailUndefined: Self = StObject.set(x, "ErrorDetail", js.undefined)
    
    inline def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setVersionId(value: VersionString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
