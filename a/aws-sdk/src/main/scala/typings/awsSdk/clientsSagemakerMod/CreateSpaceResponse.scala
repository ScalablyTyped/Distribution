package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSpaceResponse extends StObject {
  
  /**
    * The space's Amazon Resource Name (ARN).
    */
  var SpaceArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceArn] = js.undefined
}
object CreateSpaceResponse {
  
  inline def apply(): CreateSpaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSpaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSpaceResponse] (val x: Self) extends AnyVal {
    
    inline def setSpaceArn(value: SpaceArn): Self = StObject.set(x, "SpaceArn", value.asInstanceOf[js.Any])
    
    inline def setSpaceArnUndefined: Self = StObject.set(x, "SpaceArn", js.undefined)
  }
}
