package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-fragments/build/fragments/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def buildChildren(children: js.Array[String | IFragment]): String = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
}

