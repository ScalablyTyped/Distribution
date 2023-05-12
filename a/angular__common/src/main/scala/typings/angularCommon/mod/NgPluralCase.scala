package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngPluralCase]`
import typings.angularCommon.anon.Attribute
import typings.angularCommon.anon.`23`
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgPluralCase")
@js.native
open class NgPluralCase protected () extends StObject {
  def this(
    value: String,
    template: TemplateRef[js.Object],
    viewContainer: ViewContainerRef,
    ngPlural: NgPlural
  ) = this()
  
  var value: String = js.native
}
/* static members */
object NgPluralCase {
  
  @JSImport("@angular/common", "NgPluralCase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgPluralCase.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgPluralCase, 
    `[ngPluralCase]`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgPluralCase, 
      `[ngPluralCase]`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgPluralCase.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgPluralCase, js.Tuple4[Attribute, Null, Null, `23`]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgPluralCase, js.Tuple4[Attribute, Null, Null, `23`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
