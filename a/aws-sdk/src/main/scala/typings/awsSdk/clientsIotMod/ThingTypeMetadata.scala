package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingTypeMetadata extends StObject {
  
  /**
    * The date and time when the thing type was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time when the thing type was deprecated.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.undefined
}
object ThingTypeMetadata {
  
  inline def apply(): ThingTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeMetadata]
  }
  
  extension [Self <: ThingTypeMetadata](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDeprecationDate(value: js.Date): Self = StObject.set(x, "deprecationDate", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDateUndefined: Self = StObject.set(x, "deprecationDate", js.undefined)
  }
}
