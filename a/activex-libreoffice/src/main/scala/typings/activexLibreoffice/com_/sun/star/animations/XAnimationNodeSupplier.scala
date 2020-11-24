package typings.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAnimationNodeSupplier extends js.Object {
  
  val AnimationNode: XAnimationNode = js.native
  
  def getAnimationNode(): XAnimationNode = js.native
}
object XAnimationNodeSupplier {
  
  @scala.inline
  def apply(AnimationNode: XAnimationNode, getAnimationNode: () => XAnimationNode): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal(AnimationNode = AnimationNode.asInstanceOf[js.Any], getAnimationNode = js.Any.fromFunction0(getAnimationNode))
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
  
  @scala.inline
  implicit class XAnimationNodeSupplierOps[Self <: XAnimationNodeSupplier] (val x: Self) extends AnyVal {
    
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
    def setAnimationNode(value: XAnimationNode): Self = this.set("AnimationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnimationNode(value: () => XAnimationNode): Self = this.set("getAnimationNode", js.Any.fromFunction0(value))
  }
}
