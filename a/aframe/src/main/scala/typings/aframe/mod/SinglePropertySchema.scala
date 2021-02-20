package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinglePropertySchema[T] extends StObject {
  
  var default: js.UndefOr[T] = js.native
  
  var parse: js.UndefOr[js.Function1[/* value */ String, T]] = js.native
  
  var stringify: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  
  var `type`: js.UndefOr[PropertyTypes] = js.native
}
object SinglePropertySchema {
  
  @scala.inline
  def apply[T](): SinglePropertySchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinglePropertySchema[T]]
  }
  
  @scala.inline
  implicit class SinglePropertySchemaMutableBuilder[Self <: SinglePropertySchema[_], T] (val x: Self with SinglePropertySchema[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setParse(value: /* value */ String => T): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setStringify(value: /* value */ T => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    @scala.inline
    def setType(value: PropertyTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
