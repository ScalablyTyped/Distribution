package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLabels extends StObject {
  
  def Add(Name: String): CustomLabel = js.native
  def Add(Name: String, DotMatrix: Any): CustomLabel = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): CustomLabel = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.CustomLabels_typekey")
  var WordDotCustomLabels_typekey: CustomLabels = js.native
}
