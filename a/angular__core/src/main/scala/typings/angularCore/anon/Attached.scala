package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attached extends js.Object {
  
  var attached: Boolean = js.native
  
  var checkAlways: Boolean = js.native
  
  var creationMode: Boolean = js.native
  
  var destroyed: Boolean = js.native
  
  var dirty: Boolean = js.native
  
  var firstViewPass: Boolean = js.native
  
  var indexWithinInitPhase: Double = js.native
  
  var initPhaseState: Double = js.native
  
  var isRoot: Boolean = js.native
}
object Attached {
  
  @scala.inline
  def apply(
    attached: Boolean,
    checkAlways: Boolean,
    creationMode: Boolean,
    destroyed: Boolean,
    dirty: Boolean,
    firstViewPass: Boolean,
    indexWithinInitPhase: Double,
    initPhaseState: Double,
    isRoot: Boolean
  ): Attached = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], checkAlways = checkAlways.asInstanceOf[js.Any], creationMode = creationMode.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], firstViewPass = firstViewPass.asInstanceOf[js.Any], indexWithinInitPhase = indexWithinInitPhase.asInstanceOf[js.Any], initPhaseState = initPhaseState.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attached]
  }
  
  @scala.inline
  implicit class AttachedOps[Self <: Attached] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: Boolean): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckAlways(value: Boolean): Self = this.set("checkAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationMode(value: Boolean): Self = this.set("creationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstViewPass(value: Boolean): Self = this.set("firstViewPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexWithinInitPhase(value: Double): Self = this.set("indexWithinInitPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitPhaseState(value: Double): Self = this.set("initPhaseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = this.set("isRoot", value.asInstanceOf[js.Any])
  }
}
