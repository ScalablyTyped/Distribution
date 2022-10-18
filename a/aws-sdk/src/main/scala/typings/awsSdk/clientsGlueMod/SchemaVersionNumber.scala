package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersionNumber extends StObject {
  
  /**
    * The latest version available for the schema.
    */
  var LatestVersion: js.UndefOr[LatestSchemaVersionBoolean] = js.undefined
  
  /**
    * The version number of the schema.
    */
  var VersionNumber: js.UndefOr[VersionLongNumber] = js.undefined
}
object SchemaVersionNumber {
  
  inline def apply(): SchemaVersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersionNumber]
  }
  
  extension [Self <: SchemaVersionNumber](x: Self) {
    
    inline def setLatestVersion(value: LatestSchemaVersionBoolean): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "LatestVersion", js.undefined)
    
    inline def setVersionNumber(value: VersionLongNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
