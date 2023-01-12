package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionErrorItem extends StObject {
  
  /**
    * The details of the error for the schema version.
    */
  var ErrorDetails: js.UndefOr[typings.awsSdk.clientsGlueMod.ErrorDetails] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object SchemaVersionErrorItem {
  
  inline def apply(): SchemaVersionErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionErrorItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaVersionErrorItem] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(value: ErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
