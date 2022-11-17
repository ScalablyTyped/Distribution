package typings.angularCommon.anon

import typings.angularCore.mod.NgIterable
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNgForOf extends StObject {
  
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  /* static member */
  def ngTemplateContextGuard[T, U /* <: NgIterable[T] */](dir: typings.angularCommon.mod.NgForOf[T, U], ctx: Any): /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean
  
  /* static member */
  var ɵdir: ɵɵDirectiveDeclaration[
    typings.angularCommon.mod.NgForOf[Any, Any], 
    "[ngFor][ngForOf]", 
    scala.Nothing, 
    NgForOf, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    true, 
    scala.Nothing
  ]
  
  /* static member */
  var ɵfac: ɵɵFactoryDeclaration[typings.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]
}
object TypeofNgForOf {
  
  inline def apply(
    ngTemplateContextGuard: (typings.angularCommon.mod.NgForOf[Any, Any], Any) => /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean,
    ɵdir: ɵɵDirectiveDeclaration[
      typings.angularCommon.mod.NgForOf[Any, Any], 
      "[ngFor][ngForOf]", 
      scala.Nothing, 
      NgForOf, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      true, 
      scala.Nothing
    ],
    ɵfac: ɵɵFactoryDeclaration[typings.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]
  ): TypeofNgForOf = {
    val __obj = js.Dynamic.literal(ngTemplateContextGuard = js.Any.fromFunction2(ngTemplateContextGuard), ɵdir = ɵdir.asInstanceOf[js.Any], ɵfac = ɵfac.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNgForOf]
  }
  
  extension [Self <: TypeofNgForOf](x: Self) {
    
    inline def setNgTemplateContextGuard(
      value: (typings.angularCommon.mod.NgForOf[Any, Any], Any) => /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean
    ): Self = StObject.set(x, "ngTemplateContextGuard", js.Any.fromFunction2(value))
    
    inline def setƟdir(
      value: ɵɵDirectiveDeclaration[
          typings.angularCommon.mod.NgForOf[Any, Any], 
          "[ngFor][ngForOf]", 
          scala.Nothing, 
          NgForOf, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          true, 
          scala.Nothing
        ]
    ): Self = StObject.set(x, "\u0275dir", value.asInstanceOf[js.Any])
    
    inline def setƟfac(value: ɵɵFactoryDeclaration[typings.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]): Self = StObject.set(x, "\u0275fac", value.asInstanceOf[js.Any])
  }
}
