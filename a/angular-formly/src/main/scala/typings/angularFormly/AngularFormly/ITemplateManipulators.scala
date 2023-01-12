package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplateManipulators extends StObject {
  
  var postWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.undefined
  
  var preWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.undefined
}
object ITemplateManipulators {
  
  inline def apply(): ITemplateManipulators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateManipulators]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITemplateManipulators] (val x: Self) extends AnyVal {
    
    inline def setPostWrapper(value: js.Array[ITemplateManipulator]): Self = StObject.set(x, "postWrapper", value.asInstanceOf[js.Any])
    
    inline def setPostWrapperUndefined: Self = StObject.set(x, "postWrapper", js.undefined)
    
    inline def setPostWrapperVarargs(value: ITemplateManipulator*): Self = StObject.set(x, "postWrapper", js.Array(value*))
    
    inline def setPreWrapper(value: js.Array[ITemplateManipulator]): Self = StObject.set(x, "preWrapper", value.asInstanceOf[js.Any])
    
    inline def setPreWrapperUndefined: Self = StObject.set(x, "preWrapper", js.undefined)
    
    inline def setPreWrapperVarargs(value: ITemplateManipulator*): Self = StObject.set(x, "preWrapper", js.Array(value*))
  }
}
