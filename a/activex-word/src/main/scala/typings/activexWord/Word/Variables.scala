package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variables extends StObject {
  
  def Add(Name: String): Variable = js.native
  def Add(Name: String, Value: Any): Variable = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): Variable = js.native
  def Item(Index: Double): Variable = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.Variables_typekey")
  var WordDotVariables_typekey: Variables = js.native
}
