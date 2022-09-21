package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngStyle]`
import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgStyle")
@js.native
open class NgStyle protected ()
  extends StObject
     with DoCheck {
  def this(_ngEl: ElementRef[Any], _differs: KeyValueDiffers, _renderer: Renderer2) = this()
  
  /* private */ var _applyChanges: Any = js.native
  
  /* private */ var _differ: Any = js.native
  
  /* private */ var _differs: Any = js.native
  
  /* private */ var _ngEl: Any = js.native
  
  /* private */ var _ngStyle: Any = js.native
  
  /* private */ var _renderer: Any = js.native
  
  /* private */ var _setStyle: Any = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
  
  def ngStyle_=(values: js.UndefOr[StringDictionary[Any] | Null]): Unit = js.native
}
/* static members */
object NgStyle {
  
  @JSImport("@angular/common", "NgStyle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgStyle.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgStyle, 
    `[ngStyle]`, 
    scala.Nothing, 
    typings.angularCommon.anon.NgStyle, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgStyle, 
      `[ngStyle]`, 
      scala.Nothing, 
      typings.angularCommon.anon.NgStyle, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgStyle.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgStyle, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgStyle, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
