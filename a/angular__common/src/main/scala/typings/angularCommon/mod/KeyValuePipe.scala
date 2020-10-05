package typings.angularCommon.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.PipeTransform
import typings.std.Map
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
  def transform[V](): (js.Array[KeyValue[String, V]]) | Null = js.native
  def transform[V](input: NumberDictionary[V]): js.Array[KeyValue[Double, V]] = js.native
  def transform[V](
    input: NumberDictionary[V],
    compareFn: js.Function2[/* a */ KeyValue[Double, V], /* b */ KeyValue[Double, V], Double]
  ): js.Array[KeyValue[Double, V]] = js.native
  def transform[V](input: StringDictionary[V]): js.Array[KeyValue[String, V]] = js.native
  def transform[V](
    input: StringDictionary[V],
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): js.Array[KeyValue[String, V]] = js.native
  def transform[V](
    input: Null,
    compareFn: js.Function2[/* a */ KeyValue[Double | String, V], /* b */ KeyValue[Double | String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
  def transform[V](input: Map[Double | String, V]): js.Array[KeyValue[String, V]] = js.native
  def transform[V](
    input: Map[Double | String, V],
    compareFn: js.Function2[/* a */ KeyValue[Double | String, V], /* b */ KeyValue[Double | String, V], Double]
  ): js.Array[KeyValue[String, V]] = js.native
  @JSName("transform")
  def transform_KV[K, V](): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV[K, V](input: Null, compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV[K, V](input: Map[K, V]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_KV[K, V](input: Map[K, V], compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_KV_Null[K, V](): Null = js.native
  @JSName("transform")
  def transform_KV_Null[K, V](input: Null, compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](input: Map[K, V]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](input: Map[K, V], compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](input: NumberDictionary[V]): (js.Array[KeyValue[Double, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](
    input: NumberDictionary[V],
    compareFn: js.Function2[/* a */ KeyValue[Double, V], /* b */ KeyValue[Double, V], Double]
  ): (js.Array[KeyValue[Double, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](input: StringDictionary[V]): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](
    input: StringDictionary[V],
    compareFn: js.Function2[/* a */ KeyValue[String, V], /* b */ KeyValue[String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](input: Map[Double | String, V]): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_V_Union[V](
    input: Map[Double | String, V],
    compareFn: js.Function2[/* a */ KeyValue[Double | String, V], /* b */ KeyValue[Double | String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
}

