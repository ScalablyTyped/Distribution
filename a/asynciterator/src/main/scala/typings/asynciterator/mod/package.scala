package typings.asynciterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncIteratorOrArray[T] = js.Array[T] | typings.asynciterator.mod.AsyncIterator[T]
  
  type AsyncIteratorOrPromise[T] = typings.asynciterator.mod.AsyncIterator[T] | js.Promise[typings.asynciterator.mod.AsyncIterator[T]]
  
  type SourceExpression[T] = typings.asynciterator.mod.AsyncIteratorOrPromise[T] | js.Function0[typings.asynciterator.mod.AsyncIteratorOrPromise[T]]
}
