package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererType2 extends js.Object {
  
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    */
  var data: StringDictionary[js.Any] = js.native
  
  /**
    * The view encapsulation type, which determines how styles are applied to
    * DOM elements. One of
    * - `Emulated` (default): Emulate native scoping of styles.
    * - `Native`: Use the native encapsulation mechanism of the renderer.
    * - `ShadowDom`: Use modern [Shadow
    * DOM](https://w3c.github.io/webcomponents/spec/shadow/) and
    * create a ShadowRoot for component's host element.
    * - `None`: Do not provide any template or style encapsulation.
    */
  var encapsulation: ViewEncapsulation = js.native
  
  /**
    * A unique identifying string for the new renderer, used when creating
    * unique styles for encapsulation.
    */
  var id: String = js.native
  
  /**
    * Defines CSS styles to be stored on a renderer instance.
    */
  var styles: js.Array[String | js.Array[_]] = js.native
}
object RendererType2 {
  
  @scala.inline
  def apply(
    data: StringDictionary[js.Any],
    encapsulation: ViewEncapsulation,
    id: String,
    styles: js.Array[String | js.Array[_]]
  ): RendererType2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererType2]
  }
  
  @scala.inline
  implicit class RendererType2Ops[Self <: RendererType2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = this.set("encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: (String | js.Array[js.Any])*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String | js.Array[_]]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
