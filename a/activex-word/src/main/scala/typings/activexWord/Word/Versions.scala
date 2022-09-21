package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Versions extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoVersion: WdAutoVersions = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Version = js.native
  
  val Parent: Any = js.native
  
  def Save(): Unit = js.native
  def Save(Comment: Any): Unit = js.native
  
  /* private */ @JSName("Word.Versions_typekey")
  var WordDotVersions_typekey: Versions = js.native
}
