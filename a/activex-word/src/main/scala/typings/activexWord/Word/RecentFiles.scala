package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecentFiles extends StObject {
  
  def Add(Document: Any): RecentFile = js.native
  def Add(Document: Any, ReadOnly: Any): RecentFile = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): RecentFile = js.native
  
  var Maximum: Double = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.RecentFiles_typekey")
  var WordDotRecentFiles_typekey: RecentFiles = js.native
}
