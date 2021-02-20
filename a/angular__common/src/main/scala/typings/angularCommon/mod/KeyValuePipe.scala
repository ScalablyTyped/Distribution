package typings.angularCommon.mod

import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.PipeTransform
import typings.std.ReadonlyMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "KeyValuePipe")
@js.native
class KeyValuePipe protected () extends PipeTransform {
  def this(differs: KeyValueDiffers) = this()
  
  var differ: js.Any = js.native
  
  val differs: js.Any = js.native
  
  var keyValues: js.Any = js.native
  
  def transform(): Null = js.native
  def transform(
    input: js.UndefOr[scala.Nothing],
    compareFn: js.Function2[/* a */ KeyValue[_, _], /* b */ KeyValue[_, _], Double]
  ): Null = js.native
  def transform(input: Null, compareFn: js.Function2[/* a */ KeyValue[_, _], /* b */ KeyValue[_, _], Double]): Null = js.native
  def transform[K /* <: String */, V](input: ReadonlyMap[K, V]): (js.Array[KeyValue[K, V]]) | Null = js.native
  def transform[K /* <: String */, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  def transform[K /* <: Double */, V](input: Record[K, V]): js.Array[KeyValue[String, V]] = js.native
  def transform[K /* <: Double */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): js.Array[KeyValue[String, V]] = js.native
  @JSName("transform")
  def transform_KV[K, V](input: ReadonlyMap[K, V]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV[K, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Array[K, V](input: ReadonlyMap[K, V]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_KV_Array[K, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](
    input: js.UndefOr[scala.Nothing],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](input: Null, compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_DoubleV_Union[K /* <: Double */, V](): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_DoubleV_Union[K /* <: Double */, V](
    input: js.UndefOr[scala.Nothing],
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_DoubleV_Union[K /* <: Double */, V](
    input: Null,
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_DoubleV_Union[K /* <: Double */, V](input: Record[K, V]): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_DoubleV_Union[K /* <: Double */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_StringV[K /* <: String */, V](input: Record[K, V]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_K_StringV[K /* <: String */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_K_StringV_Array[K /* <: String */, V](input: ReadonlyMap[K, V]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_K_StringV_Array[K /* <: String */, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_K_StringV_Union[K /* <: String */, V](): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_StringV_Union[K /* <: String */, V](
    input: js.UndefOr[scala.Nothing],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_StringV_Union[K /* <: String */, V](input: Null, compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_StringV_Union[K /* <: String */, V](input: Record[K, V]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_K_StringV_Union[K /* <: String */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
}
