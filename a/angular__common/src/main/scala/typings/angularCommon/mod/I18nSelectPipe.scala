package typings.angularCommon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.PipeTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "I18nSelectPipe")
@js.native
class I18nSelectPipe ()
  extends StObject
     with PipeTransform {
  
  /**
    * @param value a string to be internationalized.
    * @param mapping an object that indicates the text that should be displayed
    * for different values of the provided `value`.
    */
  def transform(value: String, mapping: StringDictionary[String]): String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: Null, mapping: StringDictionary[String]): String = js.native
  def transform(value: Unit, mapping: StringDictionary[String]): String = js.native
}
