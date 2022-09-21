package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLNodes extends StObject {
  
  def Add(Name: String, Namespace: String): XMLNode = js.native
  def Add(Name: String, Namespace: String, Range: Any): XMLNode = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): XMLNode = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.XMLNodes_typekey")
  var WordDotXMLNodes_typekey: XMLNodes = js.native
}
