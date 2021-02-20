package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveSections extends StObject {
  
  var activeSections: js.Array[Double] = js.native
}
object ActiveSections {
  
  @scala.inline
  def apply(activeSections: js.Array[Double]): ActiveSections = {
    val __obj = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveSections]
  }
  
  @scala.inline
  implicit class ActiveSectionsMutableBuilder[Self <: ActiveSections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSections(value: js.Array[Double]): Self = StObject.set(x, "activeSections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSectionsVarargs(value: Double*): Self = StObject.set(x, "activeSections", js.Array(value :_*))
  }
}
