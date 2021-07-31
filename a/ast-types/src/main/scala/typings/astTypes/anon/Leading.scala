package typings.astTypes.anon

import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leading extends StObject {
  
  var leading: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var trailing: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object Leading {
  
  @scala.inline
  def apply(value: String): Leading = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leading]
  }
  
  @scala.inline
  implicit class LeadingMutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
