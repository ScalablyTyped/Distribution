package typings
package adoneLib.adoneNs.fakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fake.helpers")
@js.native
object helpersNs extends js.Object {
  def contextualCard(): adoneLib.adoneNs.fakeNs.INs.ContextualCard = js.native
  def createCard(): adoneLib.adoneNs.fakeNs.INs.Card = js.native
  def createTransaction(): adoneLib.adoneNs.fakeNs.INs.Transaction = js.native
  def mustache(
    str: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | (js.Function2[/* substring */ java.lang.String, /* repeated */js.Any, java.lang.String])
    ]
  ): java.lang.String = js.native
  def randomize(): java.lang.String = js.native
  def randomize[T](array: js.Array[T]): T = js.native
  def replaceSymbolWithNumber(): java.lang.String = js.native
  def replaceSymbolWithNumber(string: java.lang.String): java.lang.String = js.native
  def replaceSymbolWithNumber(string: java.lang.String, symbol: java.lang.String): java.lang.String = js.native
  def replaceSymbols(): java.lang.String = js.native
  def replaceSymbols(string: java.lang.String): java.lang.String = js.native
  def shuffle(): js.Array[java.lang.String] = js.native
  def shuffle[T](o: js.Array[T]): js.Array[T] = js.native
  def slugify(): java.lang.String = js.native
  def slugify(string: java.lang.String): java.lang.String = js.native
  def userCard(): adoneLib.adoneNs.fakeNs.INs.UserCard = js.native
}

