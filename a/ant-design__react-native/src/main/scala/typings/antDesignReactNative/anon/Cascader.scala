package typings.antDesignReactNative.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cascader extends StObject {
  
  var cascader: Element = js.native
}
object Cascader {
  
  @scala.inline
  def apply(cascader: Element): Cascader = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascader]
  }
  
  @scala.inline
  implicit class CascaderMutableBuilder[Self <: Cascader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascader(value: Element): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
  }
}
