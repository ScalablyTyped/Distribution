package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends StObject {
  
  def isEquivalent(other: T): Boolean
}
object IsEquivalent {
  
  inline def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => Boolean): IsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[IsEquivalent[T]]
  }
  
  extension [Self <: IsEquivalent[?], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](x: Self & IsEquivalent[T]) {
    
    inline def setIsEquivalent(value: T => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
  }
}
