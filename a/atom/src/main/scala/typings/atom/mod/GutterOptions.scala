package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.decorated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GutterOptions extends StObject {
  
  /** String added to the CSS classnames of the gutter's root DOM element. */
  var `class`: js.UndefOr[String] = js.native
  
  /**
    * Function called by a 'line-number' gutter to generate the label for each
    * line number element. Should return a String that will be used to label the
    * corresponding line.
    */
  var labelFn: js.UndefOr[js.Function1[/* lineData */ LineDataExtended, String]] = js.native
  
  /** (required) A unique String to identify this gutter. */
  var name: String = js.native
  
  /**
    * Function to be called when a mousedown event is received by a line-number
    * element within this type: 'line-number' Gutter. If unspecified, the default
    * behavior is to select the clicked buffer row.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.native
  
  /**
    * Function to be called when a mousemove event occurs on a line-number
    * element within within this type: 'line-number' Gutter.
    */
  var onMouseMove: js.UndefOr[js.Function1[/* lineData */ LineData, Unit]] = js.native
  
  /**
    * A Number that determines stacking order between gutters.
    * Lower priority items are forced closer to the edges of the window. (default: -100)
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * String specifying the type of gutter to create.
    * 'decorated' gutters are useful as a destination for decorations created with
    * Gutter::decorateMarker.
    * 'line-number' gutters.
    */
  var `type`: js.UndefOr[decorated | `line-number`] = js.native
  
  /**
    * Boolean specifying whether the gutter is visible initially after being created.
    * (default: true)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object GutterOptions {
  
  @scala.inline
  def apply(name: String): GutterOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GutterOptions]
  }
  
  @scala.inline
  implicit class GutterOptionsMutableBuilder[Self <: GutterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setLabelFn(value: /* lineData */ LineDataExtended => String): Self = StObject.set(x, "labelFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFnUndefined: Self = StObject.set(x, "labelFn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDown(value: /* lineData */ LineData => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* lineData */ LineData => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setType(value: decorated | `line-number`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
