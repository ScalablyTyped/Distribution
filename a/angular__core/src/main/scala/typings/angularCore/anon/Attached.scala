package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attached extends StObject {
  
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
  implicit class AttachedMutableBuilder[Self <: Attached] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckAlways(value: Boolean): Self = StObject.set(x, "checkAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationMode(value: Boolean): Self = StObject.set(x, "creationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstViewPass(value: Boolean): Self = StObject.set(x, "firstViewPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexWithinInitPhase(value: Double): Self = StObject.set(x, "indexWithinInitPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitPhaseState(value: Double): Self = StObject.set(x, "initPhaseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
  }
}
