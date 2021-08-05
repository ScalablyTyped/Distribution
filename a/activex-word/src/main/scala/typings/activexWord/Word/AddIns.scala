package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddIns extends StObject {
  
  def Add(FileName: String): AddIn = js.native
  def Add(FileName: String, Install: js.Any): AddIn = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): AddIn = js.native
  
  val Parent: js.Any = js.native
  
  def Unload(RemoveFromList: Boolean): Unit = js.native
  
  /* private */ @JSName("Word.AddIns_typekey")
  var WordDotAddIns_typekey: AddIns = js.native
}
