package typings.angularCompiler.tagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagDefinition extends js.Object {
  
  var canSelfClose: Boolean = js.native
  
  var closedByParent: Boolean = js.native
  
  var contentType: TagContentType = js.native
  
  var ignoreFirstLf: Boolean = js.native
  
  var implicitNamespacePrefix: String | Null = js.native
  
  def isClosedByChild(name: String): Boolean = js.native
  
  var isVoid: Boolean = js.native
  
  var preventNamespaceInheritance: Boolean = js.native
}
object TagDefinition {
  
  @scala.inline
  def apply(
    canSelfClose: Boolean,
    closedByParent: Boolean,
    contentType: TagContentType,
    ignoreFirstLf: Boolean,
    isClosedByChild: String => Boolean,
    isVoid: Boolean,
    preventNamespaceInheritance: Boolean
  ): TagDefinition = {
    val __obj = js.Dynamic.literal(canSelfClose = canSelfClose.asInstanceOf[js.Any], closedByParent = closedByParent.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], ignoreFirstLf = ignoreFirstLf.asInstanceOf[js.Any], isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid.asInstanceOf[js.Any], preventNamespaceInheritance = preventNamespaceInheritance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDefinition]
  }
  
  @scala.inline
  implicit class TagDefinitionOps[Self <: TagDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanSelfClose(value: Boolean): Self = this.set("canSelfClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedByParent(value: Boolean): Self = this.set("closedByParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: TagContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreFirstLf(value: Boolean): Self = this.set("ignoreFirstLf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClosedByChild(value: String => Boolean): Self = this.set("isClosedByChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsVoid(value: Boolean): Self = this.set("isVoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventNamespaceInheritance(value: Boolean): Self = this.set("preventNamespaceInheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitNamespacePrefix(value: String): Self = this.set("implicitNamespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitNamespacePrefixNull: Self = this.set("implicitNamespacePrefix", null)
  }
}
