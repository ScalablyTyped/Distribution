package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTags extends StObject {
  
  def Add(Name: String): SmartTag = js.native
  def Add(Name: String, Range: Any): SmartTag = js.native
  def Add(Name: String, Range: Any, Properties: Any): SmartTag = js.native
  def Add(Name: String, Range: Unit, Properties: Any): SmartTag = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): SmartTag = js.native
  
  val Parent: Any = js.native
  
  def SmartTagsByType(Name: String): SmartTags = js.native
  
  /* private */ @JSName("Word.SmartTags_typekey")
  var WordDotSmartTags_typekey: SmartTags = js.native
}
