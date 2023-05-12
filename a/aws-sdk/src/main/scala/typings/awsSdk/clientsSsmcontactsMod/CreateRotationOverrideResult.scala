package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRotationOverrideResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created rotation override.
    */
  var RotationOverrideId: Uuid
}
object CreateRotationOverrideResult {
  
  inline def apply(RotationOverrideId: Uuid): CreateRotationOverrideResult = {
    val __obj = js.Dynamic.literal(RotationOverrideId = RotationOverrideId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRotationOverrideResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRotationOverrideResult] (val x: Self) extends AnyVal {
    
    inline def setRotationOverrideId(value: Uuid): Self = StObject.set(x, "RotationOverrideId", value.asInstanceOf[js.Any])
  }
}
