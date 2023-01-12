package typings.angularForms.anon

import typings.angularForms.mod.FormHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Standalone extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  var updateOn: js.UndefOr[FormHooks] = js.undefined
}
object Standalone {
  
  inline def apply(): Standalone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standalone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Standalone] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setUpdateOn(value: FormHooks): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
