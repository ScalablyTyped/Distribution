package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T]
  def current(results: paginatedResultCallback[T]): scala.Unit
  def first(results: paginatedResultCallback[T]): scala.Unit
  def hasNext(): scala.Boolean
  def isLast(): scala.Boolean
  def next(results: paginatedResultCallback[T]): scala.Unit
}

