package typings.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeObjectWrapper extends StObject {
  
  var ObjectId: Any
}
object NativeObjectWrapper {
  
  inline def apply(ObjectId: Any): NativeObjectWrapper = {
    val __obj = js.Dynamic.literal(ObjectId = ObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeObjectWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeObjectWrapper] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: Any): Self = StObject.set(x, "ObjectId", value.asInstanceOf[js.Any])
  }
}
