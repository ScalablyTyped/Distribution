package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends StObject {
  
  def Add(Name: String): Style = js.native
  def Add(Name: String, Type: js.Any): Style = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): Style = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("Word.Styles_typekey")
  var WordDotStyles_typekey: Styles = js.native
}
