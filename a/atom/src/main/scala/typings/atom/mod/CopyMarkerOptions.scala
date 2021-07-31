package typings.atom.mod

import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyMarkerOptions extends StObject {
  
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  
  /** Custom properties to be associated with the marker. */
  var properties: js.UndefOr[js.Object] = js.undefined
  
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[Boolean] = js.undefined
}
object CopyMarkerOptions {
  
  @scala.inline
  def apply(): CopyMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyMarkerOptions]
  }
  
  @scala.inline
  implicit class CopyMarkerOptionsMutableBuilder[Self <: CopyMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setTailed(value: Boolean): Self = StObject.set(x, "tailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTailedUndefined: Self = StObject.set(x, "tailed", js.undefined)
  }
}
