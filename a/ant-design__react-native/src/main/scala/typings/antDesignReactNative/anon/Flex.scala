package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flex extends StObject {
  
  var flex: Double = js.native
}
object Flex {
  
  @scala.inline
  def apply(flex: Double): Flex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
  
  @scala.inline
  implicit class FlexMutableBuilder[Self <: Flex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
  }
}
