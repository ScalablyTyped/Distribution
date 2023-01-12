package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshareTarget extends StObject {
  
  /**
    * Identifier of the directory consumer account.
    */
  var Id: TargetId
  
  /**
    * Type of identifier to be used in the Id field.
    */
  var Type: TargetType
}
object UnshareTarget {
  
  inline def apply(Id: TargetId, Type: TargetType): UnshareTarget = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshareTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnshareTarget] (val x: Self) extends AnyVal {
    
    inline def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
