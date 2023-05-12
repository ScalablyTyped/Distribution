package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRotationResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created rotation.
    */
  var RotationArn: SsmContactsArn
}
object CreateRotationResult {
  
  inline def apply(RotationArn: SsmContactsArn): CreateRotationResult = {
    val __obj = js.Dynamic.literal(RotationArn = RotationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRotationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRotationResult] (val x: Self) extends AnyVal {
    
    inline def setRotationArn(value: SsmContactsArn): Self = StObject.set(x, "RotationArn", value.asInstanceOf[js.Any])
  }
}
