package typings.atom.mod

import typings.atom.atomStrings.`line-number`
import typings.atom.atomStrings.decorated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GutterOptions extends js.Object {
  
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
  implicit class GutterOptionsOps[Self <: GutterOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setLabelFn(value: /* lineData */ LineDataExtended => String): Self = this.set("labelFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLabelFn: Self = this.set("labelFn", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* lineData */ LineData => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* lineData */ LineData => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setType(value: decorated | `line-number`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
