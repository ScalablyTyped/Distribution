package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoAuthLocks extends StObject {
  
  /** @param Word.WdLockType [Type=1] */
  def Add(Range: Any): CoAuthLock = js.native
  def Add(Range: Any, Type: WdLockType): CoAuthLock = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): CoAuthLock = js.native
  
  val Parent: Any = js.native
  
  def RemoveEphemeralLocks(): Unit = js.native
  
  /* private */ @JSName("Word.CoAuthLocks_typekey")
  var WordDotCoAuthLocks_typekey: CoAuthLocks = js.native
}
