package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimitiveDefinition extends StObject {
  
  var defaultComponents: js.UndefOr[js.Any] = js.undefined
  
  // TODO cleanup type
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var mappings: js.UndefOr[js.Any] = js.undefined
  
  // TODO cleanup type
  var transforms: js.UndefOr[js.Any] = js.undefined
}
object PrimitiveDefinition {
  
  @scala.inline
  def apply(): PrimitiveDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimitiveDefinition]
  }
  
  @scala.inline
  implicit class PrimitiveDefinitionMutableBuilder[Self <: PrimitiveDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultComponents(value: js.Any): Self = StObject.set(x, "defaultComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultComponentsUndefined: Self = StObject.set(x, "defaultComponents", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setMappings(value: js.Any): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    @scala.inline
    def setTransforms(value: js.Any): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
  }
}
