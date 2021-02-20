package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateManipulators extends StObject {
  
  var postWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
  
  var preWrapper: js.UndefOr[js.Array[ITemplateManipulator]] = js.native
}
object ITemplateManipulators {
  
  @scala.inline
  def apply(): ITemplateManipulators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateManipulators]
  }
  
  @scala.inline
  implicit class ITemplateManipulatorsMutableBuilder[Self <: ITemplateManipulators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostWrapper(value: js.Array[ITemplateManipulator]): Self = StObject.set(x, "postWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostWrapperUndefined: Self = StObject.set(x, "postWrapper", js.undefined)
    
    @scala.inline
    def setPostWrapperVarargs(value: ITemplateManipulator*): Self = StObject.set(x, "postWrapper", js.Array(value :_*))
    
    @scala.inline
    def setPreWrapper(value: js.Array[ITemplateManipulator]): Self = StObject.set(x, "preWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreWrapperUndefined: Self = StObject.set(x, "preWrapper", js.undefined)
    
    @scala.inline
    def setPreWrapperVarargs(value: ITemplateManipulator*): Self = StObject.set(x, "preWrapper", js.Array(value :_*))
  }
}
