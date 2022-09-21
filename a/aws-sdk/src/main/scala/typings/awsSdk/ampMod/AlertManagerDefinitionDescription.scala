package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlertManagerDefinitionDescription extends StObject {
  
  /**
    * The time when the alert manager definition was created.
    */
  var createdAt: js.Date
  
  /**
    * The alert manager definition.
    */
  var data: AlertManagerDefinitionData
  
  /**
    * The time when the alert manager definition was modified.
    */
  var modifiedAt: js.Date
  
  /**
    * The status of alert manager definition.
    */
  var status: AlertManagerDefinitionStatus
}
object AlertManagerDefinitionDescription {
  
  inline def apply(
    createdAt: js.Date,
    data: AlertManagerDefinitionData,
    modifiedAt: js.Date,
    status: AlertManagerDefinitionStatus
  ): AlertManagerDefinitionDescription = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertManagerDefinitionDescription]
  }
  
  extension [Self <: AlertManagerDefinitionDescription](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setData(value: AlertManagerDefinitionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AlertManagerDefinitionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
