package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.libTableInterfaceMod.ColumnFilterItem
import typings.react.reactMod.ReactChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/util", JSImport.Namespace)
@js.native
object libTableUtilMod extends js.Object {
  def flatArray(): js.Array[_] = js.native
  def flatArray(data: js.Array[_]): js.Array[_] = js.native
  def flatArray(data: js.Array[_], childrenName: String): js.Array[_] = js.native
  def flatFilter(tree: js.Array[_], callback: js.Function): js.Any = js.native
  def generateValueMaps(): StringDictionary[js.Any] = js.native
  def generateValueMaps(items: js.Array[ColumnFilterItem]): StringDictionary[js.Any] = js.native
  def generateValueMaps(items: js.Array[ColumnFilterItem], maps: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def normalizeColumns(elements: ReactChildren): js.Array[_] = js.native
  def treeMap[Node](tree: js.Array[Node], mapper: js.Function2[/* node */ Node, /* index */ Double, _]): js.Array[_] = js.native
  def treeMap[Node](
    tree: js.Array[Node],
    mapper: js.Function2[/* node */ Node, /* index */ Double, _],
    childrenName: String
  ): js.Array[_] = js.native
}

