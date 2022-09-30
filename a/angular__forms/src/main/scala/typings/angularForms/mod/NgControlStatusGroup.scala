package typings.angularForms.mod

import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgControlStatusGroup")
@js.native
open class NgControlStatusGroup protected ()
  extends StObject
     with AbstractControlStatus {
  def this(cd: ControlContainer) = this()
}
/* static members */
object NgControlStatusGroup {
  
  @JSImport("@angular/forms", "NgControlStatusGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NgControlStatusGroup.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgControlStatusGroup, 
    String, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgControlStatusGroup, 
      String, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgControlStatusGroup.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgControlStatusGroup, js.Array[Self]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgControlStatusGroup, js.Array[Self]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
