package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.Renderer2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  * Marks `<option>` as dynamic, so Angular can be notified when options change.
  *
  * @see `SelectMultipleControlValueAccessor`
  *
  * @ngModule ReactiveFormsModule
  * @ngModule FormsModule
  * @publicApi
  */
@JSImport("@angular/forms", "\u0275NgSelectMultipleOption")
@js.native
class ɵNgSelectMultipleOption protected ()
  extends StObject
     with OnDestroy {
  def this(_element: ElementRef[js.Any], _renderer: Renderer2, _select: SelectMultipleControlValueAccessor) = this()
  
  var _element: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  var _select: js.Any = js.native
  
  var id: String = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * @description
    * Tracks the value bound to the option element. Unlike the value binding,
    * ngValue supports binding to objects.
    */
  def ngValue_=(value: js.Any): Unit = js.native
  
  /**
    * @description
    * Tracks simple string values bound to the option element.
    * For objects, use the `ngValue` input binding.
    */
  def value_=(value: js.Any): Unit = js.native
}
