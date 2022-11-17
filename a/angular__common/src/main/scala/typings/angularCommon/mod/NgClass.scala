package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.Klass
import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.IterableDiffers
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgClass")
@js.native
open class NgClass protected ()
  extends StObject
     with DoCheck {
  def this(
    _iterableDiffers: IterableDiffers,
    _keyValueDiffers: KeyValueDiffers,
    _ngEl: ElementRef[Any],
    _renderer: Renderer2
  ) = this()
  
  /**
    * Applies a collection of CSS classes to the DOM element.
    *
    * For argument of type Set and Array CSS class names contained in those collections are always
    * added.
    * For argument of type Map CSS class name in the map's key is toggled based on the value (added
    * for truthy and removed for falsy).
    */
  /* private */ var _applyClasses: Any = js.native
  
  /* private */ var _applyIterableChanges: Any = js.native
  
  /* private */ var _applyKeyValueChanges: Any = js.native
  
  /* private */ var _initialClasses: Any = js.native
  
  /* private */ var _iterableDiffer: Any = js.native
  
  /* private */ var _iterableDiffers: Any = js.native
  
  /* private */ var _keyValueDiffer: Any = js.native
  
  /* private */ var _keyValueDiffers: Any = js.native
  
  /* private */ var _ngEl: Any = js.native
  
  /* private */ var _rawClass: Any = js.native
  
  /**
    * Removes a collection of CSS classes from the DOM element. This is mostly useful for cleanup
    * purposes.
    */
  /* private */ var _removeClasses: Any = js.native
  
  /* private */ var _renderer: Any = js.native
  
  /* private */ var _toggleClass: Any = js.native
  
  def klass_=(value: String): Unit = js.native
  
  def ngClass_=(value: js.UndefOr[String | js.Array[String] | Set[String] | StringDictionary[Any] | Null]): Unit = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
}
/* static members */
object NgClass {
  
  @JSImport("@angular/common", "NgClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgClass.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgClass, 
    "[ngClass]", 
    scala.Nothing, 
    Klass, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    true, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgClass, 
      "[ngClass]", 
      scala.Nothing, 
      Klass, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      true, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgClass.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgClass, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgClass, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
