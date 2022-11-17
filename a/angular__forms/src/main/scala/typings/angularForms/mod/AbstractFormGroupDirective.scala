package typings.angularForms.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "AbstractFormGroupDirective")
@js.native
open class AbstractFormGroupDirective ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
}
/* static members */
object AbstractFormGroupDirective {
  
  @JSImport("@angular/forms", "AbstractFormGroupDirective")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "AbstractFormGroupDirective.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    AbstractFormGroupDirective, 
    scala.Nothing, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      AbstractFormGroupDirective, 
      scala.Nothing, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "AbstractFormGroupDirective.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[AbstractFormGroupDirective, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[AbstractFormGroupDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
