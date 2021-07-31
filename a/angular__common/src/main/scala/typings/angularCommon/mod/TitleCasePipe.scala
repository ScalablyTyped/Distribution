package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "TitleCasePipe")
@js.native
class TitleCasePipe ()
  extends StObject
     with PipeTransform {
  
  def transform(): Null = js.native
  /**
    * @param value The string to transform to title case.
    */
  def transform(value: String): String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  @JSName("transform")
  def transform_Union(): String | Null = js.native
  @JSName("transform")
  def transform_Union(value: String): String | Null = js.native
}
