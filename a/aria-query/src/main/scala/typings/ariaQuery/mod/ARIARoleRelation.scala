package typings.ariaQuery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARIARoleRelation extends StObject {
  
  var concept: js.UndefOr[ARIARoleRelationConcept] = js.native
  
  var module: js.UndefOr[String] = js.native
}
object ARIARoleRelation {
  
  @scala.inline
  def apply(): ARIARoleRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARIARoleRelation]
  }
  
  @scala.inline
  implicit class ARIARoleRelationMutableBuilder[Self <: ARIARoleRelation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConcept(value: ARIARoleRelationConcept): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}
