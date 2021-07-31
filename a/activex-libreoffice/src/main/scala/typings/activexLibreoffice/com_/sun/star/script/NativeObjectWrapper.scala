package typings.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeObjectWrapper extends StObject {
  
  var ObjectId: js.Any
}
object NativeObjectWrapper {
  
  @scala.inline
  def apply(ObjectId: js.Any): NativeObjectWrapper = {
    val __obj = js.Dynamic.literal(ObjectId = ObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeObjectWrapper]
  }
  
  @scala.inline
  implicit class NativeObjectWrapperMutableBuilder[Self <: NativeObjectWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: js.Any): Self = StObject.set(x, "ObjectId", value.asInstanceOf[js.Any])
  }
}
