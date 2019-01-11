package typings
package atAngularCommonLib.srcPipesKeyvalueUnderscorePipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/pipes/keyvalue_pipe", "KeyValuePipe")
@js.native
class KeyValuePipe protected ()
  extends atAngularCoreLib.srcChangeUnderscoreDetectionPipeUnderscoreTransformMod.PipeTransform {
  def this(differs: atAngularCoreLib.atAngularCoreMod.KeyValueDiffers) = this()
  var differ: js.Any = js.native
  val differs: js.Any = js.native
  var keyValues: js.Any = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform[V](input: org.scalablytyped.runtime.NumberDictionary[V]): js.Array[KeyValue[scala.Double, V]] = js.native
  def transform[V](
    input: org.scalablytyped.runtime.NumberDictionary[V],
    compareFn: js.Function2[/* a */ KeyValue[scala.Double, V], /* b */ KeyValue[scala.Double, V], scala.Double]
  ): js.Array[KeyValue[scala.Double, V]] = js.native
  def transform[V](input: org.scalablytyped.runtime.StringDictionary[V]): js.Array[KeyValue[java.lang.String, V]] = js.native
  def transform[V](
    input: org.scalablytyped.runtime.StringDictionary[V],
    compareFn: js.Function2[
      /* a */ KeyValue[java.lang.String, V], 
      /* b */ KeyValue[java.lang.String, V], 
      scala.Double
    ]
  ): js.Array[KeyValue[java.lang.String, V]] = js.native
  def transform[V](input: stdLib.Map[scala.Double | java.lang.String, V]): js.Array[KeyValue[java.lang.String, V]] = js.native
  def transform[V](
    input: stdLib.Map[scala.Double | java.lang.String, V],
    compareFn: js.Function2[
      /* a */ KeyValue[scala.Double | java.lang.String, V], 
      /* b */ KeyValue[scala.Double | java.lang.String, V], 
      scala.Double
    ]
  ): js.Array[KeyValue[java.lang.String, V]] = js.native
  def transform[K, V](): scala.Null = js.native
  def transform[K, V](
    input: scala.Null,
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], scala.Double]
  ): scala.Null = js.native
  @JSName("transform")
  def transform_KV[K, V](input: stdLib.Map[K, V]): js.Array[KeyValue[K, V]] = js.native
  @JSName("transform")
  def transform_KV[K, V](
    input: stdLib.Map[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], scala.Double]
  ): js.Array[KeyValue[K, V]] = js.native
}

