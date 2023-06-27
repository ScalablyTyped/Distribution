package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.animate
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.next
import typings.arcgisJsApi.arcgisJsApiStrings.pause
import typings.arcgisJsApi.arcgisJsApiStrings.play
import typings.arcgisJsApi.arcgisJsApiStrings.previous
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuePicker
  extends StObject
     with Widget_ {
  
  /**
  		 * Returns `true` if the ValuePicker can be advanced to the next position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canNext)
  		 */
  var canNext: Boolean = js.native
  
  /**
  		 * Returns `true` if the ValuePicker can be played.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canPlay)
  		 */
  var canPlay: Boolean = js.native
  
  /**
  		 * Returns `true` if the ValuePicker can moved to the previous item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canPrevious)
  		 */
  var canPrevious: Boolean = js.native
  
  /**
  		 * An optional caption that appears on the ValuePicker widget to give context for the user.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#caption)
  		 */
  var caption: String = js.native
  
  /**
  		 * An optional component for presenting and managing data.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#component)
  		 */
  var component: ValuePickerCollection | ValuePickerCombobox | ValuePickerLabel | ValuePickerSlider = js.native
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#disabled)
  		 */
  var disabled: Boolean = js.native
  
  /**
  		 * Indicates if the widget should be orientated horizontally (default) or vertically.
  		 *
  		 * @default "horizontal"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#layout)
  		 */
  var layout: horizontal | vertical = js.native
  
  /**
  		 * If true, playback will restart when it reaches the end.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#loop)
  		 */
  var loop: Boolean = js.native
  
  /**
  		 * Select the next value or advance to next.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#next)
  		 */
  def next(): scala.Unit = js.native
  
  @JSName("on")
  def on_animate(name: animate, eventHandler: ValuePickerAnimateEventHandler): IHandle = js.native
  @JSName("on")
  def on_next(name: next, eventHandler: ValuePickerNextEventHandler): IHandle = js.native
  @JSName("on")
  def on_pause(name: pause, eventHandler: ValuePickerPauseEventHandler): IHandle = js.native
  @JSName("on")
  def on_play(name: play, eventHandler: ValuePickerPlayEventHandler): IHandle = js.native
  @JSName("on")
  def on_previous(name: previous, eventHandler: ValuePickerPreviousEventHandler): IHandle = js.native
  
  /**
  		 * Pause playing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#pause)
  		 */
  def pause(): scala.Unit = js.native
  
  /**
  		 * Start playing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#play)
  		 */
  def play(): scala.Unit = js.native
  
  /**
  		 * The pause, in milliseconds between playback advancement.
  		 *
  		 * @default 1000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#playRate)
  		 */
  var playRate: Double = js.native
  
  /**
  		 * Select the previous value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#previous)
  		 */
  def previous(): scala.Unit = js.native
  
  /**
  		 * The current value of the ValuePicker.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#values)
  		 */
  var values: js.Array[Any | Double | String] = js.native
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#visibleElements)
  		 */
  var visibleElements: ValuePickerVisibleElements = js.native
}
