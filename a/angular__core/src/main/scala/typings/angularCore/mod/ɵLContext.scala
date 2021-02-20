package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵLContext extends StObject {
  
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | Null] = js.native
  
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[_] | Null] = js.native
  
  /**
    * The component's parent view data.
    */
  var lView: ɵangularPackagesCoreCoreBv = js.native
  
  /**
    * The map of local references (local reference name => element or directive instance) that exist
    * on this element.
    */
  var localRefs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode = js.native
  
  /**
    * The index instance of the node.
    */
  var nodeIndex: Double = js.native
}
object ɵLContext {
  
  @scala.inline
  def apply(lView: ɵangularPackagesCoreCoreBv, native: RNode, nodeIndex: Double): ɵLContext = {
    val __obj = js.Dynamic.literal(lView = lView.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵLContext]
  }
  
  @scala.inline
  implicit class ɵLContextMutableBuilder[Self <: ɵLContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: js.Object): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNull: Self = StObject.set(x, "component", null)
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDirectives(value: js.Array[_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesNull: Self = StObject.set(x, "directives", null)
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: js.Any*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setLView(value: ɵangularPackagesCoreCoreBv): Self = StObject.set(x, "lView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalRefs(value: StringDictionary[js.Any]): Self = StObject.set(x, "localRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalRefsNull: Self = StObject.set(x, "localRefs", null)
    
    @scala.inline
    def setLocalRefsUndefined: Self = StObject.set(x, "localRefs", js.undefined)
    
    @scala.inline
    def setNative(value: RNode): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIndex(value: Double): Self = StObject.set(x, "nodeIndex", value.asInstanceOf[js.Any])
  }
}
