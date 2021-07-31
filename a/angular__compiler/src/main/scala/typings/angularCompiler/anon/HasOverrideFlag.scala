package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasOverrideFlag extends StObject {
  
  var hasOverrideFlag: Boolean
  
  var property: String
  
  var suffix: String | Null
}
object HasOverrideFlag {
  
  @scala.inline
  def apply(hasOverrideFlag: Boolean, property: String): HasOverrideFlag = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], suffix = null)
    __obj.asInstanceOf[HasOverrideFlag]
  }
  
  @scala.inline
  implicit class HasOverrideFlagMutableBuilder[Self <: HasOverrideFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasOverrideFlag(value: Boolean): Self = StObject.set(x, "hasOverrideFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixNull: Self = StObject.set(x, "suffix", null)
  }
}
