package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends StObject {
  
  def isEquivalent(other: T): Boolean = js.native
}
object IsEquivalent {
  
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => Boolean): IsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[IsEquivalent[T]]
  }
  
  @scala.inline
  implicit class IsEquivalentMutableBuilder[Self <: IsEquivalent[_], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] (val x: Self with IsEquivalent[T]) extends AnyVal {
    
    @scala.inline
    def setIsEquivalent(value: T => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
  }
}
