package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInput extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Default: String = js.native
  
  def EditType(Type: WdTextFormFieldType): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Any, Format: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Any, Format: Any, Enabled: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Any, Format: Unit, Enabled: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Unit, Format: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Unit, Format: Any, Enabled: Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: Unit, Format: Unit, Enabled: Any): Unit = js.native
  
  val Format: String = js.native
  
  val Parent: Any = js.native
  
  val Type: WdTextFormFieldType = js.native
  
  val Valid: Boolean = js.native
  
  var Width: Double = js.native
  
  /* private */ @JSName("Word.TextInput_typekey")
  var WordDotTextInput_typekey: TextInput = js.native
}
