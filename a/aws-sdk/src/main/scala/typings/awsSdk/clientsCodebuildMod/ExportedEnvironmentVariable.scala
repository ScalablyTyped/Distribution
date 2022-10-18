package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportedEnvironmentVariable extends StObject {
  
  /**
    * The name of the exported environment variable.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value assigned to the exported environment variable.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ExportedEnvironmentVariable {
  
  inline def apply(): ExportedEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportedEnvironmentVariable]
  }
  
  extension [Self <: ExportedEnvironmentVariable](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
