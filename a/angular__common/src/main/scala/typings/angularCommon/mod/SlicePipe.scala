package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "SlicePipe")
@js.native
open class SlicePipe ()
  extends StObject
     with PipeTransform {
  
  /* private */ var supports: Any = js.native
  
  def transform(value: String, start: Double): String = js.native
  def transform(value: String, start: Double, end: Double): String = js.native
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform(value: Null, start: Double): Null = js.native
  def transform(value: Null, start: Double, end: Double): Null = js.native
  def transform(value: Unit, start: Double): Null = js.native
  def transform(value: Unit, start: Double, end: Double): Null = js.native
  def transform[T](value: js.Array[T], start: Double): js.Array[T] | Null = js.native
  def transform[T](value: js.Array[T], start: Double, end: Double): js.Array[T] | Null = js.native
  /**
    * @param value a list or a string to be sliced.
    * @param start the starting index of the subset to return:
    *   - **a positive integer**: return the item at `start` index and all items after
    *     in the list or string expression.
    *   - **a negative integer**: return the item at `start` index from the end and all items after
    *     in the list or string expression.
    *   - **if positive and greater than the size of the expression**: return an empty list or
    * string.
    *   - **if negative and greater than the size of the expression**: return entire list or string.
    * @param end the ending index of the subset to return:
    *   - **omitted**: return all items until the end.
    *   - **if positive**: return all items before `end` index of the list or string.
    *   - **if negative**: return all items before `end` index from the end of the list or string.
    */
  @JSName("transform")
  def transform_T_Array[T](value: js.Array[T], start: Double): js.Array[T] = js.native
  @JSName("transform")
  def transform_T_Array[T](value: js.Array[T], start: Double, end: Double): js.Array[T] = js.native
  @JSName("transform")
  def transform_T_Union[T](value: Null, start: Double): js.Array[T] | Null = js.native
  @JSName("transform")
  def transform_T_Union[T](value: Null, start: Double, end: Double): js.Array[T] | Null = js.native
  @JSName("transform")
  def transform_T_Union[T](value: Unit, start: Double): js.Array[T] | Null = js.native
  @JSName("transform")
  def transform_T_Union[T](value: Unit, start: Double, end: Double): js.Array[T] | Null = js.native
  @JSName("transform")
  def transform_Union(value: String, start: Double): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: String, start: Double, end: Double): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, start: Double): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Null, start: Double, end: Double): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, start: Double): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: Unit, start: Double, end: Double): String | Null = js.native
}
/* static members */
object SlicePipe {
  
  @JSImport("@angular/common", "SlicePipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "SlicePipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[SlicePipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[SlicePipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "SlicePipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[SlicePipe, "slice", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[SlicePipe, "slice", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
