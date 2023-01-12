package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetadataFlagBody extends StObject {
  
  /**
    * The new information to store.
    */
  var newValue: String
}
object PutMetadataFlagBody {
  
  inline def apply(newValue: String): PutMetadataFlagBody = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetadataFlagBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutMetadataFlagBody] (val x: Self) extends AnyVal {
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
