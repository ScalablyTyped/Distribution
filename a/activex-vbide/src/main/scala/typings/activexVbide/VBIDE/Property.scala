package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.Property")
@js.native
class Property protected () extends js.Object {
  val Application: typings.activexVbide.VBIDE.Application = js.native
  @JSName("Collection")
  val Collection_Original: Properties = js.native
  val Name: String = js.native
  val NumIndices: Double = js.native
  var Object: js.Any = js.native
  @JSName("Parent")
  val Parent_Original: Properties = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.Property_typekey")
  var VBIDEDotProperty_typekey: Property = js.native
  var Value: js.Any = js.native
  def Collection(index: js.Any): Property = js.native
  def IndexedValue(Index1: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any, Index3: js.Any): js.Any = js.native
  def IndexedValue(Index1: js.Any, Index2: js.Any, Index3: js.Any, Index4: js.Any): js.Any = js.native
  def Parent(index: js.Any): Property = js.native
}

