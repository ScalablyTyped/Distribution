package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileDiDependencyMetadata extends StObject {
  
  var isAttribute: js.UndefOr[Boolean] = js.undefined
  
  var isHost: js.UndefOr[Boolean] = js.undefined
  
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  var isSelf: js.UndefOr[Boolean] = js.undefined
  
  var isSkipSelf: js.UndefOr[Boolean] = js.undefined
  
  var isValue: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[CompileTokenMetadata] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object CompileDiDependencyMetadata {
  
  @scala.inline
  def apply(): CompileDiDependencyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileDiDependencyMetadata]
  }
  
  @scala.inline
  implicit class CompileDiDependencyMetadataMutableBuilder[Self <: CompileDiDependencyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAttribute(value: Boolean): Self = StObject.set(x, "isAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttributeUndefined: Self = StObject.set(x, "isAttribute", js.undefined)
    
    @scala.inline
    def setIsHost(value: Boolean): Self = StObject.set(x, "isHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHostUndefined: Self = StObject.set(x, "isHost", js.undefined)
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    @scala.inline
    def setIsSelf(value: Boolean): Self = StObject.set(x, "isSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelfUndefined: Self = StObject.set(x, "isSelf", js.undefined)
    
    @scala.inline
    def setIsSkipSelf(value: Boolean): Self = StObject.set(x, "isSkipSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSkipSelfUndefined: Self = StObject.set(x, "isSkipSelf", js.undefined)
    
    @scala.inline
    def setIsValue(value: Boolean): Self = StObject.set(x, "isValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValueUndefined: Self = StObject.set(x, "isValue", js.undefined)
    
    @scala.inline
    def setToken(value: CompileTokenMetadata): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
