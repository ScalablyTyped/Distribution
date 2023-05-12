package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngSwitch]`
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgSwitch")
@js.native
open class NgSwitch () extends StObject {
  
  /* private */ var _caseCount: Any = js.native
  
  /* private */ var _defaultUsed: Any = js.native
  
  /* private */ var _defaultViews: Any = js.native
  
  /* private */ var _lastCaseCheckIndex: Any = js.native
  
  /* private */ var _lastCasesMatched: Any = js.native
  
  /* private */ var _ngSwitch: Any = js.native
  
  /* private */ var _updateDefaultCases: Any = js.native
  
  def ngSwitch_=(newValue: Any): Unit = js.native
}
/* static members */
object NgSwitch {
  
  @JSImport("@angular/common", "NgSwitch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgSwitch.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgSwitch, 
    `[ngSwitch]`, 
    scala.Nothing, 
    typings.angularCommon.anon.NgSwitch, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgSwitch, 
      `[ngSwitch]`, 
      scala.Nothing, 
      typings.angularCommon.anon.NgSwitch, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgSwitch.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgSwitch, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgSwitch, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
