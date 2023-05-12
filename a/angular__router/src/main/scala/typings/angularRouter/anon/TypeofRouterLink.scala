package typings.angularRouter.anon

import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularRouter.angularRouterBooleans.`true`
import typings.angularRouter.angularRouterStrings.`[routerLink]`
import typings.angularRouter.mod.RouterLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRouterLink extends StObject {
  
  /* static member */
  var ɵdir: ɵɵDirectiveDeclaration[
    RouterLink, 
    `[routerLink]`, 
    scala.Nothing, 
    Fragment, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ]
  
  /* static member */
  var ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]
}
object TypeofRouterLink {
  
  inline def apply(
    ɵdir: ɵɵDirectiveDeclaration[
      RouterLink, 
      `[routerLink]`, 
      scala.Nothing, 
      Fragment, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`, 
      scala.Nothing
    ],
    ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]
  ): TypeofRouterLink = {
    val __obj = js.Dynamic.literal(ɵdir = ɵdir.asInstanceOf[js.Any], ɵfac = ɵfac.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRouterLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofRouterLink] (val x: Self) extends AnyVal {
    
    inline def setƟdir(
      value: ɵɵDirectiveDeclaration[
          RouterLink, 
          `[routerLink]`, 
          scala.Nothing, 
          Fragment, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `true`, 
          scala.Nothing
        ]
    ): Self = StObject.set(x, "\u0275dir", value.asInstanceOf[js.Any])
    
    inline def setƟfac(value: ɵɵFactoryDeclaration[RouterLink, js.Tuple6[Null, Null, Attribute, Null, Null, Null]]): Self = StObject.set(x, "\u0275fac", value.asInstanceOf[js.Any])
  }
}
