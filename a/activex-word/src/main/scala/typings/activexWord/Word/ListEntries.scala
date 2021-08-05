package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEntries extends StObject {
  
  def Add(Name: String): ListEntry = js.native
  def Add(Name: String, Index: js.Any): ListEntry = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): ListEntry = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("Word.ListEntries_typekey")
  var WordDotListEntries_typekey: ListEntries = js.native
}
