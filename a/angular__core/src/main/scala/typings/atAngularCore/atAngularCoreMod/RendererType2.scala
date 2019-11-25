package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererType2 extends js.Object {
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    */
  var data: StringDictionary[js.Any]
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
  var encapsulation: ViewEncapsulation
  /**
    * A unique identifying string for the new renderer, used when creating
    * unique styles for encapsulation.
    */
  var id: String
  /**
    * Defines CSS styles to be stored on a renderer instance.
    */
  var styles: js.Array[String | js.Array[_]]
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
}

