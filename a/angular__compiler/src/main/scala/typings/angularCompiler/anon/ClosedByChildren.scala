package typings.angularCompiler.anon

import typings.angularCompiler.tagsMod.TagContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedByChildren extends StObject {
  
  var closedByChildren: js.UndefOr[js.Array[String]] = js.undefined
  
  var closedByParent: js.UndefOr[Boolean] = js.undefined
  
  var contentType: js.UndefOr[TagContentType] = js.undefined
  
  var ignoreFirstLf: js.UndefOr[Boolean] = js.undefined
  
  var implicitNamespacePrefix: js.UndefOr[String] = js.undefined
  
  var isVoid: js.UndefOr[Boolean] = js.undefined
  
  var preventNamespaceInheritance: js.UndefOr[Boolean] = js.undefined
}
object ClosedByChildren {
  
  @scala.inline
  def apply(): ClosedByChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedByChildren]
  }
  
  @scala.inline
  implicit class ClosedByChildrenMutableBuilder[Self <: ClosedByChildren] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosedByChildren(value: js.Array[String]): Self = StObject.set(x, "closedByChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedByChildrenUndefined: Self = StObject.set(x, "closedByChildren", js.undefined)
    
    @scala.inline
    def setClosedByChildrenVarargs(value: String*): Self = StObject.set(x, "closedByChildren", js.Array(value :_*))
    
    @scala.inline
    def setClosedByParent(value: Boolean): Self = StObject.set(x, "closedByParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedByParentUndefined: Self = StObject.set(x, "closedByParent", js.undefined)
    
    @scala.inline
    def setContentType(value: TagContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setIgnoreFirstLf(value: Boolean): Self = StObject.set(x, "ignoreFirstLf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFirstLfUndefined: Self = StObject.set(x, "ignoreFirstLf", js.undefined)
    
    @scala.inline
    def setImplicitNamespacePrefix(value: String): Self = StObject.set(x, "implicitNamespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitNamespacePrefixUndefined: Self = StObject.set(x, "implicitNamespacePrefix", js.undefined)
    
    @scala.inline
    def setIsVoid(value: Boolean): Self = StObject.set(x, "isVoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVoidUndefined: Self = StObject.set(x, "isVoid", js.undefined)
    
    @scala.inline
    def setPreventNamespaceInheritance(value: Boolean): Self = StObject.set(x, "preventNamespaceInheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventNamespaceInheritanceUndefined: Self = StObject.set(x, "preventNamespaceInheritance", js.undefined)
  }
}
