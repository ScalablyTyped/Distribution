package typings.activexLibreoffice.com_.sun.star.animations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAnimationNodeSupplier extends StObject {
  
  val AnimationNode: XAnimationNode
  
  def getAnimationNode(): XAnimationNode
}
object XAnimationNodeSupplier {
  
  @scala.inline
  def apply(AnimationNode: XAnimationNode, getAnimationNode: () => XAnimationNode): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal(AnimationNode = AnimationNode.asInstanceOf[js.Any], getAnimationNode = js.Any.fromFunction0(getAnimationNode))
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
  
  @scala.inline
  implicit class XAnimationNodeSupplierMutableBuilder[Self <: XAnimationNodeSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationNode(value: XAnimationNode): Self = StObject.set(x, "AnimationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAnimationNode(value: () => XAnimationNode): Self = StObject.set(x, "getAnimationNode", js.Any.fromFunction0(value))
  }
}
