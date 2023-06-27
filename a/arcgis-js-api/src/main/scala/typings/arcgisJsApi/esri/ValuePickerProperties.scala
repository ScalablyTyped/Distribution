package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ValuePickerCollectiontype
import typings.arcgisJsApi.anon.ValuePickerComboboxtypeco
import typings.arcgisJsApi.anon.ValuePickerLabeltypelabel
import typings.arcgisJsApi.anon.ValuePickerSlidertypeslid
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePickerProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Returns `true` if the ValuePicker can be advanced to the next position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canNext)
  		 */
  var canNext: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Returns `true` if the ValuePicker can be played.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canPlay)
  		 */
  var canPlay: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Returns `true` if the ValuePicker can moved to the previous item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#canPrevious)
  		 */
  var canPrevious: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * An optional caption that appears on the ValuePicker widget to give context for the user.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#caption)
  		 */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
  		 * An optional component for presenting and managing data.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#component)
  		 */
  var component: js.UndefOr[
    ValuePickerCollectiontype | ValuePickerComboboxtypeco | ValuePickerLabeltypelabel | ValuePickerSlidertypeslid
  ] = js.undefined
  
  /**
  		 * When `true`, sets the widget to a disabled state so the user cannot interact with it.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#disabled)
  		 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates if the widget should be orientated horizontally (default) or vertically.
  		 *
  		 * @default "horizontal"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#layout)
  		 */
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
  		 * If true, playback will restart when it reaches the end.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#loop)
  		 */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The pause, in milliseconds between playback advancement.
  		 *
  		 * @default 1000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#playRate)
  		 */
  var playRate: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The current value of the ValuePicker.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#values)
  		 */
  var values: js.UndefOr[js.Array[Any | Double | String]] = js.undefined
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[ValuePickerVisibleElements] = js.undefined
}
object ValuePickerProperties {
  
  inline def apply(): ValuePickerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValuePickerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerProperties] (val x: Self) extends AnyVal {
    
    inline def setCanNext(value: Boolean): Self = StObject.set(x, "canNext", value.asInstanceOf[js.Any])
    
    inline def setCanNextUndefined: Self = StObject.set(x, "canNext", js.undefined)
    
    inline def setCanPlay(value: Boolean): Self = StObject.set(x, "canPlay", value.asInstanceOf[js.Any])
    
    inline def setCanPlayUndefined: Self = StObject.set(x, "canPlay", js.undefined)
    
    inline def setCanPrevious(value: Boolean): Self = StObject.set(x, "canPrevious", value.asInstanceOf[js.Any])
    
    inline def setCanPreviousUndefined: Self = StObject.set(x, "canPrevious", js.undefined)
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setComponent(
      value: ValuePickerCollectiontype | ValuePickerComboboxtypeco | ValuePickerLabeltypelabel | ValuePickerSlidertypeslid
    ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPlayRate(value: Double): Self = StObject.set(x, "playRate", value.asInstanceOf[js.Any])
    
    inline def setPlayRateUndefined: Self = StObject.set(x, "playRate", js.undefined)
    
    inline def setValues(value: js.Array[Any | Double | String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (Any | Double | String)*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVisibleElements(value: ValuePickerVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
