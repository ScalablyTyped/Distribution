package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation2 extends StObject
@JSImport("@angular/core", "ViewEncapsulation_2")
@js.native
object ViewEncapsulation2 extends StObject {
  
  @js.native
  sealed trait Emulated
    extends StObject
       with ViewEncapsulation2
  
  @js.native
  sealed trait None
    extends StObject
       with ViewEncapsulation2
  
  @js.native
  sealed trait ShadowDom
    extends StObject
       with ViewEncapsulation2
}
