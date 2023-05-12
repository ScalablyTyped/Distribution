package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitivityInspectionTemplatesEntry extends StObject {
  
  /**
    * The unique identifier for the sensitivity inspection template.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the sensitivity inspection template: automated-sensitive-data-discovery.
    */
  var name: js.UndefOr[string] = js.undefined
}
object SensitivityInspectionTemplatesEntry {
  
  inline def apply(): SensitivityInspectionTemplatesEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitivityInspectionTemplatesEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityInspectionTemplatesEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
