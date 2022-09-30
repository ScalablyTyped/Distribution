package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.keyvalue
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import typings.std.ReadonlyMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "KeyValuePipe")
@js.native
open class KeyValuePipe protected ()
  extends StObject
     with PipeTransform {
  def this(differs: KeyValueDiffers) = this()
  
  /* private */ var compareFn: Any = js.native
  
  /* private */ var differ: Any = js.native
  
  /* private */ val differs: Any = js.native
  
  /* private */ var keyValues: Any = js.native
  
  def transform(): Null = js.native
  def transform(
    input: Null,
    compareFn: js.Function2[/* a */ KeyValue[Any, Any], /* b */ KeyValue[Any, Any], Double]
  ): Null = js.native
  def transform(
    input: Unit,
    compareFn: js.Function2[/* a */ KeyValue[Any, Any], /* b */ KeyValue[Any, Any], Double]
  ): Null = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform[K, V](input: ReadonlyMap[K, V]): js.Array[KeyValue[K, V]] = js.native
  def transform[K, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): js.Array[KeyValue[K, V]] = js.native
  def transform[K /* <: Double */, V](input: Record[K, V]): js.Array[KeyValue[String, V]] = js.native
  def transform[K /* <: Double */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K | String, V], /* b */ KeyValue[K | String, V], Double]
  ): js.Array[KeyValue[String, V]] = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](
    input: Null,
    compareFn: js.Function2[/* a */ KeyValue[K | String, V], /* b */ KeyValue[K | String, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](
    input: Unit,
    compareFn: js.Function2[/* a */ KeyValue[K | String, V], /* b */ KeyValue[K | String, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](input: ReadonlyMap[K, V]): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K, V](
    input: ReadonlyMap[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K, V], /* b */ KeyValue[K, V], Double]
  ): (js.Array[KeyValue[K, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K /* <: Double */, V](input: Record[K, V]): (js.Array[KeyValue[String, V]]) | Null = js.native
  @JSName("transform")
  def transform_KV_Union[K /* <: Double */, V](
    input: Record[K, V],
    compareFn: js.Function2[/* a */ KeyValue[K | String, V], /* b */ KeyValue[K | String, V], Double]
  ): (js.Array[KeyValue[String, V]]) | Null = js.native
}
/* static members */
object KeyValuePipe {
  
  @JSImport("@angular/common", "KeyValuePipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "KeyValuePipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[KeyValuePipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[KeyValuePipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "KeyValuePipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[KeyValuePipe, keyvalue, `true`] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[KeyValuePipe, keyvalue, `true`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
