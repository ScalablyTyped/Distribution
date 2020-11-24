package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Versions extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AutoVersion: WdAutoVersions = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Version = js.native
  
  val Parent: js.Any = js.native
  
  def Save(): Unit = js.native
  def Save(Comment: js.Any): Unit = js.native
  
  @JSName("Word.Versions_typekey")
  var WordDotVersions_typekey: Versions = js.native
}
