package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressDataIdentifier extends StObject {
  
  /**
    * The unique identifier for the custom data identifier or managed data identifier that detected the type of sensitive data to exclude or include in the score.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data identifier; and, MANAGED, for a managed data identifier.
    */
  var `type`: js.UndefOr[DataIdentifierType] = js.undefined
}
object SuppressDataIdentifier {
  
  inline def apply(): SuppressDataIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressDataIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuppressDataIdentifier] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: DataIdentifierType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
