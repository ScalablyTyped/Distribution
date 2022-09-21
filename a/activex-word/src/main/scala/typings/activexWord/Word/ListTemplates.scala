package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplates extends StObject {
  
  def Add(): ListTemplate = js.native
  def Add(OutlineNumbered: Any): ListTemplate = js.native
  def Add(OutlineNumbered: Any, Name: Any): ListTemplate = js.native
  def Add(OutlineNumbered: Unit, Name: Any): ListTemplate = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): ListTemplate = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.ListTemplates_typekey")
  var WordDotListTemplates_typekey: ListTemplates = js.native
}
