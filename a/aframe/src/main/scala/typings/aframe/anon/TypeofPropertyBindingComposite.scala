package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable2
import typings.three.mod.PropertyBinding.Composite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPropertyBindingComposite extends StObject {
  
  var Composite: Instantiable2[
    /* targetGroup */ js.Any, 
    /* path */ js.Any, 
    typings.three.mod.PropertyBinding.Composite
  ]
}
object TypeofPropertyBindingComposite {
  
  @scala.inline
  def apply(Composite: Instantiable2[/* targetGroup */ js.Any, /* path */ js.Any, Composite]): TypeofPropertyBindingComposite = {
    val __obj = js.Dynamic.literal(Composite = Composite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPropertyBindingComposite]
  }
  
  @scala.inline
  implicit class TypeofPropertyBindingCompositeMutableBuilder[Self <: TypeofPropertyBindingComposite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposite(value: Instantiable2[/* targetGroup */ js.Any, /* path */ js.Any, Composite]): Self = StObject.set(x, "Composite", value.asInstanceOf[js.Any])
  }
}
