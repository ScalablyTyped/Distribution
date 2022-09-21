package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngPlural]`
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgPlural")
@js.native
open class NgPlural protected () extends StObject {
  def this(_localization: NgLocalization) = this()
  
  /* private */ var _activateView: Any = js.native
  
  /* private */ var _activeView: Any = js.native
  
  /* private */ var _caseViews: Any = js.native
  
  /* private */ var _clearViews: Any = js.native
  
  /* private */ var _localization: Any = js.native
  
  /* private */ var _switchValue: Any = js.native
  
  /* private */ var _updateView: Any = js.native
  
  def addCase(value: String, switchView: SwitchView): Unit = js.native
  
  def ngPlural_=(value: Double): Unit = js.native
}
/* static members */
object NgPlural {
  
  @JSImport("@angular/common", "NgPlural")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgPlural.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgPlural, 
    `[ngPlural]`, 
    scala.Nothing, 
    typings.angularCommon.anon.NgPlural, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgPlural, 
      `[ngPlural]`, 
      scala.Nothing, 
      typings.angularCommon.anon.NgPlural, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgPlural.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgPlural, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgPlural, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
